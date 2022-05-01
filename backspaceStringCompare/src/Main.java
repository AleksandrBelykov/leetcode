public class Main {
    public static void main(String[] args) {
        String s = "xyw##e";
        String t = "xyw#e#";

        SolutionTooMuchOfCode solution = new SolutionTooMuchOfCode();
        System.out.println(solution.backspaceCompare(s, t));

        SolutionShort sol = new SolutionShort();
        System.out.println(sol.backspaceCompare(s, t));
    }
}