
package inmobiliarias;

public class Casa extends Inmueble
{
    private boolean tieneGarage;
    private boolean tieneJardin;
    private boolean tienePileta;

    public Casa(String d, double s, int ca, int p, boolean tg, boolean tj, boolean tp)
    {
        super(d, s, ca, p);
        this.tieneGarage = tg;
        this.tieneJardin = tj;
        this.tienePileta = tp;
    }

    public boolean isTieneGarage()
    {
        return tieneGarage;
    }

    public boolean isTieneJardin()
    {
        return tieneJardin;
    }

    public boolean isTienePileta()
    {
        return tienePileta;
    }
    
    public void mostrarDatos()
    {
        GUI.mostrarCartel(this, "Datos de la inmobiliaria", 1);
    }

    @Override
    public String toString()
    {
        String cadena = super.toString();
        cadena += "¿Tiene garage? " + this.tieneGarage +
                  "\n¿Tiene jardín? " + this.tieneJardin +
                  "\n¿Tiene pileta? " + this.tienePileta;
        return cadena;
    }
}
