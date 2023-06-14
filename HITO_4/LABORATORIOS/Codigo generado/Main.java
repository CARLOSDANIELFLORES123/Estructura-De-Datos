package ColaDeClientes;

public class Main {
    public static void main(String[] args) {
        // 1
        Cliente Cli1 = new Cliente(" Jose " , " Oblitas " , 23 ," Bolivia " , " Masculino " , " Silver ");
        Cliente Cli2 = new Cliente(" Miguel " , " Sanchez " , 22 ," Bolivia " , " Masculino " , " Silver ");
        Cliente Cli3 = new Cliente(" Valeria " , " Carpio " , 21 ," Argentina " , " Femenino " , " Gold ");
        Cliente Cli4 = new Cliente(" Amalia " , " Angeles " , 20 ," Brazil " , " Femenino " , " Silver ");
        Cliente Cli5 = new Cliente(" Saul " , " Quispe " , 61 ," Bolivia " , " Masculino " , " Gold ");
        // B
        Cliente Cli6 = new Cliente(" Marcos" , " Oblitas " , 23 ," Bolivia " , " Masculino " , " Silver ");
        Cliente Cli7 = new Cliente(" saul " , " Sanchez " , 22 ," Bolivia " , " Masculino " , " Silver ");
        Cliente Cli8 = new Cliente(" Melanny " , " Carpio " , 21 ," Argentina " , " Femenino " , " Gold ");
        Cliente Cli9 = new Cliente(" Silvia " , " Angeles " , 20 ," Brazil " , " Femenino " , " Silver ");
        Cliente Cli10 = new Cliente(" Elvis " , " Quispe " , 61 ," Bolivia " , " Masculino " , " Gold ");


        Cola_de_Clientes Cola1 = new Cola_de_Clientes(10);

        Cola1.Adicionar(Cli1);
        Cola1.Adicionar(Cli2);
        Cola1.Adicionar(Cli3);
        Cola1.Adicionar(Cli4);
        Cola1.Adicionar(Cli5);


        Cola_de_Clientes ColaB = new Cola_de_Clientes(10);
//
        ColaB.Adicionar(Cli6);
        ColaB.Adicionar(Cli7);
        ColaB.Adicionar(Cli8);
        ColaB.Adicionar(Cli9);
        ColaB.Adicionar(Cli10);




        //Cola1.Mostrar();
        //cambiarTipo(Cola1 , " Gold " , " Bolivia " , " VIP");
        //DeterminarMayor(Cola1 , 60 );
        moviendoClientesentredosColas(Cola1,"Saul",ColaB);

        System.out.println("Cola 1 DESPUES");
        Cola1.Mostrar();
        System.out.println("Cola B DESPUES");
        ColaB.Mostrar();



    }
    public static void cambiarTipo(Cola_de_Clientes cola, String ntipo , String nPais , String nuevotipo) {
        Cola_de_Clientes aux = new Cola_de_Clientes(10);
        Cola_de_Clientes mostrar = new Cola_de_Clientes(10);
        Cliente clienteEliminado = null;

        while (cola.esVacia() == false) {

            clienteEliminado = cola.eliminar();

            if (clienteEliminado.getPais().equals(nPais)) {

                if (clienteEliminado.getTipo().equals(ntipo)) {
                    clienteEliminado.setTipo(nuevotipo);

                }

            }

            aux.Adicionar(clienteEliminado);

        }

        cola.Vaciar(aux);
        cola.Mostrar();

    }
    public static void DeterminarMayor(Cola_de_Clientes cola, int edadd) {

        Cola_de_Clientes aux = new Cola_de_Clientes(10);
        Cola_de_Clientes aux2 = new Cola_de_Clientes(10);
        int Cont = 0;
        Cliente clienteEliminado = null;

        while (cola.esVacia() == false) {

            clienteEliminado = cola.eliminar();
            if (clienteEliminado.getEdad() > edadd) {

                aux.Adicionar(clienteEliminado);
            }
            else{

                aux2.Adicionar(clienteEliminado);

            }


        }

        cola.Vaciar(aux);
        cola.Vaciar(aux2);
        cola.Mostrar();

    }
    public static void moviendoClientesentredosColas
            (Cola_de_Clientes Cola1, String nombre, Cola_de_Clientes ColaB){

        Cola_de_Clientes aux = new Cola_de_Clientes(10);
        Cola_de_Clientes aux1 = new Cola_de_Clientes(10);
        Cliente clienteEliminado = null;
        while(!Cola1.esVacia()) {
            clienteEliminado = Cola1.eliminar();
            if (clienteEliminado.getNombres().equals(nombre)) {
                aux1.Adicionar(clienteEliminado);
            }
            else{
                aux.Adicionar(clienteEliminado);
            }
        }
        Cola1.Vaciar(aux);
        aux.Vaciar(Cola1);
        ColaB.Vaciar(aux1);
        ColaB.Vaciar(aux);
    }
}
