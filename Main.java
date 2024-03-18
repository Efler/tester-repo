import java.util.regex.Pattern;

public class Main {
    public static String toMarkdownStyle(String word) {
        return word.replaceAll(
                "([" + Pattern.quote("_*[]()~`><#+-=|{}.!") + "])",
                "\\\\$1"
        );
    }

    public static void main(String[] args) {
        System.out.println(toMarkdownStyle("The qu@ick br*wn f0x jumpe]d over the l+zy d()g!"));
    }
}
