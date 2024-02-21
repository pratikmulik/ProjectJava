import React from 'react'

const DisptachComp = () => {


    
        const DispatchDummy=[
    {
        "SalesID":15660,	
        "DispatchID":102,
        "SalesDate":"2024-02-21",	
        "ArrivalDate":"2024-02-26"
    }
        ]

  return (
    <div>
        <h2 align="center">Dispatch Details</h2>
        <table border={2} align='center'>

        <thead>
        <tr>
                   
        <th>Sales ID</th>
        <th>Dispatch ID</th>
        <th>Sales Date</th>
        <th>Expected Delivery Date</th>
               
        </tr>

        </thead>


        <tbody>

        {DispatchDummy.map(Dispatch=>
        <tr>
         
            
        <td>{Dispatch.SalesID}</td>        
        <td>{Dispatch.DispatchID}</td>                  
         <td>{Dispatch.SalesDate}</td>            
        <td>{Dispatch.ArrivalDate}</td>

            
        </tr>)

        }
        </tbody>
        </table>

        <h3 align="center">For more info Contact us on</h3>
        <h4 align="center"> Support@mystore.com</h4>
        <h4 align="center">Helpline No. 1800985985</h4>



        







    </div>
  )
}

export default DisptachComp