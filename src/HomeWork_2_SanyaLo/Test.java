package HomeWork_2_SanyaLo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером
// 4х4, при подаче массива другого размера необходимо бросить исключение
// MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
// и просуммировать. Если в каком-то элементе массива преобразование не удалось
// (например, в ячейке лежит символ или текст вместо числа), должно быть брошено
// исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключение
// MySizeArrayException и MyArrayDataException, и вывести результат расчета.
public class Test {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] arrString1 = {{"1", " 2", " 3", " 4"}, {" 5", " 6", " 7", " 8"},
                {" 9", "1O", " 10", "11", "11"}, {" 12", " 13", " 14", " 15"}};
        Summ(arrString1);
        String[][] arrString2 = {{"1", " 2", " 3", " 4"}, {" 5", " 6", " 7", " 8"},
                {" 9", " 1O", "11", "12"}, {" 1З", " 14", " 15", " 16"}};
        Summ(arrString2);
    }

    static void Summ(String[][] arrString) throws MyArraySizeException {
        int a = 0;
        int b = 0;

        try {
            if (arrString.length != 4) {
                throw new MyArraySizeException();
            }else {
                for (String[] colon : arrString) {
                    if (colon.length != 4) {
                        throw new MyArraySizeException();
                    }
                }
            }

            int result = 0;

            String[][] arrayString = new String[0][4];
            for (a = 0; a < arrString.length; a++) {
                for (b = 0; b < arrString.length; b++) {
                    result += Integer.parseInt(arrString[a][b]);
                }
            }
            System.out.println("не верно в " + result);

        } catch(NumberFormatException e) {
            throw new MyArrayDataException(a+1, b+1);
        }
    }
}
