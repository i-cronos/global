#BUILDER
FROM cronosdevacr.azurecr.io/cronos/jdk/amazonjdk17:1.0.0 AS builder
WORKDIR /tmp/app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN java -Djarmode=layertools -jar app.jar extract

#APP IMAGE
FROM cronosdevacr.azurecr.io/cronos/jdk/amazonjdk17:1.0.0
WORKDIR /opt/app
ARG BUILD_DIR=/tmp/app
COPY --from=builder ${BUILD_DIR}/dependencies/ ./
COPY --from=builder ${BUILD_DIR}/snapshot-dependencies/ ./
COPY --from=builder ${BUILD_DIR}/spring-boot-loader/ ./
COPY --from=builder ${BUILD_DIR}/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]