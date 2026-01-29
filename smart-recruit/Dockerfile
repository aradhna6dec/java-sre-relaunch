# Stage 1: Build (Maven)
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Build karte hain
RUN mvn clean package -DskipTests

# MAGIC LINE: Jo bhi JAR bani hai, usme se original hatao aur main JAR ko 'app.jar' bana do
RUN cd target && rm -f *.original && mv *.jar app.jar

# Stage 2: Run (Java 21)
FROM eclipse-temurin:21-jre
WORKDIR /app
# Ab 'app.jar' confirm wahan hoga
COPY --from=build /app/target/app.jar app.jar
ENTRYPOINT ["java", "-Xms256m", "-Xmx512m", "-jar", "app.jar"]