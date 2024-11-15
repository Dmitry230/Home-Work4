public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2
        int degree = 5;
        if (degree < 4.9) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //Task 3
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " km/h то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " km/h то можно ездить спокойно");
        }

        //Task 4
        int age2 = 25;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
        } else if (age2 > 24 ) {
            System.out.println("Если возраст человека равен " + age2 + " то ему пора ходить на работу");
        }

        //Task 5
        int age3 = 14;

        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " то ему нельзя кататься на аттракционе");
        } else if (age3 >= 5 && age3 <= 13) {
            System.out.println("Если возраст ребенка равен " + age3 + " то можно кататься на аттракционе в сопровождении");
        } else if (age3 >= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " то можно кататься без сопровождения взрослого");
        }

        //Task 6
        int passengers = 80;
        if (passengers < 60) {
            System.out.println("Место в вагоне есть, сидячее");
        } else if (passengers < 102) {
            System.out.println("Место в вагоне есть, стоячее");
        } else {
            System.out.println("Вагон полностью забит");
        }

        //Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if(one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }



    }

}