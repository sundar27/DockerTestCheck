FROM openjdk:8
ADD target/triggerdetails-0.0.1-SNAPSHOT.jar triggerdetails-0.0.1-SNAPSHOT.jar
EXPOSE 9000
ENTRYPOINT ["java","-jar","triggerdetails-0.0.1-SNAPSHOT.jar"
