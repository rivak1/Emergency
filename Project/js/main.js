$(document).ready(function(){

	$(function(){
				_Ticker = $(".TickerNews").newsTicker();
			});
	$(".demo3").animatext({speed: 150,
    effect: 'tada',
    random: true,
    infinite: true});

    $(".demo4").animatext({speed: 150,
    mode: "words",
    effect: 'swing',
    infinite: true});

    $('#Click').click(function(){
    	$('html, body').animate({scrollTop:0}, 'slow');
    })

    $(window).scroll(function(){
        value=($(window).scrollTop()/($(document).height()-$(window).height()))*100;
        console.log(value)
        $('#Top').css('width',value+'%');

    })

})
function openNav() {
    
  document.getElementById("mySidenav").style.width = "100%";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}