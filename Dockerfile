# Use an official OpenJDK runtime as a parent image
FROM openjdk:18-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the executable jar file and the application.properties file to the container
COPY target/springboot-config-and-secrets-managed-by-doppler-0.0.1-SNAPSHOT.jar /app/
COPY src/main/resources/application.properties /app/

# Set the command to run the Spring Boot application
CMD ["java", "-jar", "springboot-config-and-secrets-managed-by-doppler-0.0.1-SNAPSHOT.jar"]
