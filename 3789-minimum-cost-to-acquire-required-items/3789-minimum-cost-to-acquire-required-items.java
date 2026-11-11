
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

        int com = Math.min(need1, need2);

        int rem1 = need1 - com;
        int rem2 = need2 - com;

        long op1 = ((long) need1 * cost1) + ((long) need2 * cost2);

        long op2 = ((long) com * costBoth) + ((long) rem1 * cost1) + ((long) rem2 * cost2);

        long op3 = (long) Math.max(need1, need2) * costBoth;

        long ans = Math.min(op1, Math.min(op2, op3));

        return ans;
    }
}
