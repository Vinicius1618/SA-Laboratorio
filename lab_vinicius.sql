-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.3.16-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para lab
CREATE DATABASE IF NOT EXISTS `lab` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `lab`;

-- Copiando estrutura para tabela lab.equipamento
CREATE TABLE IF NOT EXISTS `equipamento` (
  `codativo` int(11) NOT NULL AUTO_INCREMENT,
  `tipoequipamento` char(1) NOT NULL,
  `descrequipamento` varchar(30) NOT NULL,
  `sistemaoperacional` varchar(20) DEFAULT NULL,
  `codsoftware` int(11) DEFAULT NULL,
  `codlaboratorio` int(11) NOT NULL,
  `sitpatrimonio` char(1) NOT NULL,
  `dataentrativo` date DEFAULT NULL,
  `databaixaativo` date DEFAULT NULL,
  PRIMARY KEY (`codativo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela lab.equipamento: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `equipamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `equipamento` ENABLE KEYS */;

-- Copiando estrutura para tabela lab.equisoftware
CREATE TABLE IF NOT EXISTS `equisoftware` (
  `codativo` int(11) NOT NULL,
  `codsoftware` int(11) NOT NULL,
  PRIMARY KEY (`codativo`,`codsoftware`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela lab.equisoftware: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `equisoftware` DISABLE KEYS */;
/*!40000 ALTER TABLE `equisoftware` ENABLE KEYS */;

-- Copiando estrutura para tabela lab.laboratorio
CREATE TABLE IF NOT EXISTS `laboratorio` (
  `codBloco` char(1) NOT NULL,
  `codLaboratorio` int(11) NOT NULL,
  `tipoLaboratorio` char(1) NOT NULL,
  `descrLaboratorio` varchar(50) NOT NULL,
  `situacaoLaboratorio` char(1) NOT NULL,
  PRIMARY KEY (`codLaboratorio`,`codBloco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela lab.laboratorio: ~4 rows (aproximadamente)
/*!40000 ALTER TABLE `laboratorio` DISABLE KEYS */;
INSERT INTO `laboratorio` (`codBloco`, `codLaboratorio`, `tipoLaboratorio`, `descrLaboratorio`, `situacaoLaboratorio`) VALUES
	('A', 1, 'I', 'É um laboratorio de informatica', 'A'),
	('B', 1, 'I', 'É um laboratorio de informatica', 'A'),
	('A', 2, 'I', 'É um laboratorio de informatica', 'A'),
	('S', 4, 'S', 'É um laboratorio de SEcsu', 'I');
/*!40000 ALTER TABLE `laboratorio` ENABLE KEYS */;

-- Copiando estrutura para tabela lab.manutençao
CREATE TABLE IF NOT EXISTS `manutençao` (
  `codmanutençao` int(11) NOT NULL AUTO_INCREMENT,
  `codativo` int(11) NOT NULL,
  `codtecnico` int(11) NOT NULL,
  `tipomanutençao` char(1) NOT NULL,
  `ordemserviço` int(11) DEFAULT NULL,
  `descrmanutençao` varchar(60) NOT NULL,
  `datamanutençao` date NOT NULL,
  `dataliberaçao` date DEFAULT NULL,
  `statusmanutençao` char(1) NOT NULL,
  PRIMARY KEY (`codmanutençao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela lab.manutençao: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `manutençao` DISABLE KEYS */;
/*!40000 ALTER TABLE `manutençao` ENABLE KEYS */;

-- Copiando estrutura para tabela lab.software
CREATE TABLE IF NOT EXISTS `software` (
  `codsoftware` int(11) NOT NULL AUTO_INCREMENT,
  `descsoftware` varchar(40) NOT NULL,
  `descversao` varchar(20) NOT NULL,
  `datainstalaçao` date DEFAULT NULL,
  `tipolicença` char(1) DEFAULT NULL,
  PRIMARY KEY (`codsoftware`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela lab.software: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `software` DISABLE KEYS */;
INSERT INTO `software` (`codsoftware`, `descsoftware`, `descversao`, `datainstalaçao`, `tipolicença`) VALUES
	(4, 'Java', '13.5', '2060-12-31', 'V');
/*!40000 ALTER TABLE `software` ENABLE KEYS */;

-- Copiando estrutura para tabela lab.tecnico
CREATE TABLE IF NOT EXISTS `tecnico` (
  `codtecnico` int(11) NOT NULL AUTO_INCREMENT,
  `nometecnico` varchar(50) NOT NULL,
  `fonetecnico` varchar(15) NOT NULL,
  `emailtecnico` varchar(30) NOT NULL,
  PRIMARY KEY (`codtecnico`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela lab.tecnico: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tecnico` DISABLE KEYS */;
INSERT INTO `tecnico` (`codtecnico`, `nometecnico`, `fonetecnico`, `emailtecnico`) VALUES
	(1, 'João da Silva', '47 98854-5548', 'joaodasilva@senai.com.br'),
	(2, 'Pedro Teodoro', '47 98522-2255', 'pteodoro@senai.com.br'),
	(3, 'Arnaldo', '(47) 98555-4298', 'zecasilva@javou.com.br');
/*!40000 ALTER TABLE `tecnico` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
