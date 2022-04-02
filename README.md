# Principios SOLID
## Ejercicio de práctica

### Introducción

Este es un ejercicio en el que se trata de identificar problemas en un 
código existente. El código de este repositorio incumple, al menos, un
principio SOLID, pero pueden ser más de uno. Para empezar haz un *fork*
de este repositorio para hacer las modificaciones que se te piden. Cuando
termines, invita a tu tutor para que puedan acceder a tu
repositorio y revisar lo que has hecho.

Lista de tutores:

- malagardak
- lorenzomartineznunsys
- LuisGFer
- hecforga

**El ejercicio es obligatorio**, pero su objetivo es el de subir nota.
La única forma de suspender sería no hacerlo o dar como respuesta que
no se inclumple ninguno de los principios (ya se ha indicado que se
incumple al menos uno). La nota dependerá de los fallos que encontréis y
de cómo planteéis su solución.

### Planteamiento inicial

El Director Técnico te llama y te dice que hay que hacer una modificación
en la clase **Directory**: no quiere que el método *getSize()* lance una
excepción, sino que devuelva el tamaño total de los ficheros y directorios
que contiene. De paso, te dice que veas si el código tiene algún problema
y, si es así, que intentes corregirlo.

### Objetivo

Tu objetivo es hacer la modificación que te han pedido, actualizando el
método *getSize()* de la clase **Directory** y después detectar los
principios SOLID que no está cumpliendo el código y tratar de corregirlos. 
Debes concentrarte solo en los paquetes **com.kreitek.files** y
**com.kreitek.service**. No hay que modificar la función *main()* ni el
contenido del paquete **com.kreitek.utils**, ya que este solo tiene clases
que se usan para comprobar que el código sigue funcionando de la forma
esperada y que no has "roto" nada.

En tu repositorio crea un fichero en el que deberás poner los fallos que
presenta el código en relación con los principios SOLID. Este fichero debe
estar en la raíz y puede ser en formato Markdown (ERRORES.md) o un simple
fichero de texto (ERRORES.txt).

Por favor, si crees que se incumple más de un principio SOLID, separa tus
modificaciones del código en diferentes *commits*, poniendo en el mensaje
cuál es el principio que se incumplía y que se ha resuelto. Esto nos
facilita la calificación del ejercicio. Cuando creas que has terminado,
envía una copia del fichero de errores como resultado de la prueba. De esta
manera sabremos que ya podemos calificar tu ejercicio.

### NOTAS

Antes de empezar, ejecuta el proyecto. La función *mani()* construye un
sistema de archivos de prueba y ejecuta un método para imprimir el
resultado de aplicar todas las clases a ese sistema de archivos. También
muestra el resultado esperado. A medida que hagas modificaciones, puedes
ir ejecutando el proyecto para ver si el resultado sigue coincidiendo
con lo esperado y así sabrás si no estás modificando la funcionalidad.

Tienes total libertad con el código. Entre otras cosas, puedes:

* Crear las entidades de software (paquetes, clases interfaces, métodos)
  que consideres necesarias.
* Mover clases o interfaces de un paquete a otro
* Mover métodos de una clase a otra
* Modificar interfaces, clases y métodos
* Lo que se te ocurra :)

Sabemos que conseguir que se cumplan **todos** los principios al 100%
sería muy difícil. Si llegas a un punto en que ves que se te están
complicando mucho las cosas, puedes poner un comentario indicando cómo
se podría terminar de implementar la solución. Por ejemplo, si ves que
necesitarías implementar el Patrón de Diseño *Builder* para satisfacer
al 100% el principio de Inversión de Dependencias, lo podrías indicar
de esta forma:

```java
public void method() {
  /* 
      TODO: Implementar un Builder para no crear una instancia concreta 
      de la clase y cumplir el Principio de Inversión de Dependencias
   */
  MyInterfce interface = new ClassThatImplementsMyInterface();
}
```

Tómate el tiempo que quieras. Sabes que se incumple al menos un principio,
pero pueden ser más. Si revisas el código un rato después, puede que te
fijes en algo nuevo que antes habías pasado por alto. No hay fecha límite
de entrega, así que no te apresures.

Recuerda que **no hay una única solución correcta**. Todo se puede plantear
de diferentes formas. Sé creativo.