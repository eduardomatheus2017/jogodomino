/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodominoo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Domino{
    public String nome;
    public String formula;
    public int id; 
    private ImageIcon Nn;

    public Domino() {
    }

    public ImageIcon getNn() {
        return Nn;
    }

    public void setNn(ImageIcon Nn) {
        this.Nn = Nn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
/**
 *
 * @author IFMS
 */

