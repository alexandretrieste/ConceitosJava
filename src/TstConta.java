public class TstConta {
    public static void main(String[] args) throws NumException {
        PessoaJuridica pj = new PessoaJuridica();
        try {
            pj.setNumeroConta(10);
        } catch (NumException ne) {
            ne.impMsg();
        }
        pj.setCnpj(55);
        pj.getEndr().setRua("xxxx");
        pj.getEndr().setNum(255);
        pj.getResponsavel().setCpf(20);
        pj.getResponsavel().setNome(("O Responsável pela conta sou"));

        System.out.println("Nro da Conta: "+pj.getNumeroConta());
        System.out.println("Par ou ímpar? ");
        pj.validar();
        System.out.println("Nro CNPJ: "+pj.getCnpj()+"\nRua: "+pj.getEndr().getRua()+", "+pj.getEndr().getNum());
        System.out.println("CPF do responsável pela conta: "+pj.getResponsavel().getCpf());
        pj.getResponsavel().verifDoc();
        System.out.println("Nome do responsável pela conta: "+pj.getResponsavel().getNome());
        pj.verifDoc();
    }
}