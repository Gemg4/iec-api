# Use a base image with Java 25
FROM eclipse-temurin:25-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Gradle wrapper and build files
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# Make gradlew executable
RUN chmod +x gradlew

# Build the project (skip tests for speed)
RUN ./gradlew build -x test

# Expose port (Render will provide PORT env)
EXPOSE 8080

# Run the Spring Boot app
CMD ["java", "-jar", "build/libs/iec-server-0.0.1-SNAPSHOT.jar"]
