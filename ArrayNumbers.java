import java.util.Scanner;

public class ArrayNumbers {

    static boolean printrepeatedNumber (int[] numbers1, int[] numbers2) {
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; i++) {
                if (numbers1[i] == numbers2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static int[] returnArray() {
        System.out.println("¿Cuantos numeros va a introducir?");
        Scanner array = new Scanner(System.in);
        int[] numbers = new int[array.nextInt()];
        System.out.println("Introduce los numeros");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = array.nextInt();
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers1 = returnArray();
        int[] numbers2 = returnArray();

        boolean repNum = printrepeatedNumber(numbers1, numbers2);
        System.out.println("El numero " + repNum + " existe en ambos arrays");
    }
}