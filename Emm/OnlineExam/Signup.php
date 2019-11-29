<?php
include 'Controller/Validate.php';
session_start();
$FullName='';
$Phone='';
$Email='';
$latitude="";
$longitude="";
$Address="";
$c=0;
$errorArray=array();
if (isset($_POST['submit'])) {
		
		$Validate = new Validate();

		$FullName=$_POST['Name'];
		//echo $FullName;
		$FullName=strip_tags($FullName);
		//echo $FullName;
		$FullName=str_replace(" ", "", $FullName);
		$FullName=ucfirst($FullName);
		$_SESSION['Name']=$FullName;
		//echo $_SESSION['Name'];

		$phone=$_POST['Phone'];
		$_SESSION['Phone']=$phone;
		$phone=strip_tags($phone);
		$phone=str_replace(" ", "", $phone);
		$AreaPhone="91".$phone;


		$Email=$_POST['Email'];
		$_SESSION['Email']=$Email;
		$Email=strip_tags($Email);
		//$Email=str_replace(" ", "", $Email);

		$latitude=$_POST['lat'];
		$latitude=strip_tags($latitude);
		$latitude=str_replace(" ", "", $latitude);

		$longitude=$_POST['lag'];
		$longitude=strip_tags($longitude);
		$longitude=str_replace(" ", "", $longitude);

		$Address=$_POST['Location'];
		$Address=strip_tags($Address);
		$Address=str_replace(" ", "", $Address);


		array_push($errorArray,$Validate->empty1($FullName,"Enter Your Name"));
		//print_r($errorArray);

		array_push($errorArray,$Validate->empty1($phone,"Enter Your Phone"));

		array_push($errorArray,$Validate->empty1($Email,"Enter Your Email"));

		array_push($errorArray,$Validate->empty1($Address,"Please Click on Address icon"));

		array_push($errorArray,$Validate->Length($FullName,"Atleast 3 latter is required",3));

		array_push($errorArray,$Validate->Length($AreaPhone,"Insert a valid number",12));

		array_push($errorArray,$Validate->formateValidity($FullName,"Number is not allow in Text"));

		array_push($errorArray,$Validate->emailFormateValidity($Email,"Insert a valid Email"));

		array_push($errorArray,$Validate->phoneFormateValidity($AreaPhone,"Number Contain Text"));

		//echo sizeof($errorArray);
		//print_r($errorArray);
		for($i=0;$i<sizeof($errorArray);$i++)
		{

			if($errorArray[$i]=='0')
			{
				$c=$c+1;
			}

		}
		if(sizeof($errorArray)==$c)
		{

			$Database = new Db();
			$Token=md5($Email);
			$Active="Yes";

			$sql="INSERT INTO Registration(Name, Email, Token,Active,MobileNumber, Address,Latitude,Longitude)VALUES('$FullName','$Email','$Token', '$Active','$AreaPhone', '$Address', '$latitude', '$longitude')";
			$Data=mysqli_query($Database->Connectivity(),$sql);
			//echo $Data;
			if($Data>0)
			{
					
					unset($_SESSION['Name']);
					unset($_SESSION['Phone']);
					unset($_SESSION['Email']);

				     echo "<script>window.location='FormSubmit.php'</script>";
			}
			else
			{
				echo "Error";
			}
		}



		

		
		

}	

?>
<!DOCTYPE html>
<html>
<head>
	<!--Title Bar Image-->
	<link rel="shortcut icon" href="Img/Signup.png" type="image/png">

	<!-- View Port-->
	<meta name="viewport" content="width=device-width,initial-scale=1">


	<!--BOOTSTRAP CSS FILE -->	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<!--Font Awesome -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">

	<!-- CSS Profile FILE -->
	<link rel="stylesheet" type="text/css" href="Css/Signup.css">

	<!--JQUERY LINK -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<title>Sign Up</title>
</head>
<body>	
	<div class="section">
		<div class="InputLable">
			<h2>Emergency System</h2>
			<h3>Sign up</h3>
		</div>
		<div class="inputFilled">
			<form action="Signup.php" method="post">
							
						<div class="lableinput">
						<label for="Name">Name</label>
						<input type="text" name="Name"   placeholder="Your Name"  value=

							<?php

								if(isset($_SESSION['Name']))
								{
									echo $_SESSION['Name'];
								}
								else
								{
									echo "";
								}
								
							?>

						 >
						<label class="alert"><?php 

							if(in_array("Enter Your Name", $errorArray)){
								echo "Enter Your Name";
							}
							elseif (in_array("Atleast 3 latter is required", $errorArray)) {
								echo "Atleast 3 latter is required";
							}
							elseif (in_array("Number is not allow in Text", $errorArray)) {
								echo "Number is not allow in Text";
							}

						?></label>
					   </div>
					<div class="lableinput">
						<label for="Name">Email</label>
						<input type="email" name="Email" placeholder="Your Email.."  value=

							<?php

								if(isset($_SESSION['Email']))
								{
									echo $_SESSION['Email'];
								}
								else
								{
									echo " ";
								}
								
							?>

						>
						<label class="alert">
							<?php

								if(in_array("Enter Your Email", $errorArray)){
									echo "Enter Your Email";
								}
								elseif (in_array("Insert a valid Email", $errorArray)) {
								echo "Insert a valid Email";
								}
								elseif (in_array("Email is allready used", $errorArray)) {
								echo "Email is allready used";
								}
							?>

						</label>
					</div>
					<div class="lableinput">
						<label for="Name">Phone</label>
						<input type="text" name="Phone" maxlength="10" placeholder="Your phone.."  value=

							<?php

								if(isset($_SESSION['Phone']))
								{
									echo $_SESSION['Phone'];

								}
								else 
								{
									echo " ";
								}
								
							?>

						>
						<label class="alert">
							
								<?php
								if(in_array("Enter Your Phone", $errorArray)){
									 echo "Enter Your Phone";
								}
								elseif (in_array("Insert a valid number", $errorArray)) {
								     echo "Insert A Valid Length number";
								}
								elseif (in_array("Number Contain Text", $errorArray)) {
								     echo "Number Contain Text";
								}
								elseif (in_array("Mobile Number is allready used",$errorArray)) {
											
									//echo "s";		
									  echo "Mobile Number Allready Used";				
								}


								?>

						</label>
					</div>
					<div class="lableinput">
						<label id ="location"for="Name"><a id="Location" style="text-decoration: none; color: blue;" href="#"><i id="Loc"  class="fas fa-location-arrow"></i>&nbspLocation</a></label>

						<input type="text" name="Location" placeholder="Click on Location icon.." readonly required id="Loc">

						<label class="alert">
							<?php

								if(in_array("Please Click on Address icon",$errorArray))
								{
									echo "Please Click on Address icon";
								}


							?>
						</label>

						<input type="hidden" name="lat" id="lat">

						<input type="hidden" name="lag" id="lag">
					</div>
					<div class="lableinput">
						<input id="submit" class="submit" type="submit" name="submit" style="color: white; background-color: blue;">
					</div>
			</form>

		</div>
	</div>
	<script src="Js/Signup.js"></script>
</body>
</html>