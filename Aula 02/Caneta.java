import com.sun.jdi.Method;
//import com.sun.org.apache.xpath.internal.functions.Function;

/**
 * Caneta
 */
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carrga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }
    void rabiscar(){
        if (this.tampada==true) {
            System.out.println("Não pode rabiscar");
        }
        else{
            System.out.println("Rabiscando");
        }
    }
    void tampar (){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}