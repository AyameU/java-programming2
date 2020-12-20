public class Container {

    private int volume = 0;
    private int maxVolume = 100;

    public Container() {}

    public int contains() {
        return volume;
    }

    public void add(int amount) {
        if(amount >= 0) {
            if(volume + amount <= maxVolume) {
                volume += amount;
            }
            else {
                volume = 100;
            }
        }
    }

    public void remove(int amount) {
        if(amount >= 0) {
            if(volume - amount >= 0) {
                volume -= amount;
            }
            else {
                volume = 0;
            }
        }
    }

    public String toString() {
        return volume + "/" + maxVolume;
    }
}
