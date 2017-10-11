
package inmobiliarias;

public class Inmueble
{
    private String domicilio;
    private double superficie;
    private int cantidadDeAmbientes;
    private int precioEnDolares;
    private Cliente[] interesados;
    private int cantidadDeInteresados;
    private final int CANTIDAD_MAXIMA_DE_INTERESADOS; // Constante
    private boolean reservado;
    private boolean vendido;

    public Inmueble(String d, double s, int ca, int p)
    {
        this.domicilio = d;
        this.superficie = s;
        this.cantidadDeAmbientes = ca;
        this.precioEnDolares = p;
        // this.cantidadDeInteresados por defecto es 0
        // this.reservado y this.vendido por defecto son false;
        this.CANTIDAD_MAXIMA_DE_INTERESADOS = 5;
        this.interesados = new Cliente[this.CANTIDAD_MAXIMA_DE_INTERESADOS];
    }

    public void setPrecioEnDolares(int nuevoPrecio)
    {
        this.precioEnDolares = nuevoPrecio;
        if (this.interesados != null)
        {
            for (int i = 0; i < cantidadDeInteresados; i++)
            {
                this.interesados[i].avisarCambioDePrecio(this, nuevoPrecio);
            }
        }
    }
    
    public void agregarInteresado (Cliente c)
    {
        if (this.cantidadDeInteresados == this.CANTIDAD_MAXIMA_DE_INTERESADOS)
        {
            GUI.mostrarCartel("Este inmueble ya tiene demasiados interesados", "Error", 0);
        }
        else
        {
            this.interesados[this.cantidadDeInteresados] = c;
            this.cantidadDeInteresados++;
        }
    }
    
    public void quitarInteresado (Cliente c)
    {
        int pos = posicionDelInteresado(c);
        if (pos != -1)
        {
            for (int i = pos; i < this.cantidadDeInteresados-1; i++)
            {
                this.interesados[i] = interesados[i+1];
            }
            this.interesados[this.cantidadDeInteresados - 1] = null;
            this.cantidadDeInteresados--;
        }
    }
    
    private int posicionDelInteresado (Cliente c)
    {
        for (int i = 0; i < this.cantidadDeInteresados; i++)
        {
            if (interesados[i] == c)
            {
                return i;
            }
        }
        return -1;
    }
    
    public void reservar()
    {
        this.reservado = true;
        for (int i = 0; i < this.cantidadDeInteresados; i++)
        {
            this.interesados[i].avisarReserva(this);
        }
    }
    
    public void vender()
    {
        this.vendido = true;
        for (int i = 0; i < this.cantidadDeInteresados; i++)
        {
            this.interesados[i].avisarVenta(this);
        }
    }
    
    public void mostrarDatos()
    {
        GUI.mostrarCartel(this, "Datos de la inmobiliaria", 1);
    }

    @Override
    public String toString()
    {
        String cadena = "Domicilio: " + this.domicilio + "\n" +
                        "Superficie: " + this.superficie + "\n" +
                        "Cantidad de ambientes: " + this.cantidadDeAmbientes + "\n" +
                        "Precio: U$S" + this.precioEnDolares + "\n" +
                        "¿Reservado?: " + this.reservado + "\n" +
                        "¿Vendido?: " + this.vendido + "\n" +
                        "Este inmueble tiene " + this.cantidadDeInteresados + " interesados: ";
        
        if (this.cantidadDeInteresados > 0)
        {
            cadena += this.interesados[0].obtenerNombreCompleto();
            for (int i = 1; i < this.cantidadDeInteresados; i++)
            {
                cadena += ", " + this.interesados[i].obtenerNombreCompleto();
            }
        }
        
        return cadena + "\n";
    }
    
    public String getDomicilio()
    {
        return domicilio;
    }

    public double getSuperficie()
    {
        return superficie;
    }

    public int getCantidadDeAmbientes()
    {
        return cantidadDeAmbientes;
    }

    public int getPrecioEnDolares()
    {
        return precioEnDolares;
    }

    public int getCantidadDeInteresados()
    {
        return cantidadDeInteresados;
    }

    public boolean isReservado()
    {
        return reservado;
    }

    public boolean isVendido()
    {
        return vendido;
    }
}
