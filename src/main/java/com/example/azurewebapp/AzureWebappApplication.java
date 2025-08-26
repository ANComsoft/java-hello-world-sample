// Chemin: your-project-root/src/main/java/com/example/azurewebapp/AzureWebappApplication.java
package com.example.azurewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principale de l'application Spring Boot.
 * C'est le point d'entrée de notre application web.
 */
@SpringBootApplication
public class AzureWebappApplication {

    public static void main(String[] args) {
        // Lance l'application Spring Boot
        SpringApplication.run(AzureWebappApplication.class, args);
    }
}
