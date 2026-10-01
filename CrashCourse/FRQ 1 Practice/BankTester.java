public class BankTester {
    public static void main(String[] args) {
    BankAccount alex = new BankAccount("Alex", 100.0);
    BankAccount jaime = new BankAccount("Jaime", 250.0);

    alex.deposit(50.0);
    alex.printInfo();
    jaime.printInfo();

   }

}
