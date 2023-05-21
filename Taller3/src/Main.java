import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        SistemaImpl sistema = new SistemaImpl();

        cargarArchivoCSV(sistema.getInstrumentosCuerdas(), sistema.getInstrumentosViento(), sistema.getInstrumentosPercusion());

        sistema.menu();

    }


    /**
     * Metodo para crear o editar un archivo CSV con la informacion del sistema
     * @param instrumentoCuerda
     * @param instrumentoViento
     * @param instrumentoPercusión
     */
    private static void editarArchivoCSV(ArrayList<Cuerda> instrumentoCuerda, ArrayList<Viento> instrumentoViento, ArrayList<Percusión> instrumentoPercusión)
    {
        //Variable que posee el nombre del archivo a buscar
        String nombreArchivo = "instrumentos.csv";
        //Transforma la variable String nombreArchivo, en un dato tipo File
        File archivo = new File(nombreArchivo);

        //Si un archivo con ese nombre y extension no existe, pues crea un archivo desde cero
        if(!archivo.exists())
        {

            /*
            Crea un archivo con el nombre "instrumentos", con extension csv.
            Escribe, separado por comas, el dato ingresado.
             */
            try (PrintWriter pw = new PrintWriter("instrumentos.csv"))
            {
                pw.write(12 + ",");
                pw.write(15 + ",");

                System.out.println("Se ha terminado la escritura del archivo");
            }

            catch (FileNotFoundException e)
            {
                System.out.println("Error al editar el archivo");
            }
        }

        //Por el contrario, si existe, indica que ya existe un archivo, manteniendo el actual
        else if (archivo.exists())
        {
            System.out.println("¡Ya existe el archivo!");
        }
    }

    /**
     * Metodo para cargar un archivo CSV, para añadir la informacion al sistema
     * @param instrumentoCuerda
     * @param instrumentoViento
     * @param instrumentoPercusión
     * @throws IOException
     */
    private static void cargarArchivoCSV(ArrayList<Cuerda> instrumentoCuerda, ArrayList<Viento> instrumentoViento, ArrayList<Percusión> instrumentoPercusión) throws IOException{

        try(BufferedReader br = new BufferedReader(new FileReader("instrumentos.csv")))
        {
            String linea = "";

            while((linea = br.readLine()) != null)
            {
                String[] datos = linea.split(",");
                String codigo = datos[0];
                int precio = Integer.parseInt(datos[1]);
                int stock = Integer.parseInt(datos[2]);
                String nombre = datos[3];
                int numeroCuerdas = Integer.parseInt(datos[4]);
                String material = datos[5];
                String tipo = datos[6];
                String tipoPercusion = datos[7];
                String tipoCuerda = datos[8];
                String altura = datos[9];


                //En caso de que el nombre de la linea actual, sea uno de los siguientes, entonces creara un objeto de tipo Cuerda
                if(nombre.equals("Guitarra") || nombre.equals("Bajo") || nombre.equals("Violín") || nombre.equals("Arpa"))
                {
                    Cuerda cuerda = new Cuerda(nombre, material, codigo, precio, stock, tipoCuerda, numeroCuerdas, tipo);
                    //Se añade a la ArrayList de tipo Cuerda, entregada por parametros
                    instrumentoCuerda.add(cuerda);
                }

                //Por otro lado, en caso de que el nombre de la linea actual, sea uno de los siguientes, entonces creara un objeto de tipo Viento
                else if(nombre.equals("Trompeta") || nombre.equals("Saxofón") || nombre.equals("Clarinete") || nombre.equals("Flauta traversa"))
                {
                    Viento viento = new Viento(nombre, material, codigo, precio, stock);
                    //Se añade a la ArrayList de tipo Viento, entregada por parametros
                    instrumentoViento.add(viento);
                }

                //Por ultimo, en caso de que el nombre de la linea actual, sea uno de los siguientes, entonces creara un objeto de tipo Percusión
                else if(nombre.equals("Bongó") || nombre.equals("Cajón") || nombre.equals("Campanas tubulares") || nombre.equals("Bombo"))
                {
                    Percusión percusión = new Percusión(nombre, material, codigo, precio, stock, tipoPercusion, altura);
                    //Se añade a la ArrayList de tipo Percusion, entregada por parametros
                    instrumentoPercusión.add(percusión);
                }



            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Archivo no encontrado, creando uno nuevo...");
            e.printStackTrace();
        }
        catch (IIOException e)
        {
            System.out.println("El archivo no se pudo cerrar");
            e.printStackTrace();
        }
    }
}