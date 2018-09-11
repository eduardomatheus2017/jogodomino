/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodominoo.estruturas;

import jogodominoo.Domino;

/** 
 * @author wdmatheus 
 * Classe que implementa e manipula nós da lista.
 */
public class Nodo {
	private Nodo anterior;		
	private Nodo proximo;
	private Domino valor;		
	//Define valor do nó.
	public void setValor(Domino valor) {
		this.valor = valor;
	}
	//Retorna valor do nó.
	public Domino getValor() {
		return valor;
	}
	//Define nó anterior.
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	//Retorna nó anterior
	public Nodo getAnterior() {
		return anterior;
	}
	//Define proximo nó.
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	//Retorna proximo nó
	public Nodo getProximo() {
		return proximo;
	}
}
