package Strategy;

public class ChutePeitoDoPe implements Potencia{

    public float calcular(float forca, float velocidade) {
        return forca + (2 * velocidade);
    }
}
