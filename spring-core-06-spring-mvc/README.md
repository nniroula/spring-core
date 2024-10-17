#### Spring MVC project with Spring Boot
Technologies:<br>
-- Spring Boot <br>
-- Spring Web <br>
-- Spring Dev Tools <br>
-- Spring Data JPA <br>
-- Hibernate <br>
-- MySQL RDBMS <br>


#### How to run a <i>``Seed File``</i> ? 

- Open up terminal in your device and type ``mysql`` and hit enter. If this does not work, then run the command ``mysql -u root -p``. Provide password for your MySQL RDBMS. <br>
	-- Then run the command: ``source seed.sql;`` - it's your <i>``SEED FILE``</i> You may have to provide absolute path to make current working directory unambiguous to MySQL RDMS. If so then, use an absolute path something like this in Mac OS: <br>
``source /Users/nabinniroula/Desktop/Desktop-One/java-portfolio-projects/practice_spring/spring-core-06-spring-mvc/seed.sql``
<br>
	-- Use command ``show databases;`` in the terminal to check your available databases;
	-- Run the command ``use spring_mvc_db(your database name);`` to connect to your database <br>
	-- Run the command ``show tables;`` to show available database tables <br>
	-- ``SELECT * FROM student(or your table name);`` to display the list of items from the database table <br>
	
<hr>

#### Concepts
1. @Controller <br>
2. @RequestParam("html name attribute value") dataType variableName <br>
3. @GetMapping("/your url") <br>
	-- OR @RequestMapping(method = RequestMethod.GET, path = "your api end point") -> path = value <br>
4. PostMapping(----)
5. ModelMap or Modal interface for passing value from controller to jsp file
6. BindingResult attribute
7. JpaRepository interface
8. Interface implementation class
9. @Autowired
10. Field dependency injection
11. @Service annotation to represent service class


#### API Endpoints:
- localhost:8080/welcome <br>
- localhost:8080/add-std <br>
- localhost:8080/student/1 -> to retrieve student by ID  <br>

<hr>

#### Steps
1. create a folder ``src/main/resources/META-INF/resources/WEB-INF/jsp`` and put all jsp files here <br>
2. in ``application.properties`` file, define prefix and suffix for jsp files
