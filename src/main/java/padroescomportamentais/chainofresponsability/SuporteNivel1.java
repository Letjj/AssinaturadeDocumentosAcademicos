package padroescomportamentais.chainofresponsability;

public class SuporteNivel1 extends AnalistaSuporte {
    public SuporteNivel1(AnalistaSuporte superior) {
        listaChamados.add(TipoChamadoSenha.getTipoChamadoSenha());
        setAnalistaSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Suporte Nível 1";
    }
}
