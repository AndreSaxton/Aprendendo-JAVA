/**
 * ControleRemoto
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }
    @Override public void ligar() {
        setLigado(true);
    }
    @Override public void desligar() {
        setLigado(false);
    }
    @Override public void abrirMenu() {
        System.out.println("-----MENU-----"); 
        System.out.println("Esta ligado? "+getLigado());
        System.out.println("Esta tocando? "+getTocando());
        System.out.println("Volume "+getVolume());
        if (getVolume()!=0) {
            for(int v = 0; v <= getVolume(); v+=10){
                System.out.print("|");
            }
            System.out.println();
        }
        
    }
    @Override public void fecharMenu() {
        System.out.println("Fechando Menu ...");
    }
    @Override public void maisVolume() {
        if (getLigado()) {
            setVolume(getVolume()+5);
        } else {
            System.out.println("Impossivel aumentar volume");
        }
    }
    @Override public void menosVolume() {
        if (getLigado()) {
            setVolume(getVolume()-5);
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }
    @Override public void ligarMudo() {
        if (getLigado() && getVolume()>0) {
            setVolume(0);
        }
    }
    @Override public void desligarMudo() {
        if (getLigado() && getVolume()==0) {
            setVolume(50);
        }
    }
    @Override public void play() {
        if (getLigado() && !getTocando()) {
            setTocando(true);
        }
    }
    @Override public void pause() {
        if (getLigado() && getTocando()) {
            setTocando(false);
        }
    }

    private void setVolume(int v) {
        this.volume = v;
    }
    private int getVolume() {
        return this.volume;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private boolean getLigado() {
        return this.ligado;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }
    private boolean getTocando() {
        return this.tocando;
    }
}