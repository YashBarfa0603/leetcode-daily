class Solution {

    public int getSum(int a, int b) {

        // Continue until there is no carry left.
        while (b != 0) {

            // Find the carry bits.
            int carry = (a & b) << 1;

            // XOR adds the bits without considering carry.
            a = a ^ b;

            // Now process the carry.
            b = carry;
        }

        return a;
    }
}