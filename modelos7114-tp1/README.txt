modelos7114-tp1
===============

TP 1 de Modelos y Optimizaci�n I

Requerimiento:
Dada una lista de pa�ses y sus lim�trofes, crear un algoritmo que coloque antenas cubriendo en alcance todos los pa�ses. Cada antena cubre el pa�s donde se coloca y todos sus lim�trofes. Deben utilizarse la menor cantidad de antenas posibles.

Estructuras a utilizar:
- Nodo Pais
    * flag 'cobertura': indica si el pais tiene cobertura
    * int limSinCobertura: indica la cantidad de paises lim�trofes que no tienen cobertura
    * lista Pais limitrofes: lista de Paises que son lim�trofes

Algoritmo:
- Leo cada entrada, y voy cargando los nodos. Para cada pa�s, voy agregando sus lim�trofes e incrementando el contador de los lim�trofes sin cobertura, hasta cargar el grafo entero.
- Inicio el ciclo de b�squeda de la soluci�n: comienzo eligiendo el pa�s con mayor limSinCobertura.
- Para cada uno de los paises lim�trofes de su lista, hago:
  + marco el flag 'cobertura'.
  + para cada uno de los pa�ses lim�trofes, disminuyo en 1 el contador limSinCobertura.
  + disminuyo en 1 el contador limSinCobertura.
- Pongo en cero el contador limSinCobertura.
- Sigo con el siguiente pa�s que tenga el valor mayor de limSinCobertura.