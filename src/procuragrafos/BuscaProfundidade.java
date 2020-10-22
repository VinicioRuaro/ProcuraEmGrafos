package procuragrafos;

import java.util.ArrayList;

public class BuscaProfundidade {
    
    public static ArrayList<Nó> busca(Integer entrada,Integer procurado,ArrayList<Ponto> grafo){
        ArrayList<Nó> Arvore = new ArrayList(); 
        ArrayList<Nó> lista = new ArrayList();
        
        Nó paino= new Nó();
        
        paino.nome=grafo.get(entrada).nome;
        paino.atual=grafo.get(entrada);
        paino.distancia=0;
        paino.pai=null;
        paino.passados.add(entrada);
        
        Arvore.add(paino);
        lista.add(paino);
        int a;
        
        for(;lista.size()!=0&&procurado!=lista.get(0).atual.posicao;){
            
            a =1;
            
            Nó no0= new Nó();
            
            no0.nome=lista.get(0).nome+", "+lista.get(0).atual.vizinhos.get(0).vizinho.nome;
            no0.distancia=lista.get(0).distancia+lista.get(0).atual.vizinhos.get(0).aresta;
            no0.atual=lista.get(0).atual.vizinhos.get(0).vizinho;
            no0.pai=lista.get(0).atual;
            no0.passados= lista.get(0).passados;
            
            
            if(!no0.passados.contains(no0.atual.posicao)){
              
                no0.passados.add(no0.atual.posicao);
            
                lista.add(a, no0);
                Arvore.add(no0);
                a++;
            
            }
        
            
            if(lista.get(0).atual.vizinhos.size()>1){
                
                Nó no1=new Nó();
                
                no1.nome=lista.get(0).nome+", "+lista.get(0).atual.vizinhos.get(1).vizinho.nome;
                no1.distancia=lista.get(0).distancia+lista.get(0).atual.vizinhos.get(1).aresta;
                no1.atual=lista.get(0).atual.vizinhos.get(1).vizinho;
                no1.pai=lista.get(0).atual;
                no1.passados= lista.get(0).passados;
                
                
                if(!no1.passados.contains(no1.atual.posicao)){
                    
                    no1.passados.add(no1.atual.posicao);
                    
                    lista.add(a, no1);
                    Arvore.add(no1);
                    a++;
                
                }
            }
            if(lista.get(0).atual.vizinhos.size()>2){
                
                Nó no2=new Nó();
                
                no2.nome=lista.get(0).nome+", "+lista.get(0).atual.vizinhos.get(2).vizinho.nome;
                no2.distancia=lista.get(0).distancia+lista.get(0).atual.vizinhos.get(2).aresta;
                no2.atual=lista.get(0).atual.vizinhos.get(2).vizinho;
                no2.pai=lista.get(0).atual;
                no2.passados= lista.get(0).passados;
                
                
                if(!no2.passados.contains(no2.atual.posicao)){
                    
                    no2.passados.add(no2.atual.posicao);
                                 
                    lista.add(a, no2);
                    Arvore.add(no2);
                    a++;
                
                }
            }
            if(lista.get(0).atual.vizinhos.size()>3){
                
                Nó no3=new Nó();
                
                no3.nome=lista.get(0).nome+", "+lista.get(0).atual.vizinhos.get(3).vizinho.nome;
                no3.distancia=lista.get(0).distancia+lista.get(0).atual.vizinhos.get(3).aresta;
                no3.atual=lista.get(0).atual.vizinhos.get(3).vizinho;                
                no3.passados= lista.get(0).passados;
                no3.pai=lista.get(0).atual;
                
                if(!no3.passados.contains(no3.atual.posicao)){
                                
                    no3.passados.add(no3.atual.posicao);
                    
                    lista.add(a, no3);
                    Arvore.add(no3);
                    a++;
                
                }
            }
            lista.remove(0);
            
        }
        
        return Arvore;
    }
}
