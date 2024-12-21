package comunicacion;

public class Fabula extends Escrito {

    String ensenanzas;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int parametro){
        return this.getPaginas() * parametro * 1;
    }

    @Override
    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString(){
        return this.getOrigen() + "\n" + 
				this.getTitulo() + "\n" + 
				this.getAutor() + "\n" + 
				this.getPaginas() + "\n" + 
				this.ensenanzas;
    }

    public String getEnsenanza() {
        return ensenanzas;
    }

    public void setEnsenanza(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
      
}
