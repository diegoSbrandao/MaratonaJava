package br.com.maratonajava.wrapper.testes;

public class WrapperTeste {
    public static void main(String[] args) {


        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'C';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 10;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'C';
        Boolean booleanWrapper = true;

        String valor = "33";
        //Float f = new Float(valor);
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('d'));
        System.out.println(Character.isLetter('d'));
        System.out.println(Character.isLetterOrDigit('d'));


    }
}
