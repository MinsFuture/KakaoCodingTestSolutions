package question2;

class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        //트럭 하나로 모든 배달과 수거를 마치고 물류창고까지 돌아올 수 있는 최소 이동 거리를 return

        int d_cap = 0; // 배달해야하는 상자의 수
        int p_cap = 0; // 픽업해야하는 상자의 수

        for (int i = n - 1; i >= 0; i--) {
            d_cap += deliveries[i];
            p_cap += pickups[i];

            while (d_cap > 0 || p_cap > 0) {
                d_cap -= cap; // d_cap이 음수가 되어도 괜찮은 이유는 다음 집에 미리 배달하는 효과를 가지기 떄문
                p_cap -= cap; //
                answer += (i + 1)  * 2;
            }
        }

        return answer;
    }
}