FROM openjdk:8
COPY ./target/bestcalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","bestcalculator-1.0-SNAPSHOT.jar"]
