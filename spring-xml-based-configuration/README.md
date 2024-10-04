##### XML Based Configuration in Spring Framework
- Key Concepts: ``ApplicationContext`` spring IoC Container - it's an interface, ``ClassPathXmlApplicationContext`` - class that implements the ApplicationContext interface and ``getBean`` method <br>
- Spring Container makes objects for you. You do not have to make them - just use getBean method to retrieve them.
<hr>

##### Steps 
- create a simple java project in Eclipse IDE
- create a beans package and in it create a POJO class (named Student in this project)
- create resources package and in it, create an xml file named ``applicationContext.xml``
- create a package named main and in it, create App.java file (It has main mehtod and is applicaiton runner)
- create a folder named downloaded-spring-jars where you will be downloading and adding 5 different spring jar files to make this app run successfully. <br>
- Needed jar files are below. xxx means version number and all jars should have same version number except commons logging. You can download this files from ``Maven central repository`` <br>
--- spring-beans-xxx.jar <br>
--- spring-core-xxx.jar <br>
--- spring-context-xxx.jar <br>
--- spring-expression-xxx.jar <br>
--- Apache commons logging-xxx.jar <br>

<hr>

##### To add downloaded jar files to your project
- Right click on project
- Select Build Path > Configure Build Path > Libraries > Class Path > Add Libraries > User Library > User Libraries > New >
give name to your library > select it > add external jars > select jar files from your downloaded directory

##### To run this project
- Right click anywhere on App.java file and select Run As > Java Application
