create schema data
CREATE TABLE `shape` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `area` double DEFAULT NULL,
  `base` double DEFAULT NULL,
  `diameter` double DEFAULT NULL,
  `height` double DEFAULT NULL,
  `type_shape` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci