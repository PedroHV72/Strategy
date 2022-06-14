package Strategy;

public class Chuteira {

    private float forca;
    private float velocidade;

    public Chuteira(float forca, float velocidade) {
        this.forca = forca;
        this.velocidade = velocidade;
    }

    public float calcularPotencia(Potencia potencia) {
        return potencia.calcular(forca, velocidade);
    }
}
