## Sprint 5: Advanced Spring Boot

#### 🔍 What will you find in this repository?
In this repo you will find the solution for level 1,2,3 of task 5.1

Furthermore, I have implemented exception handling and testing.
If you want to see in detail every level, i have copied the exercice statement in their respective folder.


## [Level 1](https://github.com/Ruex97/Sprint5.1-AdvancedSpring-ApiRest/tree/main/S05T01N01RueXavier)
#### Developing a Web Application with MVC and JPA for Persisting Data into a MySql Database.

In this exercise, we are tasked with creating a web application that utilizes the MVC (Model-View-Controller) pattern and the JPA (Java Persistence API) specification to persist data for a Branch entity into a MySql database. We also need to create a BranchDto data transfer object with an additional property that indicates whether a branch is in the EU or not, and use this DTO in the Controller and View layers while using the Branch entity in the Repository layer. We need to respond to requests to update and query information, and develop the view using Thymeleaf and optionally using a CSS library such as Bootstrap.

## [Level 2](https://github.com/Ruex97/Sprint5.1-AdvancedSpring-ApiRest/tree/main/S05T01N02RueXavier)
#### Creating a Java application with JPA and MySQL database connectivity

In this exercise, we are asked to create a Java application that uses the JPA specification to persist a flower entity with properties such as an ID, name, and country of origin to a MySQL database. We also need to create a DTO that includes an additional property indicating whether the flower is from within the European Union or not. We will organize the application into different packages for controllers, domain, DTO, services, and repository, and implement an MVC pattern. Finally, we need to configure the application to use port 9001 and create endpoints for adding, updating, deleting, and retrieving flower information.

## [Level 3](https://github.com/Ruex97/Sprint5.1-AdvancedSpring-ApiRest/tree/main/S05T01N03RueXavier)
#### Developing a Web Application with MVC and JPA for Persisting Data into a MySql Database.

In this exercise, using RestTemplate or WebClient, you need to connect to the API you created in level 2 to call and test all the requests that the API allows. This task is about building a REST API client application that will communicate with the API created in level 2. You do not have any reference to a database, nor do you need to use JPA, as your repository will access the level 2 API. You will need to create all the layers up to the controller as any other application. The controller class must be able to handle the HTTP requests for adding, updating, deleting, retrieving one or all flowers from the API. The API client application will be run on port 9002. To test level 3, you will need to have the level 2 API running on port 9001.









