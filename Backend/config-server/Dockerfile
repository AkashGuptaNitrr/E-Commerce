FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

COPY target/config-server-0.0.1-SNAPSHOT.jar app.jar

# Config server default port is 8888
EXPOSE 8888

ENTRYPOINT ["java","-jar","app.jar"]
