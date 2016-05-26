/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinariaR;

import arvorebinaria.Arvore;

/**
 *
 * @author alunofavip
 */
public class No {


      
    int valor;
    
    private Arvore noEsquerda, noDireito;

    public No(int valor) {      
        this.valor = valor;
     
    }


    public Arvore getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(Arvore noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public Arvore getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(Arvore noDireito) {
        this.noDireito = noDireito;
    }
        

}
