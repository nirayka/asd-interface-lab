public interface Lockable {
    public void setKey(int inputtedKey);
    public void lock(int inputtedKey);
    public void unlock(int inputtedKey);
    public boolean isLocked();
}
