package banco;

import java.util.Date;

public class ContaComum {
    private int num;
    private double saldo;
    private Extrato[] extrato = new Extrato[100];
    private int pos = 0;
    private Pessoa dono;



    public ContaComum(int n, Pessoa p) {
        num = n;
        if (p.getConta() == null) {
            dono = p;
            p.setConta(this);
        } else {
            System.out.println("Essa pessoa já possui uma conta");
            return;
        }
    }

    public void credito(double val) {
        saldo = saldo + val;
        extrato[pos++] = new Extrato("Credito", val, saldo, new Date());
    }

    public void debito(double val) {
        if (val <= saldo) {
            saldo = saldo - val;
            extrato[pos++] = new Extrato("Debito", val, saldo,new Date());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        if (n < 1000) {
            num = n;
        } else {
            System.out.println("Não é permitido usar numeros maiores que 1000");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getExtrato(Date Datini, Date Datfini) {// receber duas strings, uma no começo da operação e outra no final da operação.
        String ext = "";
        for (int i = 0; i < pos; i++) {
            if(((Datini.compareTo(extrato[i].getdata())< 0) && ((Datfini.compareTo(extrato[i].getdata())> 0)))){
                ext = ext + extrato[i].getLinha();
            }
        }
        return ext;
    }

    public Pessoa getDono() {
        return dono;
    }

}
