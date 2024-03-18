public class App {
    public static void main(String[] args) {
        // Creating Yu-Gi-Oh! cards using Deckstats
        YuGiOhCard card1 = new YuGiOhCard("1550/2000", "light", "6", "Dragon/ritual");
        YuGiOhCard card2 = new YuGiOhCard("3000/2000", "dark", "8", "Spellcaster/effect");

        System.out.println("Card 1:");
        card1.displayCardDetails();
        System.out.println("\nCard 2:");
        card2.displayCardDetails();

        // Creating a Yugi deck using Deckstats
        Deckstats newdeck = new Deckstats("1550/2000", "light", "6", "Dragon/ritual");
        Deckstats newdeck2 = new Deckstats("3000/2000", "dark", "8", "Spellcaster/effect");

        System.out.println("\nYugi Deck:");
        newdeck.displayDeck();
        newdeck2.displayDeck();
    }
}
