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

-- Copiando estrutura para tabela lab.manutencao
CREATE TABLE IF NOT EXISTS `manutencao` (
  `codmanutencao` int(11) NOT NULL AUTO_INCREMENT,
  `codativo` int(11) NOT NULL,
  `codtecnico` int(11) NOT NULL,
  `tipomanutencao` char(1) NOT NULL,
  `ordemservico` int(11) DEFAULT NULL,
  `descmanutencao` varchar(60) NOT NULL,
  `datamanutencao` date NOT NULL,
  `dataliberacao` date DEFAULT NULL,
  `statusmanutencao` char(1) NOT NULL,
  PRIMARY KEY (`codmanutencao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

-- Copiando estrutura para tabela lab.tecnico
CREATE TABLE IF NOT EXISTS `tecnico` (
  `codtecnico` int(11) NOT NULL AUTO_INCREMENT,
  `nometecnico` varchar(30) NOT NULL,
  `fonetecnico` varchar(15) NOT NULL,
  `emailtecnico` varchar(40) NOT NULL,
  PRIMARY KEY (`codtecnico`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
