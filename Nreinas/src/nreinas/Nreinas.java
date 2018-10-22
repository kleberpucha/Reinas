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
        // TODO code application logic here
      int n=4;
      int a[][]= new int[n][n];
      colocarReinas(a,0);
    }

    private static void colocarReinas(int[][] a, int j) {
        if(j<a.length){
            for(int i = 0; i < a.length; i++){
                if(validarUbicacion(a,i,j)){
                    a[i][j]=1;
                    colocarReinas(a,j+1);
                    a[i][j]=0;
                }
            }
        }
        else
        {
            imprimirMatriz(a);
        }
    }

    private static boolean validarUbicacion(int[][] a, int i, int j) {
        boolean bandera = true;
        for(int k =0;k<a.length && bandera == true;k++){
            if(a[i][k]==1){
                bandera = false;
            }
        }
        for(int m = 0 ; m < a.length && bandera == true; m++){
            for(int n = 0;n <a.length && bandera == true; n++){
                if(m-n == i-j && a[m][n]==1){
                    bandera = false;
                }
                if(m+n == i+j && a[m][n]==1){
                    bandera= false;
                }
            }
        }
        return bandera;
    }
    
    private static void imprimirMatriz(int[][] a) {
        for(int i =0;i < a.length;i++){
            for(int j=0;j<a.length;j++){ 
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
