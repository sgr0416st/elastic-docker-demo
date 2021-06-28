FROM docker.elastic.co/beats/filebeat:7.13.0
LABEL maintainer="suguru.sato <sgr0416st@gmail.com>"

COPY config/filebeat.docker.yml /usr/share/filebeat/filebeat.yml
USER root
RUN chown root:filebeat /usr/share/filebeat/filebeat.yml
RUN yum -y update && \
    yum -y install curl
USER filebeat