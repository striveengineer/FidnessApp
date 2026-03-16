package cliente;

import javax.swing.*;
import modelo.*;

// esta pantalla crea rutina simple
// para demostrar otra historia de usuario

public class RutinaGUI extends JFrame{

    private JTextField txtNombre;

    public RutinaGUI(){

        setTitle("Crear rutina");
        setSize(300,200);
        setLayout(null);
        setVisible(true);

        JLabel l1 = new JLabel("Nombre rutina");
        l1.setBounds(20,20,120,25);

        add(l1);

        txtNombre = new JTextField();
        txtNombre.setBounds(130,20,120,25);

        add(txtNombre);

        JButton guardar = new JButton("Guardar");
        guardar.setBounds(90,80,100,30);

        add(guardar);

        guardar.addActionListener(e->guardar());

    }

    private void guardar(){

        String nombre = txtNombre.getText();

        Rutina r = new Rutina(nombre);

        // solo ejemplo para el avance
        r.agregarEjercicio(new Ejercicio(1,"Sentadilla","pierna","espalda recta"));

        r.exportarTXT("rutina.txt");

        JOptionPane.showMessageDialog(this,"rutina guardada");

    }

}