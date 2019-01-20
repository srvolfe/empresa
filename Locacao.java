import java.util.Scanner;
import java.util.ArrayList;


public class Locacao{

    Scanner entrada = new Scanner(System.in);
    private Boolean Alugado = false;
    private int quantidadeDeLocacoes = 0;
    private String Marca, Modelo, Placa, Locador;
    private float Kilometragem, kmRodado, gastoCombustivel, valorCombustivel, ValorDiaria, taxaKm, valorRodado ,gastoDiaria;
    private int Cnh, diasUsados;



    public String getMarca(){        return this.Marca;    }
    public String getModelo(){        return this.Modelo;    }
    public String getPlaca(){        return this.Placa;    }
    public String getLocador(){        return this.Locador;    }
    public float getkilometragem(){        return this.Kilometragem;    }
    public float getKmrodado(){        return this.kmRodado;    }
    public int getCnh(){        return this.Cnh;    }
    public int getDiasUsados(){        return this.diasUsados;    }
    public Boolean getAlugado(){        return this.Alugado;    }
    public  float getTotal(){ return this.gastoDiaria + this.valorRodado + this.gastoCombustivel;}
    public  float getGastoDiaria(){ return this.gastoDiaria ;}
    public  float getGastoCombustivel(){ return this.gastoCombustivel ;}

    public void setDiasUsados(int qntd) { this.diasUsados= qntd; this.gastoDiaria = this.diasUsados * this.ValorDiaria;}
    public void setKmUsado(float kms){ this.kmRodado = kms; this.valorRodado = this.kmRodado * this.taxaKm;}
    public void setGasolina(float gas){ this.gastoCombustivel = gas * this.valorCombustivel; }



/*
    public void devolucaoLocacao(){
        System.out.println("Digite quantos dias ficou locado o veiculo:");
        this.diasUsados = entrada.nextInt();
        this.gastoDiaria = this.diasUsados * this.ValorDiaria;

        System.out.println("Kilometragem rodada:");
        this.kmRodado = entrada.nextFloat();
        this.valorRodado = this.kmRodado * this.taxaKm;

        System.out.println("quantos litro de combustivel para completar o tanque:");
        this.gastoCombustivel = entrada.nextFloat() * this.valorCombustivel;

        float total = this.gastoDiaria + this.valorRodado + this.gastoCombustivel;
        System.out.println("Total da locação R$" + total);
    }

*/

    public Locacao cadastroLocacao(Locacao novaLocacao, ArrayList vetorfrota, ArrayList vetorCliente, Precos valores){

          int i = 0, escolha;
          System.out.println("\nTabela de precos:");
          System.out.println("Taxa de kilometragem: " + valores.getTaxaKilometragem());
          System.out.println("Valor da diaria: " + valores.getValorDiaria());
          System.out.println("Preco do combustivel: " + valores.getValorCombustivel() + "\n");
          this.valorCombustivel = valores.getValorCombustivel();
          this.taxaKm = valores.getTaxaKilometragem();
          this.ValorDiaria = valores.getValorDiaria();


          System.out.println("Escolha um modelo: ");
          while (i < vetorfrota.size()){
            Frota posicaoo = (Frota) vetorfrota.get(i);
            System.out.println("\nOPCAO: " + i);
            System.out.println("Marca: " + posicaoo.getMarca());
            System.out.println("Modelo: " + posicaoo.getModelo() + "\n");
            i++;
          }

          Frota modelo = (Frota) vetorfrota.get(entrada.nextInt());

            this.Marca = modelo.getMarca();
            this.Modelo = modelo.getModelo();
            this.Placa = modelo.getPlaca();
            this.Kilometragem = modelo.getKilometragem();


          System.out.println("Escolha um cliente: ");
          i=0;
          while (i < vetorCliente.size()){
            Clientes posicaoo = (Clientes) vetorCliente.get(i);
            System.out.println("\nOPCAO: " + i);
            System.out.println("Nome: " + posicaoo.getNome() + "\n");
            i++;
          }
          Clientes locador = (Clientes) vetorCliente.get(entrada.nextInt());
          this.Locador = locador.getNome();
          //this.Cnh = locador.getChn();

        System.out.println("Cliente slecionado: "+ locador.getNome());
        System.out.println("Modelo slecionado: "+ modelo.getModelo());

        this.quantidadeDeLocacoes++;
        this.Alugado = true;
        System.out.println("Locacao realizada com sucesso!!!");

        return novaLocacao;

    }
}
