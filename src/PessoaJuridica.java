public class PessoaJuridica extends ClienteBanco{
    private long cnpj = 0;
    private PessoaFisica responsavel = new PessoaFisica();

    @Override
    public void verifDoc() {
        if (getResponsavel().getNome().length()>30){
            System.out.println("Nome do responsável inválido");
        }else {
            System.out.println("Nome do Responsável Válido");
        }
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }
}