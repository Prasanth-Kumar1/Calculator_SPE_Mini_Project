FROM openjdk:8-alpine
COPY /target/calculator-1.0-SNAPSHOT.jar /home/calculator-1.0-SNAPSHOT.jar
CMD ["java","-cp","/home/calculator-1.0-SNAPSHOT.jar","calculator"]