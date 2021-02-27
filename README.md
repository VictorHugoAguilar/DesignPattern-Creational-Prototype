# Patrón de Diseño - Creacional - Prototype

Prototype es un patrón de diseño creacional que permite la clonación de objetos, incluso los complejos, sin acoplarse a sus clases específicas.

Todas las clases prototipo deben tener una interfaz común que haga posible copiar objetos incluso si sus clases concretas son desconocidas. Los objetos prototipo pueden producir copias completas, ya que los objetos de la misma clase pueden acceder a los campos privados de los demás.

![UML - Prototype](https://github.com/VictorHugoAguilar/DesignPattern-Creational-Prototype/blob/master/img/prototype-diagram.png?raw=true)

## Utilidad

Este patrón resulta útil en escenarios donde es impreciso abstraer la lógica que decide qué tipos de objetos utilizará una aplicación, de la lógica que luego usarán esos objetos en su ejecución. Los motivos de esta separación pueden ser variados, por ejemplo, puede ser que la aplicación deba basarse en alguna configuración o parámetro en tiempo de ejecución para decidir el tipo de objetos que se debe crear. En ese caso, la aplicación necesitará crear nuevos objetos a partir de modelos. Estos modelos, o prototipos, son clonados y el nuevo objeto será una copia exacta de los mismos, con el mismo estado. Esto resulta interesante para crear, en tiempo de ejecución, copias de objetos concretos inicialmente fijados, o también cuando sólo existe un número pequeño de combinaciones diferentes de estado para las instancias de una clase.

Dicho de otro modo, este patrón propone la creación de distintas variantes de objetos que la aplicación necesite, en el momento y contexto adecuado. Toda la lógica necesaria para la decisión sobre el tipo de objetos que usará la aplicación en su ejecución se hace independiente, de manera que el código que utiliza estos objetos solicitará una copia del objeto que necesite. En este contexto, una copia significa otra instancia del objeto. El único requisito que debe cumplir este objeto es suministrar la funcionalidad de clonarse.

## Consecuencia

Aplicar el patrón prototipo permite ocultar las clases producto (prototipos concretos) del cliente y permite que el cliente trabaje con estas clases dependientes de la aplicación sin cambios.

Además, hace posible añadir y eliminar productos en tiempo de ejecución al invocar a la operación clonar, lo que supone un método que proporciona una configuración dinámica de la aplicación.

Este patrón permite la especificación de nuevos objetos generando un objeto con valores por defecto sobre el que posteriormente se podrán aplicar cambios. La especificación de nuevos objetos también puede realizarse mediante la variación de su estructura. Reducción del número de subclases.
