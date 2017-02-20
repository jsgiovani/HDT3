
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Contiene los metodos de los algoritmos de ordedamienot
public class AlgoritmoOrdenamiento {
    static BurbujaLista listaB;
    //
    
    
    //Ordeda los datos de la lista por el metodo de Insercción
    public void ordenamientoInserccion(String direccionTxt ){
          InserccionLista lista = new InserccionLista();  
          int num = 0;
           
        Scanner archivo = null;
	try {
            archivo = new Scanner(new File(direccionTxt));
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
    
    
    //Ordena los datos de la lista por el metodo BURBUJA
    public void ordedamientoBurbuja(String direccionTxt){
        
        //Ingramos los datos a la lista
        listaB = new BurbujaLista();
        
        
        
        InserccionLista lista = new InserccionLista();  
          int num = 0;
           
        Scanner archivo = null;
	try {
            archivo = new Scanner(new File(direccionTxt));
	} catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Archivo no encontrado");
	}
	
        while(archivo.hasNext()){
            num = archivo.nextInt();
            listaB.Ingresar(new Nodo(num)); //Metodos los datos a la lista 
        }
      
        listaB.Ordenar(listaB, new CompararEntero(), listaB);
        
        Nodo aux=listaB.tope;
         while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente;
        }
        
        
        
        
      
    
    
    }
    
    
    
    
    
   
}
