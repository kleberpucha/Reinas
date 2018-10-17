/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nreinas;

/**
 *
 * @author KLEBER PUCHA
 */
public class CrearTablero {
    void dibujarTablero(int x , int y, int r){
        //declaracion de variables a utilizar
       // int ix = 0, iy = 0, fx = 0, fy = 0;
       int bandera = 0;
        //la matriz sera de tipo char
        char matriz[][] = new char[x][y];
        //for que en este momento se creara con puntos completamente que son espacios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                   if(bandera == 0){ 
                   matriz[i][j] = '■';
                   bandera=1;
                   }
                   if(bandera == 1){ 
                   matriz[i][j] = ' ';
                   bandera=0;
                   }
            }
        }
                //realizamos los for para mostrar en pantalla la matriz creada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
