/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nreinas;

import java.io.IOException;

/**
 *
 * @author KLEBER PUCHA
 */
public class Nreinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      //declaramos un valor entero el que reperentara en numero de reinas
      //A mas de eso servira como la dimencion del tablero
      int n=4;
      //declaramos una variable a de tico matriz char ya que nos permitira
      //colocar caracteres especiales para reprentar a la reina
      int a[][]= new int[n][n];
      //iniciamos el metodo colocarReinas que se encuentra en la clase ColocarReinas
      //para esto enviamos la matriz a que contiene las dimenciones del tablero
      //y un 0 que reperenta la ubicacion de inicio del tablero 
      ColocarReinas cr = new ColocarReinas();
      //llamamos al metodo colocarRreinas
      cr.colocarReinas(a, 0);
    }   
}
