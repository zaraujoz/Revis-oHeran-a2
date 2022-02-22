public class Principal {
    public static void main(String[] args) {
    Novo novo = new Novo();
    novo.setEndereco("Rua José Pereira Mendes 79");
    novo.setPreco(590000.0);
    novo.setPrecoAdicional(50000.0);   
    
    Velho velho = new Velho();
    velho.setEndereco("Rua Campos do Jordão 175");
    velho.setDesconto(10000.0);
    velho.setPreco(180000.0);

    System.out.println("Imóvel Novo:");
    System.out.println(novo.getEndereco());
    System.out.println(novo.getPreco());
    System.out.println(novo.getPrecoAdicional());
    System.out.println("============================");
    System.out.println("Imóvel velho:");
    System.out.println(velho.getEndereco());
    System.out.println(velho.getDesconto());
    System.out.println(velho.getPreco());
    System.out.println("===========================");
    }
}
