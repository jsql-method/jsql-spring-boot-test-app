gradle bootJar
sleep 1
java -jar ./build/libs/jsql-spring-boot-test-app.jar --spring.datasource.url=jdbc:postgresql://46.41.138.32:5432/plugins_test?ssl=false --spring.datasource.username=postgres --spring.datasource.password=pgMjk6F#18P,5