-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2022 at 05:08 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `admittedin`
--

CREATE TABLE `admittedin` (
  `HOSPITAL_ID` int(11) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admittedin`
--

INSERT INTO `admittedin` (`HOSPITAL_ID`, `ID`) VALUES
(5, 51930562),
(5, 52030362),
(5, 52030655),
(88, 52030655),
(111, 258),
(789, 2),
(789, 52030655),
(987, 52030290),
(74563, 8521);

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `D_ID` int(11) DEFAULT NULL,
  `P_ID` int(11) DEFAULT NULL,
  `APPOINTMENT_DATE` text NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`D_ID`, `P_ID`, `APPOINTMENT_DATE`, `ID`) VALUES
(52030655, 52030290, 'thursday', 753),
(52030562, 258, 'tmrw', 5555),
(951, 8521, 'tuesday', 5821),
(951, 258, 'hhh', 78956);

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `DOCTOR_ID` int(11) NOT NULL,
  `FirstName_DOCTOR` text NOT NULL,
  `LastName_DOCTOR` text NOT NULL,
  `Qualification` text NOT NULL,
  `ScheduleDoc` varchar(20) NOT NULL,
  `H_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`DOCTOR_ID`, `FirstName_DOCTOR`, `LastName_DOCTOR`, `Qualification`, `ScheduleDoc`, `H_ID`) VALUES
(66, ' Donee ', ' Haha  ', ' Finish  ', ' AllDays ', 987),
(951, ' teddy ', ' srour ', ' any ', ' monday', 111),
(52030290, 'Charbel', 'Srour', 'heart', 'tues', 789),
(52030562, 'Gemma', 'Elia', 'eyes', 'wedn', 88),
(52030655, '  Fawzy  ', '  Ghazawy  ', '  Head  ', 'tomorrow', 5);

-- --------------------------------------------------------

--
-- Table structure for table `hospitals`
--

CREATE TABLE `hospitals` (
  `HOSPITAL_ID` int(11) NOT NULL,
  `HOSPITAL_Name` text NOT NULL,
  `HOSPITAL_Address` char(1) NOT NULL,
  `City` text NOT NULL,
  `PATIENT_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hospitals`
--

INSERT INTO `hospitals` (`HOSPITAL_ID`, `HOSPITAL_Name`, `HOSPITAL_Address`, `City`, `PATIENT_ID`) VALUES
(5, 'Berje', '7', 'Koura', 51930562),
(88, 'idc', '4', 'Koura', 52030655),
(111, 'Lala', '4', 'Jbeil', 258),
(789, 'test', '5', 'Darbeshtar', 2),
(987, 'test2', '4', 'Beirut', 52030290),
(74563, 'IDK', '8', 'Nabatieh', 8521);

-- --------------------------------------------------------

--
-- Table structure for table `medicalrecord`
--

CREATE TABLE `medicalrecord` (
  `RecordID` int(11) NOT NULL,
  `Problem` text NOT NULL,
  `DateOfExamination` varchar(20) NOT NULL,
  `P_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicalrecord`
--

INSERT INTO `medicalrecord` (`RecordID`, `Problem`, `DateOfExamination`, `P_ID`) VALUES
(1, ' Head', 'tomorrow', 51930562),
(555, ' injury', 'friday', 258),
(777, ' Test', 'idk', 258),
(789, 'Head', 'tmrw', 52030655),
(74563, ' headache', 'anydate', 8521),
(85215, ' headdd', 'idkkk', 258),
(88888, ' kkkk', 'ggg', 51930562);

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `ID` int(11) NOT NULL,
  `FirstName` text NOT NULL,
  `LastName` text NOT NULL,
  `PhoneNb` int(11) NOT NULL,
  `Address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`ID`, `FirstName`, `LastName`, `PhoneNb`, `Address`) VALUES
(2, 'Charbel', '  Srour', 777, ' Darbeshtar'),
(258, 'Boom', ' Paww', 555, ' Jbeil '),
(8521, 'you', 'me', 7412, 'Nabatieh'),
(51930562, 'Gemma', '      Elia', 8125, ' Hadsheet '),
(52030290, 'charbel', 'srour', 555, 'Darbeshtar'),
(52030362, 'Teddy', 'Nohra', 777, 'Koura'),
(52030655, 'Fawzy', 'Ghazawy', 789, 'Koura');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admittedin`
--
ALTER TABLE `admittedin`
  ADD PRIMARY KEY (`HOSPITAL_ID`,`ID`),
  ADD KEY `ID` (`ID`);

--
-- Indexes for table `appointment`
--
ALTER TABLE `appointment`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `D_ID` (`D_ID`),
  ADD KEY `P_ID` (`P_ID`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`DOCTOR_ID`),
  ADD KEY `H_ID` (`H_ID`);

--
-- Indexes for table `hospitals`
--
ALTER TABLE `hospitals`
  ADD PRIMARY KEY (`HOSPITAL_ID`),
  ADD KEY `PATIENT_ID` (`PATIENT_ID`);

--
-- Indexes for table `medicalrecord`
--
ALTER TABLE `medicalrecord`
  ADD PRIMARY KEY (`RecordID`),
  ADD KEY `P_ID` (`P_ID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`ID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admittedin`
--
ALTER TABLE `admittedin`
  ADD CONSTRAINT `admittedin_ibfk_1` FOREIGN KEY (`HOSPITAL_ID`) REFERENCES `hospitals` (`HOSPITAL_ID`),
  ADD CONSTRAINT `admittedin_ibfk_2` FOREIGN KEY (`ID`) REFERENCES `patient` (`ID`);

--
-- Constraints for table `appointment`
--
ALTER TABLE `appointment`
  ADD CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`D_ID`) REFERENCES `doctor` (`DOCTOR_ID`),
  ADD CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`P_ID`) REFERENCES `patient` (`ID`);

--
-- Constraints for table `doctor`
--
ALTER TABLE `doctor`
  ADD CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`H_ID`) REFERENCES `hospitals` (`HOSPITAL_ID`);

--
-- Constraints for table `hospitals`
--
ALTER TABLE `hospitals`
  ADD CONSTRAINT `hospitals_ibfk_1` FOREIGN KEY (`PATIENT_ID`) REFERENCES `patient` (`ID`);

--
-- Constraints for table `medicalrecord`
--
ALTER TABLE `medicalrecord`
  ADD CONSTRAINT `medicalrecord_ibfk_1` FOREIGN KEY (`P_ID`) REFERENCES `patient` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
