package Strategy;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class JogadorTest {

    @Test
    void deveRetornarChutePeitoDoPe() {
        Jogador jogador = new Jogador();
        jogador.chutePeitoDoPe(30.0f, 30.0f);
        assertEquals(90.0f, jogador.getPotencia());
    }

    @Test
    void deveRetornarChuteColocado() {
        Jogador jogador = new Jogador();
        jogador.chuteColocado(20.0f, 20.0f);
        assertEquals(60.0f, jogador.getPotencia());
    }

    @Test
    void deveRetornarChuteTrivela() {
        Jogador jogador = new Jogador();
        jogador.chuteTrivela(25.0f, 25.0f);
        assertEquals(70.0f, jogador.getPotencia());
    }

}
