
package inmobiliarias;

public class Inmobiliaria
{
    private String nombre;
    private int cantidadDeInmuebles;
    private final int CANTIDAD_MAXIMA_DE_INMUEBLES; // Constante
    private Inmueble[] inmuebles;

    public Inmobiliaria(String n)
    {
        this.nombre = n;
        this.CANTIDAD_MAXIMA_DE_INMUEBLES = 20;
        this.inmuebles = new Inmueble[this.CANTIDAD_MAXIMA_DE_INMUEBLES];
        // this.cantidadDeInmuebles por defecto es 0
    }
    
    public void agregarInmueble (Inmueble x)
    {
        if (this.cantidadDeInmuebles == this.CANTIDAD_MAXIMA_DE_INMUEBLES)
        {
            GUI.mostrarCartel("Esta inmobiliaria ya tiene demasiados inmuebles", "Error", 0);
        }
        else
        {
            this.inmuebles[this.cantidadDeInmuebles] = x;
            this.cantidadDeInmuebles++;
        }
    }
    
    public void quitarInmueble (Inmueble x)
    {
        int pos = posicionDelInmueble(x);
        if (pos != -1)
        {
            for (int i = pos; i < this.cantidadDeInmuebles-1; i++)
            {
                this.inmuebles[i] = inmuebles[i+1];
            }
            this.inmuebles[this.cantidadDeInmuebles - 1] = null;
            this.cantidadDeInmuebles--;
        }
    }
    
    private int posicionDelInmueble (Inmueble x)
    {
        for (int i = 0; i < this.cantidadDeInmuebles; i++)
        {
            if (inmuebles[i] == x)
            {
                return i;
            }
        }
        return -1;
    }

    public void mostrarDatos()
    {
        GUI.mostrarCartel(this, "Datos de la inmobiliaria", 1);
    }

    @Override
    public String toString()
    {
        String cadena = "Inmobiliaria \"" + this.nombre + "\"\n\n";
        cadena += "Inmuebles:\n\n";
        for (int i = 0; i < this.cantidadDeInmuebles; i++)
        {
            cadena += this.inmuebles[i] + "\n\n";
        }
        
        return cadena;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getCantidadDeInmuebles()
    {
        return cantidadDeInmuebles;
    }
    
    
}
