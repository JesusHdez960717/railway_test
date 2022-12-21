FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/\*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT exec java $JAVA_OPTS  -jar /app.jar