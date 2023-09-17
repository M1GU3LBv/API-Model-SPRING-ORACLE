FROM openjdk:17
EXPOSE 8080
LABEL authors="alarc"
RUN mkdir -p /app/
ADD build/libs/TestExam-0.0.1-SNAPSHOT.jar /app/TestExam-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/TestExam-0.0.1-SNAPSHOT.jar"]