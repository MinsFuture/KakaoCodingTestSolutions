package question1;

public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] answer = so.solution(today, terms, privacies);

        for (int a : answer) {
            System.out.println(a);
        }

    }
}
