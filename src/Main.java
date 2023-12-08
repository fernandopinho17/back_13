// Classe abstrata Pessoa
abstract class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método abstrato a ser implementado pelas subclasses
    public abstract void exibirDetalhes();
}

// Subclasse concreta PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    // Método específico para PessoaFisica
    public String getCpf() {
        return cpf;
    }

    // Implementação do método abstrato da classe Pessoa
    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Física - Nome: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + cpf);
    }
}

// Subclasse concreta PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, int idade, String cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }

    // Método específico para PessoaJuridica
    public String getCnpj() {
        return cnpj;
    }

    // Implementação do método abstrato da classe Pessoa
    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Jurídica - Nome: " + getNome() + ", Idade: " + getIdade() + ", CNPJ: " + cnpj);
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", 30, "123.456.789-01");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", 5, "12.345.678/0001-90");

        pessoaFisica.exibirDetalhes();
        pessoaJuridica.exibirDetalhes();
    }
}

