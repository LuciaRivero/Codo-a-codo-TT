/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmobiliarias;

import javax.swing.JOptionPane;

/**
 *
 * @author Charly
 */
public class GUI
{

    /**
     * Muestra una ventana de información al usuario.
     *
     * @param mensaje Mensaje que se desea mostrar.
     */
    public static void mostrarCartel(Object mensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Muestra una ventana al usuario.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo Título de la ventana.
     * @param tipoDeMensaje Tipo de mensaje.
     * <ul>
     * <li>0: Error.</li>
     * <li>1: Información.</li>
     * <li>2: Advertencia.</li>
     * <li>3: Pregunta.</li>
     * <li>-1: Sin ícono.</li>
     * </ul>
     */
    public static void mostrarCartel(Object mensaje, String titulo, int tipoDeMensaje)
    {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoDeMensaje);
    }
    
    /**
     * Muestra una ventana que permite una elección al usuario a través de botones.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo Título de la ventana.
     * @param tipoDeOpcion Tipo de elección.
     * <ul>
     *      <li>0: SI o NO</li>
     *      <li>1: SI, NO o CANCELAR</li>
     *      <li>2: ACEPTAR o CANCELAR</li>
     * </ul>
     * @return Opción elegida por el usuario.
     * <ul>
     *      <li>0: Si se eligió "SI" o "ACEPTAR".</li>
     *      <li>1: Si se eligió "NO".</li>
     *      <li>2: Si se eligió "CANCELAR".</li>
     *      <li>-1: Si se cerró la ventana.</li>
     * </ul>
     */
    public static int mostrarCuadroDeConfirmacion(String mensaje, String titulo, int tipoDeOpcion)
    {
        return JOptionPane.showConfirmDialog(null, mensaje, titulo, tipoDeOpcion);
    }
    
    /**
     * Muestra una ventana que permite una elección al usuario a través de una lista.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo Título de la ventana.
     * @param valores Arreglo de cadenas, donde cada una de ellas representa un ítem de la lista.
     * @return Ítem de la lista elegido por el usuario en formato String. Si se cierra la ventana o se presiona "CANCELAR", devuelve null.
     */
    public static String mostrarCuadroDeLista(String mensaje, String titulo, String[] valores)
    {
        return (String) JOptionPane.showInputDialog(null, mensaje, titulo, 3, null, valores, valores[0]);
    }
    
    /**
     * Muestra una ventana que permite una elección al usuario a través de botones personalizados.
     * 
     * @param mensaje Mensaje que se desea mostrar.
     * @param titulo Título de la ventana.
     * @param valores Arreglo de cadenas, donde cada una de ellas representa un botón a visualizar.
     * @return Posición del botón elegido en formato int (comenzando desde 0). Si se cierra la ventana, devuelve null.
     */
    public static int mostrarCuadroDeBotones(String mensaje, String titulo, String[] valores)
    {
        return JOptionPane.showOptionDialog(null, mensaje, titulo, 0, 3, null, valores, valores[0]);
    }
    
    /**
     * Muestra una ventana al usuario que permite introducir un número entero.
     *
     * @param mensaje Mensaje que se desea mostrar.
     * @return Dato introducido por el usuario en formato int.
     * @exception NumberFormatException Si el dato no representa un número entero.
     */
    public static int ingresarEntero(String mensaje)
    {
        try
        {
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }
        catch (NumberFormatException nfe)
        {
            mostrarCartel("El dato ingresado no representa un número entero. Volvé a intentar...");
            return ingresarEntero(mensaje);
        }
    }
    
    /**
     * Muestra una ventana al usuario que permite introducir un número real.
     *
     * @param mensaje Mensaje que se desea mostrar.
     * @return Dato introducido por el usuario en formato double.
     * @exception NumberFormatException Si el dato no representa un número.
     */
    public static double ingresarReal(String mensaje)
    {
        try
        {
            return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        }
        catch (NumberFormatException nfe)
        {
            mostrarCartel("El dato ingresado no representa un número. Volvé a intentar...");
            return ingresarReal(mensaje);
        }
    }
    
    /**
     * Muestra una ventana al usuario que permite introducir una cadena.
     *
     * @param mensaje Mensaje que se desea mostrar.
     * @return Dato introducido por el usuario en formato String.
     */
    public static String ingresarCadena(String mensaje)
    {
        return JOptionPane.showInputDialog(mensaje);
    }
}
