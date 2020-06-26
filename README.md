# Picas y Famas

En este proyecto se realizó el juego de picas y famas, el cual consiste en adivinar un numero de 4 cifras, el jugador introduce un número de 4 cifras y se le dirá el número de picas y famas que tuvo.
* Pica: Si el número ingresado tiene una cifra que coincida con el número a adivinar, pero está en una posición que no corresponde.
* Famas: Si el número ingresado tiene un cifra que coincida con el número a adivinar y se encuentra eb la posición correcta.

## Getting Started

Para hacer uso del proyecto solo debe clonar el repositorio o descargarlo directamente, para ejectarlo lo hacemos por medio de la consola usando el siguiente comando.

```bash
mvnw spring-boot:run
```

O puede jugar directamente desde la siguiente dirección:

https://powerful-anchorage-32349.herokuapp.com/

### Prerequisites

Para usar el proyecto se necesitan tener las siguientes versiones de java o superior:

```
java version "1.8"
javac version "1.8"
Apache Maven 3.6.3
```

### Installing

Para usar el proyecto decargamos directamente el proyecto o lo clonamos de la siguiente manera:

En la consola nos vamos al directorio donde vamos a clonar el repositorio y ponemos el siguiente comando:

```bash
git clone https://github.com/anfegoca/ARSW-lab5.git

```
![clone](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/1.png)

En el direcctorio nos quedará la carpeta del proyecto y dentro veremos las siguiente carpetas

![direc](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/2.png)

Para modificar abrimos el proyecto con cualquier editor, en este caso usamos NetBeans

![edit](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/3.png)

Y ya podemos modificar cualquier clase del proyecto

![class](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/4.png)

## Running the tests

Para ver el funcionamiento, ejecutamos el programa, veremos lo siguiente

![class](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/5.png)

Abrimos la siguiente pagina y ya podremos usar la aplicación

http://localhost:8080/

![class](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/6.png)

Tambien podemos usar la aplicación usando la siguiente dirección

https://powerful-anchorage-32349.herokuapp.com/

![class](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/7.png)


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring](https://spring.io/projects/spring-boot) - Framework


## Versioning

El versionamiento se realizó a través de [github](https://github.com/anfegoca/ARSW-lab5.git)

## Authors

* **Andrés González** - [anfegoca](https://github.com/anfegoca)


## License

This project is licensed under the MIT License - see the [LICENSE.txt](LICENSE.txt) file for details

## Design

![class](https://github.com/anfegoca/ARSW-lab5/blob/master/resources/8.png)

Para elaborar la aplicación solo se usó la clase **Game** la cual tiene los metodos de **play** y **restart** además de los demás métodos necesarios para recibir las peticiones del navegador.



