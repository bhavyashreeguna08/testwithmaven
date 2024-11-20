# Use OpenJDK as the base image for your Java application
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your target folder to the container
COPY target/testwithmaven-1.0.jar /app/app.jar

# Command to run the application (execute the JAR file)
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
