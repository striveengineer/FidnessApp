package servidor;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// esta clase maneja cada cliente conectado
// por eso extiende Thread

public class HiloCliente extends Thread{

    private Socket socket;

    public HiloCliente(Socket socket){

        this.socket = socket;

    }

    @Override
    public void run(){

        try{

            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter salida = new PrintWriter(
                    socket.getOutputStream(), true);

            String mensaje;

            // leo mensajes del cliente
            while((mensaje = entrada.readLine()) != null){

                System.out.println("mensaje recibido: " + mensaje);

                if(mensaje.equals("LOGIN")){

                    salida.println("LOGIN_OK");

                }

                if(mensaje.equals("LISTA")){

                    salida.println("Sentadilla");
                    salida.println("Peso muerto");
                    salida.println("Curl biceps");
                    salida.println("FIN");

                }

            }

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}