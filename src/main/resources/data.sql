CREATE TABLE categories (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE dishes (
    id SERIAL PRIMARY KEY,
    category_id BIGINT REFERENCES categories(id) ON DELETE SET NULL,
    description TEXT,
    image_path VARCHAR(255),
    name VARCHAR(255) NOT NULL,
    price BIGINT
);
INSERT INTO categories (name)
VALUES
  ('Сеты'),
  ('Шаурма'),
  ('Пицца');
INSERT INTO dishes (category_id, description, image_path, name, price) VALUES
(1, 'Большой сет для компании из 3 видов роллов и суши', '/img/img1.png', 'Сет Комбо', 5990),
(1, 'Классический сет с Филадельфией, Калифорнией и унаги', '/img/img2.png', 'Сет Классика', 4990),
(1, 'Сет из запечённых роллов и горячего ролла', '/img/img3.png', 'Сет Запечённый', 5290),
(1, 'Лёгкий сет с овощными роллами и чука салатом', '/img/img4.png', 'Сет Веган', 4590),
(1, 'Сет с лососем, тунцом и сливочным сыром', '/img/img5.png', 'Сет Рыбный', 5490);