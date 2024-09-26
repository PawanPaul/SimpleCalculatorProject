FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY demo/target/demo-1.0.0-jar-with-dependencies.jar simplecalculatorproject.jar
ENTRYPOINT exec java $JAVA_OPTS -jar simplecalculatorproject.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar simplecalculatorproject.jar
