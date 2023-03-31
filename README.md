# Spring Monolithic Example

Spring Monolithic Example is a proof-of-concept full-stack web application that
leverages a couple of top level [Spring Boot](https://spring.io/projects/spring-boot) Java packages to more easily instantiate
a backend API to be consumed by an [Angular](https://angular.io/) UI.

### Tech

Spring Monolithic Example uses a number of technologies to work properly:

- [Java](https://www.java.com/en/) - Backend language for serving up data to the UI
- [Apache Maven](https://maven.apache.org/) - Java project build, dependency, and lifecycle management tool
- [Node.js](https://nodejs.org/en) - Evented I/O for the UI
- [Yarn](https://yarnpkg.com) - Node.js project build, dependency, and lifecycle management tool
- [Angular](https://angular.io/) - HTML enhanced for web apps
- [Bootstrap](https://getbootstrap.com/) - Great UI boilerplate for modern web apps

### Setup

Spring Monolithic Example requires [Node.js](https://nodejs.org/) v16.10+  and [Yarn](https://yarnpkg.com) v2+ to run.

Install the dependencies and devDependencies and start the server.

#### API

```sh
cd spring-monolithic-example/api
mvn clean install
mvn clean -Dspring-boot:run
```

#### UI

```sh
cd spring-monolithic-example/ui
yarn install
yarn start
```

Open a browser and navigate to http://localhost:4200
