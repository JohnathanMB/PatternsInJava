package FactoryMethod.factory;

import FactoryMethod.buttons.Button;
import FactoryMethod.buttons.HtmlButton;

/*
 * Produce un dialog o ventana con botones HTML
 */
public class HtmlDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
