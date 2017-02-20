/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CompararEntero implements Comparar{
   
    public int Comparar(Object obj1, Object obj2){
        
        String aux1=obj1.toString();
        String aux2=obj2.toString();
        
         int nObjeto1 = Integer.parseInt(ConvertirObjectToString(obj1));
         int nObjeto2 = Integer.parseInt(ConvertirObjectToString(obj2));
         
         //Devolver un -1 si objet1 es menor que obje2 
         int res=0;
         
         if(nObjeto1<nObjeto2){
            res=-1;
         }
         else if(nObjeto1==nObjeto2){
             res=0;
         
         }
         else{
             res=1;
         }
        //return aux1.compareTo(aux2);
        return res;
    }  
    
  
    public String ConvertirObjectToString(Object Obj) {
    String Str="";
    if(Obj!=null){
    Str = Obj.toString();
    }
    return Str;
    
    }
}
