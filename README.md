# Fundamentos de Java para principiantes

Aprende a programar construyendo un registro de puntajes para un torneo escolar. Al terminar podrás leer datos del teclado, guardar varios jugadores y mostrar quiénes clasifican.

- **Público:** estudiantes de secundaria de 12 a 17 años que están empezando a programar.
- **Duración prevista:** 60 minutos en seis lecciones.
- **Requisitos:** navegador con conexión a internet. El curso se puede practicar sin instalar software.
- **Código fuente:** [Repositorio del curso](https://github.com/upc-pre-202620-1asi0729-7737-SportPlus/java-fundamentals-course-sportplus).

## Cómo practicar

1. Selecciona **Abrir práctica** para cargar el código inicial en Compiler Explorer.
2. Edita el código en el panel de Java y revisa el resultado en el panel de ejecución. Las lecciones 4 y 6 llevan datos de ejemplo. Usa el campo de entrada estándar (stdin) para cambiarlos, con un dato por línea.
3. Resuelve el reto y compara tu resultado con el **Ejemplo resuelto**. Cada lección se ejecuta por separado.

Si quieres escribir los datos en una consola interactiva, copia el archivo **Inicio** completo al [compilador Java de OnlineGDB](https://www.onlinegdb.com/online_java_compiler) y pulsa **Run**.

## Lecciones

| # | Lección | Duración | Código | Video | Editor precargado |
|---|---|---:|---|---|---|
| 1 | [Introducción a Java y primer programa](#lección-1) | 7 min | [Inicio](starter-files/01-introduccion/Main.java) · [Ejemplo resuelto](completed-examples/01-introduccion/Main.java) | Por grabar | [Abrir práctica][practica-1] |
| 2 | [Variables, tipos y operadores](#lección-2) | 10 min | [Inicio](starter-files/02-variables/Main.java) · [Ejemplo resuelto](completed-examples/02-variables/Main.java) | Por grabar | [Abrir práctica][practica-2] |
| 3 | [Decisiones y bucles](#lección-3) | 10 min | [Inicio](starter-files/03-control/Main.java) · [Ejemplo resuelto](completed-examples/03-control/Main.java) | Por grabar | [Abrir práctica][practica-3] |
| 4 | [Métodos, parámetros y entrada/salida](#lección-4) | 9 min | [Inicio](starter-files/04-metodos/Main.java) · [Ejemplo resuelto](completed-examples/04-metodos/Main.java) | Por grabar | [Abrir práctica][practica-4] |
| 5 | [Clases, objetos y encapsulación](#lección-5) | 11 min | [Inicio](starter-files/05-poo/Main.java) · [Ejemplo resuelto](completed-examples/05-poo/Main.java) | Por grabar | [Abrir práctica][practica-5] |
| 6 | [Proyecto final y errores comunes](#lección-6) | 13 min | [Inicio](starter-files/06-proyecto/Main.java) · [Ejemplo resuelto](completed-examples/06-proyecto/Main.java) | Por grabar | [Abrir práctica][practica-6] |
| | **Total** | **60 min** | | | |

### Lección 1

**Introducción a Java y primer programa** (7 min). Explicar qué es programar y mostrar un mensaje con `System.out.println`.

**Reto.** Cambia el saludo y agrega una segunda línea que diga `El torneo va a comenzar.`

### Lección 2

**Variables, tipos y operadores** (10 min). Guardar un nombre, calcular el puntaje con operadores y comprobar si alcanza la meta.

**Reto.** Calcula el puntaje con 3 aciertos y 1 bono. Cada acierto vale 2 puntos.

### Lección 3

**Decisiones y bucles** (10 min). Usar `if/else` para decidir si alguien clasifica, `for` para recorrer rondas y `while` para contar hasta el inicio.

**Reto.** Completa la cuenta regresiva con `while`, empieza en 4 y cambia el puntaje a 5. Predice la clasificación y cuántos números verás.

### Lección 4

**Métodos, parámetros y entrada/salida** (9 min). Leer dos números con `Scanner` y usar un método con parámetros y un valor de retorno.

**Reto.** Ejecuta el programa con 4 aciertos y 2 de bono. Luego prueba con 0 y 3.

### Lección 5

**Clases, objetos y encapsulación** (11 min). Crear dos objetos `Jugador` con un constructor y usar getters y un setter para consultar y actualizar su puntaje.

**Reto.** Crea otro jugador y actualiza su puntaje a 8. Intenta cambiarlo a -1 y observa qué valor conserva.

### Lección 6

**Proyecto final y errores comunes** (13 min). Registrar jugadores, recorrer un arreglo de objetos y mostrar qué jugadores clasifican.

**Reto.** Completa el `if/else` para mostrar quién clasifica. Prueba con dos jugadores de 9 y 4 puntos. Luego prueba una entrada inválida, como `hola`.

## Comprueba tu proyecto

Con dos jugadores, Ana con 9 puntos y Luis con 4, el programa debe mostrar a Ana como clasificada y a Luis como no clasificado. La clasificación empieza en 6 puntos. El registro admite de 1 a 5 jugadores y vuelve a pedir el dato si recibe un nombre vacío, texto donde espera un número o un puntaje negativo. Usa nombres ficticios para practicar.

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

Los [guiones de grabación](scripts/) contienen las demostraciones, pausas y pruebas de cada lección. Antes de la entrega, completen el nombre del líder y la fecha, agreguen los enlaces a los videos no listados a la tabla y los enlaces de práctica a sus descripciones, y exporten este plan a PDF. Cada integrante debe aportar desde su cuenta para que su participación quede registrada en los commits.

[practica-1]: https://godbolt.org/clientstate/eJxNULluwzAM_RVCUwIEjpNu7dStS6eMsQdGUgUWEuXqCFoY-fdSjntQAqh3iADfrLLNmSJn9QjnWZGRftiB8siuorMC1TteUQmXY016YbTHnOEViWEeGKSmevGkIRcs0q6RDASRN6eSiN15BEwub3_crU5fudjQxVq6STzF82ZQL9HjDkJlEwe1ffpz7_fw7JJ1CPhRh9r31kBlhGydmBGIc0lVa2ra2wPDhAkhRGExgfViIE0RjDxLTGxjdx9-G1huW0_HMJG3aYliFMJ-Wl3FvGYjG9RguTSo_n8QvCa3RHU89Mcme7r8jopTWUNW6taiLIb4jkY536cQfNY
[practica-2]: https://godbolt.org/clientstate/eJx9UttuwjAM_RUrTyAmKCDtYROb-ACkaTxSHtzWVEGp0-WCGIh_n9tyG5OWVkp8zontJOeoPHmvLXv1Aquj0oXM4ydQBrmMWJKEaos7VIJ5G13eIrlB72GBmuGYMsioY2Z0Dj5gkGlndQGV0L1lcJrL1RrQlb5_UTejY2AbSyysgxmkas6YqtebRHMAzDW5YL0Ipg9UHVmID-vmnUYkkwdJZrmBxwLfiNEIPomq2uABIYFaqkdGoH3tyOs0JslmyvAVCXI0eTQEZNpiuKXh3xYElRLJXeXMWkPIILuRD7iggKK4aN9m8Pyrn-W3D1QNbQzDWu4kGO5dbmUgtwJBE1OzGFxztHh3_mGq-q__JktVc6ZsM-_aAYNQSUvvXcq7Ji95TinL3zx5bqtaG3KtPdYC0J7yGKw7-0VeNVbEoQnV_QaJz25q7TMZJ5OGNjq7prJ1OBtPqVNjr1Bo7qK1fD_y783E
[practica-3]: https://godbolt.org/clientstate/eJyNUk1TwjAQ_StrTmVwgMKMzoh44eRBD3KkHEK6rWHSpOYDRYb_7qZUijPqkHa6ebt9bzeZt2cOnZNGO3YHyz2TOcX0Gpjiugy8RIJsw7ecUc6ZYEWTEYo7B09cathnGmjVYa2kAOe5p7A1MoeKysnCW6nL5Qq4LV3v---4pPbE0p5vEGZwOz2rFJB8Vx5mcPODFtdi5zxWAxP8oCZ5r3SSsTnNJAspsjAaFZOM9c4UD4DK4UUyzwbEf0qZ7kBhLCTxHNbonNMp0mm7vZ_BpN33-5fN_9IQMwb9I-_PrrGhwzLo3DiIfbrScAhzixyChnUQCuH9VdL3LSBUAZ23CIpIJ_augRbz8Ck45EhEA6hjGHSqv44bL4enj1oKaa66O6JJ6Y1uEaaqqbltnLWiBH6gCN7Y1mpkiFCh9hGycwLh1oiN88bpaBzLSq5PUqb2rWcZO0Rn-lzqI1rR8wU27tqZ
[practica-4]: https://godbolt.org/clientstate/eJx9Uk1v2zAM_SuETg4WuEm2U4Md1lsPBYrlWOfAyGygQKYMieraBfnvozIlS4q1tAGZX-_R1NubRCm5wMncwtPeuF7P-RSMR95m3JK6ZocvaDSWQo72GHHDGKJASbRZnG9XFpkpLjvu2HpMCR7QMew7BrUxb7yzkARFj5fgehg03awkOt4-rQHjNk1O1cUkvkFTQYFYIvYI34HpF9Ros3pLQkPreHLVWaymQpZ2VAZpOvPDOooS0i10ZrK8LtcKwJpXkkrXMr3KvTa_L_8P-l3g8BHyRnMfoH6O61mRHzML7qiAwxew6G32GGu0OU09PbJMLukPfz8PJ5a6_DLRe5TL_5-eZ77a6s0N_KRy0-43AnmwXZ7NaF5wAvQEHsGTta6En78yLNp_vZEkR4bZ8jyRvkVPNgyj8xSP2ltrgF7JZgmxilFVkQfdW3HNZYP6VapHbS7ms0VJe7c5Q4VRqqqNORTtSu-4eN86Xij9Ya3PHwFW7qw
[practica-5]: https://godbolt.org/clientstate/eJx1U99P4zAM_lesPG2CGwwh3enQkBBvCBASj3QPbmd6mdqkSpwBmva_n9M1a8tG-pD612d_drxVnrzX1nj1F962Sq_knp-DqtCUAUsSUa1xg0p03gZXtJqiQu_hCbWBbWZAThPyShfgGVmujdUrqMU8eWWnTfm2BHSlnybveB5CiSvrAA3CAgx9JM0kU3cGM8n4e3pz7F8F7Y8CHkUZI65jRB9zcQH3jhAsOws2XxPbA84XNC5QjuADeGImB4U18EcM8f41n_U4r1-eqZ7ZwLNG-HBlJlL2rCR-tnXuaDKFM8ikM5mSn870EgzjWmxDFieQIqGfoJLtCGuXmV1kup9E4pSG4fQGmeBdG6xgPwIwLfzN2EMqkNG12IfGpa6O4s6HrqM58j8pce8UxzLMEo_vi0_RPYXR2-nyDTsxSOOIgzNj_O8IscRhs07E92RPAbTvdlDxT5z1OyQ2cLuAy5Hx0JTksfiWtcvcjzEuV2HrRlfk2kVcioI-qQhsXbeZsj-hJsNRVMMAkbu9bRf1an55Fc2Vzg9QtuFuxZXaxUXmlTZ7aSnff-RiQ0w
[practica-6]: https://godbolt.org/clientstate/eJzFV21r40YQ_itTfThkYhQn9AqXXFpC8cGVXCgNdxSiUNbS2N6w2nX3xYkJ_u-dXa0USZa50H7oGizt7szszDMvO3pJDBrDlTTJBdy_JLyk59kUEsHkyrEV0jR5ZFuW0JpRThdhhVcbpS34jcxZLrJbdeeK9VxghdLOnwvcWBJ6mcsDyruCSYmatnJZCGYMfGFcwksugcbGLQQvwFhm6bFVvISKttM7q7lc3T8A0yszaaj9sHoHaRQKdLhmJYMrkPgEcTW92xmLVcblpMfpB5cWiMrykpXEJRD1XFrUKo2ippAnuZvNFstfnX_imbTKwKNbsVJpNL9AegYM3k8uiHDqoXs_ueyf8VtNS8q3XFHBZqfR4CGg0uVdKg2pV5ITy-ySHh9fpWQC5cquafXk5MAyP6LhytlsQ_hZIdM8iYeSunBCsunvbDJUOTAHyEGqaqExYnMbJg02Y1xe142Tlj3iUTx_r_drxGZT-EwUK9TZl-s___p2ffN1Pia4tfqeP_ThS2sVp825Q-79ENRRWPJc_oHGCUsiDZQowCotUeXJUN5_80kDf-QgEV3Lxvww0DaN9NkKbfTHhJyYJxe1SzvbEei4H_BR5tAgP05P4ath4DOSL3nBiGcHTgJfnqIwCBumGVTKkBMpzQToBqvsTWE34pP2lRLQFmtIx2sIoNZKH0B5zIefqJaUCII1tSDr2xsPbmMiVhrvzk6wDurJtEkG0swQoNNAX3Gqbiq-s2d672n5tOYCIbXa4Xe1T6PgIUx8CekPjSFrZm7x2d5wSR4djS271uoppMY4lmNu6C_4ajoi2JsoXUXQULw26UohYZAmTWpnstUuI7iqdLSseJOiqJ-vIobw7l0j_uPVGJbdodE6LSP9yAH7gYlteLlqgfqT0hX7bnT5QRlxh7B1KLZIFX6DJQ-RXzKrwHAfYiLcCKVERmUSCkVVHCX6tMEQR7CtrwzBD_LkbUXps1xRojEvUXpRSxZAitI97lgnfcQxpPkuLgUYw9LbciDGeKfOD9Lg34d3ntQSfYn632N8eLEdDd8xRWuujJt5tbG7Izo2IRpoj1e-o26fi0Y7CquNQypof9M_Vd4tK-qYU0d9un_trJq7pmmuNN8yi7Dkkok-DJd9is4t3rYkzW3b45t2Sft92ZqbrMX4AArzejsNru3WX7EXjOd1b7vOMWNQDyV4FXu34SH_q7FjAkIf2tH4mM0-Qprmh4rb7CA4Aiiv7VH_1L4bewoslBLIZO96PmqEP_qny248-Oa9UNWGMlaHRv-BFvAZC0c9Tuz8qbF2PpH8NOky0Dx-F4QPgfOz2bnfFnzRilIh82rOvf9QsCWXfnaey2vJcvkhlzeOm1z-SMrsH-j3D-WwwgI
