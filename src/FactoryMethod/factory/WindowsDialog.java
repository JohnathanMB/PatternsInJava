package FactoryMethod.factory;

import FactoryMethod.buttons.Button;
import FactoryMethod.buttons.WindowsButton;

/*
 * Produce un dialog o ventana con botones tipo Windows
 */
public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
