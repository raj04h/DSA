package Searching.search_ques;

import java.util.*;

public class ice_price {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        Map<Integer, Integer> priceMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            int currentPrice = arr.get(i);
            int remainingAmount = m - currentPrice;

            if (priceMap.containsKey(remainingAmount)) {
                result.add(priceMap.get(remainingAmount) + 1); // +1 for 1-based indexing
                result.add(i + 1); // +1 for 1-based indexing
                return result;
            }

            priceMap.put(currentPrice, i);
        }
        
        return result; // If no solution is found, though per problem statement, there's always a solution.
    }

    public static void main(String[] args) {
        // Example usage:
        //int t = 2; // Number of trips

        List<Integer> trip1 = Arrays.asList(1, 4, 5, 3, 2);
        List<Integer> trip2 = Arrays.asList(2, 2, 4, 3);

        System.out.println(icecreamParlor(4, trip1)); // Output: [1, 4]
        System.out.println(icecreamParlor(4, trip2)); // Output: [1, 2]
    }
    
}
