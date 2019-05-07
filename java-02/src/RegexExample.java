import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String content = "I am noob " +
                "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("是否匹配到" + isMatch);
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(content);
        System.out.println(m.find());
        System.out.println(m.group());
    }
}
