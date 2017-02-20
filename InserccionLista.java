/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 * Juan Carlos Solis 
 * 
 * 
 * Referencias bibligraficas
 * @@AJuan D [Juan Diaz(2013, September 23). Ordenamiento por Inserción en listas enlazadas Jav [Archivo de video]. Recuperado de https://www.youtube.com/watch?v=7mf5bqmuDS4
 */
public class InserccionLista {
    
    private Nodo raiz;
    
    //COnstructor
    public InserccionLista(){
        raiz=null;
    }
    
    //Metodo que recibe un numero, lo guarda en la lista y lo ordena. 
    public void insertarNodo(int x){
        Nodo nuevo=new Nodo(x);
        Nodo reconocimiento1,reconocimiento2;
        
        //-----Priera validación: nuestra lista esta vacia?
        //Lista vacia,raiz=null
        if(raiz==null){
            raiz=nuevo;
            nuevo.siguiente=null;
        }
        else{//'sí la lista no esta vacia
            //----Segunda Validación: El número de entrada va al inicio?
            
            reconocimiento1=raiz;
            while(reconocimiento1!=null){
                reconocimiento2=reconocimiento1.siguiente;
                //para saber si debe ir al inicio de la lista
                //  comparamos el valor del nuevo nodo
                if(nuevo.dato<=reconocimiento1.dato){
                    nuevo.siguiente=raiz;
                    raiz=nuevo;
                    break;
                }
                //----Tercera validación: El nuemero que entra va al final de la lista?
                else{
                    if(nuevo.dato>reconocimiento1.dato && reconocimiento2==null){
                        reconocimiento1.siguiente=nuevo;
                        nuevo.siguiente=null;
                        break;
                    }
                    //-------Cuarta validación:El nuero entrante debe ir een la mitdad de otros dos números(nodos)
                    else {
                        if(reconocimiento1.dato<nuevo.dato && reconocimiento2.dato>=nuevo.dato){
                            reconocimiento1.siguiente=nuevo;
                            nuevo.siguiente=reconocimiento2;
                            break;
                        }
                        //el ciclo while salte de valor, ya qe
                        //ninguna  cumple con las validaciones
                        else{
                        reconocimiento1=reconocimiento1.siguiente;
                        }
                    }
                }
            }
        }
        
    }
    
    //metodo para impriir los datos de la lista 
    public void imprimirLista(){
        //barre nuestra lsita enlazada
        Nodo barrer=raiz;
        while(barrer!=null){
            System.out.println(barrer.dato);
            barrer=barrer.siguiente;
            
        }
    
        
    }
    
}
