<?php
include 'Db.php';
class Validate{
	function empty1($val,$error){

		if(empty($val)){
			return $error;
		}

		return '0';
	}

	function Length($val,$error,$limit){

		if(strlen($val)<$limit){
			return $error;
		}

		return '0';
	}


	function emailFormateValidity($val,$error){
		//echo $val;
		//echo filter_var($val,FILTER_VALIDATE_EMAIL);
		if(!filter_var($val,FILTER_VALIDATE_EMAIL)){
			return $error;
		}
		else
		{
			$Database = new Db();
			$sql="SELECT Email FROM Registration WHERE Email='$val'";
			$Data=mysqli_query($Database->Connectivity(),$sql);
			$Data=mysqli_num_rows($Data);
			//echo $Data;
			if($Data>0)
			{
				$error="Email is allready used";
				//echo $error;
				return $error;
			}
		}
		return '0';

	}

	function formateValidity($val,$error)
	{
		//echo "$val";
		//echo preg_match("/[0-9]/",$val);
		if(preg_match("/[0-9]/",$val)){
			//echo $error;
			return $error;
		}
		return '0';
	}

	function phoneFormateValidity($val,$error)
	{
		if(preg_match("/[A-Za-z]/", $val))
		{
			//echo $error;
			return $error;
		}
		else
		{
			$Database = new Db();
			$sql="SELECT MobileNumber FROM Registration WHERE MobileNumber='$val'";
			$Data=mysqli_query($Database->Connectivity(),$sql);
			$Data=mysqli_num_rows($Data);
			if($Data>0)
			{
				$error="Mobile Number is allready used";
				//echo $error;
				return $error;
			}
		}
		return '0';
	}

}



?>