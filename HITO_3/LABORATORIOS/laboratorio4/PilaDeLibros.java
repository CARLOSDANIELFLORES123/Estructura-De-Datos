package PilaDeLibros;

public class PilaDeLibros {
    private int max;
    private Libro [] libros  ;
    private int tope;

    public PilaDeLibros(int max){

        this.tope=0;
        this.max=max;
        libros=new Libro[this.max+1];
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
    public void Adicionar(Libro nuevoitem){
        if(this.esLlena() == false){
            this.tope = this.tope + 1;
            this.libros[this.tope] = nuevoitem;
        }else {
            System.out.println("la pila de Libros esta llena ");
        }
    }
    public Libro eliminar(){
        Libro elementoeliminado= null;
        if(this.esVacio() == false){
            elementoeliminado = this.libros[this.tope];
            this.tope = this.tope - 1;
        }else{
            System.out.println("la pila de libros esta vacia ");
        }
        return elementoeliminado;
    }
    public void llenar(){
    }
    public void Mostrar(){
        Libro elem = null;
        if(this.esVacio()== true){
            System.out.println("la pila esta vacia ");
        }else{
            System.out.println("Mostrando la pila de Libros ");
            PilaDeLibros aux = new PilaDeLibros(this.max);
            while( this.esVacio()==false){
                elem = this.eliminar();
                aux.Adicionar(elem);
                elem.mostrarLibro();
            }
            Vaciar(aux);
        }
    }

    public void Vaciar(PilaDeLibros pila ){

        while(pila.esVacio()== false){
            Adicionar(pila.eliminar());
        }
    }

}
