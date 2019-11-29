<?php
include 'Php/PHPMailerAutoload.php';
require 'vendor/autoload.php';
class MobileEmail{

	function Email($Email,$Location)
	{
	     /**
		 * This example shows making an SMTP connection with authentication.
		 */

		//SMTP needs accurate times, and the PHP time zone MUST be set
		//This should be done in your php.ini, but this is how to do it if you don't have access to that
		date_default_timezone_set('Etc/UTC');
			//Create a new PHPMailer instance
		$mail = new PHPMailer;
			//Tell PHPMailer to use SMTP
		$mail->isSMTP();
		$mail->SMTPSecure='tls';
			//Enable SMTP debugging
			// 0 = off (for production use)
			// 1 = client messages
			// 2 = client and server messages
		$mail->SMTPDebug = 4;
			//Ask for HTML-friendly debug output
			//$mail->Debugoutput = 'html';
			//Set the hostname of the mail server
		$mail->Host = "smtp.gmail.com";
			//Set the SMTP port number - likely to be 25, 465 or 587
		$mail->Port = 587;
			//Whether to use SMTP authentication
		$mail->SMTPAuth = flase;

			//Username to use for SMTP authentication
		$mail->Username = "shahrivak6@gmail.com";
			//Password to use for SMTP authentication
		$mail->Password = "Rivak@12345";
			//Set who the message is to be sent from
			//$mail->setFrom('shahrivak6@gmail.com','Skit Collage');
			//Set an alternative reply-to address
			//$mail->addReplyTo('replyto@example.com', 'First Last');
			//Set who the message is to be sent to	
		for ($i=0; $i<sizeof($Email);$i++){ 
				#
			$mail->addAddress($Email[$i], 'Helper');

			}	

			//Set the subject line
		$mail->Subject = 'Emergency Near you';
			//Read an HTML message body from an external file, convert referenced images to embedded,
			//convert HTML into a basic plain-text alternative body
			//$mail->msgHTML(file_get_contents('contents.html'), dirname(__FILE__));
			//Replace the plain text body with one created manually
		$mail->isHTML(true);
			//$filename='Image/Logo.png';
		$mail->Body = '<h1>Please Help The person At-></h1>'.$Location;
			//Attach an image file
			// $mail->addAttachment('Image/Logo.png');

			//send the message, check for errors
		if($mail->send())
		{
			echo  $mail->ErrorInfo;
			return true;
		}
		else
		{
			echo $mail->ErrorInfo;
			return false;
		}
	}

	function Sms(){
		$sid='AC0c83876a4f37c9121c665f6065272540';
		$sidtoken='9e63fd34ec0939ad1614a80d9285f509';
		$client = new Services_Twilio($sid,$sidtoken);
			//$client->account->messages->sendMessage('+(307) 463-9627','+919001078678', 'Your Gate-pass Is Accepted By Hod');
		$mes =$client->account->messages->sendMessage('+13074639627','+917425856605', 'Name :yashita');
			if(!empty($mes->sid)){
			echo "Done";
		}
		else{
				echo "nt";
		}
	}
}
?>