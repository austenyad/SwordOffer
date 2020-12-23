package S04;


public class Solution1 {
    /**
     * 请实现一个函数，把字符串中的每个空格换成 "%20"。
     * 例如 "We   are happy"，则输出 "We%20are%20happy"
     * // 从后往前 替换空格
     *
     * @param str
     * @return
     */
    public static String transStr(String str) {
        if (str == null) return null;


        char[] chars = str.toCharArray();
        int whiteCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (' ' == chars[i]) {
                whiteCount++;
            }
        }
        char[] newChars = new char[chars.length + whiteCount * 2];
        System.arraycopy(chars, 0, newChars, 0, chars.length);
        int p2 = newChars.length - 1;
        int p1 = newChars.length - 1 - whiteCount * 2;

        while (p1 != p2) {
            if (newChars[p1] == ' ') {
                newChars[p2--] = '0';
                newChars[p2--] = '2';
                newChars[p2--] = '%';
            }else {
                newChars[p1--] = newChars[p2--];
            }
            p1--;
        }
        return new String(newChars);
    }

    public static void main(String[] args) {
        System.out.println(transStr("We are happy"));
        System.out.println(transStr("Wearehappy"));
        System.out.println(transStr(null));
        System.out.println(transStr(""));
        System.out.println(transStr("We are  happy"));
    }
}
