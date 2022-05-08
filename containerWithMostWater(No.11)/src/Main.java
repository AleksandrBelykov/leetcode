public class Main {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        SolutionStraight solution = new SolutionStraight();
        SolutionSophisticated sol = new SolutionSophisticated();

        System.out.println(solution.maxArea(height));
        System.out.println(sol.maxArea(height));
    }
}
