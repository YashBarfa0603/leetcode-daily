class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean e = false;
        boolean digitAfterE = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '+' || ch == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e'
                    && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else if (ch == '.') {
                if (dot || e) {
                    return false;
                }
                dot = true;
            }
            else if (ch == 'e' || ch == 'E') {
                if (e || !digit) {
                    return false;
                }
                e = true;
                digitAfterE = false;
            }
            else if (ch >= '0' && ch <= '9') {
                digit = true;

                if (e) {
                    digitAfterE = true;
                }
            }
            else {
                return false;
            }
        }

        return digit && digitAfterE;
    }
}
