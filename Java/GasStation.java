public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startingStation = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                startingStation = i + 1;
                currentGas = 0;
            }
        }

        return (totalGas >= totalCost) ? startingStation : -1;
    }

    public static void main(String[] args) {
        GasStation solver = new GasStation();
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };

        System.out.println("Starting Gas Station Index: " + solver.canCompleteCircuit(gas, cost)); // Output: 3
    }
}