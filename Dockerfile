FROM openjdk:17-jdk-alpine
EXPOSE 8080
COPY ./target/my-app-*.jar /usr/app/
WORKDIR /usr/app
CMD java -jar my-app-*.jar
