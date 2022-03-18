# Proyecto del Segundo Cuatrimestre Fundamentos de Programación (Curso  \<XX\>/\<YY\>)
Autor/a: \<Carlos Luque>   uvus:\<carluqcar>

Aquí debes añadir la descripción del dataset y un enunciado del dominio del proyecto.

El dataset consiste en un fichero .csv donde encontramos una serie de coches, los cuales tienen una serie de propiedades definidas. Dicho dataset consiste en 10 columnas.
El proyecto en si tiene como objetivo analizar los datos basicos de una serie de coches.

## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.\<Coches\>**: Paquete que contiene los tipos del proyecto.
  * **fp.\<Coches\>.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
    * **\<Cars.csv\>**: Consiste en un fichero .csv donde tenemos varias propiedades de coches que estan en venta.
    * **\<dataset2.csv\>**: Añade una descripción del resto de datasets que puedas tener.
    
## Estructura del *dataset*

Aquí debes describir la estructura del dataset explicando qué representan los datos que contiene y la descripción de cada una de las columnas. Incluye también la URL del dataset original.

El dataset está compuesto por \<10> columnas, con la siguiente descripción:

* **\<marca>**: de tipo \<String>, representa la marca del coche.
* **\<modelo>**: de tipo \<String>, representa modelo del coche.
* **\<precio>**: de tipo \<Integer>, representa cuanto vale el coche.
* **\<kilometraje>**: de tipo \<Double>, representa la distancia recorrida por el coche.
* **\<tipoFuel>**: de tipo \<TipoFuel>, representa el tipo de combustible que utiliza el coche.
* **\<capacidad>**: de tipo \<Double>, representa la cantidad de combustible maxima que puede tener el coche.
* **\<segmento>**: de tipo \<TipoSegmento>, representa el tipo de segmento.
* **\<longitud>**: de tipo \<Double>, representa lo que mide el coche de largo.
* **\<ancho>**: de tipo \<Double>, representa lo que mide el coche de ancho.
* **\<fecha>**: de tipo \<LocalDate>, representa la fecha de venta del coche.

## Tipos implementados

En el proyecto he implementado varios tipos, como TipoFuel que representa que tipo de combustible lleva el coche. TipoMantenimiento que representa si el oche es mediao, barato o caro de mantener y finalmente TipoSegmento que representa el tipo de segmento que tiene el coche

### Tipo Base
El tipo base es de un record y contiene varios parametros que describen al objeto en cuestion, tiene tambien varios metodos como equals, hashcode, compareTo y toString.
**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: En este constructor esta creado para las restricciones, no he añadido nada mas ya que el tipo base es un record y no necesita constructores.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Esta restriccion no permite que el kilometraje sea menor que cero.
- R2: Esta restriccion evita que el precio obtenga un valor cero o menor que cero.
- ...
- 
**Criterio de igualdad**: En el criterio de igual es usado el metodo equals

**Criterio de ordenación**: Aqui he utilizado el metodo compareTo del tipo comparable.

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...

#### Tipos auxiliares
Descripción de los tipos auxiliares que sean necesarios añadir al proyecto.

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.

### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
