package br.com.validators;

/**
 *
 * @author Rosicléia Frasson
 */
public class Validadores {

    public static boolean SoNumeros(String texto) {
        for (char letra : texto.toCharArray()) {
            if (letra < '0' || letra > '9') {
                return false;
            }
        }
        return true;

    }


    public static boolean verificaNome(String texto) {
        if (texto.length() != 0) {
            return false;
        } else {
            for (char letra : texto.toCharArray()) {
                if (letra < '0' || letra > '9') {
                    return false;
                }
            }
        }
        return true;
    }
}