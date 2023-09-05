package banco;

import java.util.Date;//JDK 20.

public class UsoDeConta {

    public static void main(String[] args) {
        Date dat = new Date(10,9,9);
        Pessoa p = new Pessoa(1);
        p.setNome("Pedro");

        Pessoa p1 = new Pessoa(2, "João");

        ContaComum c = new ContaComum(1, p);
        ContaComum c1 = new ContaComum(1, p);

//		c1.saldo = 10;
//		c1.num = 10;
        c1.setNum(10);
        c1.setNum(10000);


        c.credito(100);
        c.debito(40);

        Date dat2 = new Date(160,8,8);


        System.out.println("Dono: " + c.getDono().getCpf());
        System.out.println("Nome: " + c.getDono().getNome());
        System.out.println(c.getExtrato(dat,dat2));

    }

}

