package Methods;

public class BubbleSort {
    public static int[] Method(int[] Vetor){
            int[] vetorLocal = Vetor;
            int temp;

            //Para cada registro do vetor
            for(int i = 0; i < vetorLocal.length; i++){
                for (int j = 0; j < (vetorLocal.length - 1); j++){
                    if(vetorLocal[j] > vetorLocal[j + 1]){
                        temp = vetorLocal[j];
                        vetorLocal[j] = vetorLocal[j+1];
                        vetorLocal[j+1] = temp;
                    }
                }
            }

            return vetorLocal;
        }
}
