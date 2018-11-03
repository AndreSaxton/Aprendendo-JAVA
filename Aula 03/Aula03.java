/**
 * Aula03
 */
public class Aula03 {
    public static void main(String[] args) {
        Caneta03 c1 = new Caneta03();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;// acesso privado
        c1.carga = 80;
        //c1.tampada = true;// acesso privado
        c1.status();
        c1.rabiscar();
        c1.tampar();
        c1.destampar();
    }
}