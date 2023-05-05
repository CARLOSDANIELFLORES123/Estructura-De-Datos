package PilaDeClientes;

public class MainCliente {
    public static void main(String[] args) {

        Cliente Cli1 = new Cliente(" Jose " , " Oblitas " , 22 , "Achocalla calle 1 " , " Masculino ");
        Cliente Cli2 = new Cliente(" Miguel " , " Choque " , 19 , "Achocalla calle 2 " , " Masculino ");
        Cliente Cli3 = new Cliente(" Victor " , " Quispe " , 15 , "Achocalla calle 3 " , " Masculino ");
        Cliente Cli4 = new Cliente(" Angela " , " Mamani " , 19 , "Achocalla calle 4 " , " Femenino ");
        Cliente Cli5 = new Cliente(" Jima " , " Mayta " , 18 , "Achocalla calle 5 " , " Femenino ");

        PilaCliente Pcliente = new PilaCliente(10);

        Pcliente.Adicionar(Cli1);
        Pcliente.Adicionar(Cli2);
        Pcliente.Adicionar(Cli3);
        Pcliente.Adicionar(Cli4);
        Pcliente.Adicionar(Cli5);




        Pcliente.Mostrar();
        //moyoresCiertaEdad(Pcliente , 20);
        //KaesimoPosicion(Pcliente,10 );
        //AsignaDireccion(Pcliente,"yarihuaya" );
        ReordenaPila(Pcliente);


    }

    public static void moyoresCiertaEdad ( PilaCliente clientes , int edadMayor)
    {
        PilaCliente aux = new PilaCliente(10);
        int Cont = 0;
        Cliente clienteEliminado = null;
        while (clientes.esVacio() == false) {
            clienteEliminado = clientes.eliminar();
            if (clienteEliminado.getEdad() > edadMayor) {

                Cont = Cont + 1;
            }
            aux.Adicionar(clienteEliminado);
        }

        clientes.Vaciar(aux);

        System.out.println("la cantidad de clientes mayores a 20 años son: " + Cont);

    }

    /*public static void KaesimoPosicion(PilaCliente clientes, int valorTope){
        PilaCliente aux = new PilaCliente(1);
        Cliente clienteEliminado = null;
        Cliente almacli = null;
        while (clientes.esVacio() == false){
            clienteEliminado = clientes.eliminar();
            if (PilaCliente ()+1 == valorTope){
                almacli= clienteEliminado;

            }
            else {
                aux.Adicionar(clienteEliminado);

            }
            clientes.Vaciar(aux);
            aux.Adicionar(almacli);

        }
    }*/
    public static void AsignaDireccion(PilaCliente clientes, String NuevaDireccion){
        PilaCliente aux = new PilaCliente(1);
        Cliente clienteEliminado = null;
        while (clientes.esVacio()){
            clienteEliminado = clientes.eliminar();
            if (clienteEliminado.getGenero().equals("Femenino")){
                clienteEliminado.setDireccion((NuevaDireccion));
            }
            aux.Adicionar(clienteEliminado);
        }
        clientes.Vaciar(aux);
    }
    public static void ReordenaPila(PilaCliente clientes){
        PilaCliente aux = new PilaCliente(1);
        Cliente clienteEliminado = null;
        PilaCliente almacenador = new PilaCliente(1);
        while (clientes.esVacio()){
            clienteEliminado = clientes.eliminar();
            if(clienteEliminado.getGenero().equals("Femenino")){
                almacenador.Adicionar(clienteEliminado);
            }
            else {
                aux.Adicionar(clienteEliminado);
            }
        }
        clientes.Vaciar(aux);
        clientes.Vaciar(almacenador);
    }

}
