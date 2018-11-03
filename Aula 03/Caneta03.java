/**
 * Caneta
 */
public class Caneta03 {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carrga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    public void rabiscar(){
        if (this.tampada==true) {
            System.out.println("Não pode rabiscar");
        }
        else{
            System.out.println("Rabiscando");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}