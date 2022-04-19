package com.company;

public class Main {
    public static void main(String[] args) {
       
        CREATE DATABASE fifthproject;

CREATE TABLE products (
                          id SERIAL PRIMARY KEY,
                          productName VARCHAR(30) NOT NULL,
                          manufacturer VARCHAR(20) NOT NULL,
                          productCount INTEGER DEFAULT 0,
                          price NUMERIC
);

INSERT INTO products (productName, manufacturer, productCount, price)
VALUES ('iPhone X', 'Apple', 2, 71000),
       ('iPhone 8', 'Apple', 3, 56000),
       ('Galaxy S9', 'Samsung', 6, 56000),
       ('Galaxy S8 Plus', 'Samsung', 2, 46000),
       ('Desire 12', 'HTC', 3, 26000);

SELECT manufacturer, COUNT(*) AS modelsCount
FROM products
GROUP BY manufacturer
HAVING COUNT(*) > 1;

SELECT manufacturer, COUNT(*) AS modelsCount
FROM products
GROUP BY manufacturer;

SELECT COUNT(*) AS prodCount,
       SUM(productCount) AS totalCount,
       MIN(price) AS minPrice,
       MAX(price) AS maxPrice,
       AVG(price) AS avgPrice
FROM products;

SELECT MAX(price) FROM products;

SELECT MIN(price) FROM products;

SELECT COUNT(*) FROM products;

SELECT AVG(price) AS average_price FROM products;

SELECT SUM(price) FROM products;

SELECT * FROM products WHERE price NOT BETWEEN 20000 AND 50000;

SELECT * FROM products WHERE manufacturer IN ('Samsung', 'HTC', 'Huawei');

SELECT * FROM Products ORDER BY ProductName LIMIT ALL OFFSET 2;

SELECT * FROM products ORDER BY productName LIMIT 2;

SELECT * FROM products ORDER BY price DESC;

SELECT * FROM products ORDER BY price;

SELECT DISTINCT productCount FROM
products;

SELECT * FROM products
WHERE productName LIKE '_____e%';

SELECT * FROM products
WHERE manufacturer = 'Samsung' AND price > 50000;

SELECT * FROM products
WHERE manufacturer = 'Apple';


CREATE TABLE products2 (
                          id SERIAL PRIMARY KEY,
                          productName VARCHAR(30) NOT NULL,
                          company VARCHAR(20) NOT NULL,
                          productCount INT DEFAULT 0,
                          price NUMERIC NOT NULL,
                          isDiscounted BOOL
);

INSERT INTO products2 (productName, company, productCount, price, isDiscounted)
VALUES
    ('iPhone X', 'Apple', 3, 76000, false),
    ('iPhone 8', 'Apple', 2, 71000, true),
    ('iPhone 7', 'Apple', 5, 42000, true),
    ('Galaxy S9', 'Samsung', 2, 46000, false),
    ('Galaxy S8 Plus', 'Samsung', 1, 56000, true),
    ('Desire 12', 'HTC', 5, 28000, true),
    ('Nokia 9', 'HMD Global', 6, 38000, true);

SELECT company, COUNT(*) AS modelsCount FROM products2
GROUP BY company HAVING COUNT(*) >= 2;

SELECT SUM(price) FROM products2;

SELECT * FROM products2 ORDER BY price DESC;

SELECT * FROM products2 WHERE isDiscounted = false;

SELECT * FROM products2 WHERE isDiscounted = true;

SELECT productName FROM products2 ORDER BY price LIMIT 1;

SELECT * FROM products2 ORDER BY price DESC LIMIT 2;

SELECT * FROM products2 WHERE price > 46000;

SELECT * FROM products2 WHERE company = 'Apple' AND price < 75000;

SELECT * FROM products2 WHERE company <> 'HTC';
    }
}
