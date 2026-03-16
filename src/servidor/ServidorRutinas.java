package servidor;

import java.net.ServerSocket;
import java.net.Socket;

// esta clase inicia el servidor
// el servidor escucha conexiones de clientes

public class ServidorRutinas {

    public static void main(String[] args){

        int puerto = 5000;

        try{

            // creo el servidor
            ServerSocket servidor = new ServerSocket(puerto);

            System.out.println("Servidor iniciado en puerto " + puerto);

            // ciclo infinito esperando clientes
            while(true){

                // accept espera que un cliente se conecte
                Socket cliente = servidor.accept();

                System.out.println("Cliente conectado");

                // creo un hilo para atender ese cliente
                HiloCliente hilo = new HiloCliente(cliente);

                hilo.start();

            }

        }catch(Exception e){

            e.printStackTrace();

        }

    }

}
