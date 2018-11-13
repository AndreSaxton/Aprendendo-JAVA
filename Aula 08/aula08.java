/**
 * aula08
 */
public class aula08 {
    public static void main(String[] args) {
        Lutador[] lut = new Lutador[]{
            new Lutador("gersom", "br", 28, 1.77f, 55.4f, "pena", 1, 2, 3),
            new Lutador("drucival", "br", 28, 1.77f, 65.4f, "pena", 1, 2, 3),
            new Lutador("aaa", "br", 28, 1.77f, 95.4f, "pena", 1, 2, 3),
            new Lutador("bbb", "br", 28, 1.77f, 105.4f, "pena", 1, 2, 3)
        };
        /*for (int iLut = 0; iLut < lut.length; iLut++) {
            String stats [] = lut[iLut].status();
            for (int iLutProp = 0; iLutProp < stats.length; iLutProp++) {
                System.out.println(stats[iLutProp]);
            }
            System.out.println("-----------------------");
        }//*/

        Luta UFC01 = new Luta();
        boolean lutaAprovada = UFC01.marcarLuta(lut[2], lut[3]);
        if (lutaAprovada) {
            System.out.println("Luta aprovada");
            System.out.println(UFC01.lutar());
        }
        else {
            System.out.println("Luta nao aprovada");
        }
    }    
}