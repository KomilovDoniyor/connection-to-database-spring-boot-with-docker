FROM amazoncorretto:11-alpine-jdk
EXPOSE 8081
COPY target/spring-boot-docker-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
ADD target/spring-boot-docker-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]