package ManejoDePilas;

public class Pilanumeros {
    private int max;
    private int  [] pilanum ;
    private int tope;



    public Pilanumeros(int max){

        this.tope=0;
        this.max=max;
        pilanum=new int [this.max+1];

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

    public void Adicionar(int nuevoitem){
        if(this.esLlena() == false){
            this.tope = this.tope + 1;
            this.pilanum[this.tope] = nuevoitem;
        }else {
            System.out.println("la pila de nuermos esta llena ");
        }


    }
    public int eliminar(){

        int elementoeliminado= 0;

        if(this.esVacio() == false){
            elementoeliminado = this.pilanum[this.tope];
            this.tope = this.tope - 1;
        }else{
            System.out.println("la pila de nuermos esta vacia ");
        }

        return elementoeliminado;




    }
    public void llenar(){


    }

    public void Mostrar(){

        int elem;
        if(this.esVacio()== true){
            System.out.println("la pila esta vacia ");
        }else{
            System.out.println(" datos de la pila ");
            Pilanumeros aux = new Pilanumeros(max);
            while( this.esVacio()==false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                System.out.println("Elemento : " + elem);
            }
            Vaciar(aux);
        }
    }

    public void Vaciar(Pilanumeros a ){

        while(a.esVacio()== false){

            Adicionar(a.eliminar());
        }


    }
}

