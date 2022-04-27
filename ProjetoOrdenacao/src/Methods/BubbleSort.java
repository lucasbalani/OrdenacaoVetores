package Methods;

public class BubbleSort {
    public static int[] Method(int[] Vetor){
            int[] vetorLocal = Vetor;
            int temp;

            //Laço executado para cada registro do vetor
            for(int i = 0; i < vetorLocal.length; i++){
                
                //Laço que percorrera o tamanho total do vetorLocal - 1
                for (int j = 0; j < (vetorLocal.length - 1); j++){
                    
                    //Validação de troca
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
