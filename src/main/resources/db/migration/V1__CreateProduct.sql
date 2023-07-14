CREATE TABLE product (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  unit_of_measure VARCHAR(50) NOT NULL,
  unit_price DECIMAL(10, 2) NOT NULL
);
