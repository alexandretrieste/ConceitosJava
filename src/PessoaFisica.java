public final class PessoaFisica extends ClienteBanco{
    private int cpf = 0;

    @Override
    public void verifDoc() {
        if ((cpf >= 10) && (cpf <= 20)){
            this.cpf = cpf;
            System.out.println("CPF válido");
        }else {
            System.out.println("CPF inválido");
        }
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
