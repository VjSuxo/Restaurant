/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Codigo;

/**
 *
 * @author Tostadora
 */
public class PilaAlimento {
    private Alimento[] pl = new Alimento[50];
   private int max = 50,tope=1;
   
   public PilaAlimento(){
       tope=0;
   }
    
   public boolean esVacia(){
       if(tope == 0){
           
           return true;
       }
       else{
           return false;
       }
       
   }
   
   public boolean esLlena(){
       
       if(tope == max){
         
           return true;
       }
       else{
          
           return false;
       }
   }
   
   public int nroElem(){

       return tope;
       
   }
   

   
   public void adiElem(Alimento elem){
    
       if(!esLlena()){
           pl[tope]= elem;
           tope++;
       }
   }
   
   public void llenar(Alimento elem, int cant){
   
       if(cant<max){
       
           for (int i = 0; i < cant; i++) {
           
               pl[i]=elem;
               
           }
           
       }
       else{
           System.out.println("La cantidad es muy grande");
       }
       
   
   }
   
   public void mostrar(){
       System.out.println("Mostrando Pila");
       PilaAlimento aux = new PilaAlimento();
       int n = tope;
       for(int i=0; i<=n-1;i++){
           Alimento x =eliminar();
           System.out.println(x);
           aux.adiElem(x);
       }
       this.vaciar(aux);
   }
   
   public Alimento eliminar(){
    
       if(!esVacia()){
           Alimento x = pl[tope-1];
           tope--;
           return x;
       }
       else{
           return null;
       }
       
   }
   
   
   public void vaciar(PilaAlimento z){
       
 
       while(!z.esVacia()){
         
           this.adiElem(z.eliminar());
       }
   }
}
