class Solution {
    public boolean isValid(String s) {

        while (s.length() > 0) {
            char[] ch = s.toCharArray();
            boolean found = false;

            for (int i = 0; i < ch.length - 1; i++) {
                if (ch[i] == '(' && ch[i + 1] == ')' || ch[i] == '[' && ch[i + 1] == ']'
                        || ch[i] == '{' && ch[i + 1] == '}') {
                    s = s.substring(0, i) + s.substring(i + 2);
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}