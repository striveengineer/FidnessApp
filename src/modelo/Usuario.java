package modelo;

// esta clase hereda de persona
// lo hice asi para demostrar herencia como pide el proyecto

public class Usuario extends Persona {

    private String username;
    private String clave;

    public Usuario(int id, String nombre, String username, String clave){

        super(id,nombre);

        this.username = username;
        this.clave = clave;

    }

    // metodo para revisar login
    public boolean validarLogin(String user,String pass){

        if(username.equals(user) && clave.equals(pass)){
            return true;
        }

        return false;

    }

}