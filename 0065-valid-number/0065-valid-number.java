class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean e = false;
        boolean digitAfterE = true;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    if (i != 0) {
                        if (s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                            return false;
                        }
                    }
                    break;

                case '.':
                    if (dot || e) {
                        return false;
                    }
                    dot = true;
                    break;

                case 'e':
                case 'E':
                    if (e || !digit) {
                        return false;
                    }
                    e = true;
                    digitAfterE = false;
                    break;

                default:
                    if (ch < '0' || ch > '9') {
                        return false;
                    }

                    digit = true;

                    if (e) {
                        digitAfterE = true;
                    }
                    break;

            }
        }
        return digit && digitAfterE;
    }
}