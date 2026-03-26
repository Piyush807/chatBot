FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy all project files
COPY . .

# Build the project
RUN ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/chatBot-0.0.1-SNAPSHOT.jar"]