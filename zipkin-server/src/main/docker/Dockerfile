FROM java:8

VOLUME ["/opt/zipkin", "/var/log"]

RUN mkdir -p /opt/zipkin && mkdir -p /var/log
ADD target/zipkin-server.jar /opt/zipkin/zipkin-server.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/opt/zipkin/zipkin-server.jar", ">", "/var/log/zipkin.log", "2>&1"]