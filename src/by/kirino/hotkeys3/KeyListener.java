package by.kirino.hotkeys3;

import org.jnativehook.NativeHookException;

//интерфейс подписчика
public interface KeyListener {

    //В этом методе обрабатываются события нажатия клавиш
    public void handleHotkeyEvent(KeyCombination keyCombination);
}
