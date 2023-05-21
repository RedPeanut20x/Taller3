public interface Sistema {



    void agregarInstrumento(String codigo, int precio, int stock, String nombre, int numeroCuerdas, String material, String tipo, String tipoPercusion, String tipoCuerda, String altura);

    void venderInstrumento();

    void consultarInstrumento();

    void cerrarSistema();

    void menu();

}
