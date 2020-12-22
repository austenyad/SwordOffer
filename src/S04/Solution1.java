package S04;




public class Solution1 {


    /**
     * 请实现一个函数，把字符串中的每个空格换成 "%20"。
     * 例如 "We   are happy"，则输出 "We%20are%20happy"
     *
     * @param str
     * @return
     */
    public static String transStr(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 32) {
                count++;
            }
        }
        // 空格原来是一个字符位置，替换成 %20 后增加2个空格
        int strLength = str.length() + count * 2;
        char[] newChars = new char[strLength];
        for (int i = 0; i < chars.length; i++) {
            newChars[i] = chars[i];
        }


        for (int i = 0; i < newChars.length; i++) {
            if (newChars[i] == ' ' && count > 0) {
                System.arraycopy(newChars, i + 1, newChars, i + 3, newChars.length  - count * 2);
                count--;
                newChars[i] = '%';
                newChars[i + 1] = '2';
                newChars[i + 2] = '0';
            }
        }
        return new String(newChars);
    }

    public static void main(String[] args) {
        System.out.println(transStr("We are happy"));
    }
}
