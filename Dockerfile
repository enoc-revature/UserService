FROM openjdk:8-jdk-alpine
COPY target/*.jar user-service.jar
ENTRYPOINT ["java", "-jar", "/user-service.jar"]
EXPOSE 8081