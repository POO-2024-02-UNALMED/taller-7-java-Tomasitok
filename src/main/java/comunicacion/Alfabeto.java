package comunicacion;

public class Alfabeto extends Pictograma {
    

    static String[] letras;
    String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return Alfabeto.letras.length;
    }

    @Override
    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString(){
        String abecedario = "";
        for(int i = 0; i < letras.length; i++){
            abecedario += letras[i];
            if (i < letras.length - 1){
                abecedario += ", ";
            }
        }
        return abecedario;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
}
