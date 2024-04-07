

public class Nodo {
      //Se crea el objeto de tipo tarea, el cual es el Dato en nuestro nodo
      Tarea Tarea;
      //Se crea el nodo Siguiente
      Nodo Siguiente;
      Nodo Cola;
      //Se crea el constructor de Nodo
      //El nodo siguiente queda como null debido a que no tenemos un nodo siguiente hasta el momento. Conforme se vayan creando nodos se actualiza el nodo siguiente para que apunte al nuevo nodo
      public Nodo(Tarea tarea /*Nodo siguiente */){
          this.Tarea=tarea;
          this.Siguiente=null;
          this.Cola=null;
          //this.siguiente=siguiente;
      }

    
}
