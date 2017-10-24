# SpringBoot-Webflow

Spring Web Flow builds on Spring MVC and allows implementing flows within a web application. It’s used for creating sequences of steps that guide users through a process or some business logic. sometimes the scenario may require be to have a more tight control over the flow of the application or to manage the possible ways to navigate through the application.

Spring  Web-Flow helps in this kind of scenario by clearly defining the views and the transition between them. Web-Flow is itself based on top of Spring MVC and hence provides all the goodies of Spring MVC plus the added control over the transitions.

Our application will be a simple login based application. Upon hitting the URL for the first time, the user will directed to a login page. The user enters his credentials and clicks on the login button. If the password is correct the view transitions to success view or else the user is directed back to the login screen.

Flow is basically a cycle of events that will lead to completion of a single task in the context of the application. This cycle or flow will include multiple events and the user maybe made to navigate to and fro between various views, depending upon the choice he makes.

## Points:
1. There is a clear start and an end point.
2. The user must go through a set of screens in a specific order.
3. The changes are not finalized until the last step.
4. Once complete it shouldn't be possible to repeat a transaction accidentally

## pom.xml

<dependency>
	<groupId>org.springframework.webflow</groupId>
	<artifactId>spring-webflow</artifactId>
	<version>2.4.2.RELEASE</version>
</dependency>
