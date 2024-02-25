FROM openjdk:11-jdk-slim-stretch
ADD target/lonua-0.0.1-SNAPSHOT.jar /lonua-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java","-jar","/lonua-0.0.1-SNAPSHOT.jar"]