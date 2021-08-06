import factory_method.factory.Dialog;
import factory_method.factory.HtmlDialog;
import factory_method.factory.WindowsDialog;

/*
 * Clase principal para probar el patrón
 */
public class Main {
    private static Dialog dialog;

    public static void main(String[] Args){
        configure();
        runBusinessLogic();
    }

    /*
     * El Factory o fábrica es usualmente seleccionada dependiendo de algo que puiede ser
     * una configuración o una variable de ambiente
     * -----------------------------------------------------------------
     * En este caso, se selecciona dependiendo del sistema operativo,
     * es decir, si es Windows o Web
     */
    private static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    /*
     * Todo el código debe funcionar con fábricas y productos a través de interfaces abstractas,
     * es decir, se crean objetos de tipo interfaces e instancian con las interfaces según corresponda.
     * De esta forma no importa con que fábrica trabaja y que tipo de producto devuelve
     */
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
