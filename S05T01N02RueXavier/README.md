#### We have an entity called FlorEntity with the following properties:
- Long ID
- String name
- String country

We also have a DTO called FlowerDTO, which will have the same properties as the Flower entity, adding one more:

String typeFlower

Depending on the country of origin of the flower, this property must indicate whether it is EU or OUTSIDE EU. To do this, you can have a private list in the same DTO with the countries that are part of the EU.

Using JPA specification, you will have to persist the FlowerEntity entity in a MySQL database, following the MVC pattern.

For this, depending on the main package, you will create a package structure, where you will locate the classes you need:

cat.itacademy.barcelonactiva.surname.name.s05.t01.n02.controllers
cat.itacademy.barcelonactiva.surname.name.s05.t01.n02.model.domain
cat.itacademy.barcelonactiva.surname.name.s05.t01.n02.model.dto
cat.itacademy.barcelonactiva.surname.name.s05.t01.n02.model.services
cat.itacademy.barcelonactiva.surname.name.s05.t01.n02.model.repository

The class located in the controllers package must be able to respond to the following requests to update and query information:

- http://localhost:9001/flor/add
- http://localhost:9001/flor/update
- http://localhost:9001/flor/delete/{id}
- http://localhost:9001/flor/getOne/{id}
- http://localhost:9001/flor/getAll

As you can see, in the application.properties file, you will have to configure the port to use to be 9001.







