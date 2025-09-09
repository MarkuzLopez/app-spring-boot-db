# Crear Proyecto en  Java con Spring Boot

* tener instalado java el jdk , verificar: java -version, ***brew install openjdk@17***
* tener instalado ***maven***, si no : brew install maven
* instalar IDE ***Eclipse***: https://www.eclipse.org/downloads/  
* (`[Eclipse](https://www.eclipse.org/downloads/)`)
* instlar Spring Tools Ecllipse:
    1.- Ve al menú: Help → Eclipse Marketplace…
    2.- Busca Spring Tools (Spring Tools 4).
    3.- Instálalo y reinicia Eclipse.
* Crear Proyecto: 
 - Menu: file -> New -> Spring Star Project:
 - Configura: 
    - Name: demo-springboot
    - Type: Maven
    - Packaging: Jar
    - Java Version: 17
    - Dependencies: elige Spring Web
----------------------------------------------------------------------------------------------------------
* Ejemplo de prueba, Dentro de src/main/java/com/example/demo tendrás la clase principal que Eclipse crea. Modifícala así:
 
 ` @SpringBootApplication
public class DemoSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootApplication.class, args);
    }
}

@RestController
class HolaController {
    @GetMapping("/hola")
    public String hola() {
        return "¡Spring Boot funciona correctamente en Eclipse y macOS!";
    }
} ´

-------------------------------------------------------------------------------------------------
# ejecutar aplicacion: 
 - en el archivo principal  -> selecionar Run AS -> Spring Boot App
 - En la consola verás que levanta un servidor en http://localhost:8080/hola
 
-------------------------------------------------------------------------------------------------
## Proyecto con base de datos H2 CRUD

# Configuracion:
 - File → New → Spring Starter Project
 - Name: crud-h2-demo
 - Type: Maven
 - Packaging: Jar
 - Java Version: 17
 # Dependencies: 
  	- Spring Web
  	- Spring Data JPA
  	- H2 Database
# Configuracion de la base de datos H2
 - En el archivo src/main/resources/application.properties agrega:
 # 1 Configuración H2
	spring.datasource.url=jdbc:h2:mem:testdb
	spring.datasource.driverClassName=org.h2.Driver
	spring.datasource.username=sa
	spring.datasource.password=
	spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
	spring.h2.console.enabled=true

 # 2 Mostrar SQL en consola
	spring.jpa.show-sql=true
	spring.jpa.hibernate.ddl-auto=update
	
 # 3 crear entidad modelo: 
  - src/main/java/com/example/crudh2demo/model/Persona.java:
  
 # 4 Crear el repositorio: 
 En src/main/java/com/example/crudh2demo/repository/PersonaRepository.java:
 
 # 5 crear el controlador REST: 
  - En src/main/java/com/example/crudh2demo/controller/PersonaController.java:
  
 # 6 Ejecuar y  Probar CRUD:
   - Clic derecho en CrudH2DemoApplication.java → Run As → Spring Boot App.
   - Arranca en http://localhost:8080.
   - se puede la DB H2: http://localhost:8080/h2-console
   
  