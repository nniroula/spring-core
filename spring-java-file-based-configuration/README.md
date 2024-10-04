##### Java File based Spring project Configuration
- Key Concepts:
-- ``ApplicationContext`` interface <br>
-- ``AnnotationConfigApplicationContext(YourConfigFile.class)`` class <br>
-- ``getBean("your method name")`` or ``getBean("bean name")`` or ``getBean(PojoClass.class)`` <br>
-- ``@Configuration`` annotation goes with your config class <br>
-- Java Configuration file is used to give instructions to Spring framework <br>

<hr>

##### Steps
-- Create a simple java project
-- Create 3 files: Configuation.java, Main.java and Student.java(POJO) files
-- Need 6 different jar files - add them as external libraries. xxx means version number and all jars should have same version number except commons logging. You can download this files from ``Maven central repository``. They are:
1.	spring-beans-xxx.jar <br>
2.	spring-core-xxx.jar <br>
3.	spring-context-xxx.jar <br>
4.	spring-expression-xxx.jar <br>
5.	Apache commons logging-xxx.jar <br>
6.	spring-aop-xxx.jar

<hr>

##### To add downloaded jar files to your project
- Right click on project
- Select Build Path > Configure Build Path > Libraries > Class Path > Add Libraries > User Library > User Libraries > New >
give name to your library > select it > add external jars > select jar files from your downloaded directory

##### To run this project
- Right click anywhere on App.java file and select Run As > Java Application
