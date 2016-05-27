/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinariaR;

/**
 *
 * @author alunofavip
 */
public class ArvoreBinaria {
    
        private No raiz;
        
        
        
        public No Inserir(int valor){
            
            return null;
        }
        
        
        public No Inserir(No node,int valor){
            
            if(valor < node.valor){
                if(node.getNoEsquerda() == null){
                    
                    Inserir(node.getNoEsquerda(), valor);
                }else{
                    System.err.println("Inserir na esquerda de" + node.valor +" o valor "+ valor);
                   
                }
            }
            
            //No direito
            
            return null;
        }
        
        
        
    
    
}
