package colas_hito4;

public class ColaDeNumeros {
    private int max;
    private int ini;
    private int fin;
    private int[] Numero;

    public ColaDeNumeros() {

        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.Numero = new int[this.max + 1];

    }

    public boolean esVacia() {

        if (ini == 0 && fin == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean esLlena(){

        if(fin == max){
            return true;
        }else{
            return false;
        }
    }


    public int nroElem(){
        return ini = fin;
    }

    public int getFin() {
        return fin;
    }

    public int getIni() {
        return ini;
    }


    public void Adicionar(int nuevoNumero){

        if(esLlena() == false){
            fin++;
            Numero[fin] = nuevoNumero;

        }else{
            System.out.println(" la Cola de Numeros esta Llena ");
        }

    }



    public int eliminar(){

        int numeroEliminado = 0;

        if(this.esVacia()== false)
        {
            ini = ini + 1;
            numeroEliminado = Numero[ini];
            if(ini == fin ){
                ini= 0;
                fin = 0;
            }
        }else{
            System.out.println(" la Cola de Numeros esta Vacia ");
        }
        return  numeroEliminado;

    }


    public void Vaciar(ColaDeNumeros Cola ){

        while(Cola.esVacia()== false){

            Adicionar(Cola.eliminar());
        }
    }
    public void Mostrar()
    {
        if(esVacia()){

            System.out.println(" la Cola esta Vacia ");
        }else{

            int elemEliminado ;
            System.out.println(" Mostrando datos de la Cola ");
            ColaDeNumeros aux = new ColaDeNumeros();
            while(!esVacia()){

                elemEliminado = eliminar();
                aux.Adicionar(elemEliminado);
                System.out.println(" valor = " + elemEliminado);
            }
            Vaciar (aux);
        }
    }


}