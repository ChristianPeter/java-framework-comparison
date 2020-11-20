# java-framework-comparison

## quarkus

https://quarkus.io/guides/getting-started

```
mvn io.quarkus:quarkus-maven-plugin:1.9.2.Final:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=quarkus-example \
    -DclassName="org.acme.getting.started.GreetingResource" \
    -Dpath="/hello"

cd quarkus-example/
./mvnw quarkus:dev
```


## spring boot
https://spring.io/quickstart
goto https://start.spring.io/

artifact: spring-boot-example
jar, java 11
add dependecy: web
create zip and extract

```
cd spring-boot-example
./mvnw spring-boot:run
```

