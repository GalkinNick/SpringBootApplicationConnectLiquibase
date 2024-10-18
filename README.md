Управление новостной лентой
=========

Приложение для управления новостной лентой. С функционалом: получение новостей, создание новостей, удаление новостой.

Для использования проекта был использованн следующий стек технологий:
--------
- **IntelliJ IDEA** — интегрированная среда разработки программного обеспечения
- **PostgreSQL** — свободная объектно-реляционная система управления базами данных.
- **Liquibase** — это независимая от базы данных библиотека с открытым исходным кодом для отслеживания, управления и применения изменений схемы базы данных.

Принцип работы и возможности подключения:
--------
- Сайт предоставляет пользователю следующий функционал через API: новости создаются, выводятся по ID и общим списком, изменяются и удаляются;
- Миграция структуры базы данных производится с помощью Liquibase;
