import java.util.Scanner;

class gameNumber {
    public static void main(String[] args) {

        int s = 0;
        int b = 0;
        int i = 0;
        int ii = 0;
        int[] arr = new int[100];
        int[] arr2 = new int[100];
        String j = "RESULT";
        int min = 1;
        int max = 100;
        for (i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            int a = min + (int) (Math.random() * ((max - min) + 1));

            for (i = 1; i < arr.length; i++) {
                s = ii++;
                System.out.println("Введите целое число от 1 до 10");
                Scanner input = new Scanner(System.in);
                String day = input.nextLine();


                if (j.equals(day)) {

                    int smallest = 0;
                    System.out.println("Текущее количество попыток = " + s);

                    for ( i = 0; i < arr.length; i++) {
                        if (smallest == 0 || (arr[i] < smallest && arr[i] != 0)) {
                            smallest = arr[i];
                        }
                    }
                    System.out.println("Количество попыток в лучшей игре = " + smallest);
                    break;
                }
                b = Integer.parseInt(day);

                if (b < 1 || b > 100 || b == 0) {
                    System.out.println("Число должно быть в диапозоне от 1 до 10");
                } else if (a > b) {
                    System.out.println("Я сам в шоке, но, загаданное число больше, брат");
                } else if (a < b) {
                    System.out.println("Не ожидал от тебя такого. Загаданное число меньше,брат");
                } else if (a == b) {
                    System.out.println("Ура вы угадали \nТекущее количество попыток = " + ii + " , Это число " + b);
                    arr[i] = i - 1;
                    arr[i] = ii;
                    ii = 0;
                    break;
                }
            }
        }
    }
}





















