package Strategy;

public class Jogador {

    private float potencia;

    public float getPotencia() {
        return potencia;
    }

    public void chutePeitoDoPe(float forca, float velocidade) {
        Chuteira chuteira = new Chuteira(forca, velocidade);
        this.potencia = chuteira.calcularPotencia(new ChutePeitoDoPe());
    }

    public void chuteColocado(float forca, float velocidade) {
        Chuteira chuteira = new Chuteira(forca, velocidade);
        this.potencia = chuteira.calcularPotencia(new ChuteColocado());
    }

    public void chuteTrivela(float forca, float velocidade) {
        Chuteira chuteira = new Chuteira(forca, velocidade);
        this.potencia = chuteira.calcularPotencia(new ChuteTrivela());
    }

}
