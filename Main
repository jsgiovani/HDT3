
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          InserccionLista lista = new InserccionLista();  
          int num = 0;
           
        Scanner archivo = null;
	try {
            archivo = new Scanner(new File("C:\\Users\\User\\Desktop\\Estrucura de Datos\\Mio\\10.LeerTxt_GuardarloEnarreglo\\src\\numeros.txt"));
	} catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Archivo no encontrado");
	}
	
        while(archivo.hasNext()){
            num = archivo.nextInt();
            lista.insertarNodo(num);    //Guardaos el numero en la lista y lo ubica en orde de mayor a menor
            //System.out.println(num);            
        }
        
        //Imprimimos la lista ordenada 
        lista.imprimirLista();
        
             
                
	
                
    } 
}
    

