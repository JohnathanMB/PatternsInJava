package factory_method.factory;

import factory_method.buttons.Button;
import factory_method.buttons.WindowsButton;

/*
 * Produce un dialog o ventana con botones tipo Windows
 */
public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
