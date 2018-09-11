/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodominoo.estruturas;

/**
 * @author wdmatheus 
 * Classe para excessão de valor existente na lista com herança da classe Exception
 */
public class ExistentValueException extends Exception{	
	public ExistentValueException(){
		super();
	}	
	public ExistentValueException(String msg){
		super(msg);
	}
}