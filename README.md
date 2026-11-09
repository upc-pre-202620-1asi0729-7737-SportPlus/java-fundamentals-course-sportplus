# Curso de fundamentos de Java para principiantes

## Resumen del curso

Este curso está dirigido a estudiantes de secundaria que quieren aprender a programar desde cero. A lo largo de las lecciones construiremos un registro de puntajes para un torneo escolar. Comenzaremos mostrando un mensaje en pantalla y, poco a poco, incorporaremos nombres, resultados, decisiones y objetos hasta poder registrar a varios jugadores.

Los ejemplos se trabajan directamente en el navegador. Cada lección incluye una práctica con el código inicial y una versión resuelta para comparar los resultados. Puedes detenerte, modificar los datos y volver a ejecutar el programa mientras sigues la explicación.

- **Público objetivo.** Estudiantes de 12 a 17 años sin experiencia previa en programación.
- **Prerrequisitos.** Manejo básico del navegador y del teclado.
- **Herramientas necesarias.** Un navegador web y conexión a internet.

El código del curso y las actividades están disponibles en el repositorio del equipo. [Repositorio de GitHub](https://github.com/upc-pre-202620-1asi0729-7737-SportPlus/java-fundamentals-course-sportplus).

## Secuencia de lecciones

### Lección 1 · ¿Qué es Java y cómo se escribe un programa?

- **Temas clave.** Programación, instrucciones, estructura básica de Java y salida por consola.
- **Enfoque didáctico y ejemplo.** Para organizar un torneo necesitamos seguir un orden: anunciar el inicio, registrar a los participantes y mostrar los resultados. Un programa también sigue instrucciones en un orden determinado. En esta lección conocerás cómo se escriben esas instrucciones en Java y ejecutarás tu primer mensaje en el navegador. Identificaremos dónde comienza el programa y qué hace la instrucción `System.out.println`, observando la relación entre lo que escribimos y lo que aparece en la consola.
- **Actividad práctica.** Cambia el saludo del programa y agrega una segunda línea que anuncie el inicio del torneo. Antes de ejecutarlo, piensa en qué orden aparecerán los mensajes.

Puedes comenzar con el código preparado y consultar la solución al terminar. [Abrir práctica][practica-1] · [Código inicial](starter-files/01-introduccion/Main.java) · [Ejemplo resuelto](completed-examples/01-introduccion/Main.java).

**Enlace a la lección.** Pendiente de agregar el video.
<!-- Reemplazar la línea anterior por el enlace real al video no listado de esta lección. -->

### Lección 2 · Variables, tipos de datos y operadores

- **Temas clave.** Variables, `String`, `int`, `boolean`, operaciones aritméticas y comparaciones.
- **Enfoque didáctico y ejemplo.** Un marcador guarda información que cambia durante un partido. En nuestro programa utilizaremos variables para guardar el nombre de un jugador, sus aciertos y su puntaje. Veremos por qué un nombre se representa como texto y los aciertos como números enteros. Después calcularemos el resultado sumando un bono a los puntos obtenidos y usaremos una comparación para comprobar si el jugador alcanza la meta. Al cambiar un valor podremos observar cómo afecta al resultado.
- **Actividad práctica.** Calcula el puntaje de un jugador con tres aciertos y un punto de bono, considerando que cada acierto vale dos puntos. Cambia los aciertos y comprueba cuándo deja de alcanzar la meta.

Puedes comenzar con el código preparado y consultar la solución al terminar. [Abrir práctica][practica-2] · [Código inicial](starter-files/02-variables/Main.java) · [Ejemplo resuelto](completed-examples/02-variables/Main.java).

**Enlace a la lección.** Pendiente de agregar el video.
<!-- Reemplazar la línea anterior por el enlace real al video no listado de esta lección. -->

### Lección 3 · Estructuras de control, decisiones y bucles

- **Temas clave.** Condiciones con `if/else`, comparaciones y repeticiones con `for` y `while`.
- **Enfoque didáctico y ejemplo.** Las reglas de un torneo determinan quién clasifica. Traduciremos una de esas reglas a una condición: un jugador clasifica cuando obtiene al menos seis puntos. Luego veremos cómo repetir una tarea sin escribir la misma instrucción varias veces. Usaremos un bucle `for` para mostrar las rondas y un `while` para realizar una cuenta regresiva. Seguiremos los valores de los contadores para entender cuándo continúa cada bucle y cuándo termina.
- **Actividad práctica.** Completa la cuenta regresiva desde cuatro hasta uno. Después cambia el puntaje a cinco y comprueba el mensaje de clasificación. Prueba también con seis para revisar el límite de la condición.

Puedes comenzar con el código preparado y consultar la solución al terminar. [Abrir práctica][practica-3] · [Código inicial](starter-files/03-control/Main.java) · [Ejemplo resuelto](completed-examples/03-control/Main.java).

**Enlace a la lección.** Pendiente de agregar el video.
<!-- Reemplazar la línea anterior por el enlace real al video no listado de esta lección. -->

### Lección 4 · Métodos, parámetros y entrada de datos

- **Temas clave.** Métodos, parámetros, valores de retorno y lectura de datos con `Scanner`.
- **Enfoque didáctico y ejemplo.** Hasta este punto hemos escrito los datos directamente en el código. Ahora permitiremos que quien use el programa introduzca los aciertos y el bono. Para calcular el resultado crearemos un método que reciba esos dos valores y devuelva el puntaje. Puedes imaginarlo como una regla de cálculo que se aplica a distintas fichas de jugadores. Explicaremos qué información entra por los parámetros, qué operación se realiza y cómo se utiliza el valor que devuelve `return`.
- **Actividad práctica.** Completa el método de cálculo y ejecútalo con cuatro aciertos y dos puntos de bono. Repite la prueba con cero aciertos y tres de bono para comprobar que el método utiliza los datos recibidos.

Puedes comenzar con el código preparado y consultar la solución al terminar. [Abrir práctica][practica-4] · [Código inicial](starter-files/04-metodos/Main.java) · [Ejemplo resuelto](completed-examples/04-metodos/Main.java).

**Enlace a la lección.** Pendiente de agregar el video.
<!-- Reemplazar la línea anterior por el enlace real al video no listado de esta lección. -->

### Lección 5 · Introducción a la programación orientada a objetos

- **Temas clave.** Clases, atributos, objetos, constructores, instanciación y encapsulación con getters y setters.
- **Enfoque didáctico y ejemplo.** Cuando hay varios participantes, conviene reunir el nombre y el puntaje de cada uno en una misma ficha. La clase `Jugador` describirá qué contiene esa ficha, y cada objeto representará a un participante concreto. Crearemos a Ana y Luis usando un constructor y consultaremos sus datos mediante métodos. Después protegeremos el puntaje con un atributo privado y un setter que permita actualizarlo cuando el valor sea válido. Así veremos cómo los datos y el comportamiento se relacionan dentro de un objeto.
- **Actividad práctica.** Crea un tercer jugador, cambia su puntaje a ocho e intenta asignarle un valor negativo. Consulta el resultado con el getter y explica por qué conserva el último puntaje válido.

Puedes comenzar con el código preparado y consultar la solución al terminar. [Abrir práctica][practica-5] · [Código inicial](starter-files/05-poo/Main.java) · [Ejemplo resuelto](completed-examples/05-poo/Main.java).

**Enlace a la lección.** Pendiente de agregar el video.
<!-- Reemplazar la línea anterior por el enlace real al video no listado de esta lección. -->

### Lección 6 · Registro de jugadores, programa completo y cierre

- **Temas clave.** Arreglos de objetos, entrada de datos, recorridos, integración de conceptos y errores comunes.
- **Enfoque didáctico y ejemplo.** Reuniremos lo aprendido en un programa que registra a varios jugadores y muestra sus resultados. Un arreglo permitirá guardar sus fichas en posiciones numeradas. Recorreremos esas posiciones para leer los datos y después presentar quiénes clasifican. También probaremos situaciones que pueden ocurrir al usar el programa, como dejar un nombre vacío o escribir una palabra donde se espera un número. Cerraremos revisando cómo interpretar un mensaje de error y cómo elegir nombres claros para las variables y los métodos.
- **Actividad práctica.** Completa la condición que muestra quién clasifica. Registra a Ana con nueve puntos y a Luis con cuatro, revisa sus resultados y prueba una entrada incorrecta para observar cómo vuelve a solicitarse el dato.

Puedes comenzar con el código preparado y consultar la solución al terminar. [Abrir práctica][practica-6] · [Código inicial](starter-files/06-proyecto/Main.java) · [Ejemplo resuelto](completed-examples/06-proyecto/Main.java).

**Enlace a la lección.** Pendiente de agregar el video.
<!-- Reemplazar la línea anterior por el enlace real al video no listado de esta lección. -->

## Cómo utilizar las prácticas

Selecciona **Abrir práctica** para cargar el ejercicio en Compiler Explorer. Escribe tus cambios en el panel de Java y observa el resultado en el panel de ejecución. En las lecciones que reciben datos, modifica la entrada estándar, identificada como `stdin`, colocando un dato en cada línea.

También puedes copiar el código inicial completo en OnlineGDB y pulsar **Run** para trabajar con su consola interactiva. Ejecuta una lección a la vez. [Abrir OnlineGDB](https://www.onlinegdb.com/online_java_compiler).

## Para seguir practicando

Cuando completes el registro, modifica el puntaje mínimo de clasificación y prueba con valores por debajo, por encima e iguales al nuevo límite. Después intenta mostrar cuántos jugadores clasificaron. Estas pequeñas modificaciones te ayudarán a comprobar qué parte del programa controla cada resultado.

## Elaboración

- **Universidad y carrera:** Universidad Peruana de Ciencias Aplicadas, Ingeniería de Software
- **Curso:** Desarrollo de Aplicaciones Open Source (1ASI0729), período 202620, NRC 7737
- **Equipo:** SportPlus
- **Líder y fecha de entrega:** por confirmar

- Sergio Joaquin Evangelista Ygnacio
- Sebastian Aaron Carbajal Santivañez
- Alexis Sebastian Martin Farro
- Marlon Packard Viza Quispe
- Eduardo Jesus Osorio Ramirez


Los guiones incluyen las demostraciones y las pausas de práctica para preparar las grabaciones. [Guiones de las lecciones](scripts/).

[practica-1]: https://godbolt.org/clientstate/eJxNULluwzAM_RVCUwIEjpNu7dStS6eMsQdGUgUWEuXqCFoY-fdSjntQAqh3iADfrLLNmSJn9QjnWZGRftiB8siuorMC1TteUQmXY016YbTHnOEViWEeGKSmevGkIRcs0q6RDASRN6eSiN15BEwub3_crU5fudjQxVq6STzF82ZQL9HjDkJlEwe1ffpz7_fw7JJ1CPhRh9r31kBlhGydmBGIc0lVa2ra2wPDhAkhRGExgfViIE0RjDxLTGxjdx9-G1huW0_HMJG3aYliFMJ-Wl3FvGYjG9RguTSo_n8QvCa3RHU89Mcme7r8jopTWUNW6taiLIb4jkY536cQfNY
[practica-2]: https://godbolt.org/clientstate/eJx9UttuwjAM_RUrTyAmKCDtYROb-ACkaTxSHtzWVEGp0-WCGIh_n9tyG5OWVkp8zontJOeoPHmvLXv1Aquj0oXM4ydQBrmMWJKEaos7VIJ5G13eIrlB72GBmuGYMsioY2Z0Dj5gkGlndQGV0L1lcJrL1RrQlb5_UTejY2AbSyysgxmkas6YqtebRHMAzDW5YL0Ipg9UHVmID-vmnUYkkwdJZrmBxwLfiNEIPomq2uABIYFaqkdGoH3tyOs0JslmyvAVCXI0eTQEZNpiuKXh3xYElRLJXeXMWkPIILuRD7iggKK4aN9m8Pyrn-W3D1QNbQzDWu4kGO5dbmUgtwJBE1OzGFxztHh3_mGq-q__JktVc6ZsM-_aAYNQSUvvXcq7Ji95TinL3zx5bqtaG3KtPdYC0J7yGKw7-0VeNVbEoQnV_QaJz25q7TMZJ5OGNjq7prJ1OBtPqVNjr1Bo7qK1fD_y783E
[practica-3]: https://godbolt.org/clientstate/eJyNUk1TwjAQ_StrTmVwgMKMzoh44eRBD3KkHEK6rWHSpOYDRYb_7qZUijPqkHa6ebt9bzeZt2cOnZNGO3YHyz2TOcX0Gpjiugy8RIJsw7ecUc6ZYEWTEYo7B09cathnGmjVYa2kAOe5p7A1MoeKysnCW6nL5Qq4LV3v---4pPbE0p5vEGZwOz2rFJB8Vx5mcPODFtdi5zxWAxP8oCZ5r3SSsTnNJAspsjAaFZOM9c4UD4DK4UUyzwbEf0qZ7kBhLCTxHNbonNMp0mm7vZ_BpN33-5fN_9IQMwb9I-_PrrGhwzLo3DiIfbrScAhzixyChnUQCuH9VdL3LSBUAZ23CIpIJ_augRbz8Ck45EhEA6hjGHSqv44bL4enj1oKaa66O6JJ6Y1uEaaqqbltnLWiBH6gCN7Y1mpkiFCh9hGycwLh1oiN88bpaBzLSq5PUqb2rWcZO0Rn-lzqI1rR8wU27tqZ
[practica-4]: https://godbolt.org/clientstate/eJx9Uk1v2zAM_SuETg4WuEm2U4Md1lsPBYrlWOfAyGygQKYMieraBfnvozIlS4q1tAGZX-_R1NubRCm5wMncwtPeuF7P-RSMR95m3JK6ZocvaDSWQo72GHHDGKJASbRZnG9XFpkpLjvu2HpMCR7QMew7BrUxb7yzkARFj5fgehg03awkOt4-rQHjNk1O1cUkvkFTQYFYIvYI34HpF9Ros3pLQkPreHLVWaymQpZ2VAZpOvPDOooS0i10ZrK8LtcKwJpXkkrXMr3KvTa_L_8P-l3g8BHyRnMfoH6O61mRHzML7qiAwxew6G32GGu0OU09PbJMLukPfz8PJ5a6_DLRe5TL_5-eZ77a6s0N_KRy0-43AnmwXZ7NaF5wAvQEHsGTta6En78yLNp_vZEkR4bZ8jyRvkVPNgyj8xSP2ltrgF7JZgmxilFVkQfdW3HNZYP6VapHbS7ms0VJe7c5Q4VRqqqNORTtSu-4eN86Xij9Ya3PHwFW7qw
[practica-5]: https://godbolt.org/clientstate/eJx1U99P4zAM_lesPG2CGwwh3enQkBBvCBASj3QPbmd6mdqkSpwBmva_n9M1a8tG-pD612d_drxVnrzX1nj1F962Sq_knp-DqtCUAUsSUa1xg0p03gZXtJqiQu_hCbWBbWZAThPyShfgGVmujdUrqMU8eWWnTfm2BHSlnybveB5CiSvrAA3CAgx9JM0kU3cGM8n4e3pz7F8F7Y8CHkUZI65jRB9zcQH3jhAsOws2XxPbA84XNC5QjuADeGImB4U18EcM8f41n_U4r1-eqZ7ZwLNG-HBlJlL2rCR-tnXuaDKFM8ikM5mSn870EgzjWmxDFieQIqGfoJLtCGuXmV1kup9E4pSG4fQGmeBdG6xgPwIwLfzN2EMqkNG12IfGpa6O4s6HrqM58j8pce8UxzLMEo_vi0_RPYXR2-nyDTsxSOOIgzNj_O8IscRhs07E92RPAbTvdlDxT5z1OyQ2cLuAy5Hx0JTksfiWtcvcjzEuV2HrRlfk2kVcioI-qQhsXbeZsj-hJsNRVMMAkbu9bRf1an55Fc2Vzg9QtuFuxZXaxUXmlTZ7aSnff-RiQ0w
[practica-6]: https://godbolt.org/clientstate/eJzFV21r40YQ_itTfThkYhQn9AqXXFpC8cGVXCgNdxSiUNbS2N6w2nX3xYkJ_u-dXa0USZa50H7oGizt7szszDMvO3pJDBrDlTTJBdy_JLyk59kUEsHkyrEV0jR5ZFuW0JpRThdhhVcbpS34jcxZLrJbdeeK9VxghdLOnwvcWBJ6mcsDyruCSYmatnJZCGYMfGFcwksugcbGLQQvwFhm6bFVvISKttM7q7lc3T8A0yszaaj9sHoHaRQKdLhmJYMrkPgEcTW92xmLVcblpMfpB5cWiMrykpXEJRD1XFrUKo2ippAnuZvNFstfnX_imbTKwKNbsVJpNL9AegYM3k8uiHDqoXs_ueyf8VtNS8q3XFHBZqfR4CGg0uVdKg2pV5ITy-ySHh9fpWQC5cquafXk5MAyP6LhytlsQ_hZIdM8iYeSunBCsunvbDJUOTAHyEGqaqExYnMbJg02Y1xe142Tlj3iUTx_r_drxGZT-EwUK9TZl-s___p2ffN1Pia4tfqeP_ThS2sVp825Q-79ENRRWPJc_oHGCUsiDZQowCotUeXJUN5_80kDf-QgEV3Lxvww0DaN9NkKbfTHhJyYJxe1SzvbEei4H_BR5tAgP05P4ath4DOSL3nBiGcHTgJfnqIwCBumGVTKkBMpzQToBqvsTWE34pP2lRLQFmtIx2sIoNZKH0B5zIefqJaUCII1tSDr2xsPbmMiVhrvzk6wDurJtEkG0swQoNNAX3Gqbiq-s2d672n5tOYCIbXa4Xe1T6PgIUx8CekPjSFrZm7x2d5wSR4djS271uoppMY4lmNu6C_4ajoi2JsoXUXQULw26UohYZAmTWpnstUuI7iqdLSseJOiqJ-vIobw7l0j_uPVGJbdodE6LSP9yAH7gYlteLlqgfqT0hX7bnT5QRlxh7B1KLZIFX6DJQ-RXzKrwHAfYiLcCKVERmUSCkVVHCX6tMEQR7CtrwzBD_LkbUXps1xRojEvUXpRSxZAitI97lgnfcQxpPkuLgUYw9LbciDGeKfOD9Lg34d3ntQSfYn632N8eLEdDd8xRWuujJt5tbG7Izo2IRpoj1e-o26fi0Y7CquNQypof9M_Vd4tK-qYU0d9un_trJq7pmmuNN8yi7Dkkok-DJd9is4t3rYkzW3b45t2Sft92ZqbrMX4AArzejsNru3WX7EXjOd1b7vOMWNQDyV4FXu34SH_q7FjAkIf2tH4mM0-Qprmh4rb7CA4Aiiv7VH_1L4bewoslBLIZO96PmqEP_qny248-Oa9UNWGMlaHRv-BFvAZC0c9Tuz8qbF2PpH8NOky0Dx-F4QPgfOz2bnfFnzRilIh82rOvf9QsCWXfnaey2vJcvkhlzeOm1z-SMrsH-j3D-WwwgI
