public class Main {
    public static void main(String[] args) {
        int x = -10200;
        Solution solution = new Solution();
        SolutionNoUseOfLong sol = new SolutionNoUseOfLong();

        System.out.println(solution.reverse(x));
        System.out.println(sol.reverse(x));


    }
}
