public abstract class ClienteBanco implements Verifica {
    private int numeroConta = 0;
    private String nome = "";
    private Endereco endr = new Endereco();

    public abstract void verifDoc();

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) throws NumException {
        if(numeroConta >= 0) {
            this.numeroConta = numeroConta;
        }
        else {
            throw new NumException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndr() {
        return endr;
    }

    public void setEndr(Endereco endr) {
        this.endr = endr;
    }

    @Override
    public void validar() {
        if(numeroConta % 2 == 0) {
            System.out.println("É par!");
        } else {
            System.out.println("É ímpar!");
        }
    }
}
