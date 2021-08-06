package factory_method.factory;

import factory_method.buttons.Button;
import factory_method.buttons.HtmlButton;

/*
 * Produce un dialog o ventana con botones HTML
 */
public class HtmlDialog extends Dialog{

    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
