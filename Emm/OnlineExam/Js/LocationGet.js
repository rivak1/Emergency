var localApi="https://maps.googleapis.com/maps/api/geocode/json?latlng="+'<?php echo $lat.",".$lag; ?>'+"&key=AIzaSyBu0jVnAJTUd-g7BAbIfqk_LgIATjRZeuI";
		alert(localApi)
		//alert(<?php echo $lat; ?>)
  			var xhttp = new XMLHttpRequest();
  			xhttp.onreadystatechange = function() {
    			if (this.readyState == 4 && this.status == 200) {
    				  document.getElementById('demo').innerHTML=this.responseText;
    				  var Data= JSON.parse(this.responseText)
    				  //console.log(Data['results'][0].formatted_address)
    				  document.getElementById('demo').value=Data['results'][0].formatted_address;
    				}
  				};
  		xhttp.open("GET", "https://maps.googleapis.com/maps/api/geocode/json?latlng=21.240207,72.849&key=AIzaSyBu0jVnAJTUd-g7BAbIfqk_LgIATjRZeuI", true);
 		 xhttp.send();