public class Main {
    public static void main(String[] args) {
        Die myDice = new Die(6);
        myDice.setKey(12345);
        myDice.unlock(54321);
        myDice.unlock(12345);
        myDice.roll();
        myDice.printLockState();
        myDice.view();
        myDice.roll(3);
        myDice.lock(12345);
        myDice.roll();
        myDice.view();
    }
}
