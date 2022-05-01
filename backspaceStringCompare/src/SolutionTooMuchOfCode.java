import java.util.Arrays;

public class SolutionTooMuchOfCode {
    private static final int BACKSPACE = '#';

    public boolean backspaceCompare(String s, String t) {
        char[] bufferS = deleteletters(s.toCharArray());
        char[] bufferT = deleteletters(t.toCharArray());

        String sString = getString(bufferS);
        String tString = getString(bufferT);

        return sString.equals(tString);
    }

    private char[] deleteletters(char[] buffer){
        int backspaceNumb = 0;
        for (int i = buffer.length - 1; i >= 0; i--) {
            if (buffer[i] == BACKSPACE) {
                backspaceNumb++;
            }
            if (backspaceNumb > 0 && buffer[i] != BACKSPACE) {
                buffer[i] = BACKSPACE;
                backspaceNumb--;
            }
        }
        return buffer;
    }

    private String getString(char[] buffer) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char b : buffer){
            if (b != BACKSPACE) {
                 stringBuilder.append(b);
            }
        }
        return stringBuilder.toString();
    }
}
