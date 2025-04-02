FROM openjdk:17

COPY target/docker-test-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "docker-test-app.jar"]