CREATE DATABASE JSProducts;

CREATE TABLE `Producto` (
`nombre` varchar(100) DEFAULT NULL,
`descripcion` varchar(100) DEFAULT NULL,
`peso` int(11) DEFAULT NULL,
`stock` int(11) DEFAULT NULL,
`id` int(11) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `Producto` (`nombre`, `descripcion`, `peso`, `stock`, `id`) VALUES
('Producto 1', 'Descripción del Producto 1', 100, 50, 1),
('Producto 2', 'Descripción del Producto 2', 150, 30, 2),
('Producto 3', 'Descripción del Producto 3', 200, 20, 3),
('Producto 4', 'Descripción del Producto 4', 80, 40, 4),
('Producto 5', 'Descripción del Producto 5', 120, 60, 5),
-- Continúa con los valores únicos para `id` aquí
('Producto 46', 'Descripción del Producto 46', 90, 25, 46),
('Producto 47', 'Descripción del Producto 47', 110, 35, 47),
('Producto 48', 'Descripción del Producto 48', 130, 55, 48),
('Producto 49', 'Descripción del Producto 49', 170, 45, 49),
('Producto 50', 'Descripción del Producto 50', 190, 70, 50);