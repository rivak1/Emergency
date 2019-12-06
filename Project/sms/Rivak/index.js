function confirmDelete(o)
{     
    
    var retVal = confirm("Do you want to Delete ?");       
    if( retVal == true ) 
    {                  
        deleteContact(o);   
        return true;  
     }            
}   
function deleteContact(o) 
{       
    var p=o.parentNode.parentNode;      
    p.parentNode.removeChild(p); 
}

