# Community-Store-Project-PRM3-
A mobile-first campus marketplace connecting students, faculty, and local vendors for secure buying, selling, and community announcements.

## Backend

The backend uses Java 21, Spring Boot, Spring Data JPA, and Maven. It starts with an in-memory H2 database by default, so no database installation is needed for local development. Local data is cleared when the application stops.

### Run locally

Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

macOS/Linux:

```bash
./mvnw spring-boot:run
```

The API listens on `http://localhost:8080`. Run the automated tests with `./mvnw test` (or `.\mvnw.cmd test` in PowerShell).

### PostgreSQL deployment

Set the `prod` profile and provide a reachable PostgreSQL database. Configure these environment variables:

- `SPRING_PROFILES_ACTIVE=prod`
- `DB_URL=jdbc:postgresql://<host>:5432/community_store_db`
- `DB_USERNAME=<database username>`
- `DB_PASSWORD=<database password>`

Build the executable JAR with `./mvnw clean package` and run `java -jar target/community-store-backend-0.0.1-SNAPSHOT.jar`. Do not commit database credentials.

### Docker

Build the image with `docker build -t community-store-backend .` and run locally with `docker run --rm -p 8080:8080 community-store-backend`. For a hosted deployment, pass the PostgreSQL variables above to the container and set `SPRING_PROFILES_ACTIVE=prod`.
