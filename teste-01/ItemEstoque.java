public class ItemEstoque {
    private String nome;
    private int quantidade;


    public ItemEstoque(String nome, int quantidadeInicial) {
        this.nome = nome;
        if (quantidadeInicial < 0) {
            this.quantidade = 0; 
        } else {
            this.quantidade = quantidadeInicial;
        }
    }

    // Método para retirar unidades do estoque
    public boolean retirar(int quantidadeRetirada) {
        if (quantidadeRetirada <= 0) {
            System.out.println("Se quer alguma caneta, adicione uma valor mair que 0.");
            return false;
        }
        if (quantidadeRetirada <= quantidade) {
            quantidade -= quantidadeRetirada;
            return true;
        } else {
            System.out.println("Não temos tudo isso, solicite uma outra quantidade.");
            return false;
        }
    }


    public void exibirInformacoes() {
        System.out.println("Item: " + nome + ", Quantidade: " + quantidade);
    }


    public static void main(String[] args) {

        ItemEstoque item = new ItemEstoque("Caneta Azul", 50);


        item.retirar(10);


        item.exibirInformacoes();
    }
}
