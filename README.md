# Spring Persistence Hub

**SPRING DATA JPA PROJECTS**

A collection of small, focused Spring Boot projects that demonstrate different features and usage patterns of Spring Data JPA. This repository is intended for learners and mentors who want hands-on examples to practice CRUD operations, repository methods, custom queries, LOBs, versioning, and working with dates/timestamps.

---

## Repository structure (high level)

Each folder is a standalone Spring Boot sample project demonstrating a specific topic in Spring Data JPA:

* `BootDataJPAProj01-CrudRepository` — Basic CRUD using `CrudRepository`.
* `BootJPAProj02-ProductManagment` — Simple product management (entities, repository, service, console runner).
* `BootJPAProj03-LiabraryManagment` — Library management example (authors, books, relations).
* `BootDataJPAProj04-JPARepository` — Switching to `JpaRepository` and using pagination and sorting.
* `BootDataJPAProj05-CostomeMethod-FinderMethod` — Derived query methods (finder methods / naming conventions).
* `BootDataJPAProj06CustomeMethod-QueryMethod` — Custom `@Query` methods and JPQL/native queries.
* `BootDataJPAProj07-Versioning-TimeStamping` — Entity versioning with `@Version` and auditing timestamps.
* `BootDataJPAProj08-WorkingWithTimeAndDate` — Best practices for `java.time` types and time zone handling.
* `BootDataJPAProj09-WorkingWithLOBs` — Working with large objects (BLOB/CLOB) and file storage approaches.

> Note: Folder names reflect the learning goal. Each project contains its own `pom.xml` or shares a parent `pom.xml` depending on how the repository is organized.

---

## Key features covered

* Spring Boot + Spring Data JPA setup
* Different repository interfaces: `CrudRepository`, `JpaRepository`
* Derived query methods (finder methods)
* JPQL and native SQL queries with `@Query`
* Pagination and sorting
* Entity relationships (OneToOne, OneToMany, ManyToOne, ManyToMany)
* Transactional operations and propagation behaviors
* Auditing (`@CreatedDate`, `@LastModifiedDate`) and optimistic locking (`@Version`)
* Handling `LocalDate`, `LocalDateTime`, `OffsetDateTime` and time zone considerations
* Working with LOBs (file upload/download, storing bytes/text in DB)

---

## Prerequisites

* Java 17 (or Java 11 depending on individual project `pom.xml`)
* Maven 3.6+
* A relational database (H2 for quick testing, or MySQL/Postgres/Oracle if you want persistent data)
* Git (to clone the repo)

---

## Quick start (recommended)

1. Clone the repository:

```bash
git clone https://github.com/param7666/spring-persistence-hub.git
cd spring-persistence-hub
```

2. Pick a sample project folder you want to run (for example `BootDataJPAProj01-CrudRepository`).

3. Open `src/main/resources/application.properties` (or `application.yml`) and configure a datasource. Example for H2 (in-memory):

```properties
spring.datasource.url=jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

4. Build and run the chosen sample:

```bash
mvn clean install -DskipTests
# from the project folder
mvn spring-boot:run
```

5. Watch the console output and interact with example runners or REST endpoints if provided.

---

## Running with MySQL / PostgreSQL

To run samples against a real database:

1. Create a database (e.g. `spring_persistence_hub`).
2. Update `application.properties` with JDBC URL, username, password and correct dialect.
3. Set `spring.jpa.hibernate.ddl-auto` appropriately (`update`/`validate`/`none`) depending on your needs.

Example (MySQL):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spring_persistence_hub?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
```

---

## What to look for in each project

* `entity` package: JPA entity mapping examples (primary keys, relationships, LOBs, enums)
* `repository` package: `CrudRepository`/`JpaRepository` usage, derived queries, custom queries
* `service` package: business logic encapsulation and transactional boundaries
* `runner` or `controller`: sample interaction points (CommandLineRunner examples, or REST controllers)
* `resources`: `application.properties` and SQL import scripts if included

---

## Tips & learning suggestions

* Start with `BootDataJPAProj01-CrudRepository` to understand the basics.
* Move to `BootDataJPAProj04-JPARepository` to learn pagination and sorting.
* Inspect `BootDataJPAProj05/06` to see how to craft finder methods and `@Query` when naming conventions are insufficient.
* Explore `07` and `08` to understand optimistic locking and correct handling of Java `time` API.
* Use H2 console for quick data inspection: `http://localhost:8080/h2-console` (adjust port if needed).

---

## Tests

If sample projects include unit/integration tests, run them with:

```bash
mvn test
```

For integration tests that require DB access, you can use an embedded database profile or testcontainers (if configured).

---

## Contributing

Contributions, issues and feature requests are welcome! If you want to add a new sample project or improve an existing one:

1. Fork the repository
2. Create a feature branch (`git checkout -b feat/add-sample-name`)
3. Add your sample project following existing folder conventions
4. Ensure `README.md` inside the new folder explains what the sample demonstrates
5. Open a Pull Request describing your changes

---

## License

This repository can use an open-source license — if you have a preference, add a LICENSE file. Common choices:

* MIT
* Apache 2.0

---

## Contact / Author

Repository maintained by **param7666**.

If you want improvements to this README (example commands, badges, screenshots, or a consolidated multi-module build), tell me what you'd like and I can update the README accordingly.
