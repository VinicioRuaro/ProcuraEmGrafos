package procuragrafos;

import java.util.ArrayList;

    public class ArrumarLeitura {

    public static ArrayList<Ponto> retorno(){
        
        ArrayList<Ponto> saida = new ArrayList();
        
        Ponto Oradea = new Ponto("Oradea",0);     
        
        Ponto Zerind = new Ponto("Zerind",1);
        
        Ponto Arack = new Ponto("Arack",2);
        
        Ponto Timisoara = new Ponto("Timisoara",3);
               
        Ponto Lugoj = new Ponto("Lugoj",4);
        
        Ponto Mehadia = new Ponto("Mehadia",5);
       
        Ponto Dobreta = new Ponto("Dobreta",6);
        
        Ponto Craiova = new Ponto("Craiova",7);
        
        Ponto RimnicuVilcea = new Ponto("Rimnicu Vilcea",8);       
        
        Ponto Sibiu = new Ponto("Sibiu",9);       
        
        Ponto Fagaras = new Ponto("Fagaras",10);       
        
        Ponto Pitesti = new Ponto("Pitesti",11);        
        
        Ponto Bucharest = new Ponto("Bucharest",12);       
        
        Ponto Giurgiu = new Ponto("Giurgiu",13);        
        
        Ponto Urziceni = new Ponto("Urziceni",14);        
        
        Ponto Hirsova = new Ponto("Hirsova",15);
        
        Ponto Eforie = new Ponto("Eforie",16);
        
        Ponto Vaslui = new Ponto("Vaslui",17);
        
        Ponto Lasi = new Ponto("Lasi",18);
        
        Ponto Neamt = new Ponto("Neamt",19);
        
        Oradea.adicionarVizinho(Oradea, 71, Zerind);
        
        Zerind.adicionarVizinho(Zerind, 75, Arack);
        
        Arack.adicionarVizinho(Arack, 118, Timisoara);
        
        Timisoara.adicionarVizinho(Timisoara, 111, Lugoj);
        
        Lugoj.adicionarVizinho(Lugoj, 70, Mehadia);
        
        Mehadia.adicionarVizinho(Mehadia, 75, Dobreta);
        
        Dobreta.adicionarVizinho(Dobreta, 120, Craiova);
        
        Craiova.adicionarVizinho(Craiova, 146, RimnicuVilcea);
        
        RimnicuVilcea.adicionarVizinho(RimnicuVilcea, 80, Sibiu);
        
        Sibiu.adicionarVizinho(Sibiu, 140, Arack);
        
        Sibiu.adicionarVizinho(Sibiu, 151, Oradea);
        
        Craiova.adicionarVizinho(Craiova, 138, Pitesti);
        
        RimnicuVilcea.adicionarVizinho(RimnicuVilcea, 97, Pitesti);
        
        Pitesti.adicionarVizinho(Pitesti, 101, Bucharest);
        
        Sibiu.adicionarVizinho(Sibiu, 99, Fagaras);
        
        Fagaras.adicionarVizinho(Fagaras, 221, Bucharest);
        
        Bucharest.adicionarVizinho(Bucharest, 90, Giurgiu);
        
        Bucharest.adicionarVizinho(Bucharest, 85, Urziceni);
        
        Urziceni.adicionarVizinho(Urziceni, 98, Hirsova);
        
        Hirsova.adicionarVizinho(Hirsova, 86, Eforie);
        
        Urziceni.adicionarVizinho(Urziceni, 142, Vaslui);
        
        Vaslui.adicionarVizinho(Vaslui, 142, Vaslui);
        
        Vaslui.adicionarVizinho(Vaslui, 92, Lasi);
        
        Lasi.adicionarVizinho(Lasi, 87, Neamt);
        saida.add(Oradea);
        saida.add(Zerind);
        saida.add(Arack);        
        saida.add(Timisoara);
        saida.add(Lugoj);
        saida.add(Mehadia);
        saida.add(Dobreta);
        saida.add(Craiova);
        saida.add(RimnicuVilcea);
        saida.add(Sibiu);
        saida.add(Fagaras);
        saida.add(Pitesti);
        saida.add(Bucharest);
        saida.add(Giurgiu);
        saida.add(Urziceni);
        saida.add(Hirsova);        
        saida.add(Eforie);
        saida.add(Vaslui);
        saida.add(Lasi);
        saida.add(Neamt);
        
        
        return saida;  

}}
