CREATE DATABASE IF NOT EXIST `pintores`;
USE `pintores`;
CREATE TABLE `pintor` (
  `id_pintor` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `idade` int DEFAULT NULL,
  PRIMARY KEY (`id_pintor`)
);
INSERT INTO `pintor` VALUES (1,'Clesio Seixas',22),(2,'Dina Sfat',38),(3,'Pedro Carlos',29),(4,'Nemis Dias',44),(5,'Luciano Dias',32),(6,'Sergio Rolando',46),(7,'Sr Miro Pinturas',65),(8,'Cleber do Amaral',48),(9,'Gladston Nascimento',49);
