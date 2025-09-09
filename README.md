# Crear Proyecto en  Java con Spring Boot

* tener instalado java el jdk , verificar: java -version, brew install openjdk@17
* tener instalado maven, si no : brew install maven
* instalar IDE Eclipse: https://www.eclipse.org/downloads/  
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