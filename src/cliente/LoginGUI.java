package cliente;

import javax.swing.*;

// pantalla simple de login

public class LoginGUI extends JFrame{

    private JTextField txtUsuario;
    private JPasswordField txtClave;
    private JButton btnLogin;

    private ClienteRutinas cliente;

    public LoginGUI(){

        setTitle("Login");
        setSize(300,200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cliente = new ClienteRutinas();
        cliente.conectar("localhost",5000);

        JLabel l1 = new JLabel("Usuario");
        l1.setBounds(20,20,80,25);
        add(l1);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(100,20,150,25);
        add(txtUsuario);

        JLabel l2 = new JLabel("Clave");
        l2.setBounds(20,60,80,25);
        add(l2);

        txtClave = new JPasswordField();
        txtClave.setBounds(100,60,150,25);
        add(txtClave);

        btnLogin = new JButton("Ingresar");
        btnLogin.setBounds(100,100,100,30);
        add(btnLogin);

        btnLogin.addActionListener(e -> login());

        setVisible(true);

    }

    private void login(){

        String respuesta = cliente.enviar("LOGIN");

        if(respuesta.equals("LOGIN_OK")){

            new MenuGUI(cliente);

            dispose();

        }else{

            JOptionPane.showMessageDialog(this,"login incorrecto");

        }

    }
public static void main(String[] args) {

    // aqui arranca la interfaz del login
    new LoginGUI();

}
}