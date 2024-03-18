public class Deckstats {
    private String attribute;
    private String level;
    private String typeAndMonsterCategory;
    private String ATKandDEF;

    // Constructor
    public Deckstats(String ATKandDEF, String attribute, String level, String typeAndMonsterCategory) {
        this.ATKandDEF = ATKandDEF;
        this.attribute = attribute;
        this.level = level;
        this.typeAndMonsterCategory = typeAndMonsterCategory;
    }

    // Display deck details
    public void displayDeck() {
        System.out.println("Attribute: " + attribute);
        System.out.println("Level: " + level);
        System.out.println("Type/Monster Category: " + typeAndMonsterCategory);
        System.out.println("ATK/DEF: " + ATKandDEF);
    }
}
