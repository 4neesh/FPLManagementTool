CREATE DATABASE  IF NOT EXISTS `fpl_fixtures`;
USE `fpl_fixtures`;

--
-- Table structure for table `fpl_fixtures`
--

DROP TABLE IF EXISTS `fpl_fixtures`;

CREATE TABLE `fpl_fixtures` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gameweek` int(3) DEFAULT NULL,
  `home` varchar(45) DEFAULT NULL,
  `away` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `fpl_fixturesfpl_fixtures` VALUES 
	(1,1,'LIV','NOR'),
	(2,1,'WHU','MCY')


