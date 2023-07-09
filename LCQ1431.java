import java.util.ArrayList;
import java.util.List;

class LCQ1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies
        for (int i = 0; i < candies.length; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }

        // Check if each child can have the maximum number of candies
        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= maxCandies) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
