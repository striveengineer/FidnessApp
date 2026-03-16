package cliente;

import javax.swing.*;

// menu principal despues del login

public class MenuGUI extends JFrame{

    public MenuGUI(ClienteRutinas cliente){

        setTitle("Menu");
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // boton ver ejercicios
        JButton ejercicios = new JButton("Ver ejercicios");
        ejercicios.setBounds(60,40,180,40);
        add(ejercicios);

        // boton crear rutina
        JButton rutina = new JButton("Crear rutina");
        rutina.setBounds(60,100,180,40);
        add(rutina);

        // boton cerrar sesion
        JButton salir = new JButton("Cerrar sesion");
        salir.setBounds(60,160,180,40);
        add(salir);


        // aqui agrego que hace cada boton

        // abre ventana ejercicios
        ejercicios.addActionListener(e -> {

            new EjerciciosGUI(cliente);

        });


        // abre ventana crear rutina
        rutina.addActionListener(e -> {

            new RutinaGUI();

        });


        // cerrar programa
        salir.addActionListener(e -> {

            System.exit(0);

        });

    }

}