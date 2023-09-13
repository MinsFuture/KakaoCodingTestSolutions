package question2;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] deliveries2 = {1, 0, 2, 0, 1, 0, 2};
        int[] pickups2 = {0, 2, 0, 1, 0, 2, 0};

        long answer2 = s.solution(2, 7, deliveries2, pickups2);
        System.out.println("answer2 = " + answer2);
    }
}
