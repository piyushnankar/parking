FROM eclipse-temurin:17-jdk-focal
 
WORKDIR /app

EXPOSE 8080
 
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY ./src/main/resources/application.yml .
RUN ./mvnw dependency:go-offline
 
COPY src ./src
 
CMD ["./mvnw", "spring-boot:run"]