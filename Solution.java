class Solution {
    public static int solution(int[] T) {
        int n = T.length;
        int[] minR = new int[n];

        minR[n-1] = T[n-1];
        for (int i = n-2; i >= 0; i--)
            minR[i] = Math.min(minR[i+1], T[i]);
        int maxL = 0;

        for (int j = 0; j < n-2; j++) {
            maxL = Math.max(maxL, T[j]);
            if (maxL < minR[j+1])
                return j+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-5, -5, -5, -42, 6, 12}));
    }
}