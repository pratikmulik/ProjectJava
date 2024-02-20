package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDTO;
import com.app.service.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController 
{
	
	@Autowired
	private ProductService productService;
	
	//Post
		// http://host:port/product , method=POST

		@PostMapping
		public ResponseEntity<?> addNewProduct(@RequestBody @Valid ProductDTO dto)
		{
			System.out.println("In Add Product DTO");
			return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(dto));
		}
		
		//Get
		// 2. http://host:port/product/{productId} , method=GET
		
		@GetMapping(value = "/{productId}")
		public ResponseEntity<?> getProductbyId(@PathVariable Long productId)throws IOException
		{
			System.out.println("Getting product by product ID="+productId);
			return ResponseEntity.ok(productService.findProductById(productId));
		}
		
		/*
		 * 
		 * @GetMapping
	public ResponseEntity<?> getAllEmpsPaginated(@RequestParam(defaultValue = "0", required = false) int pageNumber,
			@RequestParam(defaultValue = "3", required = false) int pageSize) {
		System.out.println("in get all emps " + pageNumber + " " + pageSize);
		List<EmployeeDTO> list = employeeService.getAllEmployees(pageNumber, pageSize);
		if (list.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		// emps found
		return ResponseEntity.ok(list);
	}
		 */
		
		//getAll
		
		@GetMapping
		public ResponseEntity<?> getAllProductsPaginated(@RequestParam(defaultValue = "0", required = false) int pageNumber,
				@RequestParam(defaultValue = "3", required = false) int pageSize) {
			System.out.println("in get all Products " + pageNumber + " " + pageSize);
			List<ProductDTO> list = productService.findAllProduct(pageNumber, pageSize);
					
			if (list.isEmpty())
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			return ResponseEntity.ok(list);
		}
		
		//Put 
		//http://host:port/product/{productId} , method=PUT
		
		@PutMapping(value = "/{productId}")
		public ResponseEntity<?> updateProduct(@PathVariable Long productId, @RequestBody @Valid ProductDTO dto)
		{
			System.out.println("In update product by id="+productId+" "+dto);
			return ResponseEntity.ok(productService.updateProduct(productId, dto));
		}
		
		//Delete
		//2. http://host:port/product/{productId} , method=DELETE
		@DeleteMapping(value ="/{productId}")
		public ResponseEntity<?> deleteProduct (@PathVariable Long productId)throws IOException
		{
			System.out.println("Deleting product by Id="+productId);
			return ResponseEntity.ok(productService.deleteProductById(productId));
		}
		

}
