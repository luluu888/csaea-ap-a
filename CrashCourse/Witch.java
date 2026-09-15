public class Witch {
    String characterName;
    int health;
    String location;
    String species;
    int age;
    String signatureSpell;
    String element;
    boolean isHungry;
    double expLevel;
    String gender;
    int intelligence;

    public Witch (String characterName, String element, String gender) {
        this.characterName = characterName;
        this.element = element;
        this.gender = gender;

        isHungry = false;
        intelligence = 1;
        health = 100;
        expLevel = 0.0;
        age = 100;
        location = "forest";
    }

    public void attack() {
        expLevel += 0.1
    }

    public void moveLocation() {
        location = "lair";
        }
    }

    public void learnSpell() {
        expLevel += 0.5;
        intelligence += 1;
    }

    public void eat() {
        if (isHungry = true){
            isHungry = false;
        }
        else {
            System.out.println(characterName + "is not in dire need of sustenance at this time");
        }
    }

    public void performSpells(String spell) {
        System.out.println(characterName + "has performed" + spell);
    }

    public void drinkPotion() {
        health += 5;
    }

    public void birthday() {
        age += 1;
    }

    public void celebrate() {
        System.out.println(characterName + "elatedly dances in celebration!");
    }

    public void plotting() {
        System.out.println(characterName + "is plotting some mischief!");
        if (isHungry = true) {
            System.out.println("Maybe the bakery good will mysteriously go missing soon...");
        }
        if (health < 20){
            System.out.println("Forget mischief! Let's go find the things needed to make a health potion");
        }
        if (expLevel > 50) {
            System.out.println("You'll never know what it is though!");
        }
    }



}