public class Main {
    public static void main(String[] args) {
        Die myDice = new Die(6);
        myDice.setKey(12345);
        myDice.unlock(54321);
        myDice.unlock(12345);
        myDice.roll();
        myDice.roll();
        myDice.roll();
        myDice.lock(12345);
        myDice.roll();
    }
}
