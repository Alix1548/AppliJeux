-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 13 jan. 2020 à 20:35
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `applijeux`
--

-- --------------------------------------------------------

--
-- Structure de la table `adherent`
--

DROP TABLE IF EXISTS `adherent`;
CREATE TABLE IF NOT EXISTS `adherent` (
  `idAdherent` int(4) NOT NULL AUTO_INCREMENT,
  `Login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idAdherent`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `adherent`
--

INSERT INTO `adherent` (`idAdherent`, `Login`, `password`, `nom`, `prenom`) VALUES
(1, 'acoller', 'mdpacollet', 'Collet', 'Alix');

-- --------------------------------------------------------

--
-- Structure de la table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `idAdherent` int(4) NOT NULL AUTO_INCREMENT,
  `Login` varchar(20) NOT NULL,
  `password` varchar(8) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idAdherent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `jeux`
--

DROP TABLE IF EXISTS `jeux`;
CREATE TABLE IF NOT EXISTS `jeux` (
  `idJuex` int(4) NOT NULL AUTO_INCREMENT,
  `nom` varchar(30) NOT NULL,
  `description` varchar(140) DEFAULT NULL,
  `durrée` int(11) NOT NULL,
  `nbjmax` int(2) NOT NULL,
  `nbjmin` int(2) NOT NULL,
  `id_Theme` int(4) NOT NULL,
  `id_Aderent` int(4) DEFAULT NULL,
  PRIMARY KEY (`idJuex`),
  KEY `FK_Jeu_Theme` (`id_Theme`),
  KEY `FK_Jeu_Aderent`(`id_Aderent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `message`
--

DROP TABLE IF EXISTS `message`;
CREATE TABLE IF NOT EXISTS `message` (
  `idMessage` int(4) NOT NULL AUTO_INCREMENT,
  `date` datetime NOT NULL,
  `lu` tinyint(4) NOT NULL,
  `type` varchar(20) NOT NULL,
  `id_Adherent` int(4) NOT NULL,
  `id_Message` int(4) NOT NULL,
  PRIMARY KEY (`idMessage`),
  KEY `FK_message_adherent`(`id_Adherent`),
  KEY `FK_message_messsage`(`id_Message`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `seance`
--

DROP TABLE IF EXISTS `seance`;
CREATE TABLE IF NOT EXISTS `seance` (
  `idSeance` int(4) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `heure_fin` datetime NOT NULL,
  `heure_debut` datetime NOT NULL,
  PRIMARY KEY (`idSeance`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `theme`
--

DROP TABLE IF EXISTS `theme`;
CREATE TABLE IF NOT EXISTS `theme` (
  `idTheme` int(4) NOT NULL AUTO_INCREMENT,
  `libelle` varchar(20) NOT NULL,
  PRIMARY KEY (`idTheme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Structure de la table `Inscription`
--

DROP TABLE IF EXISTS `inscription`;
CREATE TABLE IF NOT EXISTS `inscription` (
  `idInscription` int(4) NOT NULL AUTO_INCREMENT,
  `id_Adherent` int(4) NOT NULL,
  `id_Seance` int(4) NOT NULL,
  PRIMARY KEY (`idInscription`,`id_Adherent`,`id_Seance`),
  KEY `FK_message_adherent`(`id_Adherent`),
  KEY `FK_message_seance`(`id_Seance`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `jeux`
--
ALTER TABLE `jeux`
  ADD CONSTRAINT `FK_Jeu_Theme` FOREIGN KEY (`id_Theme`) REFERENCES `theme` (`idTheme`);
COMMIT;
  ADD CONSTRAINT `FK_Jeu_Aderent` FOREIGN KEY (`id_Aderent`) REFERENCES `adherent` (`idAderent`);
COMMIT;

--
-- Contraintes pour la table `message`
--

ALTER TABLE `message`
  ADD CONSTRAINT `FK_message_seance` FOREIGN KEY (`id_seance`) REFERENCES `seance` (`idSeance`);
COMMIT;
  ADD CONSTRAINT `FK_message_Aderent` FOREIGN KEY (`id_Aderent`) REFERENCES `adherent` (`idAdherent`);
COMMIT;

--
-- Contraintes pour la table `message`
--

ALTER TABLE `inscription`
  ADD CONSTRAINT `FK_inscription_Aderent` FOREIGN KEY (`id_Aderent`) REFERENCES `adherent` (`idAdherent`);
COMMIT;
  ADD CONSTRAINT `FK_inscription_seance` FOREIGN KEY (`id_seance`) REFERENCES `seance` (`idSeance`);
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
