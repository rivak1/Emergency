
$('#Location').click(function(){  
        alert('Please Wait....') 
        getLocation()

      }) 

$(window).ready(function()
{
  $('submit').attr('disabled','disabled')
})
$("#Loc").click(function(){

  $(this).remove();

})
$("#Location").click(function(){

  $(this).remove('')
  $("#location").html('Location')

})
function getLocation() {
     if (navigator.geolocation) 
     	 {
            
             navigator.geolocation.getCurrentPosition(showPosition);
         }
     else 
     { 
            alert("Geolocation is not supported by this browser.");
            window.location="FindNearPeple.php";
     
      }
 }
function showPosition(position){ 
          $('#lat').val(position.coords.latitude)
          $('#lag').val(position.coords.longitude)
          var localApi="https://maps.googleapis.com/maps/api/geocode/json?latlng="+position.coords.latitude+","+position.coords.longitude+"&key=AIzaSyAL4ryKrNOFuBdIyEadu441LQn2x5La2Bk";
			alert('Your Location...')
      console.log(localApi);
        			var xhttp = new XMLHttpRequest();
  			xhttp.onreadystatechange = function() {
    			if (this.readyState == 4 && this.status == 200) {
    				  var Data= JSON.parse(this.responseText)
              console.log(Data);
    				  document.getElementById('Loc').value=Data['results'][0].formatted_address;
    				}
  				};
  		xhttp.open("GET", localApi, true);
 		 xhttp.send();
}  