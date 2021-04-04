FROM arm32v6/alpine:3.7
RUN apk update \
    && apk add openjdk8 \
    && java -version
ADD docker.jar docker.jar
EXPOSE 8080
CMD java -jar docker.jar