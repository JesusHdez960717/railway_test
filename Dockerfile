FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/railway_test-0.0.3.SNAPSHOT.20221221.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]