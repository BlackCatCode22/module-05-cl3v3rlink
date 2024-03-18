
public class YuGiOhCard {
    private String attribute;
    private String level;
    private String typeAndMonsterCategory;
    private String ATKandDEF;

    // Constructor
    public YuGiOhCard(String ATKandDEF, String attribute, String level, String typeAndMonsterCategory) {
        this.ATKandDEF = ATKandDEF;
        this.attribute = attribute;
        this.level = level;
        this.typeAndMonsterCategory = typeAndMonsterCategory;
    }

    // Getter methods
    public String getAttribute() {
        return attribute;
    }

    public String getLevel() {
        return level;
    }

    public String getTypeAndMonsterCategory() {
        return typeAndMonsterCategory;
    }

    public String getATKandDEF() {
        return ATKandDEF;
    }

    // Display card details
    public void displayCardDetails() {
        System.out.println("Attribute: " + attribute);
        System.out.println("Level: " + level);
        System.out.println("Type/Monster Category: " + typeAndMonsterCategory);
        System.out.println("ATK/DEF: " + ATKandDEF);
    }
}
