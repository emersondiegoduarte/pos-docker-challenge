FROM openjdk:8-alpine

COPY /target/*.jar pos-docker-challenge.jar

ENTRYPOINT ["java", "-jar", "pos-docker-challenge.jar"]