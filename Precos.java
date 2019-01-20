import java.util.Scanner;

public class Precos extends Locacao {

    Scanner entrada = new Scanner(System.in);

    private float ValorDiaria, TaxaKilometragem = 5, ValorCombustivel = 4;


    public float getValorDiaria(){             return this.ValorDiaria;   }
    public float getTaxaKilometragem(){        return this.TaxaKilometragem;    }
    public float getValorCombustivel(){        return this.ValorCombustivel;    }


    public void cadastroPrecos(){

        System.out.println("Digite o valor da diaraia:");
        this.ValorDiaria = entrada.nextFloat();

        System.out.println("Digite a taxa de kilometragem:");
        this.TaxaKilometragem = entrada.nextFloat();

        System.out.println("Digite o valor do combustivel:");
        this.ValorCombustivel = entrada.nextFloat();

        System.out.println("Cadastro realizado com sucesso!!!");
        entrada.nextLine();
    }
}
