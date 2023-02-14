

import java.util.;

public class program4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the equation: ");
        String equation = sc.nextLine();
        String[] parts = equation.split("\\+|=");
        int q = 0, w = 0, e = 0;
        boolean qKnown = false, wKnown = false, eKnown = false;
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i].trim();
            if (part.endsWith("?")) {
                part = part.substring(0, part.length() - 1);
                int num = Integer.parseInt(part);
                if (i == 0) {
                    q = num;
                    qKnown = true;
                } else if (i == 1) {
                    w = num;
                    wKnown = true;
                } else {
                    e = num;
                    eKnown = true;
                }
            } else {
                int num = Integer.parseInt(part);
                if (!qKnown) {
                    q = num - w;
                } else if (!wKnown) {
                    w = num - q;
                } else if (!eKnown) {
                    e = num + q + w;
                }
            }
        }
        if (q >= 0 && w >= 0 && e >= 0) {
            System.out.println(q + " + " + w + " = " + e);
        } else {
            System.out.println("No solution");
        }
    }
}