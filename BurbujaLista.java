/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BurbujaLista {
    
    Nodo tope;
    
    
 //   static BurbujaLista lista;
    /*void ListaAleatoria() {
        lista = new BurbujaLista();
        lista.Ingresar(new Nodo(3));
        lista.Ingresar(new Nodo(300345));
        lista.Ingresar(new Nodo(44));
        lista.Ingresar(new Nodo(15));
        lista.Ingresar(new Nodo(1));
      
    }
*/
    public BurbujaLista() {
        tope = null;
    }      
   
    boolean Vacia(){
        return tope==null;
    }
   
    void Ingresar(Nodo temp){
        if(Vacia()){
            tope = temp;
        }else{
            Nodo aux1, aux2;
            aux2 = tope;
            aux1 = tope.siguiente;
            while(aux1!=null){
                aux1 = aux1.siguiente;
                aux2 = aux2.siguiente;
            }
            aux2.siguiente = temp;
        }
    }
    
    
    void Ordenar(BurbujaLista lis, Comparar c,BurbujaLista lista) {
        Nodo aux1, aux2;
        aux2 = lis.tope;
        while (aux2 != null) {
            aux1 = aux2.siguiente;
            while (aux1 != null) {
                if (c.Comparar(aux1.dato, aux2.dato) < 0) {
                    Object aux = aux2.dato;
                    aux2.dato = aux1.dato;
                    aux1.dato = (int) aux;
                }
                aux1 = aux1.siguiente;
            }
            aux2 = aux2.siguiente;
        }
        lista = lis;
    }
}
