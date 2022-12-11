FROM openjdk:15-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

VOLUME /tmp

ADD target/PersonalStock-0.0.1-SNAPSHOT.jar PersonalStock.jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} PersonalStock-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "PersonalStock-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081







