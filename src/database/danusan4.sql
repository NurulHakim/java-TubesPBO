-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2019 at 06:23 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `danusan4`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(8) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `userpenjual` varchar(8) NOT NULL,
  `userpembeli` varchar(8) NOT NULL,
  `id_barang` int(3) NOT NULL,
  `Nama_menu` varchar(25) NOT NULL,
  `Stok` int(3) NOT NULL,
  `Harga` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`userpenjual`, `userpembeli`, `id_barang`, `Nama_menu`, `Stok`, `Harga`) VALUES
('danu1', 'virda1', 1, 'ayam', 23, 10000);

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `userpembeli` varchar(8) NOT NULL,
  `id_history` int(3) NOT NULL,
  `total_bayar` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`userpembeli`, `id_history`, `total_bayar`) VALUES
('virda1', 0, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `pembeli`
--

CREATE TABLE `pembeli` (
  `nama_pembeli` varchar(25) NOT NULL,
  `userpembeli` varchar(8) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembeli`
--

INSERT INTO `pembeli` (`nama_pembeli`, `userpembeli`, `password`) VALUES
('virda', 'virda1', '1999');

-- --------------------------------------------------------

--
-- Table structure for table `penjual`
--

CREATE TABLE `penjual` (
  `nama_penjual` varchar(25) NOT NULL,
  `userpenjual` varchar(8) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjual`
--

INSERT INTO `penjual` (`nama_penjual`, `userpenjual`, `password`) VALUES
('danu', 'danu1', 'danu12');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `userpenjual` varchar(8) NOT NULL,
  `userpembeli` varchar(8) NOT NULL,
  `Jumlah_beli` int(3) NOT NULL,
  `Nama_menu` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`userpenjual`, `userpembeli`, `Jumlah_beli`, `Nama_menu`) VALUES
('danu1', 'virda1', 2, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id_barang`),
  ADD KEY `username` (`userpenjual`),
  ADD KEY `userpembeli` (`userpembeli`);

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD KEY `username1` (`userpembeli`);

--
-- Indexes for table `pembeli`
--
ALTER TABLE `pembeli`
  ADD PRIMARY KEY (`userpembeli`);

--
-- Indexes for table `penjual`
--
ALTER TABLE `penjual`
  ADD PRIMARY KEY (`userpenjual`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD KEY `username1` (`userpembeli`),
  ADD KEY `username` (`userpenjual`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `barang`
--
ALTER TABLE `barang`
  ADD CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`userpenjual`) REFERENCES `penjual` (`userpenjual`),
  ADD CONSTRAINT `barang_ibfk_2` FOREIGN KEY (`userpembeli`) REFERENCES `pembeli` (`userpembeli`);

--
-- Constraints for table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `history_ibfk_1` FOREIGN KEY (`userpembeli`) REFERENCES `pembeli` (`userpembeli`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`userpembeli`) REFERENCES `pembeli` (`userpembeli`),
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`userpenjual`) REFERENCES `penjual` (`userpenjual`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
