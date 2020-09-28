# DataStorageRelayServer

### Technologies: 
> Spring Boot, Spring Data, Spring Cloud, Hibernate, JPA, REST, Spring MVC, MySQL, Maven, JSON
### Java version: 14

### Start the app:
> com.github.zhalabkevich.validation.ValidationApplication 

### REST 

> - GET http://localhost:8080/api/cars/ - view all cars
> - POST http://localhost:8080/api/cars/add/ - add new car {"car_number": "AA 0000-0", "car_brand": id, "car_model": id, "car_tenant": id}
> - GET http://localhost:8080/api/cars/{id_car}/ - view car on id
> - GET http://localhost:8080/api/cars/tenant/{id_car}/ - view the tenant's cars
> - GET http://localhost:8080/api/cars/brands/ - view all car brand
> - GET http://localhost:8080/api/cars/brands/{id_brand}/ - view brand models

> - GET http://localhost:8080/api/tenants/ - view all tenants
> - GET http://localhost:8080/api/tenants/{id_tenant}/ - view tenant

> - GET http://localhost:8080/api/stat/here/ - cars on the territory

> - POST http://localhost:8080/api/stat/add/ - add car entry into the territory {"time_in": "15:54:48", "days": "08.05.2020", "last_flag": false, "car": 16}
> - PUT http://localhost:8080/api/stat/add/ - car driving from the territory {"time_out": "08:55:17", "last_flag": true, "car": 16}

> - POST http://localhost:8080/user/signup - register new user/signup 
> - POST http://localhost:8080/user/login - login for existing user {"email": "user@mail.com", "password": "user"}
> - POST http://localhost:8080/user/logout - logout, invalidate session

### Cars API (REST)
### Start the app:
> com.github.zhalabkevich.car_server.CarServerApplication 
### SQL scripts for Cars API:
> src/main/resourses/sql/scripts.sql 
### REST
> - GET http://localhost:8000/api/cars/ - view all cars
> - POST http://localhost:8000/api/cars/add/ - add new car {"car_number": "AA 0000-0", "car_brand": id, "car_model": id, "car_tenant": id}
> - GET http://localhost:8000/api/cars/{id_car}/ - view car on id
> - GET http://localhost:8000/api/cars/tenant/{id_car}/ - view the tenant's cars
> - GET http://localhost:8000/api/cars/brands/ - view all car brand
> - GET http://localhost:8000/api/cars/brands/{id_brand}/ - view brand models

> - GET http://localhost:8000/api/tenants/ - view all tenants
> - GET http://localhost:8000/api/tenants/{id_tenant}/ - view tenant

> - GET http://localhost:8000/api/stat/here/ - cars on the territory

> - POST http://localhost:8000/api/stat/add/ - add car entry into the territory {"time_in": "15:54:48", "days": "08.05.2020", "last_flag": false, "car": 16}
> - PUT http://localhost:8000/api/stat/add/ - car driving from the territory {"time_out": "08:55:17", "last_flag": true, "car": 16}


### Registration API (REST)
### Start the app:
> com.github.zhalabkevich.registration.RegistrationApplication
### SQL scripts for Cars API:
> src/main/resourses/sql/scripts.sql 

### REST

> - POST http://localhost:8001/user/signup - register new user/signup {"email": "user@mail.com", "password": "user"} or full info
> - POST http://localhost:8001/user/login - login for existing user {"email": "user@mail.com", "password": "user"}
> - POST http://localhost:8001/user/logout - logout, invalidate session
