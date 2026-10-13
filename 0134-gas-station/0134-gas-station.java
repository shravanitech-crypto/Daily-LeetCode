import java.util.*;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1 = Arrays.stream(gas).sum();
        int sum2 = Arrays.stream(cost).sum();

        if (sum1 < sum2) {
            return -1;
        }

        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            tank = tank + gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        return start;
    }
}