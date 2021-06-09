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
public class ListaSMesero {
    
    private NodoMesero p;
    
	public ListaSMesero(){
		p = null;
	}
	public NodoMesero getP() {
		return p;
	}
	public void setP(NodoMesero p) {
		this.p = p;
	}
	public int nronodos() {
		int c = 0;
		NodoMesero aux = getP();
		while(aux != null) {
			c++;
			aux = aux.getSig();
		}
		return c;
	}
	public void mostrar() {
		NodoMesero aux = getP();
		int c=nronodos();int c2=c;
		int t=0;		
		while(c!=0) {
			t++;
			if(c2==t) {
			System.out.print("|"+aux.getMesero().getNombre()+"|");
			aux = aux.getSig();
			}else { 
				System.out.print("|"+aux.getMesero().getNombre()+"|"+"-");
				aux = aux.getSig();
			}
			c--;
		}
	}
	public void adiprincipio(Mesero elem) {
		NodoMesero nuevo = new NodoMesero();
		nuevo.setMesero(elem);
		nuevo.setSig(getP());
		setP(nuevo);
	}
	public void adifinal(Mesero elem) {
		NodoMesero nuevo = new NodoMesero();
		nuevo.setMesero(elem);
		if(getP() == null) 
			setP(nuevo);
		else {
			NodoMesero aux = getP();
			while(aux.getSig()  != null)
				aux = aux.getSig();
			aux.setSig(nuevo);
		}
	}
	public NodoMesero eliprincipio() {
		NodoMesero aux = getP();
		if(aux != null) {
			setP(getP().getSig());
			aux.setSig(null);
		}else 
			System.out.print("La lista esta vacia");
		return aux;
	}
	public NodoMesero elifinal() {
		NodoMesero a = getP();
		NodoMesero b = getP();
		if(b != null) {
			if(b.getSig() != null)
				setP(null);
			else {
				while(b.getSig() != null) {
					a = b;
					b = b.getSig();
				}
				a.setSig(null);
			}
		}else
			System.out.println("La lista esta vacia");
		return b;
	}
	
        
	
}
