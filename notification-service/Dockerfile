FROM eclipse-temurin:21-jdk-alpine
COPY target/*.jar app.jar
# JVM memory limits set karein (128MB start, 256MB max)
ENTRYPOINT ["java", "-Xms128m", "-Xmx256m", "-jar", "/app.jar"]