package modelo;

// esta clase representa un ejercicio normal

public class Ejercicio {

    protected int id;
    protected String nombre;
    protected String tipo;
    protected String descripcion;

    public Ejercicio(int id,String nombre,String tipo,String descripcion){

        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
        this.descripcion=descripcion;

    }

    public String getNombre(){

        return nombre;

    }

    public String getDescripcion(){

        return descripcion;

    }

    public String toString(){

        return nombre;

    }

}