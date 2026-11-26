class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        int remove = 10;
        boolean isAliceTurn = true;

        while(n >= remove){
            n -= remove; //subtract the stones removed from the pile
            remove--;
            isAliceTurn = !isAliceTurn; // switch player 1. Alice's turn becomes Bob's turn 2. Bob's turn becomes Alice's turn
        }
        return !isAliceTurn; //When the loop ends, the current player cannot move.
    }
}