# Utilisez une image de base avec Java 11
FROM openjdk:11-jre-slim

# Copiez le fichier JAR de votre application dans l'image Docker
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Définissez la commande pour exécuter votre application
ENTRYPOINT ["java","-jar","/app.jar"]
