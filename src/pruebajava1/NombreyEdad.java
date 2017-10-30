/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava1;
import javax.swing.JOptionPane;
/**************************************************************************
 * Alex Olivares Del Valle 
 * @author LAB17
 * Fecha: Octubre 30 del 2017
 * Programa: Prueba Java 1
 * Responsabilidad: Calcular el area de un rectangulo
 */
public class NombreyEdad 
{
    
    public static void main(String[] args)
    {
        String Nombre;
        int Edad;
       
        Nombre = (JOptionPane.showInputDialog("Ingrese su Nombre"));
        Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
        
        JOptionPane.showMessageDialog(null, "Bienvenido "+(Nombre));
        JOptionPane.showMessageDialog(null, "En 20 años usted tendra "+(Edad+20));
        
    }
}
