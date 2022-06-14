package Strategy;

public class ChuteColocado implements Potencia {

    public float calcular(float forca, float velocidade) {
        return (1.5f * velocidade) + (1.5f * forca);
    }

}
