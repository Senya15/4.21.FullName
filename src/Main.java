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
        System.out.println(name);

    }

    private static boolean checkFullName(String string, char serchPart) {

        boolean check = false;
        startIndex = string.indexOf(serchPart);
        lastIndex = string.lastIndexOf(serchPart);
        name = string.substring(startIndex, lastIndex).trim();
        int indexCheck = name.indexOf(serchPart);
        if (!(indexCheck == -1)) {
            check = true;
        }
        return check;
    }


}
