
package trabajo_Herencia_proyecto;

public class Logging {
    public String logging_usuario(String usuario, String password)
    {
        // auxi
        String mensaje;
        if (usuario.equals("Robert")&& password.equals("1111"))
            mensaje = "Bienvenido Robert, genio.";
        else if ((usuario.equals("Juan")&& password.equals("1112")))
                mensaje = "Bienvenido Juan, capi10.";
        else if ((usuario.equals("Jesus")&& password.equals("1113")))
                mensaje = "Bienvenido Jesús, The gsus.";
        
        else 
            mensaje = "Usuario no encontrado en la lista de Admins";
        
        return mensaje;
                         
    }
}
