import java.util.regex.*;

public class RegexChecker {
    private String pattern;
    private String title;

    public RegexChecker(String title, String pattern) {
        this.title = title;
        this.pattern = pattern;
    }

    public boolean matches(String content) {
        return Pattern.matches(this.pattern, content);
    }

    @Override
    public String toString() {
        return this.title;
    }
}
