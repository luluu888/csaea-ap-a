import module java.base;
public class Detective {

    public String characterName;
    private int age;
    private String ability;
    private int healthLevel;
    private boolean isAlive;
    private boolean isHungry;
    private int strength;
    private double intelligenceLevel;

    public Detective (String characterName, int age, String ability) {
        this.characterName = characterName;
        this.age = age;
        this.ability = ability;

        isAlive = true;
        healthLevel = 100;
        intelligenceLevel = 100.0;
    }

    public void solveCase () {
        intelligenceLevel += 0.5;
        System.out.println(characterName + "is a real sleuth!");
        System.out.println(characterName + "has reached intelligence level " + intelligenceLevel);
    }
    public void haveBirthday () {
        age++;
        System.out.println(characterName + " , happy Birthday!");
    }

    public void train (int reps) {
        for (int i = 1; i <= reps; i++) {
            strength++;
        }
        System.out.println(characterName + " has trained " + ability + " to strength level " + strength);
        isHungry = true;

    }

    public void takeDamage (int damage) {
        healthLevel -= damage;
        if (healthLevel <= 0) {
            System.out.println(characterName + " has died");
            isAlive = false;
        }
        else {
            System.out.println(characterName + "has taken" + damage + "points of damage!");
        }
    }

    public void eat() {
        if (isHungry = true){
            isHungry = false;
            System.out.println(characterName + " is satisfied!");
        }
        else {
            System.out.println(characterName + "is not hungry, but they can always go for snacks another time.");
        }
    }

    }
Detective junichirou = new Detective("Junichirou Tanizaki", 16, "Light Snow");
junichirou.train(33);
junichirou.takeDamage(100);
junichirou.healthLevel
Detective jouno = new Detec("Jouno Saigiku", 20, "Priceless Tears);
Detective jouno = new Detec("Jouno Saigiku", 20, "Priceless Tears");
Detective jouno = new Detective("Jouno Saigiku", 20, "Priceless Tears");
jouno.eat();
jouno.solveCase()