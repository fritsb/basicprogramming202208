import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] artists = insertArtists(); // Deze methode zorgt ervoor dat de artiesten ingevoerd kunnen worden door de gebruiker. De methode geeft een String-verzameling terug
        showArtists(artists); // Deze methode laat de artiesten zien, daarvoor geven een String-verzameling mee

        /*
        // Handmatig aanmaken van een String- verzameling waar 4 waarden in opgeslagen kunnen worden
        String[] artists = new String[4]; // Extra informatie over Arrays: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
        // Handmatig vullen van waarden
        artists[0] = "Goldband"; // Op vakje 0 zetten we de tekst Goldband
        artists[1] = "S10"; // Op vakje 1 zetten we de tekst S10
        artists[2] = "Hang Youth";
        artists[3] = "Heideroosjes"; */

        /*
        // Handmatig uitlezen van de String-verzameling
        System.out.println("Artiest op plek 1: " + artists[0]);
        System.out.println("Artiest op plek 2: " + artists[1]);
        System.out.println("Artiest op plek 3: " + artists[2]);
        System.out.println("Artiest op plek 4: " + artists[3]);*/
    }

    // Deze methode inserArtists() zorgt ervoor dat de gebruiker artiesten kan invoeren
    // De methode geeft een String-verzameling terug aan de plek waar die wordt aangeroepen (main-methode)
    public static String[] insertArtists() {
        System.out.println("Hoeveel artiesten wil je invoeren?");
        Scanner input = new Scanner(System.in);
        int numberArtists = input.nextInt();
        input.nextLine(); // workaround
        String[] artists = new String[numberArtists]; // We creeeren een array waarbij de gebruiker de lengte aangeeft

        for(int i = 0; i < numberArtists; i++) { // Via een for-loop vullen we de array met informatie.
            System.out.println("Voer artiest in: ");
            artists[i] = input.nextLine(); // 1e keer wordt op vakje 0 een artiest ingevoerd, 2e keer op vakje 1, etc.
        }

        return artists; // Via return wordt de array met artiesten teruggegeven
    }

    // Deze methode showArtists() zorgt ervoor dat de inhoud van String-verzameling wordt getoond mbv een for-loop
    public static void showArtists( String[] artists ) {
        for(int i =0; i < artists.length; i++) {
            System.out.println("Artiest op plek " + (i+1) + " is: " + artists[i]);
        }

    }
}