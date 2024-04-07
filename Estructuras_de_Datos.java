

import javax.swing.JOptionPane;

public class Estructuras_de_Datos {
    Nodo Cabeza;
    Nodo Cola;

    public Estructuras_de_Datos() {
        this.Cabeza = null;
        this.Cola = null;
    }

    public void Mostrar_Tareas_Pendientes() {
    };
    
    //s Se crea el metodo agregar que tiene como parametro un objeto tarea de tipo
    // Tarea, este conteniendo los atributos de la clase Tarea
    // se crea el objeto nodoNuevo de tipo Nodo, el cual tiene como parametro el
    // objeto tarea, que es insertada por el usuario
    public void Agregar(Tarea tarea) {
        //se implementa una combinacion de listas simples y colas utilizando nodos. Se combinan lo mejor de los dos mundos en mi opinion
        Nodo nodoNuevo = new Nodo(tarea);
        if (isEmpty()) {
            Cabeza = nodoNuevo;
            Cola = nodoNuevo;
        } else {
            Cola.Siguiente = nodoNuevo;
            Cola = nodoNuevo;

        }
    };
//se verifica si la cola esta vacia
    public boolean isEmpty()
    {
        return Cabeza == null;
    }

    //por revisar e implementar
    public void peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La lista de tareas está vacía");
        }
       System.out.println(Cabeza.Tarea);
    }

    public void MostrarTarea() {
        Nodo Actual = Cabeza;
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron tareas que mostrar. Intente nuevamente");
        } else {
            JOptionPane.showMessageDialog(null, "Tareas encontradas: ");
            while (Actual != null) {
                JOptionPane.showMessageDialog(null, "Nombre de la tarea: " + Actual.Tarea.getNombre() + " ");
                JOptionPane.showMessageDialog(null, "Tipo de tarea: " + Actual.Tarea.getTipo_Tarea() + " ");
                JOptionPane.showMessageDialog(null, "Estado de tarea: " + Actual.Tarea.getEstado() + " ");
                JOptionPane.showMessageDialog(null, "Fecha de tarea: " + Actual.Tarea.getFecha() + " ");
                Actual = Actual.Siguiente;
            }
        }
    }

    public void Marcar_Tareas_Completadas(int posicion) {
        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "Error: La posición debe ser no negativa.");
            return;
        }

        Nodo actual = Cabeza;
        int indice = 0;

        while (actual != null && indice < posicion) {
            actual = actual.Siguiente;
            indice++;
        }
        if (actual == null) {
            JOptionPane.showMessageDialog(null, "Error: La posición está más allá del final de la lista.");

        } else {
            Tarea tarea = new Tarea();
            
            int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Puede marcar la tarea como completada y eliminarla de la lista o solamente cambiar el status para volver a acceder a ella. Elija 1 si desea marcar como completa y eliminar o 2 si solo desea marcar como completa"));
            if (opc == 1) {
                if (JOptionPane.showConfirmDialog(null, "¿Está seguro que desea marcar la tarea como completada y eliminarla? No podrá acceder a ella nuevamente") != 0) {
                  return;
                }else{Eliminar_Tarea(posicion);} 
                }else if (opc == 2) {
                tarea.setNombre(JOptionPane.showInputDialog(null, "Ingrese nombre de la tarea nuevamente:"));
                tarea.setTipo_Tarea(JOptionPane.showInputDialog(null, "Ingrese el tipo de tarea nuevamente:"));
                tarea.setTipo_Tarea(JOptionPane.showInputDialog(null, "Ingrese la fecha de la tarea nuevamente:"));

                tarea.setEstado("Completada.");
                JOptionPane.showMessageDialog(null,"Tarea en la posición " + posicion + " marcada como completa correctamente.");
                actual.Tarea = tarea;
            } else {
                JOptionPane.showMessageDialog(null, "Error: Numero no valido.");
            } ;
           

        }
      
       
       
    };

    public void Eliminar_Tarea(int posicion) {
        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "Error: La posición debe ser no negativa.");
            return;
        }

        if (posicion == 0) {
            Cabeza = Cabeza.Siguiente; // Elimina el primer nodo (cabeza).
            JOptionPane.showMessageDialog(null, "Tarea en la posición " + posicion + " eliminada correctamente.");

            return;
        }

        Nodo actual = Cabeza;
        int indice = 0;

        while (actual != null && indice < posicion - 1) {
            actual = actual.Siguiente;
            indice++;
        }

        if (actual == null || actual.Siguiente == null) {
            JOptionPane.showMessageDialog(null, "Error: La posición está más allá del final de la lista.");
            return;
        }

        actual.Siguiente = actual.Siguiente.Siguiente; // Elimina el nodo en la posición especificada.
        JOptionPane.showMessageDialog(null, "Tarea en la posición " + posicion + " eliminada correctamente.");

    };

}
