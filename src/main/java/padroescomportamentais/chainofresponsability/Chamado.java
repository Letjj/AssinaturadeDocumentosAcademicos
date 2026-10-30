package padroescomportamentais.chainofresponsability;

public class Chamado {
    private TipoChamado tipoChamado;

    public Chamado(TipoChamado tipoChamado) {
        this.tipoChamado = tipoChamado;
    }

    public TipoChamado getTipoChamado() {
        return tipoChamado;
    }

    public void setTipoChamado(TipoChamado tipoChamado) {
        this.tipoChamado = tipoChamado;
    }
}
