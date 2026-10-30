package padroescomportamentais.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    EspecialistaSeguranca especialista;
    SuporteNivel3 nivel3;
    SuporteNivel2 nivel2;
    SuporteNivel1 nivel1;

    @BeforeEach
    void setUp() {
        // Monta a cadeia de responsabilidade: Nível 1 -> Nível 2 -> Nível 3 -> Especialista
        especialista = new EspecialistaSeguranca(null);
        nivel3 = new SuporteNivel3(especialista);
        nivel2 = new SuporteNivel2(nivel3);
        nivel1 = new SuporteNivel1(nivel2);
    }

    @Test
    void deveRetornarSuporteNivel1ParaSenha() {
        assertEquals("Suporte Nível 1", nivel1.resolverChamado(new Chamado(TipoChamadoSenha.getTipoChamadoSenha())));
    }

    @Test
    void deveRetornarSuporteNivel2ParaHardware() {
        assertEquals("Suporte Nível 2", nivel1.resolverChamado(new Chamado(TipoChamadoHardware.getTipoChamadoHardware())));
    }

    @Test
    void deveRetornarSuporteNivel2ParaSoftware() {
        assertEquals("Suporte Nível 2", nivel1.resolverChamado(new Chamado(TipoChamadoSoftware.getTipoChamadoSoftware())));
    }

    @Test
    void deveRetornarSuporteNivel3ParaRede() {
        assertEquals("Suporte Nível 3", nivel1.resolverChamado(new Chamado(TipoChamadoRede.getTipoChamadoRede())));
    }

    @Test
    void deveRetornarEspecialistaParaSeguranca() {
        assertEquals("Especialista em Segurança", nivel1.resolverChamado(new Chamado(TipoChamadoSeguranca.getTipoChamadoSeguranca())));
    }

    @Test
    void deveRetornarNaoResolvidoParaChamadoDesconhecido() {
        // Simulando um tipo de chamado que ninguém na cadeia trata
        TipoChamado tipoDesconhecido = new TipoChamado() {};
        assertEquals("Chamado não resolvido", nivel1.resolverChamado(new Chamado(tipoDesconhecido)));
    }
}