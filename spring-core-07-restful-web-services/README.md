#### RESTful Web Service using Spring Boot and Spring Web MVC

To create Spring project --> go to start.spring.io
Concepts:
1. ``@RestController`` <br>
2. ``@GetMapping("/api-end-point")`` or ``@GetMapping(path="/api-end-point")``. path may require jsp page in your project <br>
3. ``@PathVariable dataType variableName`` = to access a value of variable in an api end point
4. Path Parameter = variable in api end point
5. ``@RequestMapping(method=Request.GET, path = "/api-end-point")`` or ``@RequestMapping(path="/api-end-point")``
6. ``static block`` - to initialize the static list <br>
7. ``Constructor Based Dependency Injection``
8. ``@RequestBody User user`` for creating a user
9. spring 
10. spring boot
11. Spring Bean
12. Spring IoC Container
14. REST API
15. Communication formats(JSON and XML)
16. Spring Data JPA
17. HTML form
18. Exception Handling in Spring Boot 
19. Starter Projects
20. In DaoService class define a method and in controller class use it

##### Java Concepts
1. Static List
2. List 
3. ArrayList
4. Class instantiation
5. Predicate
6. Functional Programming => stream, filter, lambda expression
7. Optional container return type
8. LocalDate
9. LocalDateTime


##### API end points
1. localhost:8080/users -> retrieves all users <br>
2. localhost:8080/users/1 -> 1 is s user id to get details about a user <br>
3. localhost:8080/user --> For creating a user in Postman like Rest Api client
