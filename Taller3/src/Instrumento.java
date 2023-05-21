public class Instrumento {

    /**
     * Nombre del instrumento
     */
    String nombre = "";

    /**
     * Material del instrumento
     */
    String material = "";

    /**
     * Codigo del instrumento
     */
    String codigo = "";

    /**
     * Precio del instrumento
     */
    int precio = 0;

    /**
     * Stock del instrumento
     */
    int stock = 0;

    /**
     * Constructor de la clase Instrumento
     * @param nombre
     * @param material
     * @param codigo
     * @param precio
     * @param stock
     */
    public Instrumento(String nombre, String material, String codigo, int precio, int stock) {
        this.nombre = nombre;
        this.material = material;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getMaterial() {return material;}

    public void setMaterial(String material) {this.material = material;}

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}

    public int getStock() {return stock;}

    public void setStock(int stock) {this.stock = stock;}
}
