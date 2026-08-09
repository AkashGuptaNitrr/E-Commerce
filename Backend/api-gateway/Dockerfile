# Use official OpenJDK 17 image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built jar into container
COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar

# Expose port (gateway usually runs on 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
