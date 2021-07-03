# workloadmgmt
Update the status of order

1)sample end point and request
PUT: http://localhost:8084/v1/updateOrderStatus/7001
request: {
"orderStatus":"wp"
}

Responses:

{
code:"0000"
description:"Status updated successfully"
}
 

{
code:"1000"
description:"Invalid input"
}

 
{
code:"1001"
description:"Order Not found"
}


{
code:"5000"
description:"any other error"
}






