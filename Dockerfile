FROM openjdk:17-jdk-slim

COPY target/testwithmaven-1.0.jar /app/testwithmaven-1.0.jar

WORKDIR /app

CMD ["java", "-jar", "testwithmaven-1.0.jar"]
