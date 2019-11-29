<?php
include 'Db.php';
include 'MobileEmail/MobileEmail.php';
$mail = new MobileEmail();
$Database = new Db();
$UserLongitude=$_GET['Lag'];
//echo $UserLongitude;
$Userlatitude=$_GET['lat'];
$Mobile =array();
$Email=array();
$location=$_GET['Location'];
//echo $location;
if(isset($UserLongitude)&&isset($Userlatitude))
{
	

	$Data=$Database->RetriveData();
	while ( $data = mysqli_fetch_array($Data)) {
		//echo $data['Latitude'];
		$theta = $UserLongitude - $data['Longitude'];
    	$dist = sin(deg2rad($Userlatitude)) * sin(deg2rad($data['Latitude'])) +  cos(deg2rad($Userlatitude)) * cos(deg2rad($data['Latitude'])) * cos(deg2rad($theta));
    	$dist = acos($dist);
    	$dist = rad2deg($dist);
    	$miles = $dist * 60 * 1.1515;
    	$Distance =$miles * 1.609344;
    	echo $Distance;
		if($Distance<=15){
			array_push($Mobile, $data['MobileNumber']);
			array_push($Email, $data['Email']);
		}
			
	}
	if($mail->Email($Email,$location)==true) 
	{
		echo "ture";
		echo "<script>window.location='index.php'</script>";
	}
	else
	{
		echo "false";
		print_r($Email);
	}
	

}


?>
<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<script type="text/javascript">
		
</script>
</body>
</html>