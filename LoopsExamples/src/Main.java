import java.util.Scanner; // we importeren de Scanner-class uit de java.util-package zodat we met de gebruiker kunnen communiceren.

public class Main {
    public static void main(String[] args) {


        System.out.println("Hoe vaak wil je iets herhalen? "); // We vragen aan de gebruiker hoeveel iets wilt herhalen
        Scanner input = new Scanner(System.in); // We hebben daarvoor het Scanner-object nodig
        int number; // We hebben een variabele nodig om de gebruikersinvoer op te slaan.

        // Onderstaande code is gebaseerd op: https://kodejava.org/how-do-i-validate-input-when-using-scanner/
        while (!input.hasNextInt()) { // While-loop loopt zolang door tot input.hasNextInt() niet meer false is; dus met andere woorden dat er een geheel getal is opgegeven door de gebruiker.
            String userInput = input.next(); // Hier vangen we met next() de gebruikersinvoer op in de String-variabele userInput; zodat we die op de volgende regel kunnen gebruiken om aan te geven dat het geen geldige invoer is
            System.out.printf("\"%s\" is not a valid number.%n", userInput);  // Hiermee laten we op het scherm zien dat de gebruikersinvoer niet geldig is. printf()-methode is een andere variant dan print en println
        }
        number = input.nextInt(); // Mocht de gebruiker wel een int hebben opgegeven dan slaan we deze op in de number-variabele. Hier komen we alleen als de gebruikersinvoer een getal is, anders blijft de code hangen in de while-loop.

        System.out.println("Voorbeeld for-lus");
        // Voorbeeld van een for-loop; deze loopt net zolang door zolang i < number is. i is de teller, en number is het getal wat de gebruiker opgeeft.
        for(int i =0 ; i < number; i++) {
            System.out.println("Herhaling: " + i);
        }

        System.out.println("Voorbeeld while-lus");
        // Voorbeeld van een while-loop; deze loopt net zolang door tot x >= number. x is de teller die we op regel 24 aanmaken.
        int x = 0;
        while(true) {
            if(x >= number) {
                break;
            }

            System.out.println("Herhaling: " + x);
            x++;

        }

    }
}