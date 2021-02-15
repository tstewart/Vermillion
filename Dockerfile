FROM openjdk:8-alpine

COPY target/uberjar/vermillion.jar /vermillion/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/vermillion/app.jar"]
