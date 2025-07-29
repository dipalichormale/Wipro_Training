package Day_8;

import java.util.Map;
import java.util.TreeMap;

public class Collections_TreeMap {
    public static void main(String[] args) {
        // TreeMap stores entries in sorted order of keys
        Map<String, String> countriesAndCapitals = new TreeMap<>();

        // Add countries and their capitals
        countriesAndCapitals.put("Japan", "Tokyo");
        countriesAndCapitals.put("France", "Paris");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("Canada", "Ottawa");
        countriesAndCapitals.put("Australia", "Canberra");

        // Print countries (sorted alphabetically)
        System.out.println("Countries (Sorted Alphabetically): " + countriesAndCapitals.keySet());

        // Print only capitals
        System.out.println("Capitals: " + countriesAndCapitals.values());

        // Print country and capital
        System.out.println("\nCountry and Capital Details:");
        for (String country : countriesAndCapitals.keySet()) {
            System.out.println(country + ": " + countriesAndCapitals.get(country));
        }
    }
}