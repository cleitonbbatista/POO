package ads.poo;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class Telefone {

    private String valor;
    private String eR = "^[0-9]{13,13}+$";
    private String mascara = "+## (##) #####-###";
    private String resultado;

    public Telefone(String valor) {
        if (valor.matches(eR)) {
            this.valor = valor;
        } else {
            return;
        }
        
    }

    public String toString() {
        try {
            MaskFormatter mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }

}
