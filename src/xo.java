public class xo {
    public static boolean getXO(String str) {
        int cntO = 0;
        int cntX = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                cntO++;
            } else if (str.charAt(i) == 'X' || str.charAt(i) == 'x') {
                cntX++;
            }
        }
        if (cntO == cntX) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(getXO("xooxx"));
    }
}
