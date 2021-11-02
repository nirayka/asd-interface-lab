public class Die implements Lockable {
    private int key;
    final private int numSides;
    private boolean isLocked = true;


    public Die(int numSides) {
        this.numSides = numSides;
        System.out.println("You have instantiated a die with " + numSides + " sides.");
    }

    public void setKey(int key) {
        this.key = key;
        System.out.println("This die has been established with the key " + key + ".");
    }

    public void lock(int inputtedKey) {
        if (inputtedKey == key) {
            isLocked = true;
            System.out.println("This die has been locked.");
        } else {
            System.out.println("You have inputted the incorrect key. You cannot control the lock state of the die.");
        }
    }

    public void unlock(int inputtedKey) {
        if (inputtedKey == key) {
            isLocked = false;
            System.out.println("This die has been unlocked.");
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
            System.out.println("The die is currently unlocked");
        }
    }

    public void roll() {
        if (isLocked) {
            System.out.println("Sorry, you can't roll this die because it is locked.");
        } else {
            int result = (int) ((numSides * Math.random()) + 1);
            System.out.println("You have rolled a " + result + " on this die.");
        }

    }


}
