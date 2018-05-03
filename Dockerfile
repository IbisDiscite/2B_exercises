FROM openjdk:8
ADD target/exercises-mysql.jar exercises-mysql.jar
EXPOSE 4040
ENTRYPOINT ["java", "-jar", "exercises-mysql.jar"]
