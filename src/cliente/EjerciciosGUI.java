package cliente;

import javax.swing.*;
import modelo.*;
import java.util.ArrayList;

// esta pantalla muestra ejercicios
// no es super compleja pero sirve para el avance

public class EjerciciosGUI extends JFrame{

    private JList lista;

    public EjerciciosGUI(ClienteRutinas cliente){

        setTitle("Ejercicios");
        setSize(300,400);
        setLayout(null);
        setVisible(true);

        DefaultListModel modeloLista = new DefaultListModel();

        // creo algunos ejercicios de ejemplo

        modeloLista.addElement(new Ejercicio(1,"Sentadilla","pierna","espalda recta"));
        modeloLista.addElement(new Ejercicio(2,"Curl biceps","brazo","subir mancuernas"));
        modeloLista.addElement(new EjercicioCardio(3,"Correr","cardio","30 minutos"));

        lista = new JList(modeloLista);

        JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(30,30,200,200);

        add(scroll);

    }

}