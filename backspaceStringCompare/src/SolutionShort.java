public class SolutionShort {
    private static final int BACKSPACE = '#';

    public boolean backspaceCompare(String s, String t) {
        String sProcessed = getString(s);
        String tProcessed = getString(t);

        return sProcessed.equals(tProcessed);
    }

    private String getString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] buffer = string.toCharArray();

        for (char b : buffer){
            if (b == BACKSPACE && stringBuilder.length() != 0){
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            } else {
                stringBuilder.append(b);
            }
        }
        return stringBuilder.toString();
    }
}
