# Programando con Pixel · Fundamentos de Java

## Resumen del curso

Aprende a programar desde cero creando **Mi Mascota Virtual**, una mascota llamada **Pixel**, al estilo Tamagotchi. El curso sigue las cinco lecciones de los videos: comenzamos con un saludo, guardamos los datos de Pixel, tomamos decisiones, reutilizamos métodos y terminamos construyendo una clase `Mascota` con sus propios datos y comportamientos.

- **Público objetivo:** estudiantes de 12 a 17 años sin experiencia previa en programación.
- **Prerrequisitos:** manejo básico del navegador y del teclado.
- **Herramientas:** navegador y conexión a internet para trabajar en JDoodle, como en los videos. También puedes ejecutar los archivos con un JDK instalado.
- **Material:** `starter-files` contiene las prácticas por completar; `completed-examples` contiene el código final mostrado en cada video; `videos` contiene las cinco grabaciones de referencia.

Cada lección es independiente. Abre solo el archivo de la lección que estés siguiendo.

## Secuencia de lecciones

### Lección 1 · ¿Qué es Java y la programación?

**Descripción.** Conoce qué significa programar y cómo se ejecutan las instrucciones paso a paso. Escribe la clase `HolaMundo`, reconoce el método `main` y usa `System.out.println` para dar la bienvenida a Mi Mascota Virtual.

- **Conclusiones clave.** `main` es el punto de inicio del programa; `System.out.println` muestra un mensaje en la consola.
- **Ponlo en práctica.** Completa la instrucción que imprime `¡Bienvenido a Mi Mascota Virtual!`. Después cambia el saludo.
- **Video:** [Leccion1_Completa.mp4](videos/Leccion1_Completa.mp4).
- **Empieza a programar:** [HolaMundo.java](starter-files/01-introduccion/HolaMundo.java).
- **Ejemplo resuelto:** [HolaMundo.java](completed-examples/01-introduccion/HolaMundo.java).

Salida del ejemplo:

```text
¡Bienvenido a Mi Mascota Virtual!
```

### Lección 2 · Variables y tipos de datos

**Descripción.** Usa variables como cajas con nombre para guardar información de Pixel. El video presenta `String` para texto, `int` para números enteros y `boolean` para verdadero o falso. En la demostración `MascotaDemo` se declaran `nombre = "Pixel"`, `hambre = 50` y `energia = 80`, y se concatena texto con `+`.

- **Conclusiones clave.** Cada variable tiene un tipo; sus valores describen el estado de la mascota.
- **Ponlo en práctica.** Completa la línea que muestra el nombre y el hambre. Cambia el hambre y vuelve a ejecutar. Como práctica adicional, muestra también la energía.
- **Video:** [Leccion2_Completa.mp4](videos/Leccion2_Completa.mp4).
- **Empieza a programar:** [MascotaDemo.java](starter-files/02-variables/MascotaDemo.java).
- **Ejemplo resuelto:** [MascotaDemo.java](completed-examples/02-variables/MascotaDemo.java).

Salida del ejemplo:

```text
Pixel tiene 50 de hambre
```

### Lección 3 · Estructuras de control: decisiones y bucles

**Descripción.** Haz que el programa decida si Pixel tiene mucha hambre con `if/else` y la condición `hambre > 70`. Después usa un bucle `for` para mostrar cinco días de cuidado de la mascota.

- **Conclusiones clave.** `if/else` elige qué bloque ejecutar; `for` repite una acción usando un contador.
- **Ponlo en práctica.** Completa la decisión y el mensaje dentro del bucle. Prueba con hambre de 80, 70 y 50 para observar cuándo cambia el resultado.
- **Video:** [Leccion3_Completa.mp4](videos/Leccion3_Completa.mp4).
- **Empieza a programar:** [ControlDemo.java](starter-files/03-control/ControlDemo.java).
- **Ejemplo resuelto:** [ControlDemo.java](completed-examples/03-control/ControlDemo.java).

Salida del ejemplo:

```text
¡Pixel tiene mucha hambre!
Día 1: cuidando a Pixel
Día 2: cuidando a Pixel
Día 3: cuidando a Pixel
Día 4: cuidando a Pixel
Día 5: cuidando a Pixel
```

### Lección 4 · Métodos, entrada/salida e introducción a la POO

**Descripción.** Organiza instrucciones en el método reutilizable `alimentar()`, que muestra `Pixel fue alimentado.`. Usa `Scanner` y `nextLine()` para preguntar el nombre de la mascota y anunciar su nacimiento. La lección introduce la idea de agrupar datos y comportamientos en una clase.

