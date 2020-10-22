package procuragrafos;

import java.util.ArrayList;


public class Ponto {
    
    String nome = new String();
    int posicao;
    
    public Ponto(String nome,int posicao){
    this.nome=nome;
    this.posicao=posicao;
    }
    
    ArrayList<Vizinho> vizinhos = new ArrayList();

    
       
    public void adicionarVizinho(Ponto entrada,int aresta, Ponto vizinhoadicionar){
       Vizinho addvizinho = new Vizinho(aresta, vizinhoadicionar);      
       vizinhos.add(addvizinho);       
       vizinhoadicionar.adicionarVizinhoRetorno(vizinhoadicionar,aresta, entrada);
       
    }
    
    private void adicionarVizinhoRetorno(Ponto entrada,int aresta, Ponto vizinhoadd){
       Vizinho addvizinho = new Vizinho(aresta, vizinhoadd);      
       vizinhos.add(addvizinho);
    }
    
    
    
    
}
