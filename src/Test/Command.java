package Test;

import by.kirino.hotkeys3.KeyCombination;
import by.kirino.hotkeys3.KeyListener;
import org.jnativehook.NativeHookException;

public class Command implements KeyListener {

    private String name;
    private KeyCombination keyCombination;

    public Command(String name) {
        this.name = name;
        keyCombination = new KeyCombination();
    }

    public void setKeyCombination(KeyCombination keyCombination) {
        this.keyCombination = keyCombination;
    }

    @Override
    public void handleHotkeyEvent(KeyCombination keyCombination) {
        if (this.keyCombination.toShortString().equals(keyCombination.toShortString())){
            System.out.println("Сработала команда " + name);
        }
    }
}
