/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nreinas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author KLEBER PUCHA
 */
public class ColocarReinas {
        int cont=0;
        int solucion=0;
        //Declaramos la variable para crear el archivo de log
        String dir="C://Users//KLEBER PUCHA//Desktop//";
        FileWriter archivo;
        //creamos un metodo public colocarReinas el mismo que nos permitira ir 
        //de alguna manera monitoreando la ubicacion de las reinas que se colocan
        public void colocarReinas(int[][] a, int j) throws IOException {  
        
        this.dir = dir;
        if(new File(dir+"//"+"log.txt").exists()==false){
            archivo=new FileWriter(new File(dir+"//"+"log.txt"),false);
            archivo.close();
        }
        archivo=new FileWriter(new File(dir+"//"+"logReinas.txt"),true);
        //verificacmos si j que inicia con 0 es menor a la dimencion de la matriz
        //con esto logramos iniciar
        if(j<a.length){
            
            for(int i = 0; i < a.length; i++){
                //verificamos que si la ubicacion es valida
                if(validarUbicacion(a,i,j)){
                    cont++;
                    //si es true quiere decir q no reinas q se cruecen para la 
                    //la ubicacion actual y por ende colocamos una Reina
                    a[i][j]=1;
                    //escribimos la ubicacion de la reina en nuestro log
                      archivo.write(cont+" - "+i+","+j+"\r\n");
                      archivo.close();
                    //continuamos con la nueva matriz colocada la Reina
                    //de forma de recursividad enviamos la nueva matriz y la j 
                    //le sumamos una ubicacion nueva
                    colocarReinas(a,j+1); 
                    a[i][j]=0;
                    cont=0;
                }
            }
        }
        else
        {
            //llamamos al metodo imprimir que contiene la matriz modificada
            solucion++;
            System.out.println("SOLUCION "+solucion);
            System.out.println("FELIZ CUMPLE CARO");
            imprimirMatriz(a);
        }
    }
    //metodo booleano  que rrecorre la matriz para verificar si no exitiste
    //cruces entre reinas
    private static boolean validarUbicacion(int[][] a, int i, int j) {
        boolean bandera = true;
        for(int k =0;k<a.length && bandera == true;k++){
            if(a[i][k]==1){
                bandera = false;
            }
        }
        //nos ayuda a ver si no existen reinas en diagonal
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
            for (int[] a1 : a) {
                for (int j = 0; j<a.length; j++) {
                    System.out.print(a1[j] + " ");
                }
                System.out.println("");
            }
    }
}
