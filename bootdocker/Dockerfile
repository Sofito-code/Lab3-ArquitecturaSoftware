# Utiliza una imagen base de OpenJDK 17
FROM openjdk:17-jdk

# Copia el archivo JAR de tu proyecto Spring Boot al contenedor
COPY ssmu-api-0.0.1-SNAPSHOT.jar /usr/src/bootdocker/ssmu-api-0.0.1-SNAPSHOT.jar

# Establece el directorio de trabajo en /app
WORKDIR /usr/src/bootdocker

# Expone el puerto 8080 que utiliza Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "/usr/src/bootdocker/ssmu-api-0.0.1-SNAPSHOT.jar"]




