import java.util.Scanner;

public class Clientes{

    Scanner entrada = new Scanner(System.in);

    private String Nome;
    private int NumeroHabilitacao;


    public String getNome(){    return this.Nome;   }
    public int getCnh(){        return this.NumeroHabilitacao;    }

    public void setNome(String Nome){     this.Nome = Nome;   }
    public void setCnh(int Cnh){         this.NumeroHabilitacao = Cnh;    }

    public Clientes cadastro(Clientes novoCliente){

        System.out.println("Digite o nome do cliente:");
        this.Nome = entrada.next();
        entrada.nextLine();
        System.out.println("Digite o numero de habilitcao do cliente:");
        this.NumeroHabilitacao = entrada.nextInt();

        System.out.println("Cadastro realizado com sucesso!!!");
        return novoCliente;
    }
}
