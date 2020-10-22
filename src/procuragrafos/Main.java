package procuragrafos;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {  
        
        
        ArrayList<Ponto> grafo;
        grafo=ArrumarLeitura.retorno();              
        
        Scanner ler = new Scanner(System.in);
        String leitura = new String();
        
        System.out.println("Selecione o Metodo de busca:\n1 para busca em extensão (Breadth-first)\n" +
        "2 para busca de custo uniforme\n" +
        "3 para busca em profundidade (Depth-first)\n" +
        "4 para busca em profundidade limitada\n" +
        "5 para busca de aprofundamento iterativo");
        leitura = ler.next();
        
        
        System.out.println("\nSelecione a cidade de saida digitando o numero correspondente:\nEx: Se o escolhido for Oradea digita 0");
        for(int a=0;a<grafo.size();a++){
            System.out.println( grafo.get(a).posicao +" "+grafo.get(a).nome);   
        }
        System.out.println("\nSobe para ler");
        String saida;
        saida= ler.next();
        int inicio=StringInt.StringInt(saida);
        
        
        System.out.println("\nSelecione a cidade de chegada digitando o numero correspondente:\nEx: Se o escolhido for Neamt digita 19");
        for(int a=0;a<grafo.size();a++){
            System.out.println( grafo.get(a).posicao +" "+grafo.get(a).nome);   
        }       
        System.out.println("\nSobe para ler");
        
        String chegada;
        chegada= ler.next();       
        int procurado = StringInt.StringInt(chegada);
        ArrayList<Nó> arvore = null;
        
        if(leitura.charAt(0)=='1'){
            
            arvore= BuscaExtensão.busca(inicio, procurado, grafo);
            
        }
        else if(leitura.charAt(0)=='3'){
            arvore= BuscaProfundidade.busca(inicio, procurado, grafo);
        }
        else if(leitura.charAt(0)=='2'){
            
            arvore= BuscaCustoUniforme.busca(inicio, procurado, grafo);
        }
        else if(leitura.charAt(0)=='4'){
            arvore = BuscaProfundidadeLimitada.busca(inicio, procurado, grafo);
        }
        else if(leitura.charAt(0)=='5'){
            arvore = BuscaAprofundamentoImperativo.busca(inicio, procurado, grafo);
        }
        
        System.out.println("\nArvore de Derivação\n");
        int verificador = 0;
        for (int i = 0; i < arvore.size(); i++) {
            
            System.out.println("Nome: "+arvore.get(i).atual.nome+"\nNumero da Cidade: "+arvore.get(i).atual.posicao);
            System.out.println("Posição: "+i);
            System.out.println("Posição arvore: " +arvore.get(i).nome);
            System.out.println("Distancia Percorida: "+arvore.get(i).distancia);
            if(leitura.charAt(0)=='4'||leitura.charAt(0)=='5'){
                System.out.println("Profundidade: "+arvore.get(i).profundidade);
            }
            System.out.println("");
            
            
            if(arvore.get(i).atual.posicao==procurado){
                verificador=i;
            }
                                  
        }
        
              
        System.out.println("Nome "+arvore.get(verificador).atual.nome+"\nNumero da Cidade: "+arvore.get(verificador).atual.posicao);
        System.out.println("Posição Nó: "+verificador);  
        System.out.println("Posição arvore: " +arvore.get(verificador).nome);
        System.out.println("Distancia Percorida: "+arvore.get(verificador).distancia);
        if(leitura.charAt(0)=='4'||leitura.charAt(0)=='5'){
            System.out.println("Profundidade: "+arvore.get(verificador).profundidade);
        }    
           
        
        
        
        
        
        
    }
    
}


    