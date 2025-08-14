# Gyrmania — Сайт доставки суши 🍣

Веб-приложение для онлайн-заказа блюд из ресторана японской кухни.  
Реализовано на **Java (Spring Boot)** с подключением **PostgreSQL** и развернуто в Docker.

---

## 🚀 Возможности
- Просмотр меню с категориями и блюдами
- Админ-панель для добавления, редактирования и удаления блюд
- Авторизация (демо: `admin / admin`)
- Хранение изображений в облаке (Cloudinary)
- Полная контейнеризация через Docker + docker-compose
- Автоматическая инициализация базы тестовыми данными (`data.sql`)

---

## 🛠 Стек технологий
- **Backend:** Java 17, Spring Boot, Spring MVC, Spring Data JPA, JDBC
- **Database:** PostgreSQL
- **Cloud Storage:** Cloudinary API
- **Frontend:** HTML, CSS, JSTL
- **Build Tool:** Maven
- **Deploy:** Docker, docker-compose
- **Other:** Hibernate ORM, JPA

## ⚙ Запуск проекта (локально с Docker)
1. Клонировать репозиторий:
   ```bash
   git clone https://github.com/Kront2000/Antosha.git
   cd Antosha
2.Собрать проект:
./mvnw clean package

З.запустить контейнеры:
docker-compose up --build

4.Приложение будет доступно по адресу:
http://localhost:8080

