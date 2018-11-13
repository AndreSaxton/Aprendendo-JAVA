/**
 * aula08
 */
public class aula08 {
    public static void main(String[] args) {
        lutador[] lut = new lutador[]{
            new lutador("gersom", "br", 28, 1.77f, 55.4f, "pena", 1, 2, 3),
            new lutador("drucival", "br", 28, 1.77f, 55.4f, "pena", 1, 2, 3),
            new lutador("aaa", "br", 28, 1.77f, 55.4f, "pena", 1, 2, 3),
            new lutador("bbb", "br", 28, 1.77f, 55.4f, "pena", 1, 2, 3)
        };
        for (int iLut = 0; iLut < lut.length; iLut++) {
            String stats [] = lut[iLut].status();
            for (int iLutProp = 0; iLutProp < stats.length; iLutProp++) {
                System.out.println(stats[iLutProp]);
            }
            System.out.println("-----------------------");
        }
    }    
}