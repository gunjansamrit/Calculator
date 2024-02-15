# Use a Java runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Java executable JAR file from the target directory into the container
COPY target/Calculator-0.0.1-SNAPSHOT.jar /app/Calculator-0.0.1-SNAPSHOT.jar

# Command to run the Java application
CMD ["java", "-jar", "Calculator-0.0.1-SNAPSHOT.jar"]
