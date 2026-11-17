# MS1 MockMvc Unit Testing

## Requirement
Send a simulated HTTP GET request to `/MS1` with `a=5` and `b=10`.
Verify HTTP 200 OK and the exact response body `MS1=15`.

## Technologies
- Java 17
- Spring Boot 3.5.7
- Maven
- Spring Web
- JUnit 5 and MockMvc

## Import into Spring Tool Suite (STS)
1. Extract this ZIP file.
2. Open STS.
3. Select **File > Import > Maven > Existing Maven Projects**.
4. Browse to the extracted `MS1-MockMvc-UnitTesting` folder.
5. Select the project and click **Finish**.
6. If dependencies do not download automatically, right-click the project and select **Maven > Update Project**.

## Run the isolated test
1. Open `src/test/java/com/example/ms1/controller/MS1ControllerTest.java`.
2. Right-click the file.
3. Select **Run As > JUnit Test**.
4. The test should pass.

The test uses `@WebMvcTest` and `MockMvc`. It simulates the HTTP request through Spring MVC without starting a real web server.

## Optional: Run the application and try it in a REST client
1. Run `MockMvcUnitTestingApplication.java` using **Run As > Spring Boot App**.
2. In Postman, Thunder Client, or another REST client, send:
   - Method: GET
   - URL: `http://localhost:8080/MS1?a=5&b=10`
3. Expected status: `200 OK`
4. Expected response body: `MS1=15`

## PostgreSQL
PostgreSQL is not required for this experiment. The `/MS1` endpoint only adds two request parameters and returns the result. No database, table, SQL script, or PostgreSQL connection is used.

## Project structure
```text
MS1-MockMvc-UnitTesting
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java/com/example/ms1
    │       ├── MockMvcUnitTestingApplication.java
    │       └── controller/MS1Controller.java
    └── test
        └── java/com/example/ms1/controller
            └── MS1ControllerTest.java
```
