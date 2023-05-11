# homework

## Country Api

This project, is an API that proceeds Counties(`name` ve `president`) GET, POST, PUT and DELETE request.

---
# Setting up project
## Maven setup `(ignore if already setup)`:

        a. Install maven from https://maven.apache.org/download.cgi

        b. Unzip maven and keep in C drive (you can keep any location. Path location will be changed accordingly).

        c. Set MAVEN_HOME in system variable.
---

Add Maven Plugin to POM.XML
---
    <build>
       <plugins>
         <plugin>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-maven-plugin</artifactId>
          </plugin>
        </plugins>
      </build>
# Build Spring Boot Project with Maven

    mvn package
## `or`

      mvn install / mvn clean install
## Run Spring Boot app using Maven:

     mvn spring-boot:run
## `[optional]` Run Spring Boot app with java -jar command

      java -jar target/mywebserviceapp-0.0.1-SNAPSHOT.jar

---
## Endpoints
---
 You can make API request via API test tools.( Postman or cURL):
- `GET api/v1.0/countries`: Gets all countries.
  
- `GET api/v1.0/countries/{id}`: Gets country by id.
  
- `POST api/v1.0/countries`: Saves new country.
  
- `PUT api/v1.0/countries/{id}`: Updates country president name.

- `DELETE api/v1.0/countries/{id}`: Deletes country.


---
If you have any questions or feedback regarding the project, please feel free to reach out to me. You can contact me through the following:

`Email:` dikbykmert@gmail.com

`Twitter:` @mertdkb