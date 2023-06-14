package ColaDeClientes;

public class Cola_de_Clientes {
    private int max;
    private int ini;
    private int fin;
    private Cliente cCliente [];

    public Cola_de_Clientes(int max){

        this.max = max;
        this.cCliente = new Cliente[this.max + 1];
        this.ini = 0;
        this.fin = 0;

    }

    public boolean esVacia(){

        if(this.ini == 0 && this.fin == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esLlena(){

        if(this.ini == this.max){
            return true;
        }else{
            return false;
        }
    }

    public int nroElem(){

        return fin - ini;
    }

    public void Adicionar(Cliente nuevoElem){

        if(esLlena() == false){

            fin++;
            cCliente[fin] = nuevoElem;

        }else{
            System.out.println(" la Cola de Clientes esta Llena ");
        }

    }

    public Cliente eliminar(){

        Cliente elementoeliminado =null;


        if(this.esVacia()== false)
        {
            ini ++;
            elementoeliminado = cCliente[ini];
            if(ini == fin ){
                ini= 0;
                fin = 0;
            }

        }else{
            System.out.println(" la Cola de Clientes esta Vacia ");
        }

        return  elementoeliminado;

    }

    public void Vaciar(Cola_de_Clientes Cola ){

        while(Cola.esVacia()== false){

            Adicionar(Cola.eliminar());
        }

    }



    public void Mostrar()
    {
        if(esVacia()== true){

            System.out.println(" la Cola esta Vacia ");
        }else{

            Cliente elem =null;
            System.out.println(" Mostrando datos de la Cola ");
            Cola_de_Clientes aux = new Cola_de_Clientes(max);
            while(esVacia()== false){

                elem = eliminar();
                aux.Adicionar(elem);
                elem.muestraCliente();
            }
            Vaciar (aux);
        }
    }

}
