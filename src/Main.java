public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void taskHeader(int number, String caption) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("|| Задача " + number + ": " + caption + " ||");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }


    public static void task1() {
        taskHeader(1, "Объявление массивов");
        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        boolean[] arr3 = {true, false, false};

    }

    public static void task2() {
        taskHeader(2, "Вывод массивов");
        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        boolean[] arr3 = {true, false, false};

        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[arr1.length - 1]);

        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[arr2.length - 1]);

        for (int i = 0; i < arr3.length - 1; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[arr3.length - 1]);
    }

    public static void task3() {
        taskHeader(3, "вовиссам довыВ");
        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        boolean[] arr3 = {true, false, false};

        for (int i = arr1.length - 1; i > 0; i--) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[0]);

        for (int i = arr2.length - 1; i > 0; i--) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.println(arr2[0]);

        for (int i = arr3.length - 1; i > 0; i--) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println(arr3[0]);
    }

    public static void task4() {
        taskHeader(4, "Нечётное -> чётное");
        int[] arr1 = new int[]{1, 2, 3};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
        }
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ", ");
        }
        System.out.println(arr1[arr1.length - 1]);
    }

    public static void task5() {

        // пока не совсем понимаю, как это работает
        final String ANSI_RESET = "\u001B[0m";                  //возвращает цвет текста в консоли к значению по умолчанию
        final String ANSI_GREEN = "\u001B[32m";                 //меняет цвет текста в консоли на зелёный
        //=========================================

        taskHeader(5, "The Matrix");              //Wake up, Neo...
        byte matrixSize = 6;                                    //размер матрицы
        int[][] theMatrix = new int[matrixSize][matrixSize];    //объявление двумерного массива
        int count = 1;
        for (int j = 0; j < matrixSize; j++) {                  //проходим по рядам
            for (int i = 0; i < matrixSize; i++) {              //проходим по столбцам

                theMatrix[i][j] = count + i;
                if (count + i == matrixSize) break;
            }
            count++;
        }
        for (int j = 0; j < matrixSize; j++) {                  //проходим по рядам
            for (int i = 0; i < matrixSize - 1; i++) {          //проходим по столбцам
                if (theMatrix[i][j] > 0) {
                    System.out.print(ANSI_GREEN + theMatrix[i][j] + ", " + ANSI_RESET);       //вывод ненулевых элементов матрицы зелёным цветом
                } else
                    System.out.print(theMatrix[i][j] + ", ");                                 //вывод нулевых элементов матрицы цветом по умолчанию
            }
            if (theMatrix[matrixSize - 1][j] > 0) {
                System.out.println(ANSI_GREEN + theMatrix[matrixSize - 1][j] + ANSI_RESET);
            } else System.out.println(theMatrix[matrixSize - 1][j]);
        }
    }
}