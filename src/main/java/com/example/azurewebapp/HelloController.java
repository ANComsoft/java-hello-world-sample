// Chemin: your-project-root/src/main/java/com/example/azurewebapp/HelloController.java
package com.example.azurewebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Contrôleur pour gérer les requêtes HTTP et retourner des vues (pages HTML).
 * Il expose un endpoint "/" pour la page d'accueil.
 */
@Controller
public class HelloController {

    /**
     * Gère les requêtes GET sur l'endpoint "/".
     * Retourne le nom du template HTML à afficher.
     * Le fichier HTML doit être placé dans 'src/main/resources/templates/'.
     * @return Le nom du template Thymeleaf (sans l'extension .html).
     */
    @GetMapping("/")
    public String home() {
        return "home";
    }
}