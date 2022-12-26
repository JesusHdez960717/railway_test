FROM openjdk:17-jdk-alpine
COPY "./build/libs/railway_test-0.0.3.SNAPSHOT.20221221" app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]