public class Main {
    public static void main(String[] args) {

        

        BolsaNinja<FerramentaNinja> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(20));
        bolsaNinja.adicionarFerramenta(new Pergaminho("de invocação"));
        bolsaNinja.adicionarFerramenta(new Ilicitos("Droga"));

        System.out.println("Itens da bolsa:");
        bolsaNinja.mostrarFerramentas();
    }
    
}
