CREATE DATABASE  IF NOT EXISTS `ahc` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ahc`;
-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: ahc
-- ------------------------------------------------------
-- Server version	5.7.19-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `departments`
--

DROP TABLE IF EXISTS `departments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departments` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(100) DEFAULT NULL,
  `hosp_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`dept_id`),
  KEY `FK_gbb52hp97voi4j3r8s49kwyvj` (`hosp_id`),
  CONSTRAINT `FK_gbb52hp97voi4j3r8s49kwyvj` FOREIGN KEY (`hosp_id`) REFERENCES `hospitals` (`hospital_id`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departments`
--

LOCK TABLES `departments` WRITE;
/*!40000 ALTER TABLE `departments` DISABLE KEYS */;
INSERT INTO `departments` VALUES (1,'Medical Records',1),(2,'Cardiology ',1),(3,'Admissions ',1),(4,'Chaplaincy ',1),(5,'Gynecology ',1),(6,'Human Resources',1),(7,'Maternity ',1),(8,'Neurology ',1),(9,'Oncology ',1),(10,'Purchasing & Supplies',1),(11,'Radiotherapy',2),(12,'Urology ',2),(13,'Pharmacy ',2),(14,'Maternity ',2),(15,'Haematology ',2),(16,'Chaplaincy ',2),(17,'Admissions ',2),(18,'Cardiology ',2),(19,'General Surgery',2),(20,'General Services',2),(21,'Haematology ',3),(22,'Information Management',3),(23,'Information Management',3),(24,'Admissions ',3),(25,'Cardiology ',3),(26,'Anesthetics ',3),(27,'Human Resources ',3),(28,'Maternity ',3),(29,'Neurology ',3),(30,'Gynecology ',4),(31,'Orthopaedics ',4),(32,'Pharmacy ',3),(33,'Sexual Health ',4),(34,'Urology ',4),(35,'Haematology ',4),(36,'Breast Screening',4),(37,'Cardiology ',4),(38,'Chaplaincy ',4),(39,'Diagnostic Imaging ',4),(40,'Information Management',4),(41,'Oncology ',5),(42,'Pharmacy ',5),(43,'Renal ',5),(44,'Radiotherapy ',5),(45,'Admissions ',5),(46,'Accident and emergenc',5),(47,'Anesthetics ',5),(48,'Chaplaincy ',5),(49,'General Surgery',5),(50,'Purchasing & Supplies',5),(51,'Oncology ',6),(52,'Neonatal ',6),(53,'Maternity ',6),(54,'Infection Control',6),(55,'Haematology ',6),(56,'Gastroenterology ',6),(57,'Admissions ',6),(58,'Accident and emergency',6),(59,'General Surgery',6),(60,'Information Management',6),(61,'Occupational Therapy',7),(62,'Nutrition and Dietetics',7),(63,'Patient Services',7),(64,'Pain Management ',7),(65,'Sexual Health',7),(66,'Social Work',7),(67,'Radiotherapy ',7),(68,'Maternity ',7),(69,'Admissions ',7),(70,'Anesthetics ',7),(71,'Chaplaincy ',8),(72,'Haematology ',8),(73,'Neonatal ',8),(74,'Pain Management',8),(75,'Radiotherapy ',8),(76,'Urology ',8),(77,'Orthopaedics ',8),(78,'Maternity ',8),(79,'Cardiology ',8),(80,'Admissions',8),(81,'Anesthetics ',9),(82,'Diagnostic Imaging',9),(83,'Breast Screening',9),(84,'Accident and emergency',9),(85,'Critical Care',9),(86,'Cardiology ',9),(87,'Chaplaincy ',9),(88,'Diagnostic Imaging',9),(89,'Gynecology ',9),(90,'Neurology ',9),(91,'Accident and emergency',10),(92,'Urology ',10),(93,'Pharmacy ',10),(94,'Oncology ',10),(95,'Diagnostic Imaging',10),(96,'Ophthalmology ',10),(97,'Human Resources',10),(98,'Admissions ',10),(99,'Neurology ',10),(100,'Radiology ',10),(101,'Accident and emergency',11),(102,'Human Resources',11),(103,'Neurology ',11),(104,'Rheumatology ',11),(105,'Admissions ',11),(106,'Sexual Health',11),(107,'Diagnostic Imaging',11),(108,'Oncology ',11),(109,'Pharmacy ',11),(110,'Physiotherapy ',11),(111,'Admissions ',12),(112,'Nephrology ',12),(113,'Accident and emergency',12),(114,'Human Resources',12),(115,'Microbiology ',12),(116,'Information Management',12),(117,'Pharmacy ',12),(118,'Physiotherapy ',12),(119,'Occupational Therapy',12),(120,'Infection Control',12),(121,'Human Resources',13),(122,'Radiology ',13),(123,'Nursing',13),(124,'Neurology ',13),(125,'Accident and emergency',13),(126,'Admissions ',13),(127,'Infection Control',13),(128,'Information Management',13),(129,'General Surgery',13),(130,'Gynecology ',13),(131,'Radiology ',14),(132,'Human Resources',14),(133,'Chaplaincy ',14),(134,'Diagnostic Imaging',14),(135,'Breast Screening',14),(136,'Neonatal ',14),(137,'Admissions ',14),(138,'Pain Management ',14),(139,'Radiotherapy ',14),(140,'Accident and emergency',14),(141,'Physiotherapy ',15),(142,'Gynecology ',15),(143,'Radiology ',15),(144,'Human Resources',15),(145,'Purchasing & Supplies',15),(146,'Admissions ',15),(147,'Accident and emergency',15),(148,'Microbiology ',15),(149,'Radiology ',15),(150,'Oncology ',15);
/*!40000 ALTER TABLE `departments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospitals`
--

DROP TABLE IF EXISTS `hospitals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hospitals` (
  `hospital_id` int(11) NOT NULL AUTO_INCREMENT,
  `hospital_name` varchar(100) NOT NULL,
  `hospital_address` varchar(100) NOT NULL,
  `hospital_tel` varchar(100) DEFAULT NULL,
  `hospital_index` varchar(100) NOT NULL,
  PRIMARY KEY (`hospital_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospitals`
--

LOCK TABLES `hospitals` WRITE;
/*!40000 ALTER TABLE `hospitals` DISABLE KEYS */;
INSERT INTO `hospitals` VALUES (1,'Solihull Hospital','Solihull','+44 121 424 2000','UK1522'),(2,'Broadmoor Hospital','Crowthorne','+44 1344 773111','UK1252'),(3,'Rampton Hospital','Retford','+44 1777 248321','UK1333'),(4,'Freeman Hospital','Newcastle upon Tyne','+44 191 233 6161','UK1141'),(5,'Bethlem Royal Hospital','Beckenham','+44 20 3228 6000','UK1117'),(6,'Scarborough General Hospital','Scarborough','+44 1723 368111','UK1147'),(7,'Great Ormond Street Hospital','London','+44 20 7405 9200','UK1101'),(8,'Private Birth Centre','Northwich','+44 1606 871770','UK1574'),(9,'London Bridge Hospital','London','+44 20 7407 3100','UK1101'),(10,'Southampton General Hospital','Southampton','+44 23 8077 7222','UK1681'),(11,'King\'s College Hospital','London','+44 20 3299 9000','UK1101'),(12,'Faringdon Health Centre ','Faringdon','+44 1367 242388','UK1718'),(13,'Rampton Secure Hospital','England','+44 1777 248321','UK1111'),(14,'Northern General Hospital',' Sheffield','+44 114 243 4343','UK1965'),(15,'Platinum Medical Centre',' London','+44 20 7483 5148','UK1101');
/*!40000 ALTER TABLE `hospitals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-10 22:32:09
