<?php

if (isset($_FILES["uploaded_file"]["name"])) {
	# code...
	$name = $_FILES["uploaded_file"]["name"];
	$tmp_name = $_FILES['uploaded_file']['tmp_name'];
	$error = $_FILES['uploaded_file']['error'];

	if (!empty($name)) {
		# code...
		$location = './assets/';

		if (!is_dir($location)) 
			mkdir($location);
		if(move_uploaded_file($tmp_name, $location.$name))
			echo "Uploaded";
	}
	else
		echo "Please choose a file";
}
?>