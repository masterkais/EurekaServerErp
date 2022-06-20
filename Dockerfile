FROM  openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY target/eureka-server-erp-0.0.1-SNAPSHOT.jar eureka-server-erp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/eureka-server-erp-0.0.1-SNAPSHOT.jar"]