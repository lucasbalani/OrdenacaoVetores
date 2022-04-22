package Methods;

public class ShellSort {
    public static int[] Method(int[] Vetor){
        int i , j , temp;
        int[] vetorLocal = Vetor;

        int incremento = 1;
        while(incremento < vetorLocal.length) {
            incremento = 3 * incremento + 1;
        }

        while (incremento > 1) {
            incremento /= 3;
            
            for(i = incremento; i < vetorLocal.length; i++) {
                temp = vetorLocal[i];
                j = i - incremento;
                while (j >= 0 && temp < vetorLocal[j]) {
                    vetorLocal[j + incremento] = vetorLocal[j];
                    j -= incremento;
                }
                vetorLocal [j + incremento] = temp;
            }
        }
        
        return vetorLocal;
    }	
}
