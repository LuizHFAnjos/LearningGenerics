import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T extends FerramentaNinja> {

    //iniciar Array
    private List<T> ferramentas;

    //construtor 
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    //colocar ferramentas no array
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //mostrar lista de ferramentas
    public void mostrarFerramentas(){
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
     
}
