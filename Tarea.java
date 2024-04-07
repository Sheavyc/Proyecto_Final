

public class Tarea {
    private String Nombre;
    private String Tipo_Tarea;
    private String Estado;
    private String Fecha;
    //No se crean constructores porque no vamos a construir objetos a partir de esta clase, sino de la clase nodo
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getTipo_Tarea() {
        return Tipo_Tarea;
    }
    public void setTipo_Tarea(String tipo_Tarea) {
        Tipo_Tarea = tipo_Tarea;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getFecha() {
        return Fecha;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
        
    }
    
   

    
}
