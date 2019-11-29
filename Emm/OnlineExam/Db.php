<?php

class Db
{

	function Connectivity(){

		$connection = mysqli_connect("Localhost","root","","EmergencySystem");
		//.        '$sql="Create Database Emergency_System";
		if (!$connection) {
    	die('Could not connect: ' . mysql_error());
		}
		else
		{
			return $connection;
		}	
	}

	function CreateTable()
	{
		

		$sql="CREATE TABLE IF NOT EXISTS Registration( Name TEXT NOT NULL , Id INT NOT NULL AUTO_INCREMENT  , Email VARCHAR(100) NOT NULL, Token VARCHAR(100) NOT NULL ,Active TEXT NOT NULL, MobileNumber BIGINT NOT NULL ,Address VARCHAR(100) NOT NULL , Latitude DOUBLE NOT NULL , Longitude DOUBLE NOT NULL , PRIMARY KEY (Id))";
		$RegistrationTbale=mysqli_query($this->Connectivity(),$sql);
		
		$Sql="CREATE Table IF NOT EXISTS History( Message VARCHAR(100) NOT NULL , Id INT NOT NULL AUTO_INCREMENT , REmail VARCHAR(100) NOT NULL , MobileNumber BIGINT NOT NULL,Address VARCHAR(100) NOT NULL ,PRIMARY KEY(Id))";	
		$HistoryTable=mysqli_query($this->Connectivity(),$Sql);

	}

	function RetriveData(){

		$sql = "SELECT * from Registration";
	    $Data = mysqli_query($this->Connectivity(),$sql);
	    return $Data;
	

	}
	
}
$DataStart= new Db();
$DataStart->CreateTable();

?>