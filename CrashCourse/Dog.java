public class Dog {
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    boolean isHome;
    int energyLevel;

    public Dog (String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        energyLevel = 100;
        age = 1;
        weight = 40.0;
        isHungry = true;
        isHome = true;
    }

    public void bark() {
        System.out.println("dog: bark!");

    }

    public void scratch() {
        System.out.println("dog: destroys your couch");

    }

    public void bite() {
        System.out.println("dog: bites you");
    }

    public void eat() {
        if (isHungry = true) {
            isHungry = false;
            weight += 0.5;
            System.out.println("Your dog has been fed!");
        }
        else {
            System.out.println("Your dog is not hungry");
        }

    }

    public void runAway() {
        isHome = false;
        energyLevel -= 2;
    }

    public void comeHome() {
        isHome = true;
    }

    public void sleep() {
        energyLevel = 100;
    }

    public void birthday() {
        age += 1;
        System.out.println("Happy birthday!");
    }

}
