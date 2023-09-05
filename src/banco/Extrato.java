package banco;

import java.util.Date;

public class Extrato {
    private Date data;
    private String operacao;
    private double valor;
    private double saldo;

    public Extrato(String op, double v, double s,Date dat) {
        operacao = op;
        valor = v;
        saldo = s;
        data = dat;
    }
    public void setdata(Date data){
        this.data = data;
    }
    public Date getdata(){
        return data;
    }
    public String getLinha() {
        return "( " + data +" )\n"  +operacao + ": " + valor + " Saldo: " + saldo + "\n"+"( " + new Date() +" )"+"\n ________________________________\n";
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
