import java.util.Scanner;

public class Frota extends Locacao{

    Scanner entrada = new Scanner(System.in);

    private String Marca, Modelo, Placa;
    private float kilometragem;
    


    public String getMarca(){    return this.Marca;   }
    public String getModelo(){        return this.Modelo;    }
    public String getPlaca(){        return this.Placa;    }
    public float getKilometragem(){        return this.kilometragem;    }

    public void setMarca(String Marca){     this.Marca = Marca;   }
    public void setModelo(String Modelo){   this.Modelo = Modelo;    }
    public void setPlaca(String Placa){         this.Placa = Placa;    }
    public void setkilometragem(float kilometragem){         this.kilometragem = kilometragem;    }

    public Frota cadastro(Frota novoFrota){

        System.out.println("Digite a Marca do veiculo:");
        this.Marca = entrada.next();
        entrada.nextLine();
        System.out.println("Digite a Modelo do veiculo:");
        this.Modelo = entrada.next();
        entrada.nextLine();
        System.out.println("Digite a Placa do veiculo:");
        this.Placa = entrada.next();
        entrada.nextLine();
        System.out.println("Digite a kilometragem do veiculo:");
        this.kilometragem = entrada.nextFloat();

        System.out.println("Cadastro realizado com sucesso!!!");
        return novoFrota;
    }
}
