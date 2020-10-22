package procuragrafos;

import java.util.ArrayList;

public class Caminho {
    int atual;
    
    public Caminho(int atual){
        this.atual=atual;
    }

    ArrayList<Vizinho> caminhopercorido= new ArrayList();
    
    
    int distancia;
    
    void adicionarCaminho(Vizinho entrada){
        caminhopercorido.add(entrada);
        distancia=distancia+entrada.aresta;
    }
    
}
