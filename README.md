# Factory Method
## Introducción
En esta rama encontramos el código de ejemplo de para patrón de diseño Factory Method implementado en Java.<br>
En este ejemplo vamos a utilizar el patrón de diseño para crear una ventana con botones dependiendo del sistema operativo en que se corra el programa.<br>
Por ejemplo, cuando se corra en un sistema operativo se va a abrir una pequeña ventana con un letreto y un botón
pero cuando se corra en un medio web se creará un boton de tipo html para escribir un mensaje de hola mundo.

## Explicación
Se crean las clases con sus respectivos paquetes
```
 factory_method/buttons/Button
 factory_method/buttons/HtmlButton
 factory_method/buttons/WindowsButton
 
 factory_method/factory/Dialog
 factory_method/factory/HtmlDialog
 factory_method/factory/WindowsDialog
 
 Main
```

Donde clase se usa de la siguiente manera (Explicación por paquetes):

### Package: factory_method/buttons/
En este paquete se crea la interface para los diferentes tipos de botones y sus implementaciones.<br>
En este caso, se crea la interface _**Button**_ que define las funciones de todos los botones. <br>
Además se crean las clases _**HtmlButton**_ con la implementación de un botón HTML y la clase 
_**WindowsButton**_ con la implementación de un botón para una ventana en el sistema operativo Windows.

### Package: factory_method/factory
En este paquete se implementa el patrón de diseño donde tenemos la clase abstracta _**Dialog**_ la cual es Fábrica base
o BaseFactory que se encarga de definir la lógica para el ejemplo y crear un método abstracto para la creación del tipo de botón 
dependiendo de la configuración.<br>
Además se crean las clases _**HtmlDialog**_ y _**WindowsDialog**_ que son las fábricas o Factory de cada tipo de dialogo, es decir,
estas clases extienden de _**Dialog**_ e implementan el método abstracto definido en ella según corresponda a su implementación.

### Clase: Main
En esa clase tenemos un ejemplo de uso de del patrón donde lanzamos un Dialog o ventana dependiendo del sistema operativo en que se corra el programa.

## Referencias
[1] Factory Method. (s. f.). refactoring.guru. Recuperado 1 de agosto de 2021, de https://refactoring.guru/es/design-patterns/factory-method
