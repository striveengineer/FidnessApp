package modelo;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;

// esta clase guarda los ejercicios que el usuario agrega

public class Rutina {

    private String nombre;
    private ArrayList<Ejercicio> ejercicios;

    public Rutina(String nombre){

        this.nombre = nombre;

        // aqui uso colecciones
        ejercicios = new ArrayList<>();

    }

    public void agregarEjercicio(Ejercicio e){

        ejercicios.add(e);

    }

    public ArrayList<Ejercicio> getEjercicios(){

        return ejercicios;

    }

    // exportar rutina a txt
    public void exportarTXT(String ruta){

        try{

            FileWriter fw = new FileWriter(ruta);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Rutina: "+nombre);

            int i=1;

            for(Ejercicio e: ejercicios){

                pw.println(i+" "+e.getNombre());
                pw.println(e.getDescripcion());

                i++;

            }

            pw.close();

        }catch(Exception e){

            // manejo de excepciones
            System.out.println("error guardando archivo");

        }

    }

}