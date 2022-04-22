package Methods;

public class InsertionSort {
    public static int[] Method(int[] Vetor){
        int[] vetorLocal = Vetor;
        int temp;
        int i;
        int j;
        
    //Para cada registro executamos este laço
    for (j = 1; j < vetorLocal.length; j++)
    {
      //Guarda o valor atual do vetor
      temp = vetorLocal[j];
      for (i = j - 1; (i >= 0) && (vetorLocal[i] > temp); i--)
      {
         vetorLocal[i + 1] = vetorLocal[i];
      }
        //Fazendo a troca
        vetorLocal[i + 1] = temp;
    }

        return vetorLocal;
    }
}
