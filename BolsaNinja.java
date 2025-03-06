import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T extends FerramentaNinja> {

    
    private List<T> ferramentas;

    
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

   
    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
     
}
