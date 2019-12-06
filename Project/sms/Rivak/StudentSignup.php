<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="Signup.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<div class="wrap">
	<div class="head">
			<h2>REGISTRATION FORM</h2>
		</div>
	
	<form class="form" method="Post" action=""> 
		<div class="card">
			<label class="lbcolor">Name</label>
			<input type="text" name="name" placeholder="Your Name.....!">
		</div>
		<div class="card">
			<label class="lbcolor">Father Name</label>
			<input type="text" name="name" placeholder="Your Father Name...!">
		</div>
		<div class="card">
			<label class="lbcolor">CollageId</label>
			<input type="text" name="name" placeholder="Your Collage Id">
			
		</div>
		<div class="card">
			<label class="lbcolor"> Your Number</label>
			<input type="text" name="name"  placeholder="Your Number">
			
		</div>
		<div class="card">
			<label class="lbcolor">Your Father Number</label>
			<input type="text" name="name"  placeholder="Your Father Number">
			
		</div>
		<div class="card">
			<label class="lbcolor">Your Email</label>
			<input type="text" name="name" placeholder="Your Email">
		</div>
		<div class="card">
			<label class="lbcolor"> 
				Gender
				<!-- <?php
                     if(in_array("Insert Your Gender....!", $error_array))
                     {
                         echo "<i style='color:red;'><small>Insert Your Gender....!</small><i>";
                     }
                     else
                     {
                     	echo "<i style='color:red;'><small>Your Branch</small><i>";
                     }
                ?> -->
             </label>
			 <select name="Gender">
                 <option value=""selected="selected">Gender</option>
                 <option value="Male">Male</option>
                 <option value="Female">Female</option>
                 <option value="Other">Other</option>
              </select>
		</div>
		<div class="card">
			<label class="lbcolor">Your Branch</label>
			 <select name="Branch" class="form-cntrol">
                  <option  selected="selected" value="">Select Your Branch</option>
                  <option value="Computer Science">Computer Science</option>
                  <option value="Information technology">Information technology</option>
                  <option value="Electricl Engineering">Electricl Engineering</option>
                  <option value="Electric And Electronic">Electric And Electronic</option>
                  <option value="Mechnical Engineering">Mechnical Engineering</option>
                  <option value="Civil  Engineering">Civil  Engineering</option>
             </select>
			
		</div>
		<div class="card">
			<label class="lbcolor">Password</label>
			<input type="text" name="name" placeholder="Enter Password eg:'rivak@12345'">
			
		</div>
		<div class="card">
			<label class="lbcolor">Confirm Password</label>
			<input type="text" name="name" placeholder="Enter Again Same Password">
			
		</div>
		<button type="submit">Submit</button>
	</form>
</div>
<script type="text/javascript" src="Signup.js">
	
</script>
</body>
</html>
