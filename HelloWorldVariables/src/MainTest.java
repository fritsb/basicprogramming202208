import java.util.Scanner; // Deze regel wordt toegevoegd doordat we op regel 22 gebruik willen maken van een Scanner-object.

public class MainTest { // de naam van de klasse (MainTest) moet overeenkomen met bestandsnaam (dus MainTest.java).
    public static void main(String[] args) {
        // Onderstaande-code staat in commentaar. Verwijder de / * en * / tekens om de code te activeren.
        /*
        char currentPlayerToken = 'X'; // we maken een karakter-variabele aan waar we de karakter X in opslaan. Type = char, naam = currentPlayerToken, waarde = X
        int teacherAge; // we maken een int-variabele aan waar we een geheel getal kunnen opslaan. Dit doen we paar regels verder.
        String teacherName = "Frits"; // we maken een String-variabele aan, waar we de waarde 'Frits' in opslaan. Type = String, naam = teacherAge, waarde = Frits

        teacherAge = 37; // Hier wijzen we een waarde toe aan de teacherAge variabele. De type = int, naam = teacherAge, waarde = 37
        System.out.println("De huidige player token is: "+ currentPlayerToken); // Hier laten we de informatie van de currentPlayerToken-variabele op het scherm zien.
        System.out.println("De leeftijd van de docent is: " + teacherAge);  // Hier laten we de informatie van de teacherAge-variabele op het scherm zien.

        System.out.println("De naam van de docent is: " + teacherName); // Hier laten we de informatie van de teacherName-variabele op het scherm zien.
        teacherName = "Nova"; // Hier passen we de waarde van teacherName-variabele aan; we overschrijven de oude waarde Frits met de nieuwe waarde Nova.
        System.out.println("De naam van de inval-docent is: " + teacherName); // Hier laten we de informatie van de aangepaste teacherName-variabele op het scherm zien.
        teacherName = "Piet"; // Hier passen we de waarde van teacherName-variabele aan; we overschrijven de oude waarde Nova met de nieuwe waarde Piet.
        System.out.println("De naam van de inval-docent is: " + teacherName); // Hier laten we de informatie van de aangepaste teacherName-variabele op het scherm zien.
*/

        Scanner input = new Scanner(System.in); // We maken hier een scanner-object aan met de naam input. Hiermee kunnen we communiceren met de gebruiker.
        System.out.println("Voer je naam in: "); // Tekst op het scherm met een Enter
        String userName = input.nextLine(); // Hier slaan we de informatie op in een variabele met de naam userName, we gebruiker daarvoor de nextLine()-methode van het scanner-object om 1 regel tekst op te slaan in de userName-variabele.

        System.out.println("De ingevoerde naam is: " + userName ); // Hier laten we de invoer van de gebruiker zien op het scherm.
        System.out.println("De ingevoerde naam is: " + userName.toUpperCase()); // Hier laten we de invoer van de gebruiker zien op het scherm waarbij de invoer is omgezet naar hoofdletters mbv toUpperCase().
        System.out.println("De naam bestaat uit: " + userName.length() + " karakters"); // Hier laten we het aantal karakters zien van de userName-variabele.


    }
}