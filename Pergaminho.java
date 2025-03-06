public class Pergaminho implements FerramentaNinja{

    private String conteudo;

    public Pergaminho(String conteudo){
        this.conteudo = conteudo;
    }

    public String getConteudo(){
        return conteudo;
    }

    @Override
    public String toString() {
        return "Pergaminho " + conteudo;
    }

    


}