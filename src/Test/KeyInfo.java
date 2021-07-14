package Test;

import by.kirino.hotkeys3.KeyCombination;
import by.kirino.hotkeys3.KeyListener;

public class KeyInfo implements KeyListener {

    @Override
    public void handleHotkeyEvent(KeyCombination keyCombination) {
        System.out.println("Нажата комбинация " + keyCombination.toShortString());
    }
}
