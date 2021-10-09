FROM adoptopenjdk/openjdk16:ubi
RUN mkdir /opt/app
COPY ./target/helloworld-0.0.1-SNAPSHOT.jar /opt/app
CMD ["java", "-jar", "/opt/app/helloworld-0.0.1-SNAPSHOT.jar"]