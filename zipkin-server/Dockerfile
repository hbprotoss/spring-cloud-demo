FROM java:8

ENV ZIPKIN_ROOT /opt/zipkin
ENV LOG_ROOT /var/log
WORKDIR ${ZIPKIN_ROOT}
VOLUME ["/opt/zipkin/config", "/var/log"]

RUN mkdir -p ${LOG_ROOT}
ADD target/zipkin-server.jar ${ZIPKIN_ROOT}/zipkin-server.jar
EXPOSE 8080

CMD ["/bin/sh", "-c", "java -jar -Dspring.config.location=/opt/zipkin/config/application.properties zipkin-server.jar  >> /var/log/zipkin.log 2>&1"]