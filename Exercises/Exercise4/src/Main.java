public class Main{
    public static void main(String[] args) {
        RegexChecker[] matchers = {
                new RegexChecker("Email", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"),
                new RegexChecker("Date (yyyy-mm-dd)", "^\\d{4}-\\d{2}-\\d{2}$"),
                new RegexChecker("Letters", "^[a-zA-Z]+$"),
                new RegexChecker("Numbers", "^\\d+$"),
                new RegexChecker("US ZIP code", "^\\d{5}(-\\d{4})?$"),

        };

        String[] positiveCases = {
                "olliee0713@gmail.com",
                "2024-07-13",
                "YiChingWang",
                "880713",
                "95136"
        };

        String[] negativeCases = {
                "yiching.com",
                "99/99/9999",
                "Yiching1999",
                "YiChing1999",
                "1999"
        };

        for (int i = 0; i < matchers.length; i++) {
            boolean isMatchPositive = matchers[i].matches(positiveCases[i]);
            System.out.println("Validation Subject: " + matchers[i]);
            System.out.println("Positive Case: '" + positiveCases[i] + "'\n- Matches or not ? Ans : " + isMatchPositive);


            boolean isMatchNegative = matchers[i].matches(negativeCases[i]);
            System.out.println("Negative Case: '" + negativeCases[i] + "'\n- Matches or not ? Ans : " + isMatchNegative);
            System.out.println("-------------------------------");
        }
    }
}