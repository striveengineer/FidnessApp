package cliente;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// esta clase es la que conecta con el servidor

public class ClienteRutinas {

    private Socket socket;
    private BufferedReader entrada;
    private PrintWriter salida;

    // conecta al servidor
    public void conectar(String host, int puerto){

        try{

            socket = new Socket(host, puerto);

            entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            salida = new PrintWriter(
                    socket.getOutputStream(), true);

        }catch(Exception e){

            e.printStackTrace();

        }

    }

    // envia mensaje al servidor
    public String enviar(String mensaje){

        try{

            salida.println(mensaje);

            return entrada.readLine();

        }catch(Exception e){

            e.printStackTrace();

        }

        return null;

    }

}
