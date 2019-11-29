-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 29, 2019 at 05:16 PM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `EmergencySystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `History`
--

CREATE TABLE `History` (
  `Message` varchar(100) NOT NULL,
  `Id` int(11) NOT NULL,
  `REmail` varchar(100) NOT NULL,
  `MobileNumber` bigint(20) NOT NULL,
  `Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `Registration`
--

CREATE TABLE `Registration` (
  `Name` text NOT NULL,
  `Id` int(11) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Token` varchar(100) NOT NULL,
  `Active` text NOT NULL,
  `MobileNumber` bigint(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Latitude` double NOT NULL,
  `Longitude` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Registration`
--

INSERT INTO `Registration` (`Name`, `Id`, `Email`, `Token`, `Active`, `MobileNumber`, `Address`, `Latitude`, `Longitude`) VALUES
('Rivakshah', 16, 'shahrivak6@gmail.com', 'b374fdfac75203663ffe1f4afa478dd0', 'Yes', 911234567890, '9694826310à¤…à¤—à¥à¤¨à¤¾AgunaaMohalla,Rajasthan341503,India', 26.797445699999997, 75.8155651),
('Rajaaryan', 17, 'rivakshah1@gmail.com', 'fc0ead7ad7a59603844d7ab1a8046834', 'Yes', 919988999999, '9694826310à¤…à¤—à¥à¤¨à¤¾AgunaaMohalla,Rajasthan341503,India', 26.797445699999997, 75.8155651),
('Rahul', 18, 'khandelwal.rahul652@gmail.com', '67d90b3afda28b78086f86916fc33232', 'Yes', 919694180845, '191/329pratapnagar,PratapNagar,Sector19,Jaipur,Rajasthan302033,India', 26.797445699999997, 75.8155651);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `History`
--
ALTER TABLE `History`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `Registration`
--
ALTER TABLE `Registration`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `History`
--
ALTER TABLE `History`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Registration`
--
ALTER TABLE `Registration`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
