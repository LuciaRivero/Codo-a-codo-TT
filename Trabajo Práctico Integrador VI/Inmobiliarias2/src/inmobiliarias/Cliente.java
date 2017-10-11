
package inmobiliarias;

public class Cliente
{
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;

    public Cliente(String n, String a, String t, String m)
    {
        this.nombre = n;
        this.apellido = a;
        this.telefono = t;
        this.mail = m;
    }
    
    public void avisarCambioDePrecio (Inmueble x, int nuevoPrecio)
    {
        String mensaje = "\n\nEstimado/a " + obtenerNombreCompleto() + ":\n" +
                         "El inmueble sito en " + x.getDomicilio() + 
                         ", por el cual ha mostrado interés, ha cambiado de precio.\n" +
                         "El nuevo precio es de U$S " + nuevoPrecio + ".";
        enviarMail("Se ha actualizado el precio de un inmueble", mensaje);
    }
    
    public void avisarReserva (Inmueble x)
    {
        String mensaje = "\n\nEstimado/a " + obtenerNombreCompleto() + ":\n" +
                         "El inmueble sito en " + x.getDomicilio() + 
                         ", por el cual ha mostrado interés, ha sido reservado.\n";
        enviarMail("Se ha reservado un inmueble", mensaje);
    }
    
    public void avisarVenta (Inmueble x)
    {
        String mensaje = "\n\nEstimado/a " + obtenerNombreCompleto() + ":\n" +
                         "El inmueble sito en " + x.getDomicilio() + 
                         ", por el cual ha mostrado interés, ha sido vendido.\n";
        enviarMail("Se ha vendido un inmueble", mensaje);
    }
    
    private void enviarMail(String asunto, String cuerpo)
    {
        String mensaje = "SE ENVIA EL SIGUIENTE MAIL\n\n" +
        "Para: " + this.mail + "\n" +
        "Asunto: " + asunto + "\n" +
        "Mensaje: " + cuerpo + "\n";
        
        GUI.mostrarCartel(mensaje, "Enviando mail...", 1);
    }
    
    public String obtenerNombreCompleto()
    {
        return this.nombre + " " + this.apellido;
    }
    
    @Override
    public String toString()
    {
        String cadena = "Nombre: " + this.nombre +
                        "\nApellido: " + this.apellido +
                        "\nTeléfono: " + this.telefono +
                        "\nMail: " + this.telefono;
        
        return cadena;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public String getMail()
    {
        return mail;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }
}
