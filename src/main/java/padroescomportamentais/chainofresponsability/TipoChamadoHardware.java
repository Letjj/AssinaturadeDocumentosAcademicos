package padroescomportamentais.chainofresponsability;

public class TipoChamadoHardware implements TipoChamado {
    private static TipoChamadoHardware tipoChamadoHardware = new TipoChamadoHardware();

    private TipoChamadoHardware() {}

    public static TipoChamadoHardware getTipoChamadoHardware() {
        return tipoChamadoHardware;
    }
}
