
package inmobiliarias;

public class Main
{
    public static void main(String[] args)
    {
        // TRES NUEVOS CLIENTES
        Cliente bob = new Cliente("Bob","Patiño","1134589634","bobpat@supermail.com");
        Cliente hank = new Cliente("Hank","Scorpio","1146851035","hanko19@deliverer.com");
        Cliente edna = new Cliente("Edna","Krabappel","1129487613","edna.krabappel@primariaspringfield.edu");
        
        // CINCO NUEVOS INMUEBLES
        Inmueble gaona = new Inmueble("Av. Gaona 1215 3º F", 42.87, 2, 65000);
        Inmueble espinosa = new Inmueble("Espinosa 684", 72.15, 4, 170000);
        Inmueble acoyte = new Inmueble("Av. Acoyte 522 7º", 69.39, 4, 135000);
        Inmueble franklin = new Inmueble("Franklin 716", 55.12, 3, 120000);
        Inmueble hidalgo = new Inmueble("Hildalgo 1463 14º B", 35.36, 1, 90000);
        
        // DOS NUEVAS INMOBILIARIAS
        Inmobiliaria casitaFeliz = new Inmobiliaria("Casita Feliz");
        Inmobiliaria sweetHome = new Inmobiliaria("Sweet Home");
        
        // AGREGAMOS LOS INMUEBLES EN LAS INMOBILIARIAS
        casitaFeliz.agregarInmueble(gaona);
        casitaFeliz.agregarInmueble(espinosa);
        sweetHome.agregarInmueble(acoyte);
        sweetHome.agregarInmueble(franklin);
        sweetHome.agregarInmueble(hidalgo);
        
        // CARGAMOS ALGUNOS INTERESADOS
        gaona.agregarInteresado(bob);
        gaona.agregarInteresado(edna);
        espinosa.agregarInteresado(hank);
        espinosa.agregarInteresado(edna);
        hidalgo.agregarInteresado(edna);
        
        // IMPRIMIMOS ALGUNOS DATOS
        sweetHome.mostrarDatos();
        espinosa.mostrarDatos();
        gaona.mostrarDatos();
        
        // ALGUNOS MOVIMIENTOS
        gaona.setPrecioEnDolares(62000);
        gaona.reservar();
        gaona.vender();
        espinosa.quitarInteresado(edna);
        
        // IMPRIMIMOS ALGUNOS DATOS
        sweetHome.mostrarDatos();
        espinosa.mostrarDatos();
        gaona.mostrarDatos();
    }
}
