-- -------------------------
-- Table structure of 'User'
-- -------------------------
DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
	`id` INT(11) UNSIGNED AUTO_INCREMENT,
	`username` varchar(20) NOT NULL,
	`password` varchar(20) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ------------------------
-- Records of user
-- ------------------------
INSERT INTO `User` (`username`, `password`) VALUES ('admin', 'admin');
INSERT INTO `User` (`username`, `password`) VALUES ('kin', '123456');
