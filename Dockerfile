FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# 🔥 IMPORTANT FIX
RUN chmod +x mvnw

# Build project
RUN ./mvnw clean package -DskipTests

# Run app
CMD ["java", "-jar", "target/chatBot-0.0.1-SNAPSHOT.jar"]