package padroescomportamentais.chainofresponsability;

public class SuporteNivel3 extends AnalistaSuporte {
    public SuporteNivel3(AnalistaSuporte superior) {
        listaChamados.add(TipoChamadoRede.getTipoChamadoRede());
        setAnalistaSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte Nível 3";
    }
}
