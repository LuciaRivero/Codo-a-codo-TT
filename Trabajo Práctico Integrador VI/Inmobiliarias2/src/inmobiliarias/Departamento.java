
package inmobiliarias;

public class Departamento extends Inmueble
{
    private boolean tieneCochera;
    private boolean tieneBaulera;

    public Departamento(String d, double s, int ca, int p, boolean tc, boolean tb)
    {
        super(d, s, ca, p);
        this.tieneCochera = tc;
        this.tieneBaulera = tb;
    }

    public boolean isTieneCochera()
    {
        return tieneCochera;
    }

    public boolean isTieneBaulera()
    {
        return tieneBaulera;
    }
    
    public void mostrarDatos()
    {
        GUI.mostrarCartel(this, "Datos de la inmobiliaria", 1);
    }
    
    @Override
    public String toString()
    {
        String cadena = super.toString();
        cadena += "¿Tiene cochera? " + this.tieneCochera +
                  "\n¿Tiene baulera? " + this.tieneBaulera;
        return cadena;
    }
}
