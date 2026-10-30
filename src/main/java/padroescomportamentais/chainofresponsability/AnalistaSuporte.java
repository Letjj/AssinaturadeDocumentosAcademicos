package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class AnalistaSuporte {
    protected ArrayList<TipoChamado> listaChamados = new ArrayList<>();
    private AnalistaSuporte analistaSuperior;

    public AnalistaSuporte getAnalistaSuperior() {
        return analistaSuperior;
    }

    public void setAnalistaSuperior(AnalistaSuporte analistaSuperior) {
        this.analistaSuperior = analistaSuperior;
    }

    public abstract String getDescricaoCargo();

    public String resolverChamado(Chamado chamado) {
        if (listaChamados.contains(chamado.getTipoChamado())) {
            return getDescricaoCargo();
        } else {
            if (analistaSuperior != null) {
                return analistaSuperior.resolverChamado(chamado);
            } else {
                return "Chamado não resolvido";
            }
        }
    }
}