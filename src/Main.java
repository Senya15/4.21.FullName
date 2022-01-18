import java.util.Scanner;

public class Main {
    private static int startIndex = 0;
    private static int lastIndex = 0;

    public static void main(String[] args) {
        char space = ' ';
        Scanner sc = new Scanner(System.in);
        String intFullName = sc.nextLine().trim();
        do {
            System.out.println("Введите три слова через пробел: \"Фамилия Имя Отчество\"");
            intFullName = sc.nextLine().trim();
        }
        while (checkFullName(intFullName, space));

    }

    private static boolean checkFullName(String intFullName, char space) {

        boolean check = false;
        startIndex = intFullName.indexOf(space);
        lastIndex = intFullName.lastIndexOf(space);
        String name = intFullName.substring(startIndex, lastIndex).trim();
        int indexCheck = name.indexOf(space);
        if (!(indexCheck == -1)) {
            check = true;
        }
        return check;
    }


}
