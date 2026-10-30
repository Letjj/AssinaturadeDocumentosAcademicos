package padroescomportamentais.chainofresponsability;

public class SuporteNivel2 extends AnalistaSuporte {
    public SuporteNivel2(AnalistaSuporte superior) {
        listaChamados.add(TipoChamadoHardware.getTipoChamadoHardware());
        listaChamados.add(TipoChamadoSoftware.getTipoChamadoSoftware());
        setAnalistaSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte Nível 2";
    }
}
