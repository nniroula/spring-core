#### Annotation based Spring project Configuration using XML file
- Key Concepts:
-- Google annotation context xml schema for context and use it in your applicationContext.xml file
-- ``ApplicationContext`` interface <br>
-- ``ClassPathXmlApplicationContext(xml_file_path)`` class <br>
-- ``getBean("your method name")`` or ``getBean("bean name")`` or ``getBean(PojoClass.class)`` <br>
-- ``<context:component-scan`` tag that goes in xml file. <br>
-- In ``applicationContext.xml`` file. We do not use <bean> tags, instead we use <context:component-scan> tags <br>
-- applicationContext.xml file is used to give instructions to Spring framework <br>
-- ``@Component`` annotation is used to declare a class as a Spring bean <br>
-- ``@Value`` annotation is used to inject values into Spring fields or methods <br>


<hr>

#### Steps
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

#### To add downloaded jar files to your project
- Right click on project
- Select Build Path > Configure Build Path > Libraries > Class Path > Add Libraries > User Library > User Libraries > New >
give name to your library > select it > add external jars > select jar files from your downloaded directory

#### To run this project
- Right click anywhere on App.java file and select Run As > Java Application
