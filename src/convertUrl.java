package src;
import java.util.Scanner;

public class convertUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String input = scanner.nextLine();
        String output = replaceCDN(input);
        System.out.println("替换后的字符串为：" + output);
    }

    public static String replaceCDN(String input) {
        String regex = ".*cdn";
        String replacement = "https://cdn.jsdelivr.net/gh/ZhsKevin/cdn";
        return input.replaceAll(regex, replacement);
    }
}