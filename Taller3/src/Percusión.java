public class Percusión extends Instrumento{

    /**
     * Tipo de percusion del instrumento
     */
    String tipoPercusion = "";

    /**
     * Altura del instrumento
     */
    String altura = "";

    /**
     * Constructor de la clase Percusion
     * @param nombre
     * @param material
     * @param codigo
     * @param precio
     * @param stock
     * @param tipoPercusion
     * @param altura
     */
    public Percusión(String nombre, String material, String codigo, int precio, int stock, String tipoPercusion, String altura) {
        super(nombre, material, codigo, precio, stock);
        this.tipoPercusion = tipoPercusion;
        this.altura = altura;
    }

    /**
     * Obtiene el tipo de percusion del instrumento
     * @return tipoPercusion
     */
    public String getTipoPercusion() {return tipoPercusion;}

    /**
     * Cambia el tipo de percusion del instrumento
     * @param tipoPercusion
     */
    public void setTipoPercusion(String tipoPercusion) {this.tipoPercusion = tipoPercusion;}

    /**
     * Obtiene la altura del instrumento
     * @return altura
     */
    public String getAltura() {return altura;}

    /**
     * Cambia la altura del instrumento
     * @param altura
     */
    public void setAltura(String altura) {this.altura = altura;}
}
