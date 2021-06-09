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
public class ListaSPedido {
    NodoPedido p;
    	ListaSPedido() {
		p = null;
	}
	public NodoPedido getP() {
		return p;
	}
	public void setP(NodoPedido p) {
		this.p = p;
	}
	public int nronodos() {
		int c = 0;
		NodoPedido aux = getP();
		while(aux != null) {
			c++;
			aux = aux.getSig();
		}
		return c;
	}
	public void mostrar() {
		NodoPedido aux = getP();
		int c=nronodos();int c2=c;
		int t=0;		
		while(c!=0) {
			t++;
			if(c2==t) {
			System.out.print("|"+aux.getAlimento().getNombre()+"|");
			aux = aux.getSig();
			}else { 
				System.out.print("|"+aux.getAlimento().getNombre()+"|"+"-");
				aux = aux.getSig();
			}
			c--;
		}
	}
	public void adiprincipio(Alimento elem) {
		NodoPedido nuevo = new NodoPedido();
		nuevo.setAlimento(elem);
		nuevo.setSig(getP());
		setP(nuevo);
	}
	public void adifinal(Alimento elem) {
		NodoPedido nuevo = new NodoPedido();
		nuevo.setAlimento(elem);
		if(getP() == null) 
			setP(nuevo);
		else {
			NodoPedido aux = getP();
			while(aux.getSig()  != null)
				aux = aux.getSig();
			aux.setSig(nuevo);
		}
	}
	public NodoPedido eliprincipio() {
		NodoPedido aux = getP();
		if(aux != null) {
			setP(getP().getSig());
			aux.setSig(null);
		}else 
			System.out.print("La lista esta vacia");
		return aux;
	}
	public NodoPedido elifinal() {
		NodoPedido a = getP();
		NodoPedido b = getP();
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
