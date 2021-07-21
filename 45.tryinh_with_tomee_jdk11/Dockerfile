# apt update && apt install wget -y && wget https://mirrors.estointernet.in/apache/tomcat/tomcat-9/v9.0.50/bin/apache-tomcat-9.0.50.tar.gz && tar -xvf apache-tomcat-9.0.50.tar.gz

# Using tomee image for tomcat server
FROM tomee:11-jre-8.0.0-M3-microprofile

# Copying
COPY build/libs/tryinh_with_tomee_jdk11-1.0-SNAPSHOT.war /usr/local/tomee/webapps/contact_project.war

