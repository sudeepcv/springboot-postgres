# Springboot-Postgres Skeleton[ gitpod - travis ci - heroku ] [ gitpod - travis ci - heroku skeleton] [![Build Status](https://travis-ci.org/sudeepcv/springboot-postgres.svg?branch=master)](https://travis-ci.org/sudeepcv/springboot-postgres)
### Features

- Spring boot postgres skeleton
- Heroku travis-ci configuration
-  Gitpod IED [image: gitpod/workspace-postgres]
-   The site is up run running at : 
https://springboot-postgres-sudeep.herokuapp.com/

------------



#### Gitpod IDE Configuration

------------

In order to open this repository in git pod ide:

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://github.com/sudeepcv/springboot-postgres)

To run the spring boot application:

`./mvnw spring-boot:run`
or 
`mvn spring-boot:run`

To check the postgres status:

`$ pg_ctl status`
pg_ctl: no server running

To start postgress:

`$ pg_start`

waiting for server to start.... done

server started

To check postgress Status:

`$ pg_ctl status`

pg_ctl: server is running (PID: 1758)

To use dev profile you must provide :

spring.profiles.active=prod

in the application.properties file


## Travis-ci configuration


```json
language: java
jdk: openjdk8
script: mvn package -DskipTests
deploy:
  app: springboot-postgres-sudeep
  provider: heroku
  api_key:
    secure: -------
  on:
    repo: sudeepcv/springboot-postgres
```

If you have both the Heroku and Travis CI command line clients installed, you can get your key, encrypt it and add it to your .travis.yml by running the following command from your project directory:

`travis encrypt $(heroku auth:token) --add deploy.api_key`

To skip the test i have added :

`  script: mvn package -DskipTests`

## Heroku Configuration

------------

To run this app on heroku you need to add a postgres addon 