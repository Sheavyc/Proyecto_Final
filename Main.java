
/*
    1. Crear la clase Tareas. Esta clase servira como plantilla para almacenar los atributos tales como: 
    *Nombre de tarea
    *Tipo de tarea

    2. Crear la clase Main, la cual nos permite crear la logica de la interfaz, utilizando un trycatch para validacion, dowhile y switch para la generacion de la interfaz junto con joptionpane
    
    3.Crear la clase Nodo. Esta nos servira para que a partir de ella podamos crear la clase Lista. 

    4. Crear la clase Lista, esta nos servira para almacenar las diferentes tareas, crear los metodos correspondientes que nos permitan mostrar las tareas pendientes, marcar tareas como completadas y la eliminacion de estas.

     





 */

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        //se simplifica el nombre a lista para no utilizar uno tan largo 
          Estructuras_de_Datos lista = new Estructuras_de_Datos();
        int Opcion = 0;
        
      
        
        do {
            try {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a su sistema administrador de tareas, seleccione un valor para continuar \n"
                    + "1 - Agregar nueva tarea\n"
                    + "2 - Mostrar tareas pendientes \n"
                    + "3 - Marcar tarea como completada \n"
                    + "4 - Eliminar tarea \n"
                    + "5 - Ver la última tarea agregada \n"
                    + "6 - Salir"));
                switch (Opcion) {
                    case 1:
                        Tarea tarea_insertada = new Tarea();
                        tarea_insertada.setNombre(JOptionPane.showInputDialog(null, "Ingrese nombre de la tarea:"));
                        tarea_insertada.setTipo_Tarea(JOptionPane.showInputDialog(null, "Ingrese el tipo de tarea:"));
                        tarea_insertada.setEstado((JOptionPane.showInputDialog(null, "Ingrese el estado de la tarea:")));
                        tarea_insertada.setFecha((JOptionPane.showInputDialog(null, "Ingrese la fecha de la tarea:")));

                        

                        lista.Agregar(tarea_insertada);
                        JOptionPane.showMessageDialog(null, "Tarea Agregada");
                        break;
                    case 2:
                        lista.MostrarTarea();
                        break;
                     case 3:
                        int posicion_completada = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la posición de la tarea que quiere marcar como completada?"));
                        lista.Marcar_Tareas_Completadas(posicion_completada);
                        break;
                    case 4:
                    int posicion_eliminar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la posición de la tarea que quiere eliminar?"));
                        lista.Eliminar_Tarea(posicion_eliminar);
                        break;
                    case 5: 
                   //por implementar
                    break;    
                    case 6: 
                    if (JOptionPane.showConfirmDialog(null, "Seguro que desea salir?")!=0) {
                        Opcion = 0;
                    }else{
                        JOptionPane.showMessageDialog(null, "Cerrando sesión en el programa de tareas...");
                        JOptionPane.showMessageDialog(null, "Nos vemos pronto!");
                    }
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione un valor del 1 al 6");
                }
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }

        } while (Opcion != 6);
        
    }
}
