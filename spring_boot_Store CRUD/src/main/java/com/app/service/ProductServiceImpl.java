package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.ProductDao;
import com.app.dto.ProductDTO;
import com.app.entities.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	
	
	@Override
	public ProductDTO createProduct(ProductDTO dto) {
		Product product =mapper.map(dto, Product.class);
		
		Product savedProduct=productRepo.save(product);
		System.out.println("Product saved in product table");
		return mapper.map(savedProduct, ProductDTO.class);
	}

	@Override
	public ProductDTO findProductById(Long productId) {
		
		//Optional<Product> product=productRepo.findById(productId);
		//return mapper.map(product, ProductDTO.class);
		
		
		return mapper.map(productRepo.findById(productId).orElseThrow(()-> new ResourceNotFoundException("Invalid Product ID or Product not yet saved"))
				, ProductDTO.class);
	}
	
	
	
	@Override
	public ProductDTO updateProduct(Long productId, ProductDTO dto) 
	
	{
		Product productEntity=productRepo.findById(productId).orElseThrow(()-> new ResourceNotFoundException("Invalid Product Id!!!"));
		mapper.map(dto, productEntity);
	
		productRepo.save(productEntity);
		System.out.println("After mapping user="+productEntity);
		dto.setProductId(productId);
		return dto;
		
	}

	
	@Override
	public boolean deleteProductById(Long productId) {
		Product product =productRepo.findById(productId).orElseThrow(()-> new ResourceNotFoundException("Invalid User Id!!!"));
		if(product!=null)
		{
			productRepo.deleteById(productId);
		
		// TODO Auto-generated method stub
		return true;
		}
		else return false;
	}

	@Override
	public List<ProductDTO> findAllProduct(int pageNumber, int pageSize) {
		Pageable pageable= PageRequest.of(pageNumber, pageSize);
		
		List<Product> productList=productRepo.findAll(pageable).getContent();
		return productList.
				stream()
				.map(product-> mapper.map(product, ProductDTO.class))
				.collect(Collectors.toList());
	}

}



/*



@Override
public ProductDTO createProduct(ProductDTO dto) {
	Product product =mapper.map(dto, Product.class);
	
	Product savedProduct=productRepo.save(product);
	System.out.println("Product saved in product table");
	return mapper.map(savedProduct, ProductDTO.class);
}

@Override
public ProductDTO findProductById(Long productId) {
	
	Optional<Product> product=productRepo.findById(productId);
	return mapper.map(product, ProductDTO.class);
}

@Override
public ProductDTO updateProduct(Long productId, ProductDTO dto) 

{
	Product product=productRepo.findById(productId).orElseThrow(()-> new ResourceNotFoundException("Invalid Product Id!!!"));
	mapper.map(dto, product);
	System.out.println("After mapping user="+product);
	productRepo.save(product);
	dto.setProductId(productId);
	return dto;
	
}


@Override
public boolean deleteProductById(Long productId) {
	Product product =productRepo.findById(productId).orElseThrow(()-> new ResourceNotFoundException("Invalid User Id!!!"));
	if(product!=null)
	{
		productRepo.deleteById(productId);
	
	// TODO Auto-generated method stub
	return true;
	}
	else return false;
}

@Override
public List<ProductDTO> findAllProduct(int pageNumber, int pageSize) {
	Pageable pageable= PageRequest.of(pageNumber, pageSize);
	
	List<Product> productList=productRepo.findAll(pageable).getContent();
	return productList.
			stream()
			.map(product-> mapper.map(product, ProductDTO.class))
			.collect(Collectors.toList());
}

*/