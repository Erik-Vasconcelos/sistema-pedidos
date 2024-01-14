FROM ubuntu:latest AS build

FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

ARG DATABASE_URL
ARG DATABASE_USERNAME
ARG DATABASE_PASSWORD

RUN apt-get install maven -y
RUN mvn clean install -DskipTests=true

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/sistema-pedido-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]