public final class PessoaFisica extends ClienteBanco{
    private int cpf = 0;
    private PessoaJuridica pj;

    @Override
    public void verificaDoc() {
        if ((cpf >= 10) && (cpf <= 20)){
            this.cpf = cpf;
            System.out.println("CPF válido");
        }else {
            System.out.println("CPF inválido");
        }
    }

    public PessoaJuridica getPj() {
        return pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
