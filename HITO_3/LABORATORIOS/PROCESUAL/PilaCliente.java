package PilaDeClientes;

public class PilaCliente {
    private int max;
    private Cliente [] clientes;
    private int tope;

    public PilaCliente(int max){
        this.tope=0;
        this.max=max;
        clientes=new Cliente[this.max+1];

    }
    public boolean esVacio(){
        if(tope==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean esLlena(){
        if(tope==max){
            return true;
        }else{
            return false;
        }
    }
    public int nroElem(){
        return this.tope;
    }
    public void Adicionar(Cliente nuevoitem){
        if(this.esLlena() == false){
            this.tope = this.tope + 1;
            this.clientes[this.tope] = nuevoitem;
        }else {
            System.out.println("la pila de Clientes esta llena ");
        }
    }
    public Cliente eliminar(){
        Cliente elementoeliminado= null;
        if(this.esVacio() == false){
            elementoeliminado = this.clientes[this.tope];
            this.tope = this.tope - 1;
        }else{
            System.out.println("la pila de Clientes esta vacia ");
        }
        return elementoeliminado;
    }
    public void llenar(){
    }

    public void Mostrar(){
        Cliente elem = null;
        if(this.esVacio()== true){
            System.out.println("la pila esta vacia ");
        }else{
            System.out.println("Mostrando la pila de Clientes ");
            PilaCliente aux = new PilaCliente(this.max);
            while( this.esVacio()==false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                elem.muestraCliente();
            }
            Vaciar(aux);
        }
    }
    public void Vaciar(PilaCliente pila){
        while(pila.esVacio()== false){
            Adicionar(pila.eliminar());
        }
    }

}
