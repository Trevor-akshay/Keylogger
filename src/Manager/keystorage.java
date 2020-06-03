package Manager;

public class keystorage {
    private  int keycode;
    private  boolean keypressed;
    private  long systemtimeinmillisecs;

    public keystorage(int keycode, boolean keypressed, long systemtimeinmillisecs) {
        this.keycode = keycode;
        this.keypressed = keypressed;
        this.systemtimeinmillisecs = systemtimeinmillisecs;
    }


    public  int getKeycode() {
        return keycode;
    }

    public  boolean isKeypressed() {
        return keypressed;
    }
    public  long getSystemtimeinmillisecs() {
        return systemtimeinmillisecs;
    }

    @Override
    public String toString() {
        return "keystorage{" +
                "keycode=" + keycode +
                ", keypressed=" + keypressed +
                ", systemtimeinmillisecs=" + systemtimeinmillisecs +
                '}';
    }
}
