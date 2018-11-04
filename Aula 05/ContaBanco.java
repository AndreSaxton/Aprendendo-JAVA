
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("--------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.status);
    }
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t == "CC") {
            setSaldo(50);
        } else {
            setSaldo(150);
        }
    }
    public void fecharConta() {
        if (getSaldo()>0) {
            System.out.println("Conta com dinheiro");
        } else if(getSaldo()<0){
            System.out.println("Conta em debito");
        } else {
            setStatus(false);
            System.out.println("Conta fechado com sucesso");
        }
    }
    public void depositar(float v) {
        if (getStatus()) {
            setSaldo(getSaldo()+v);
        } else {
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float v) {
        if (getStatus() && getSaldo()>=v) {
            setSaldo(getSaldo()-v);
        } else {
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensalidade() {
        float v;
        if (getTipo()=="CC") {
            v = 12;
        } else {
            v = 20;
        }
        if (getStatus() && getSaldo()>v) {
            setSaldo(getSaldo()-v);
        } else {
            System.out.println("Impossivel pagar");
        }
    }
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean b) {
        this.status = b;
    }
}