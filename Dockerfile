FROM openjdk:11
WORKDIR /app
ARG JAR_FILE=target/post.jar
COPY ${JAR_FILE} /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
