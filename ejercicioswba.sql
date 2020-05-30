-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 30-05-2020 a las 02:25:21
-- Versión del servidor: 5.7.24
-- Versión de PHP: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejercicioswba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `agregarvideo`
--

DROP TABLE IF EXISTS `agregarvideo`;
CREATE TABLE IF NOT EXISTS `agregarvideo` (
  `id_video` int(11) NOT NULL AUTO_INCREMENT,
  `usuarioVideo` text CHARACTER SET latin1 NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `url` varchar(50) NOT NULL,
  `plataforma` varchar(50) NOT NULL,
  `urlCompleta` varchar(50) NOT NULL,
  PRIMARY KEY (`id_video`)
) ENGINE=MyISAM AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `agregarvideo`
--

INSERT INTO `agregarvideo` (`id_video`, `usuarioVideo`, `titulo`, `url`, `plataforma`, `urlCompleta`) VALUES
(10, 'Krono', 'Kurt- La Mujer Perfecta (Lyric Video)', 'QD0aSAe67CI', 'YouTube', 'https://www.youtube.com/watch?v=QD0aSAe67CI'),
(9, 'Krono', 'Part Time Heroes : A Sea Shepherd Documentary', '243707834', 'Vimeo', 'https://vimeo.com/channels/documentary/243707834'),
(8, 'Krono', 'Mirei Touyama - By Your Side', 'JeT796p_5cg', 'YouTube', 'https://www.youtube.com/watch?v=JeT796p_5cg'),
(11, 'Krono', 'Primer clase de japonés con Anna Iriyama', '8qzscKX6_WQ', 'YouTube', 'https://www.youtube.com/watch?v=8qzscKX6_WQ'),
(12, 'Krono', 'Lo Mejor de Beethoven', 'W-fFHeTX70Q', 'YouTube', 'https://www.youtube.com/watch?v=W-fFHeTX70Q'),
(14, 'Krono', 'The Monolith', '244555885', 'Vimeo', 'https://vimeo.com/channels/documentary/244555885'),
(21, 'neos', 'How to Hollow a Book', '189642668', 'Vimeo', 'https://vimeo.com/189642668'),
(19, 'Krono', 'Animation Tutorial # 2: Expressive Eyes', '191624680', 'Vimeo', 'https://vimeo.com/191624680'),
(22, 'neos', 'Zombieland 2: Double Tap', 'bKLpU-p8Zlo', 'YouTube', 'https://www.youtube.com/watch?v=bKLpU-p8Zlo'),
(23, 'neos', 'MAGIC! - Rude (Official Music Video)', 'PIh2xe4jnpk', 'YouTube', 'https://www.youtube.com/watch?v=PIh2xe4jnpk'),
(28, 'neos', 'Tom Rosenthal | “Lead Me To You”', '176894130', 'Vimeo', 'https://vimeo.com/176894130'),
(27, 'neos', 'Orange Opening', 'Qml0mNDJvKs', 'YouTube', 'https://www.youtube.com/watch?v=Qml0mNDJvKs'),
(29, 'neos', 'Corona ‘This Is Living’ Bottle Films', '167412210', 'Vimeo', 'https://vimeo.com/167412210'),
(30, 'neos', '¿Cuanto Gana Un Programador Intermedio y Senior?', 'G0jfR5LDqio', 'YouTube', 'https://www.youtube.com/watch?v=G0jfR5LDqio'),
(31, 'gamer ', 'Pharrell Williams - Happy', 'ZbZSe6N_BXs', 'YouTube', 'https://www.youtube.com/watch?v=ZbZSe6N_BXs'),
(32, 'gamer ', 'Andy Mineo & Wordsplayed - DANCE', '243668441', 'Vimeo', 'https://vimeo.com/243668441'),
(33, 'gamer ', 'EDEN | Gold', '243403452', 'Vimeo', 'https://vimeo.com/243403452'),
(34, 'gamer ', 'Miguel - I Told You So', '241497923', 'Vimeo', 'https://vimeo.com/241497923'),
(35, 'gamer ', 'The Vaccines - Give Me A Sign', '141858260', 'Vimeo', 'https://vimeo.com/141858260'),
(36, 'gamer ', 'Bruno Mars - The Lazy Song ', 'fLexgOxsZu0', 'YouTube', 'https://www.youtube.com/watch?v=fLexgOxsZu0'),
(37, 'gamer ', 'Coldplay - Adventure Of A Lifetime', 'QtXby3twMmI', 'YouTube', 'https://www.youtube.com/watch?v=QtXby3twMmI'),
(38, 'lorenita', 'Carol of the Bells - Lindsey Stirling', 'EKkzbbLYPuI', 'YouTube', 'https://www.youtube.com/watch?v=EKkzbbLYPuI'),
(39, 'lorenita', 'Sleepwalking - Lindsey Stirling', 'jyvcg72-reA', 'YouTube', 'https://www.youtube.com/watch?v=jyvcg72-reA'),
(40, 'lorenita', 'Wake Me Up - Avicii  - Simply Three', 'XSs2cR2Tvuk', 'YouTube', 'https://www.youtube.com/watch?v=XSs2cR2Tvuk'),
(41, 'lorenita', 'Heineken Legendary Posters', '91603846', 'Vimeo', 'https://vimeo.com/91603846'),
(42, 'lorenita', 'Remember Friday Art Class', '61787451', 'Vimeo', 'https://vimeo.com/61787451'),
(43, 'lorenita', 'Portugal. The Man - “So Young”', '220084649', 'Vimeo', 'https://vimeo.com/220084649'),
(44, 'lorenita', 'We Found Love - Lindsey Stirling', '0g9poWKKpbU', 'YouTube', 'https://www.youtube.com/watch?v=0g9poWKKpbU'),
(45, 'eren', 'Angelina Jordan - Bohemian Rhapsody', 'LsTH02V9Pt4', 'YouTube', 'https://www.youtube.com/watch?v=LsTH02V9Pt4'),
(46, 'eren', 'Daneliya Tuleshova - Rise Up - The World\'s Best', 'voLvnqzs0J8', 'YouTube', 'https://www.youtube.com/watch?v=voLvnqzs0J8'),
(47, 'eren', 'Delhis sorprende a todos con su primera nota', 'igCSieG5qrY', 'YouTube', 'https://www.youtube.com/watch?v=igCSieG5qrY'),
(48, 'eren', 'Jackie Evancho - To Believe ', 'isQWXmbwURw', 'YouTube', 'https://www.youtube.com/watch?v=isQWXmbwURw'),
(49, 'eren', 'Connie Talbot - Colours of The Wind', 'G1CLhkXX4lU', 'YouTube', 'https://www.youtube.com/watch?v=G1CLhkXX4lU'),
(50, 'eren', 'Booking.com - ‘Wing It’ Global TV', '132853121', 'Vimeo', 'https://vimeo.com/132853121'),
(51, 'eren', 'CHI Free Our Voices : Teaser Film', '110472172', 'Vimeo', 'https://vimeo.com/110472172'),
(52, 'juanito', 'Bienvenidos a Cuba | Alan por el mundo', 'NntF1iERRYc', 'YouTube', 'https://www.youtube.com/watch?v=NntF1iERRYc'),
(53, 'juanito', 'Lo más bello que he visto en mi vida! - India #4', 'RteKx_UKUes', 'YouTube', 'https://www.youtube.com/watch?v=RteKx_UKUes'),
(54, 'juanito', 'Así se vive el MUNDIAL 2018 en RUSIA ', 'DuI70G_AClA', 'YouTube', 'https://www.youtube.com/watch?v=DuI70G_AClA'),
(55, 'juanito', 'Phenomena Exotica', '412790601', 'Vimeo', 'https://vimeo.com/412790601'),
(56, 'juanito', 'Esther', '405992218', 'Vimeo', 'https://vimeo.com/405992218'),
(57, 'juanito', 'Drum Wave', '422276660', 'Vimeo', 'https://vimeo.com/422276660'),
(58, 'juanito', 'Insight: Brad Bird on Animation', '189791698', 'Vimeo', 'https://vimeo.com/189791698'),
(59, 'kratos12', 'Queen - I Want To Break Free', 'f4Mc-NYPHaQ', 'YouTube', 'https://www.youtube.com/watch?v=f4Mc-NYPHaQ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
CREATE TABLE IF NOT EXISTS `comentarios` (
  `comentarios` text CHARACTER SET latin1 COLLATE latin1_spanish_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `comentarios`
--

INSERT INTO `comentarios` (`comentarios`) VALUES
('Sabía lo que significa \"Yabai\", pero nunca pensé en asociarlo al \"no manches\", y es perfecto, arigatou Anna-Sensei'),
('<br>'),
('Creo que deberÃ­as de hacer mas vÃ­deos como esto, son muy didÃ¡cticos.'),
('Que buen video, creo esto ayuda a muchas personas.'),
('Apenas te escuche hablar japonÃ©s y me suscribÃ­.'),
('Son palabras muy interesantes.'),
('Excelente vídeo, gracias por la información.'),
('Algunas palabras ya las conocÃ­a pero otras no, muchas gracias por el vÃ­deo.'),
('hola soy nuevo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) CHARACTER SET latin1 NOT NULL,
  `usuario` varchar(50) CHARACTER SET latin1 NOT NULL,
  `nombre` varchar(50) CHARACTER SET latin1 NOT NULL,
  `pass` varchar(20) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `apellido`, `usuario`, `nombre`, `pass`) VALUES
(1, 'Perez', 'neos', 'Juan', '123'),
(7, 'Cano', 'Krono', 'Oscar', '246'),
(9, 'Ortiz', 'gamer', 'Agustin', '1234'),
(10, 'Rojero', 'lorenita', 'Lorena', '123'),
(11, 'Villanueva', 'manuelito', 'Manuel', '1234'),
(13, 'Jaeger', 'eren', 'Eren', '999'),
(14, 'Perez', 'juanito', 'juan', '123'),
(15, 'Ortiz', 'Agustino', 'Agustin', '123'),
(17, 'Castro', 'kratos12', 'Eduardo', 'kratos12'),
(18, 'Davalos Torres', 'kido123', 'Jorge Alberto', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
