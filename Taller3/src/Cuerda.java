public class Cuerda extends Instrumento{

    /**
     * Tipo de cuerda del instrumento
     */
    String tipoCuerda = "";

    /**
     * Tipo de sonido del instrumento
     */
    String tipo = "";

    /**
     * Numero de cuerdas del instrumento
     */
    int numeroCuerdas = 0;


    /**
     * Constructor de la clase Cuerda
     * @param nombre
     * @param material
     * @param codigo
     * @param precio
     * @param stock
     * @param tipoCuerda
     * @param numeroCuerdas
     * @param tipo
     */
    public Cuerda(String nombre, String material, String codigo, int precio, int stock, String tipoCuerda, int numeroCuerdas, String tipo) {
        super(nombre, material, codigo, precio, stock);
        this.tipoCuerda = tipoCuerda;
        this.numeroCuerdas = numeroCuerdas;
        this.tipo = tipo;
    }

    public String getTipoCuerda() {return tipoCuerda;}

    public void setTipoCuerda(String tipoCuerda) {this.tipoCuerda = tipoCuerda;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public int getNumeroCuerdas() {return numeroCuerdas;}

    public void setNumeroCuerdas(int numeroCuerdas) {this.numeroCuerdas = numeroCuerdas;}
}
