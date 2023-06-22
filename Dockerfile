# Use a base image with Java 17 and Gradle 8.1.1 installed
FROM eclipse-temurin:17.0.7_7-jdk-alpine AS builder

# Set the working directory
WORKDIR /app

# Copy the build.gradle.kts and settings.gradle files
COPY build.gradle.kts .
COPY settings.gradle.kts .

# Copy the Gradle wrapper files
COPY gradlew .
COPY gradlew.bat .
COPY gradle ./gradle

# Copy the source code
COPY ./todo-list-service/src ./todo-list-service/src
COPY ./domain-events/src ./domain-events/src

# Build and test the application
RUN ./gradlew :todo-list-service:build -x test

COPY ./todo-list-service/build/libs/todo-list-service.jar ./app.jar

# Expose the application port (change it to the actual port your Spring Boot app uses)
EXPOSE 8080

# Set the entrypoint to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
