FROM openjdk:8u191-jre-alpine
COPY build/libs/*.jar /tmp/jsql-spring-boot-test-app.jar
CMD java -jar /tmp/jsql-spring-boot-test-app.jar
