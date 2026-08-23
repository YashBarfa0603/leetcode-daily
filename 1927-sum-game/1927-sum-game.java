class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0;
        int rightSum = 0;
        int leftQuestion = 0;
        int rightQuestion = 0;
        int mid = num.length() / 2;
        for (int i = 0; i < num.length(); i++) {
            char current = num.charAt(i);
            if (i < mid) {
                if (current == '?') {
                    leftQuestion++;
                } else {
                    leftSum += current - '0';
                }
            } else {
                if (current == '?') {
                    rightQuestion++;
                } else {
                    rightSum += current - '0';
                }
            }
        }
        // Odd number of '?' means Alice gets the final move.
        if ((leftQuestion + rightQuestion) % 2 == 1) {
            return true;
        }

        // Bob wins only when the '?' can exactly balance the known sums.
        if (leftSum - rightSum
                == 9 * (rightQuestion - leftQuestion) / 2) {
            return false;
        } else {
            return true;
        }
    }

}