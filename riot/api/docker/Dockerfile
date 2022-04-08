#FROM leadtools:21.0
FROM openjdk:8


#run
RUN groupadd -g 9900 nsidgroup
RUN useradd  nsidmap -u 2001 -g nsidgroup

USER nsidmap

ADD api-riot-latest.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar", "-Dspring.config.location=/config/application.properties", "--logging.file.name=${LOGFILE}"]
