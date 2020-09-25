

# require

1. jdk1.8
2. mongodb
3. docker

# run as docker container

```
# create image
mvn package docker:build

# run
docker run -d --net=host -p 8080:8080 --name springboot-mongodb-docker springboot/springboot-mongodb-docker:latest

# test
http://localhost:8080/swagger-ui.html#/

```
