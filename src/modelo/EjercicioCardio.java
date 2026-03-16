package modelo;

// esta clase hereda de ejercicio
// aqui tambien uso polimorfismo sobrescribiendo un metodo

public class EjercicioCardio extends Ejercicio{

    public EjercicioCardio(int id,String nombre,String tipo,String descripcion){

        super(id,nombre,tipo,descripcion);

    }

    @Override
    public String toString(){

        // sobrescribi este metodo para demostrar polimorfismo

        return nombre + " (cardio)";

    }

}