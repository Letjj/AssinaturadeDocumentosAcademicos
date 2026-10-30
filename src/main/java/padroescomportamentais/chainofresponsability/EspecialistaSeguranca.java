package padroescomportamentais.chainofresponsability;

public class EspecialistaSeguranca extends AnalistaSuporte {
    public EspecialistaSeguranca(AnalistaSuporte superior) {
        listaChamados.add(TipoChamadoSeguranca.getTipoChamadoSeguranca());
        setAnalistaSuperior(superior);
    }

    @Override
    public String getDescricaoCargo() {
        return "Especialista em Segurança";
    }
}
