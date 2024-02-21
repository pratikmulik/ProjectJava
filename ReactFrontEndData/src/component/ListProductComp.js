import React from 'react'

const ListProductComp = () => {

  const dummyProduct=[
  { "productID":100,
    "productName":"Titan 1501",
    "productDesc":"Analog,Waterproof,MetalBody",
    "productStock":20,
    "productImg":"imagePath1501",
    "productCost":1599
  },
  
  { "productID":101,
  "productName":"Timex 999",
  "productDesc":"Digital,Waterproof,Sports",
  "productStock":15,
  "productImg":"imagePath999",
  "productCost":2199
  },

  { "productID":102,
    "productName":"Titan 200",
    "productDesc":"Analog,Waterproof,Rubber",
    "productStock":5,
    "productImg":"imagePath200",
    "productCost":850
  }



];

  return (
    <div>
      <h2 align="center">From Classic to Digital</h2>
        <h3 align="center">----Our best-selling Range----</h3>

        <table border={2} align='center'>
          <thead>
            <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Description</th>
            <th>Product Sample Image</th>
            <th>Price Rs.</th>
            </tr>
          </thead>

          <tbody>
            {dummyProduct.map(Product=>
          <tr key={Product.productID}>
            <td>{Product.productID}</td>
            <td>{Product.productName}</td>
            <td><img src='../images/w1.jpg' alt='Watches on Display' height={200} width={
              140}/></td>
            <td>{Product.productDesc}</td>
            <td>{Product.productCost}</td>
           
          </tr>)
}

          </tbody>


        </table>


    </div>
  )
}

export default ListProductComp