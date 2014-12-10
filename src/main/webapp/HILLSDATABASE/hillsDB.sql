CREATE DATABASE  IF NOT EXISTS `hills` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hills`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: hills
-- ------------------------------------------------------
-- Server version	5.6.21-log

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
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL DEFAULT 'ROLE_USER',
  `authorities_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`authorities_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorities`
--

LOCK TABLES `authorities` WRITE;
/*!40000 ALTER TABLE `authorities` DISABLE KEYS */;
INSERT INTO `authorities` VALUES ('admin@hills.com','ROLE_ADMIN',1),('travis@hills.com','ROLE_USER',2),('jim@hills.com','ROLE_ADMIN',3),('henry@hills.com','ROLE_ADMIN',4);
/*!40000 ALTER TABLE `authorities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `employee_id` int(11) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `socail_security` varchar(45) DEFAULT NULL,
  `date_hired` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES (1,101,'John','Smith','1804 Hillcrest Drive','Pewaukee','WI','53072','345-55-5874','5/5/2013'),(2,202,'Jamie','Peterson','686 Cherry Tree Lane','Pewaukee','WI','53072','641-02-9820','5/5/2014'),(3,303,'Steven','Canty','456 Ridgewood Trail','Waukesha','WI','53071','225-63-5458','5/6/2014'),(4,9999,'Harold','Lovestin','1234 Henry Lane','Waukesha','WI','53071','987-65-1220','12/1/2014'),(6,505,'Brenden','Steele','1800 Jane Street','Pewaukee','WI','53074','484-98-6598','12/10/2012'),(7,606,'Steven','Tyler','1804 West Main','Pewaukee','WI','53074','601-98-1154','6/06/2014'),(8,45678,'Tiffany','Taft','456 Main Street','Waukesha','WI',NULL,'321-98-9874','12/1/2014');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `golf_shop`
--

DROP TABLE IF EXISTS `golf_shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `golf_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `golf_shop_id` decimal(6,2) DEFAULT NULL,
  `greens_fees` decimal(6,2) DEFAULT NULL,
  `cart_fees` decimal(6,2) DEFAULT NULL,
  `shop_sales` decimal(6,2) DEFAULT NULL,
  `member_charges` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `golf_shop`
--

LOCK TABLES `golf_shop` WRITE;
/*!40000 ALTER TABLE `golf_shop` DISABLE KEYS */;
INSERT INTO `golf_shop` VALUES (3,1005.00,1300.98,1300.00,1300.23,5000.23),(4,1005.00,9844.89,2987.00,9841.55,2030.01),(5,1005.00,5461.55,1516.44,1161.59,200.00),(6,1005.00,8118.85,5845.48,2354.56,1518.00),(8,1005.00,5484.89,437.56,694.25,44.31),(9,1005.00,4583.24,5435.45,455.90,96.00),(11,1005.00,784.58,445.65,29.87,29.87),(12,1005.00,784.58,445.65,29.87,29.87),(13,1005.00,784.58,445.65,29.87,29.87),(14,1005.00,784.58,445.65,29.87,29.87),(15,1005.00,184.58,645.65,899.87,989.87),(16,1005.00,35.68,42.54,19.87,64.87),(19,1454.00,2002.54,1684.25,33.27,48.45),(20,1454.00,2002.54,1684.25,33.27,48.45),(23,1454.00,32.84,354.86,323.21,0.00);
/*!40000 ALTER TABLE `golf_shop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instructors`
--

DROP TABLE IF EXISTS `instructors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instructors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `instructor_id` int(11) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `rate` decimal(6,2) DEFAULT NULL,
  `teaching` varchar(45) DEFAULT NULL,
  `availability` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instructors`
--

LOCK TABLES `instructors` WRITE;
/*!40000 ALTER TABLE `instructors` DISABLE KEYS */;
INSERT INTO `instructors` VALUES (1,1001,'Sean Foley',199.00,'Short Game, Irons','Mon-Fri'),(2,1002,'Butch Harmon',219.00,'Short Game, Course Mangament','Mon-Fri'),(3,1003,'Dave Pelz',155.00,'Shor Game','Thurs-Sun'),(4,1004,'Orlando Fan',99.00,'Irons, Wedge Play','W-Sun'),(5,1005,'Charlie Rhymer',99.00,'Long Game','Thur-Sun'),(6,1006,'James Rider',145.00,'Course Management','Wed-Sun');
/*!40000 ALTER TABLE `instructors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lessons`
--

DROP TABLE IF EXISTS `lessons`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lessons` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lessons`
--

LOCK TABLES `lessons` WRITE;
/*!40000 ALTER TABLE `lessons` DISABLE KEYS */;
INSERT INTO `lessons` VALUES (1,'John','Sanders','12/15/2014','11:00am'),(2,'Tara','Conners','12/16/2014','3:00pm'),(3,'Henry','Ford','12/16/2014','9:00pm'),(4,'Tara','Conwell','12/20/2014','6:00pm'),(5,'Peter','Malark','12/21/2014','2:00pm'),(6,'Arnold','Sevrey','12/17/2014','4:30pm');
/*!40000 ALTER TABLE `lessons` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `members` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` int(11) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `zip` varchar(45) DEFAULT NULL,
  `membership_type` varchar(45) DEFAULT NULL,
  `quarterly_minimum` decimal(6,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (1,2001,'John','Ringo','88 Humbolt','Pewaukee','WI','53072','Single',400.00),(2,2002,'Jerry ','Jones','1245 Hopkins Lane','Pewaukee','WI','53072','Couple',600.00),(3,2003,'Jamie','Jones','1245 Hopkins Lane','Pewaukee','WI','53072','Couple',0.00),(4,2004,'Andrew ','Luck','454 Luck Lane','Pewaukee','WI','53072','Single',400.00),(5,2005,'Carl','Sandable','989 Sports Lane','New Berlin','WI','54089','Couple',600.00),(6,2006,'Jenifer','Sandable','989 Sports Lane','New Berlin','WI','54089','Couple',0.00),(7,2007,'Steve','Stricker','1845 Stricker Lane','Madison','WI','53714','Family',1200.00),(8,2008,'Nicki','Stricker','1845 Stricker Lane','Madison','WI ','53714','Family',0.00),(9,2009,'Bobby ','Stricker','1845 Stricker Lane','Madison','WI ','53714','Family',0.00),(10,2010,'Izzy','Stricker','1845 Stricker Lane','Madison','WI ','53714','Family',0.00);
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `membership_rates`
--

DROP TABLE IF EXISTS `membership_rates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `membership_rates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categories` varchar(45) DEFAULT NULL,
  `rates` varchar(45) DEFAULT NULL,
  `monthly_fees` varchar(45) DEFAULT NULL,
  `other_charges` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membership_rates`
--

LOCK TABLES `membership_rates` WRITE;
/*!40000 ALTER TABLE `membership_rates` DISABLE KEYS */;
INSERT INTO `membership_rates` VALUES (1,'Single Golf Membership','$20,000.00','$500.00','$0.00'),(2,'Student Golf Membership','$14,000.00','$250.00','$0.00'),(3,'Couple Golf Membership','$35,000.00','$750.00','$0.00'),(4,'Family Golf Membership','$42,000.00','$1000.00','$0.00'),(5,'Fitness Facility','$1,200.00','$0.00','$10.00 Towel Fee'),(6,'Pool Facility','$1,000.00','$0.00','$10.00 Towel Fee'),(7,'Tennis Facility','$0.00','$0.00','$25.00 Court Fee'),(8,'Lost Card','$10.00','$0.00','$0.00'),(9,'Food & Beverage Minimum','$400.00-$1,200.00 / Based On Membership Type','$0.00','$0.00');
/*!40000 ALTER TABLE `membership_rates` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `event` varchar(45) DEFAULT NULL,
  `memberId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES (1,'Carl','Sanders','Member Guest','1005');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurant` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food_charges` decimal(6,2) DEFAULT NULL,
  `drink_charges` decimal(6,2) DEFAULT NULL,
  `member_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,32.99,27.99,2001),(2,45.87,18.99,2005),(3,65.24,12.89,2222),(4,36.87,19.45,2006),(5,21.70,45.33,1010);
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teesheet`
--

DROP TABLE IF EXISTS `teesheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teesheet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `playerOne` varchar(45) DEFAULT NULL,
  `playerTwo` varchar(45) DEFAULT NULL,
  `playerThree` varchar(45) DEFAULT NULL,
  `playerFour` varchar(45) DEFAULT NULL,
  `teeTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teesheet`
--

LOCK TABLES `teesheet` WRITE;
/*!40000 ALTER TABLE `teesheet` DISABLE KEYS */;
INSERT INTO `teesheet` VALUES (1,'James','Tyler','Trevor','Barbara','2013-05-21 12:30:00'),(2,'Jamie','Kelsey','Jennifer','Charles','2013-05-21 12:40:00'),(3,'Henry','Bob','Bill','Roger','2013-05-21 12:50:00'),(4,'Luke','Tracey','Jared','Bill','2013-05-21 01:00:00'),(5,'Adam','Aaron','Steven','Muhammad','2013-05-21 01:10:00'),(6,'Jamie','Ashley','Amanda','Peg','2013-05-21 01:20:00'),(7,'Audra','Eve','Ava','Stacey','2013-05-21 01:30:00'),(8,'Jennifer','Kelsey','Tammie',NULL,'2013-05-21 01:40:00'),(9,'Karl','Jim',NULL,NULL,'2013-05-21 01:50:00'),(10,'James',NULL,NULL,'Henry','2013-05-21 02:00:00'),(11,'Peter','Jessica',NULL,NULL,'2013-05-21 02:10:00'),(12,NULL,NULL,NULL,NULL,'2013-05-21 02:20:00'),(13,NULL,NULL,NULL,NULL,'2013-05-21 02:30:00'),(14,NULL,NULL,NULL,NULL,'2013-05-21 02:40:00'),(15,NULL,NULL,NULL,NULL,'2013-05-21 02:50:00'),(16,'Peter','Jacob','Mike',NULL,'2013-05-21 03:00:00'),(17,'Amy','Jim',NULL,NULL,'2013-05-21 03:10:00'),(18,NULL,NULL,NULL,NULL,'2013-05-21 03:20:00'),(19,'Kurt','Willie',NULL,NULL,'2013-05-21 03:30:00'),(20,NULL,NULL,NULL,NULL,'2013-05-21 03:40:00'),(21,NULL,NULL,NULL,NULL,'2013-05-21 03:50:00'),(22,NULL,NULL,NULL,NULL,'2013-05-21 04:00:00');
/*!40000 ALTER TABLE `teesheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT 'null',
  `enabled` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('admin@hills.com','100a966464e6d6b450e2ac52cbfd1d5273da644ff50ad2ffec4cfd8c8f75bbe7d753d3c8fd6d7169d66e7bd5e3d5d5da9b4ee638b3b783b2726874b756e4216b',1),('henry@hills.com','bb1230eb8a9f869a82b0b639ca5bf5b256d5987f631fe0d273ad92f8cb963682543bdbfae3aa1bc3a1861c460a8d2c885a4646e8ac406db7678703d97c1313d4',1),('jim@hills.com','d33300aa0653ee2b6efd8995669c9b486d8d6bf6a72a31ceec149389942b695b1b24f38a675169ccf11574e9c5334e516d0e534fd29e9cfec36a35e34176354b',1),('travis@hills.com','df7f78dc6d19c739a16758a006658bd444348f2dcf3933bb764596f9355daa85d4dc0fcc2c97f4b442c7d8a80c3e2e38909d6e2d713cd15ee430e0165cf29f2b',1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-09 21:48:55
