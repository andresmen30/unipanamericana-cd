FROM openjdk:8
EXPOSE 8080
ADD target/unipanamericana-docker.jar unipanamericana-docker.jar
ENTRYPOINT ["java", "-jar", "/unipanamericana-docker.jar"]