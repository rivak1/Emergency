$("button#btn1").click(function(){
	var time;
	var width=0;
	var time2;
	var width2=30;
	time=setInterval(function(){
		if(width!=1280){
			width++
			width2++
			$("#div1").css("margin-left",width2+"px");
			$("#div2").css("margin-left",width+"px");
		}
		else
		{
			time2=setInterval(function(){
			if(width!=0)
			{
			width--
			width2--
			$("#div1").css("margin-left",width2+"px");
			$("#div2").css("margin-left",width+"px");
		}
		else{

			clearInterval(time2)

		}
			},1)

			clearInterval(time);
		}
	},1);
});
$("button").click(function(){
	var color=$(this).val()
	color=color.split('&');
	text="linear-gradient"+"("+color[0]+","+color[1]+")"
	$("#div1").css("background",text)
	$("#div2").css("background",text)
});


$("button#btn").click(function(){
	var color
  	color=$("input").val();
	color=color.split(',');
	text="linear-gradient"+"("+color[0]+","+color[1]+")"
	$("#main").css("background",text);
})

