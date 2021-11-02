public class Die implements Lockable {
    private int key;
    final private int numSides;
    private boolean isLocked = true;
    private int lastRolled = -1;


    public Die(int numSides) {
        this.numSides = numSides;
        System.out.println("You have instantiated a die with " + numSides + " sides.");
    }

    public void setKey(int key) {
        this.key = key;
        System.out.println("This die has been given the key " + key + ".");
    }

    public void lock(int inputtedKey) {
        if (inputtedKey == key) {
            isLocked = true;
            System.out.println("You inputted the correct key. This die has been locked.");
        } else {
            System.out.println("You have inputted the incorrect key. You cannot control the lock state of the die.");
        }
    }

    public void unlock(int inputtedKey) {
        if (inputtedKey == key) {
            isLocked = false;
            System.out.println("You have inputted the correct key. This die has been unlocked.");
        } else {
            System.out.println("You have inputted the incorrect key. You cannot control the lock state of the die.");
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void printLockState() {
        if (isLocked) {
            System.out.println("The die is currently locked.");
        } else {
            System.out.println("The die is currently unlocked.");
        }
    }

    public void roll() {
        if (isLocked) {
            System.out.println("Sorry, you can't roll this die because it is locked.");
        } else {
            int result = (int) ((numSides * Math.random()) + 1);
            System.out.println("You have rolled a " + result + " on this die.");
            lastRolled = result;
        }
    }

    public void roll(int numRolls) {
        if (isLocked) {
            System.out.println("Sorry, you can't roll this die because it is locked.");
        } else {
            System.out.println("You have chosen to roll this die " + numRolls + " times.");
            for (int i = 1; i <= numRolls; i++) {
                int result = (int) ((numSides * Math.random()) + 1);
                System.out.println("On roll " + i + ", you rolled " + result + ".");
                lastRolled = result;
            }
        }
    }

    public void view() {
        if (isLocked) {
            System.out.println("Sorry, you can't view this die because it is locked.");
        } else {
            if (lastRolled == -1) {
                System.out.println("This die has not yet been rolled.");
            } else {
                System.out.println("You are currently viewing the die. The last rolled number was " + lastRolled + ".");
            }
        }
    }


}
