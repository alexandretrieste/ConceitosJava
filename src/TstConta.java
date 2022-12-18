public class TstConta {
    public static void main(String[] args) throws NumException {
        PessoaJuridica pj = new PessoaJuridica();
        try {
            pj.setNumeroConta(10);
        } catch (NumException ne) {
            ne.impMsg();
        }
        pj.setCnpj(55);
        pj.setEndr("Rua 25 de março");
        pj.getResponsavel().setCpf(20);
        pj.setNome("ccccccc dddddddd aaaaaaaa gggg");

        System.out.println("Nro da Conta: "+pj.getNumeroConta());
        System.out.println("Par ou ímpar? ");
        pj.validar();
        System.out.println("Nro CNPJ: "+pj.getCnpj()+"\nRua: "+pj.getEndr());
        System.out.println("CPF do responsável pela conta: "+pj.getResponsavel().getCpf());
        pj.getResponsavel().verificaDoc();
        System.out.println("Nome do responsável pela conta: "+pj.getNome());
        pj.verificaDoc();


    }
}