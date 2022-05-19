#FROM adoptopenjdk/openjdk11:alpine-jre
#EXPOSE 8090
#COPY target/spring-boot-pfe.jar spring-boot-pfe.jar
#ENTRYPOINT ["java","-jar","/spring-boot-pfe.jar"]


FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8090
VOLUME /tmp
COPY target/pfe_V4-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
