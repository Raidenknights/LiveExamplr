#build a JAR file first

#FROM maven:3.6.3-jdk-8-slim AS build
#WORKDIR C:\Users\manas\eclipse-workspace\LiveEmaple
#COPY . target
#RUN mvn -f /home/app/pom.xml clean package

# create an Image

FROM openjdk:20-slim-buster
ADD target/live-example-api.jar live-example-api.jar
ENTRYPOINT ["sh","-c","java -jar /live-example-api.jar"]