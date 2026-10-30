package padroescomportamentais.chainofresponsability;

public class TipoChamadoSenha implements TipoChamado {
    private static TipoChamadoSenha tipoChamadoSenha = new TipoChamadoSenha();

    private TipoChamadoSenha() {}

    public static TipoChamadoSenha getTipoChamadoSenha() {
        return tipoChamadoSenha;
    }
}
