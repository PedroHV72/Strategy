package Strategy;

public class ChuteTrivela implements Potencia {

    public float calcular(float forca, float velocidade) {
        return forca + (1.8f * velocidade);
    }

}
