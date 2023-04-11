FROM alpine:3.17

RUN apk add openjdk17
COPY build/libs/demo.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]