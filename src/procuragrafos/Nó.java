package procuragrafos;

import java.util.ArrayList;
import java.util.List;

public class Nó {
    public Ponto atual;
    public int distancia;
    String nome = new String(); //arvore
    public Ponto pai;
    ArrayList<Integer> passados = new ArrayList();
    int profundidade;
}
