FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker-image-using-jenkis.jar spring-boot-docker-image-using-jenkis
ENTRYPOINT ["java","-jar","/spring-boot-docker-image-using-jenkis"]
