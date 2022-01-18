import java.util.Scanner;

public class Main {
    private static int startIndex = 0;
    private static int lastIndex = 0;
    private static String name;

    public static void main(String[] args) {
        char space = ' ';
        Scanner sc = new Scanner(System.in);
        String strFullName;
        do {
            System.out.println("Введите три слова через пробел: \"Фамилия Имя Отчество\"");
            strFullName = sc.nextLine().trim();
        }
        while (checkFullName(strFullName, space));
        System.out.println(outputFullName(strFullName));
    }

    private static boolean checkFullName(String string, char space) {

        boolean check = false;
        startIndex = string.indexOf(space);
        lastIndex = string.lastIndexOf(space);
        if (startIndex == -1 | lastIndex == -1) {
            check = true;
        } else {
            name = string.substring(startIndex, lastIndex).trim();
            int indexCheck = name.indexOf(space);
            if (!(indexCheck == -1) | name.equals("")) {
                check = true;
            }
        }
        return check;
    }

    private static String outputFullName(String string) {

        String surName = string.substring(0, startIndex);
        String otchestvo = string.substring(lastIndex + 1);
        return "Фамилия: " + surName + "\nИмя: " + name + "\nОтчество: " + otchestvo;
    }
}
