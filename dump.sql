-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: localhost    Database: Users
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `users` (
  `id_user` int(10) NOT NULL AUTO_INCREMENT,
  `fullName` varchar(20) NOT NULL,
  `nikName` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `age` varchar(3) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (27,'1','2','2','2','2'),(28,'1','2','2','2','2'),(29,'1','2','2','2','2'),(30,'','','','',''),(31,'misha','koj','email','18','111222'),(32,'v','d','w','18','1'),(33,'vasya','v','mail','18','1'),(34,'4','4','4','4','2'),(35,'4','4','4','4','2'),(36,'4','4','4','4','2'),(37,'4','4','4','4','2'),(38,'4','4','4','4','1'),(40,'1','2','2','2','2'),(41,'1','2','2','2','2'),(42,'1','2','2','2','2'),(43,'1','2','2','2','2'),(44,'1','2','2','2','2'),(45,'1','2','2','2','2'),(46,'1','2','2','2','2'),(47,'1','2','2','2','2'),(48,'mm','kojes11','1@gmail.com','1','1'),(49,'1','2','2','2','2'),(50,'1','2','2','2','2'),(51,'1','2','2','2','2'),(52,'1','2','2','2','2'),(53,'1','2','2','2','2'),(54,'1','2','2','2','2'),(55,'1','2','2','2','2'),(56,'1','2','2','2','2'),(57,'1','2','2','2','2'),(58,'1','2','2','2','2'),(59,'Misha Kole','m','11@gmail.com','1','1'),(60,'1','2','2','2','2'),(61,'1','2','2','2','2'),(62,'Miha koles','kojes12','1@gmail.com','1','1');
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

-- Dump completed on 2019-03-18 22:10:39
