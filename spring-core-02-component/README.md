##### Spring framework core - @Component and @ComponentScan
- Key Concepts: <br>
- ``@Component``
- ``@ComponentScan or @ComponentScan("package where component you want to scan is present")``
- ``@Primary``
- ``@Qualifier("nameForQualifier")``
- Multiple Candidate beans
- ``@Configuration``
- Java Configuration file
- ``Interface``
- ``Loose Coupling``
- ``Tight Coupling``
- ``new AnnotationConfigAplicationContext(ConfigurationClass.class)``
- ``try with resources in java``
- context.getBean(JavaComponentClass.class).methodName
- Arrays, stream, forEach() and method reference

<hr>

##### Where to use different annotations
- ``@Component`` -> use with any java class you want to create Spring bean of
- ``@ComponentScan("package Name")`` -> use with a java @Configuration class
- ``@Primary`` -> use with a @Component class which you want to make a default bean when there are multiple candidate beans
- ``@Qualifier("nameForQualifier")`` -> use with a @Component class that you want to give priority when there are multiple candidate beans to be chosen as a qualified bean
- ``Interface`` -> use it to achieve abstraction and loose coupling
- ``@Configuration`` -> use with Java Configuration file 
<br>
<br>
- ``NOTE:`` Application Launcher class with main method does not need any annotations
