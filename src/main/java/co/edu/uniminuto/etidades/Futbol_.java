
package co.edu.uniminuto.etidades;


public class Futbol_ {
    private int id;
    private String nombre;
    private short edad;
    private short estatus;

    public Futbol_(String nombre, short edad, short estatus) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.estatus = estatus;
    }

    public Futbol_() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public short getEstatus() {
        return estatus;
    }

    public void setEstatus(short estatus) {
        this.estatus = estatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Futbol_{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append(", estatus=").append(estatus);
        sb.append('}');
        return sb.toString();
    }
    
    
   

}
