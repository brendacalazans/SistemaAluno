-- phpMyAdmin SQL Dump
-- version 3.5.4
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 03-Maio-2023 às 17:31
-- Versão do servidor: 5.5.28-log
-- versão do PHP: 5.4.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `dbsistemaaluno`
--
CREATE DATABASE `dbsistemaaluno` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `dbsistemaaluno`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbaluno`
--

CREATE TABLE IF NOT EXISTS `tbaluno` (
  `RGMAluno` int(8) NOT NULL,
  `NomeAluno` varchar(80) NOT NULL,
  `DataAluno` date NOT NULL,
  `CPFAluno` varchar(14) NOT NULL,
  `EmailAluno` varchar(80) NOT NULL,
  `EnderecoAluno` varchar(100) NOT NULL,
  `MunicipioAluno` varchar(40) NOT NULL,
  `UFAluno` char(2) NOT NULL,
  `CelularAluno` varchar(15) NOT NULL,
  `CursoAluno` varchar(40) NOT NULL,
  `CampusAluno` varchar(40) NOT NULL,
  `PeriodoAluno` varchar(20) NOT NULL,
  PRIMARY KEY (`RGMAluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbboletim`
--

CREATE TABLE IF NOT EXISTS `tbboletim` (
  `RGMAluno` int(8) NOT NULL,
  `Disciplina` varchar(40) NOT NULL,
  `Semestre` int(2) NOT NULL,
  `Nota` double(3,1) NOT NULL,
  `Falta` int(2) NOT NULL,
  PRIMARY KEY (`RGMAluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
