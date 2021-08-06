package FactoryMethod.factory;

import FactoryMethod.buttons.Button;

/*
 * Clase Factory(fábrica) Base; Tener en cuenta que decir Factory es sólo un rol para la clase.
 * Esta debe tener algo de lógica comercial la cual necesita la creación de diferentes productos para ser ejecutada.
 * En este caso, esta es la lógica para lanzar el botón el cual puede ser HTML o Windows
 */
public abstract class Dialog {
    
    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    /*
     * Las subclases sobreescribirán este método para crear el tipo de botón específico que necesita
     */
    protected abstract Button createButton();
}
