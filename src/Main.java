public class Main {
    public static void main(String[] args) {
        System.out.println(palindrom("qweEWQ qweewq"));

    }
    public static boolean palindrom (String string) {
        String revers = "";
        for (int simbol = string.length() - 1; simbol >= 0; simbol--) {
            revers = revers + string.charAt(simbol);
        }
        if (string.equalsIgnoreCase(revers)) {
            return true;
        }
        else {
            return false;
        }
    }
}