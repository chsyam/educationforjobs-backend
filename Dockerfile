FROM openjdk:17-oracle
ADD target/eduactionforjobs-0.0.1-SNAPSHOT.jar eduactionforjobs-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","eduactionforjobs-0.0.1-SNAPSHOT.jar"]