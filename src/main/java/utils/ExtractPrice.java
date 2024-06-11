package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPrice {
	public static String extractPrice(String text) {
        // Define la expresión regular para el formato del precio
        String regex = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        
        // Si encuentra una coincidencia, retorna el valor
        if (matcher.find()) {
            return matcher.group();
        }
        
        return null; // Si no encuentra ninguna coincidencia, retorna null
    }
}
