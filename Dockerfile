FROM openjdk:8
ADD target/exercises-mysql.jar exercises-mysql.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "exercises-mysql.jar"]