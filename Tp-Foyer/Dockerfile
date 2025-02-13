FROM openjdk:17-jdk-slim

# Arguments for downloading from Nexus
ARG NEXUS_URL=http://172.16.65.5:8081/repository/maven-releases
ARG GROUP_ID=tn/projet
ARG ARTIFACT_ID=Foyer
ARG VERSION=3.0.0

# Install curl and download the application JAR from Nexus
RUN apt-get update && \
    apt-get install -y curl && \
    curl -o /app.jar "${NEXUS_URL}/${GROUP_ID}/${ARTIFACT_ID}/${VERSION}/${ARTIFACT_ID}-${VERSION}.jar" && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Set the entry point to run the downloaded JAR file
ENTRYPOINT ["java", "-jar", "/app.jar"]

# Expose port 8082 for the application
EXPOSE 8082
