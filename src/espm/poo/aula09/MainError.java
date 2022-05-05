package espm.poo.aula09;

public class MainError {
    public static void main(String[] args) {
        int n = 10, m = 15;
        double[][] matriz = new double[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(matriz[i][j] + "");
            }
        }
    }
}
