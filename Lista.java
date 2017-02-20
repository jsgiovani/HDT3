
public class Lista {
	private Nodo inicio;
	private Nodo fin;
	
	
	//Inicializacion del constructor con sus respectivos paramentros
	Lista (){
		inicio = null;
		fin = null;
	}
	
	//Metodo para isertar un nuevo nodo en la lista DOBLEMENTE ENLASADA
	public void InsertarDato(int dato){
		Nodo nodoNuevo = new Nodo();
		nodoNuevo.dato = dato;
		
		if(inicio == null){
			inicio = nodoNuevo;
			inicio.siguente = null;
			inicio.anterior = null;
			fin = inicio;
			
		} else{
			fin.siguente = nodoNuevo;
			nodoNuevo.anterior = fin;
			nodoNuevo.siguente = null;
			fin = nodoNuevo;
		}
	}
	
	public void mostrarDatosLista(){
		Nodo actual = new Nodo();
		actual = inicio;
		while(actual != null){
			System.out.println(actual.dato);
			actual = actual.siguente;
		}
	}
	
	
	
}
