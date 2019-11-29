$(window).ready(function(){

  $('#slides').superslides();

var typed = new Typed(".typed", {
    strings: ["SOFTWARE ENGINEER.","SAVE PEOPLE.", "HELP PEOPLE.", "CLICK BUTTON NOTIFY."],
    typeSpeed:100,
    loop:true,
    startDelay:1000,
    showCursor:false
  });


  $('#submit').click(function(){
    getLocation();
  })


      function getLocation() {
               
              if (navigator.geolocation) {
                 navigator.geolocation.getCurrentPosition(showPosition);
                } else { 
                  alert("Geolocation is not supported by this browser.");
                  window.location="FindNearPeple.php";
     
                   }
              }

     function showPosition(position){ 
     alert('Your Location is Shared To Nearest People')  
     alert(position.coords.latitude+"jjjjss")
           var localApi="https://maps.googleapis.com/maps/api/geocode/json?latlng="+position.coords.latitude+","+position.coords.longitude+"&key=AIzaSyAL4ryKrNOFuBdIyEadu441LQn2x5La2Bk";
            alert('Your Location...')
            console.log(localApi)
           //alert(<?php echo $lat; ?>)
           var xhttp = new XMLHttpRequest();
           xhttp.onreadystatechange = function() {
          if (this.readyState == 4 && this.status == 200) {
              var Data= JSON.parse(this.responseText)
              console.log(Data['results'][0])
               window.location="FindNearPeple.php?Lag="+position.coords.longitude+"&lat="+position.coords.latitude+"&Location="+Data['results'][0].formatted_address;
            }
          };
      xhttp.open("GET", localApi, true);
     xhttp.send();
          
       }  


});
 
