import java.util.Random;

public class ProgrammingTask {
        public static void main(String[] args) {
                long[] z; // Task1
                int k = 0;
                double[] x = new double[15]; // Task2
                Random random = new  Random(); // Task2
                double[][] w = new double[8][15]; // Task3
                // Task1↓
                for (int i = 6; i < 21; i+=2) {
                        k += 1;
                }
                z = new long[k];
                for (int i = 0; i < z.length; i++) {
                        z[i] = 20 - i * 2;
                }
                // Task2↓
                for (int i = 0; i < 15; i++) {
                        x[i] = (random.nextDouble() * 17.0 - 4.0);
                }
                // Task3↓
                for (int i = 0; i < z.length; i++) {
                        for (int j = 0; j < x.length; j++) {
                                if (z[i] == 6 || z[i] == 8 || z[i] == 18 || z[i] == 20) {
                                        w[i][j] = func1(x[j]);
                                }
                                if (z[i] == 14) {
                                        w[i][j] = func2(x[j]);
                                }
                                if (z[i] != 14 && z[i] != 6 && z[i] != 8 && z[i] != 18 && z[i] != 20) {
                                        w[i][j] = func3(x[j]);
                                }
                        }
                }
                // Task4↓
                for (int i = 0; i < w.length; i++) {
                        for (int j = 0; j < w[i].length; j++){
                                System.out.printf("%6.2f ", w[i][j]);
                        }
                        System.out.println();
                }
        }
        public static double func1(double x) {
                return Math.cos(Math.cos(Math.pow(((x/1.0)/4.0),2)));
        }
        public static double func2(double x) {
                return Math.sin(Math.log(Math.abs(x)));
        }
        public static double func3(double x) {
                return Math.atan(Math.cos(Math.cos(Math.atan((3.0/4.0)*((x + 4.5) / 17.0)))));
        }
}