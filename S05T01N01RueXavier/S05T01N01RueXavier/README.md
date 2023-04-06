#### We have an entity named branch with the following properties:

- Integer pk_branchID
- String name
- String country

We also have a DTO named branchDto that will have the same properties as the branch entity, with the addition of one property:

String typeBranch

Depending on the country of the branch, this property should indicate whether it is UE or Outside the EU. To do this, you can have a private list in the same DTO (for example: List String countries) with the countries that are part of the EU.

Using the JPA specification, you will have to persist the branch entity to a MySql database, following the MVC pattern.

For this, depending on the main package, you will create a package structure where you will locate the classes you need:

cat.itacademy.barcelonactiva.surname.name.s05.t01.n01.controllers
cat.itacademy.barcelonactiva.surname.name.s05.t01.n01.model.domain
cat.itacademy.barcelonactiva.surname.name.s05.t01.n01.model.dto
cat.itacademy.barcelonactiva.surname.name.s05.t01.n01.model.services
cat.itacademy.barcelonactiva.surname.name.s05.t01.n01.model.repository

The class located in the controllers package will have to be able to respond to the following requests to update and query information:

http://localhost:9000/sucursal/add
http://localhost:9000/sucursal/update
http://localhost:9000/sucursal/delete/{id}
http://localhost:9000/sucursal/getOne/{id}
http://localhost:9000/sucursal/getAll

As you can see, in the application.properties file, you will have to configure the port to use as 9000.

The view will have to be developed with Thymeleaf.

To make it more attractive, you can optionally use a CSS library that facilitates this, such as Bootstrap, Tailwind, Material, etc.