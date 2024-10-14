##### Spring Data JPA project with Spring Boot

- Steps: <br>
-- 1. create a starter project using start.spring.io <br>
-- 2.	Add dependencies of spring-boot-starter-data-jpa and mysql-connector j <br>
-- 3. Create an Entity class with @Entity annotation - its a POJO object class <br>
-- 4. Create your custom repository interface that extends JpaRepository(provides all CRUD operations) and your custom repo has empty body <br>
-- 5. Create a Service interface and provide your custom methods to implement CRUD operations
-- 6. Create a Service interface implementation class and provide implementations for the methods in service interface using JpaRepository interface CRUD(or DAO) methods <br>
--7. in main(), use Application context and service implementation class for inserting, updating, creating, and deleting data <br>
-- 8. Create database in Terminal or using MySQL workbench
-- 9. Provide database connection in application.properties file(jdbc url, mysql username and password, hibernate dialect, table creation etc) <br>

###### NOTE: Update your ``mysql username and password`` in application.properties file before running your spring-boot application



