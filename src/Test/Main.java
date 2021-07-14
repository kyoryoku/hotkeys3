package Test;

import by.kirino.hotkeys3.Hotkey;
import by.kirino.hotkeys3.KeyCombination;
import org.jnativehook.NativeHookException;

public class Main {
    public static void main(String[] args) throws NativeHookException {
        Command cmd1 = new Command("cmd1");
        Command cmd2 = new Command("cmd2");
        Command cmd3 = new Command("cmd3");
        Command cmd4 = new Command("cmd4");

        KeyCombination kc1 = new KeyCombination("1");
        KeyCombination kc2 = new KeyCombination("Ctrl+2");
        KeyCombination kc3 = new KeyCombination("3");

        cmd1.setKeyCombination(kc1);
        cmd2.setKeyCombination(kc2);

        Hotkey.getInstance().enableHotkeys();
        Hotkey.getInstance().addListeners(cmd1, cmd2, cmd3, cmd4);

        KeyInfo ki = new KeyInfo();
        Hotkey.getInstance().addListener(ki);

        Hotkey.getInstance().disableHotkeys();
    }
}
