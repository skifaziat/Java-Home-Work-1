public class program4  {
    public static boolean solveEquation (String equation) {
        int q, w, e;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                q = (equation.charAt(0) == '?') ? i : Character.getNumericValue(equation.charAt(0));
                w = (equation.charAt(4) == '?') ? j : Character.getNumericValue(equation.charAt(4));
                e = (equation.charAt(8) == '?') ? 0 : Character.getNumericValue(equation.charAt(8));
                if (q + w == e) {
                    System.out.println(q + " + " + w + " = " + e);
                    return true;
                }
            }
        }
        return false;
    
    }
}