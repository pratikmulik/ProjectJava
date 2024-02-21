import React from 'react'
//rafce
const SalesDocComp = () => 

{
    const SalesDummy=[
{
    "SalesID":15660,	
    "UserID":102,
    "CartId":1236,
    "SalesDate":"2024-02-21",	
    "TotalCost":1699
}
/*,

{
    "SalesID":15661,	
    "UserID":95,
    "CartId":1266,
    "SalesDate":"2024-02-15",	
    "TotalCost":265
},
{
    "SalesID":15662,	
    "UserID":16,
    "CartId":1248,
    "SalesDate":"2024-02-09",	
    "TotalCost":25000
}*/

]
  return(
    <div>
        <h2 align="center">Order Invoice</h2>
        <table border={2} align='center'>

        <thead>
        <tr>
                   
        <th>User ID</th>
        <th>Sales TxNo.</th>
        <th>Date</th>
        <th>Product ID</th>
        <th>Transaction Amount</th>
        
        </tr>

        </thead>

        <tbody>

        {SalesDummy.map(Sales=>
        <tr>
         
         <td>{Sales.UserID}</td>      
        <td>{Sales.SalesID}</td>        
        <td>{Sales.SalesDate}</td>                  
         <td>{Sales.CartId}</td>            
        <td>{Sales.TotalCost}</td>

            
        </tr>)


       


       
}
</tbody>
        </table>
        <h4 align="center">Disclaimer:-  This document is digitally signed.</h4>

        <h2 align="center">Thank you for shopping with us..!!!!</h2>
        

    </div>
  )
}

export default SalesDocComp