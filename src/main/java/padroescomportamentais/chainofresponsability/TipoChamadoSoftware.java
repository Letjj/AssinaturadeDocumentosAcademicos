package padroescomportamentais.chainofresponsability;

public class TipoChamadoSoftware implements TipoChamado {
    private static TipoChamadoSoftware tipoChamadoSoftware = new TipoChamadoSoftware();

    private TipoChamadoSoftware() {}

    public static TipoChamadoSoftware getTipoChamadoSoftware() {
        return tipoChamadoSoftware;
    }
}