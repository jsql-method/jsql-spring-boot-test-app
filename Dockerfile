FROM gradle:5.4-jdk as builder
ADD --chown=gradle . /home/gradle
RUN gradle bootJar


FROM openjdk:8u191-jre-alpine
COPY --from=builder /home/gradle/build/libs/*.jar /tmp/jsql-spring-boot-test-app.jar
CMD java -jar /tmp/jsql-spring-boot-test-app.jar
