-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mer. 14 déc. 2022 à 10:22
-- Version du serveur : 10.4.25-MariaDB
-- Version de PHP : 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `db_product`
--

-- --------------------------------------------------------

--
-- Structure de la table `catagory`
--

CREATE TABLE `catagory` (
  `id` bigint(20) NOT NULL,
  `my_category` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `category`
--

CREATE TABLE `category` (
  `id` bigint(20) NOT NULL,
  `my_category` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `category`
--

INSERT INTO `category` (`id`, `my_category`) VALUES
(10, 'Computer'),
(11, 'Imprimante'),
(12, 'Software');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(16);

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL,
  `designation` varchar(70) DEFAULT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `id_cat` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `product`
--

INSERT INTO `product` (`id`, `designation`, `price`, `quantity`, `id_cat`) VALUES
(1, 'Prod xd1', 2500, 8, NULL),
(2, 'Prod xd2', 200, 18, NULL),
(3, 'Prod xd3', 5000, 6, NULL),
(4, 'Prod xd1', 2500, 8, NULL),
(5, 'Prod xd2', 200, 18, NULL),
(6, 'Prod xd3', 5000, 6, NULL),
(7, 'Prod xd1', 2500, 8, NULL),
(8, 'Prod xd2', 200, 18, NULL),
(9, 'Prod xd3', 5000, 6, NULL),
(13, 'Prod xd1', 2500, 8, 10),
(14, 'Prod xd2', 200, 18, 11),
(15, 'Prod xd3', 5000, 6, 12);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `catagory`
--
ALTER TABLE `catagory`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKb9e4u0by58dveub6rbauwn1iu` (`id_cat`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
