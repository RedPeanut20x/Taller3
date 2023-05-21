import java.util.ArrayList;
import java.util.Scanner;

public class SistemaImpl implements Sistema
{
    /**
     * Lista de instrumentos de cuerdas
     */
    ArrayList<Cuerda> instrumentosCuerdas;

    /**
     * Lista de instrumentos de viento
     */
    ArrayList<Viento> instrumentosViento;

    /**
     * Lista de instrumentos de percusión
     */
    ArrayList<Percusión> instrumentosPercusion;

    /**
     * Constructor de la clase SistemaImpl
     */
    public SistemaImpl()
    {
        this.instrumentosCuerdas = new ArrayList<Cuerda>();
        this.instrumentosViento = new ArrayList<Viento>();
        this.instrumentosPercusion = new ArrayList<Percusión>();
    }

    /**
     * Obtiene la lista de instrumentos de cuerdas
     * @return instrumentosCuerdas
     */
    public ArrayList<Cuerda> getInstrumentosCuerdas() {return instrumentosCuerdas;}

    /**
     * Obtiene la lista de instrumentos de viento
     * @return instrumentosViento
     */
    public ArrayList<Viento> getInstrumentosViento() {return instrumentosViento;}

    /**
     * Obtiene la lista de instrumentos de percusión
     * @return instrumentosPercusion
     */
    public ArrayList<Percusión> getInstrumentosPercusion() {return instrumentosPercusion;}

    /**
     * Metodo para agregar un instrumentos, se incluyen como parametros todas las caracteristicas posibles en un instrumento
     * Dependiendo de los nombres que se entregue en el argumento, citara los diferentes constructores para cada tipo de instrumento correspondiente
     * @param codigo
     * @param precio
     * @param stock
     * @param nombre
     * @param numeroCuerdas
     * @param material
     * @param tipo
     * @param tipoPercusion
     * @param tipoCuerda
     * @param altura
     */
    public void agregarInstrumento(String codigo, int precio, int stock, String nombre, int numeroCuerdas, String material, String tipo, String tipoPercusion, String tipoCuerda, String altura)
    {
        //Crea un objeto de tipo Cuerda y lo agrega a la ArrayList de instrumentos de Cuerda del sistema
        if(nombre.equals("Guitarra") || nombre.equals("Bajo") || nombre.equals("Violín") || nombre.equals("Arpa"))
        {
            Cuerda cuerda = new Cuerda(nombre, material, codigo, precio, stock, tipoCuerda, numeroCuerdas, tipo);
            instrumentosCuerdas.add(cuerda);
        }

        //Crea un objeto de tipo Viento y lo agrega a la ArrayList de instrumentos de Viento del sistema
        if(nombre.equals("Trompeta") || nombre.equals("Saxofón") || nombre.equals("Clarinete") || nombre.equals("Flauta traversa"))
        {
            Viento viento = new Viento(nombre, material, codigo, precio, stock);
            instrumentosViento.add(viento);
        }

        //Crea un objeto de tipo Percusion y lo agrega a la ArrayList de instrumentos de Percusion del sistema
        if(nombre.equals("Bongó") || nombre.equals("Cajón") || nombre.equals("Campanas tubulares") || nombre.equals("Bombo"))
        {
            Percusión percusión = new Percusión(nombre, material, codigo, precio, stock, tipoPercusion, altura);
            instrumentosPercusion.add(percusión);
        }
    }

    public void venderInstrumento()
    {

    }

    public void consultarInstrumento()
    {

    }

    public void cerrarSistema()
    {

    }

    public void menu()
    {
        boolean menu1switch = false;
        //Imprime el menu princiapl
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Beath the Rythm=========\n" +
                "1)Agregar Instrumento\n" +
                "2)Vender Instrumento\n" +
                "3)Consultar inventario\n" +
                "4)Cierre\n" +
                "\n" +
                "Ingrese una opcion :  ");
        String menu1 = sc.nextLine();

        //Si se elige la primera opcion
        if(menu1.equals("1"))
        {
            System.out.println("===========Beath the Rythm=========\n" +
                    "1)Agregar instrumento de cuerdas\n" +
                    "2)Agregar instrumento de viento\n" +
                    "3)Agregar instrumento de percusión\n" +
                    "\n" +
                    "Ingrese una opcion : ");
            String menu2 = sc.nextLine();

            if(menu2.equals("1"))
            {
                System.out.println("Nombre : ");
                String nombre = sc.nextLine();
                System.out.println("Material : ");
                String material = sc.nextLine();
                System.out.println("Codigo : ");
                String codigo = sc.nextLine();
                System.out.println("Precio : ");
                int precio = sc.nextInt();
                System.out.println("Stock : ");
                int stock = sc.nextInt();
                System.out.println("Tipo de cuerda : ");
                String tipoCuerda = sc.nextLine();
                System.out.println("Numero de cuerdas : ");
                int numeroCuerdas = sc.nextInt();
                System.out.println("Tipo : ");
                String tipo = sc.nextLine();

                //Se entregan los valores ingresados para los argumentos del metodo AgregarInstrumento Cuerdas
                agregarInstrumento(codigo,precio,stock,nombre,numeroCuerdas,material,tipo,null,tipoCuerda,null);

            }

            if(menu2.equals("2"))
            {
                System.out.println("Nombre : ");
                String nombre = sc.nextLine();
                System.out.println("Material : ");
                String material = sc.nextLine();
                System.out.println("Codigo : ");
                String codigo = sc.nextLine();
                System.out.println("Precio : ");
                int precio = sc.nextInt();
                System.out.println("Stock : ");
                int stock = sc.nextInt();

                //Se entregan los valores ingresados para los argumentos del metodo AgregarInstrumento, para crear un instrumento de Viento
                agregarInstrumento(codigo,precio,stock,nombre,0,material,null,null,null,null);
            }

            if(menu2.equals("3"))
            {
                //Datos para la creacion del instrumento
                System.out.println("Nombre : ");
                String nombre = sc.nextLine();
                System.out.println("Material : ");
                String material = sc.nextLine();
                System.out.println("Codigo : ");
                String codigo = sc.nextLine();
                System.out.println("Precio : ");
                int precio = sc.nextInt();
                System.out.println("Stock : ");
                int stock = sc.nextInt();
                System.out.println("Tipo de percusion : ");
                String tipoPercusion = sc.nextLine();
                System.out.println("Altura : ");
                String altura = sc.nextLine();

                //Se entregan los valores ingresados para los argumentos del metodo AgregarInstrumento, para crear un instrumento de Percusion
                agregarInstrumento(codigo,precio,stock,nombre,0,material,null,tipoPercusion,null,altura);

            }

        }

        //Si se elige la segunda opcion
        else if(menu1.equals("2"))
        {


        }

        //Si se elige la tercera opcion
        else if(menu1.equals("3"))
        {

        }

        //Si se elige la cuarta opcion
        else if(menu1.equals("4"))
        {

        }




    }


}