- **Conclusiones clave.** Definir un método permite llamarlo sin repetir sus instrucciones. `Scanner` lee lo que escribe el usuario y `System.out` muestra la respuesta.
- **Ponlo en práctica.** Completa y llama a `alimentar()`. Lee el nombre y muestra el mensaje de nacimiento. Prueba con `Pixel` y luego con otro nombre.
- **Video:** [Leccion4_Completa.mp4](videos/Leccion4_Completa.mp4).
- **Empieza a programar:** [MetodosDemo.java](starter-files/04-metodos/MetodosDemo.java).
- **Ejemplo resuelto:** [MetodosDemo.java](completed-examples/04-metodos/MetodosDemo.java).

Ejemplo de sesión (el usuario escribe `Pixel`):

```text
Pixel fue alimentado.
¿Cómo se llama tu mascota? Pixel
¡Genial! Pixel ha nacido.
```

### Lección 5 · Fundamentos de POO, programa completo

**Descripción.** Construye la clase `Mascota` con los atributos privados `nombre`, `hambre`, `energia` y `nivel`. El constructor recibe el nombre e inicializa el hambre en 50, la energía en 100 y el nivel en 1. Crea a Pixel con `new Mascota("Pixel")`, aliméntalo, hazlo jugar y consulta su nivel con `getNivel()`.

- **Conclusiones clave.** Una clase es el modelo de los objetos; el constructor establece su estado inicial. La encapsulación protege los atributos y permite consultarlos mediante métodos públicos.
- **Comportamientos del video.** `alimentar()` reduce el hambre en 15 sin bajar de 0 y aumenta la energía en 5 sin superar 100. `jugar()` reduce la energía en 10 sin bajar de 0 e incrementa el nivel. Se usan `Math.max` y `Math.min` para respetar esos límites.
- **Ponlo en práctica.** Completa los métodos y sus llamadas desde `main`. Después crea una segunda mascota o llama dos veces a `jugar()` y comprueba su nivel.
- **Video:** [Leccion5_Completa.mp4](videos/Leccion5_Completa.mp4).
- **Empieza a programar:** [Main.java](starter-files/05-poo/Main.java).
- **Ejemplo resuelto:** [Main.java](completed-examples/05-poo/Main.java).

Salida del ejemplo:

```text
Pixel fue alimentado. Hambre: 35
Pixel jugó y subió a nivel 2
Nivel final: 2
```

## Cómo utilizar las prácticas

1. Abre el video y el archivo inicial de la misma lección.
2. Entra al [editor de Java de JDoodle](https://www.jdoodle.com/online-java-compiler), utilizado en las grabaciones, y copia el contenido del archivo en el editor. Conserva el nombre de la clase pública del ejemplo. Si tu editor exige un archivo con el mismo nombre, utiliza `HolaMundo.java`, `MascotaDemo.java`, `ControlDemo.java`, `MetodosDemo.java` o `Main.java`, según la lección.
3. Completa los comentarios `TODO` y pulsa **Execute**. En la lección 4, escribe el nombre cuando se solicite; si usas entrada estándar en lugar del modo interactivo, coloca `Pixel` en una línea de `stdin`.
4. Compara tu resultado con el archivo de `completed-examples`.

Los enlaces de las prácticas abren el código inicial en GitHub para que puedas copiarlo. Los videos se pueden abrir desde sus enlaces; si GitHub no ofrece reproducción, usa la opción de descargar el archivo.

### Ejecución local

Con un JDK instalado, abre una terminal en la carpeta del ejemplo. El nombre del archivo debe coincidir con el de su clase pública. Por ejemplo, para la primera lección:

```sh
cd completed-examples/01-introduccion
javac -encoding UTF-8 HolaMundo.java
java HolaMundo
```

Para el programa completo:

```sh
cd completed-examples/05-poo
javac -encoding UTF-8 Main.java
java Main
```

Compila cada lección en su propia carpeta. Los archivos `.class` generados se excluyen mediante `.gitignore`.

## Para seguir practicando

Personaliza el nombre de Pixel, prueba diferentes valores de hambre y energía y observa cómo cambian los mensajes. En el programa final, repite las llamadas a `alimentar()` y `jugar()` para comprobar los límites de los atributos y el aumento del nivel.

## Elaboración

- **Universidad y carrera:** Universidad Peruana de Ciencias Aplicadas, Ingeniería de Software.
- **Curso:** Desarrollo de Aplicaciones Open Source (1ASI0729), período 202620, NRC 7737.
- **Equipo:** SportPlus.
- **Líder y fecha de entrega:** por confirmar.

Integrantes:

- Sergio Joaquin Evangelista Ygnacio
- Sebastian Aaron Carbajal Santivañez
- Alexis Sebastian Martin Farro
- Marlon Packard Viza Quispe
- Eduardo Jesus Osorio Ramirez
