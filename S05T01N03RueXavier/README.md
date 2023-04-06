Using **WebClient**, you will have to connect to the API that you created in level 2, to call and test all the requests that this API allows.

Keep in mind that in this task of level 3, you have no reference to any database, nor do you need to use JPA, since your repository will access the API from level 2.

You do not need to create a View because this level 3 is intended as a Rest API, but you will need to create all the layers up to the controller like any other application:

cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.controllers
cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain
cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.dto
cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.services
cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.repository

The controller class must be able to handle the following requests:

- http://localhost:9002/flor/clientFlorsAdd
- http://localhost:9002/flor/clientFlorsUpdate
- http://localhost:9002/flor/clientFlorsDelete/{id}
- http://localhost:9002/flor/clientFlorsGetOne/{id}
- http://localhost:9002/flor/clientFlorsAll

As you can see, in the application.properties file, you will have to configure the port to use as 9002.

To test level 3, you will need to have level 2 API running. You will not have any problems since level 3 API works with port 9002 and level 2 with port 9001.






