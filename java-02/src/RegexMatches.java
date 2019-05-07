/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 15:18 2019/5/7
 * @Description:
 *  _
 * | |
 * | |__   _   _   __ _
 * | '_ \ | | | | / _` |
 * | |_) || |_| || (_| |
 * |_.__/  \__,_| \__, |
 *                 __/ |
 *                |___/
 */

import java.util.regex.*;

public class RegexMatches {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoobkkk";
    private static String REPLACE = "-";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            //System.out.println(m.group());
            m.appendReplacement(sb, REPLACE);
        }
        System.out.println(sb);
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

}
