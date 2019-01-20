import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

class main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);



        ArrayList ArrayClientes = new ArrayList();
        ArrayList ArrayFrota = new ArrayList();
        ArrayList ArrayLocacao = new ArrayList();
        Precos tabelaPrecos = new Precos();
        int escolha, i=0, temp;
        float soma = 0;


        while (i < 2){
          Clientes clienteAdd = new Clientes();
          clienteAdd.setNome("Nome " + i);
          clienteAdd.setCnh(i);
          ArrayClientes.add(clienteAdd);

          Frota frotaAdd = new Frota();
          frotaAdd.setMarca("Marca " + i);
          frotaAdd.setModelo("Modelo " + i);
          frotaAdd.setkilometragem(i);
          frotaAdd.setPlaca("Placa " + i);
          ArrayFrota.add(frotaAdd);


          i++;
        }

        do{
            System.out.println("\nDigite 1 para cadastrar clientes");
            System.out.println("Digite 2 para cadastrar Frota");
            System.out.println("Digite 3 para cadastrar precos");
            System.out.println("Digite 4 para cadastrar  a locacao de um veiculo");
            System.out.println("Digite 5 para Listar os clientes cadastrados");
            System.out.println("Digite 6 para Listar os veiculos da frota");
            System.out.println("Digite 7 para Listar as Locacoes");
            System.out.println("Digite 8 para Calcular o total das diarias");
            System.out.println("Digite 9 para Calcular o total da quilometragem");
            System.out.println("Digite 10 para Calcular o total da reposicao do combustivel");
            System.out.println("Digite 11 para Calcular o total final da locacao");
            System.out.println("Digite 12 para Listar os dados da locacao (extrato para o cliente)");
            System.out.println("Digite 100 para sair\n");

            escolha = entrada.nextInt();

            switch(escolha){
                case 1:
                    Clientes novoCliente = new Clientes();
                    novoCliente.cadastro(novoCliente);
                    ArrayClientes.add(novoCliente);
                    break;

                case 2:
                    Frota novoVeiculo = new Frota();
                    novoVeiculo.cadastro(novoVeiculo);
                    ArrayFrota.add(novoVeiculo);
                    break;

                case 3:
                    tabelaPrecos.cadastroPrecos();


                case 4:
                    i=0;
                    System.out.println("Ja possui cadastro?");
                    System.out.println("(1) para sim.");
                    System.out.println("(2) para nao.");
                    escolha = entrada.nextInt();
                    if (escolha == 2){
                      Clientes novoCadastro = new Clientes();
                      novoCadastro.cadastro(novoCadastro);
                      ArrayClientes.add(novoCadastro);
                    }

                    Locacao novaLocacao = new Locacao();
                    novaLocacao.cadastroLocacao(novaLocacao, ArrayFrota, ArrayClientes, tabelaPrecos);
                    ArrayLocacao.add(novaLocacao);
                    break;


                case 5:
                    System.out.println("Quantidade de clientes cadastrados: " + ArrayClientes.size());
                    temp =  ArrayClientes.size();
                    i=0;
                    while( i < temp){
                        Clientes posicao = (Clientes) ArrayClientes.get(i);
                        System.out.println("Nome do Cliente: " + posicao.getNome());
                        System.out.println("Numero Cnh: " + posicao.getCnh() + "\n");
                        i++;
                    }
                    break;

                case 6:
                    System.out.println("Frota cadastrada: " + ArrayFrota.size());
                    temp =  ArrayFrota.size();
                    i=0;
                    while( i < temp){
                        Frota posicaoo = (Frota) ArrayFrota.get(i);
                        System.out.println("\nMarca do veiculo: " + posicaoo.getMarca());
                        System.out.println("Modelo do veiculo: " + posicaoo.getModelo());
                        System.out.println("Placa do veiculo: " + posicaoo.getPlaca());
                        System.out.println("kilometragem do veiculo: " + posicaoo.getkilometragem() + "\n");
                        i++;
                    }
                    break;

                case 7:
                    System.out.println("Locacoes cadastradas: " + ArrayLocacao.size());
                    temp =  ArrayLocacao.size();
                    i=0;
                    while( i < temp){
                        Locacao cliente = (Locacao) ArrayLocacao.get(i);
                        System.out.println("\nCliente: " + cliente.getLocador());
                        System.out.println("Cnh: " + cliente.getCnh());
                        System.out.println("Marca do veiculo: " + cliente.getMarca());
                        System.out.println("Modelo do veiculo: " + cliente.getModelo());
                        System.out.println("Placa do veiculo: " + cliente.getPlaca());
                        System.out.println("kilometragem rodada: " + cliente.getKmrodado());
                        System.out.println("Quantidade de dias locado: " + cliente.getKmrodado() + "\n");
                        i++;
                    }
                    break;

                  case 8:
                    i=0;
                   soma = 0;
                    while(i < ArrayLocacao.size()){
                      Locacao diarias = (Locacao) ArrayLocacao.get(i);
                      soma += diarias.getGastoDiaria();
                      i++;
                    }
                    System.out.println("Total de todas as Diarias: " + soma + "\n");
                    break;

                case 9:
                  i=0;
                 soma = 0;
                  while(i < ArrayLocacao.size()){
                    Locacao kilometragens = (Locacao) ArrayLocacao.get(i);
                    soma += kilometragens.getKmrodado();
                    i++;
                  }
                  System.out.println("Total de kilometragem rodada dos veiculos: " + soma + "\n");
                  break;

                case 10:
                  i=0;
                 soma = 0;
                  while(i < ArrayLocacao.size()){
                    Locacao combustivel = (Locacao) ArrayLocacao.get(i);
                    soma += combustivel.getGastoCombustivel();
                    i++;
                  }
                  System.out.println("Total de todas as reposicoes de combustivel: " + soma + "\n");
                  break;

                case 11:
                System.out.println("Escolha qual veiculo a ser devolvido");

                i=0;
                while(i < ArrayLocacao.size()){
                  Locacao tempDevolucao = (Locacao) ArrayLocacao.get(i);

                  if (tempDevolucao.getAlugado() == true){
                    System.out.println(i);
                    System.out.println(tempDevolucao.getLocador());
                    System.out.println(tempDevolucao.getModelo() + "\n");
                  }
                  i++;
                }
                System.out.println("Qual deseja devolver");

                Locacao tempDevolucao = (Locacao) ArrayLocacao.get(entrada.nextInt());

                    System.out.println("Digite quantos dias ficou locado o veiculo:");
                    tempDevolucao.setDiasUsados(entrada.nextInt());

                    System.out.println("Kilometragem rodada:");
                    tempDevolucao.setKmUsado(entrada.nextFloat());

                    System.out.println("quantos litro de combustivel para completar o tanque:");
                    tempDevolucao.setGasolina(entrada.nextFloat());

                    System.out.println("Total da locacao R$" + tempDevolucao.getTotal());
                break;

                  case 12:
                    System.out.println("Escolha qual veiculo a ser devolvido");

                    i=0;
                    while(i < ArrayLocacao.size()){
                       tempDevolucao = (Locacao) ArrayLocacao.get(i);

                      if (tempDevolucao.getAlugado() == true){
                        System.out.println(i);
                        System.out.println(tempDevolucao.getLocador());
                        System.out.println(tempDevolucao.getModelo() + "\n");
                      }
                      i++;
                    }
                    System.out.println("Qual deseja devolver");

                   tempDevolucao = (Locacao) ArrayLocacao.get(entrada.nextInt());

                        System.out.println("Digite quantos dias ficou locado o veiculo:");
                        tempDevolucao.setDiasUsados(entrada.nextInt());

                        System.out.println("Kilometragem rodada:");
                        tempDevolucao.setKmUsado(entrada.nextFloat());

                        System.out.println("quantos litro de combustivel para completar o tanque:");
                        tempDevolucao.setGasolina(entrada.nextFloat());

                        System.out.println("Total da locacao R$" + tempDevolucao.getTotal());
                    break;


                  default:
                    System.out.println("Opcao invalida");
                    break;
                }



        } while(escolha != 100);

    }
}
