
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println(" Printout Task 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void task2() {
        System.out.println(" Printout Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void task3() {
        int ic;
        System.out.println(" Printout Task 3");
        for (int i = 0; i <= 17; i++) {
            ic = i % 2;
            if (ic == 0 || i == 0) System.out.println("i = " + i);
        }
    }


    public static void task4() {
        System.out.println(" Printout Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("i = " + i);
        }
    }

    public static void task5() {
        int ic1;
        int ic2;
        int ic3;

        System.out.println(" Printout Task 5");
        for (int i = 1904; i <= 2096; i++) {
            ic1 = i % 4;
            ic2 = i % 400;
            ic3 = i % 100;
            if (ic1 == 0 || ic2 == 0 && ic3 != 0) System.out.println("i = " + i + " високосный год");
        }
    }

    public static void task6() {
        int ic;


        System.out.println(" Printout Task 6");
        for (int i = 1; i <= 14; i++) {

            ic = 7 * i;
            System.out.println(ic);
        }
    }

    public static void task7() {
        int ic;


        System.out.println(" Printout Task 7");
        ic = 1;
        System.out.println(ic);

        for (int i = 1; i <= 9; i++) {


            ic = ic * 2;
            System.out.println(ic);

        }
    }
        public static void task8() {
            int monthly=29000;
            int result=0;


            System.out.println(" Printout Task 8");

            for (int i = 1; i <= 12; i++) {


                result=result+monthly;

                System.out.println(" Месяц " + i + " сумма накоплений = " + result + " рублей" );

            }
        }



    public static void task9() {
        float monthly=29000f;
        float result=0;


        System.out.println(" Printout Task 9");

        for (int i = 1; i <= 12; i++) {


            result=result+monthly;

            System.out.println(" Месяц " + i + " сумма накоплений = " + result + " рублей" );

            result=result * 1.01f;

        }
    }

    public static void task10() {

        int result;

        System.out.println(" Printout Task 10");

        for (int i = 1; i <= 10; i++) {


            result=2*i;

            System.out.println(" 2 * " + i + " = " + result  );



        }
    }

}
