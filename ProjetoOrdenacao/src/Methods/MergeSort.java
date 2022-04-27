/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

public class MergeSort {
    
    public static int[] Method(int[] Vetor, int inicio, int fim){
        
        if (inicio < fim - 1) {
           
           //Pega a posição do meio do vetor 
            int meio = (inicio + fim) / 2;
            
            
            //Recursao
            Method(Vetor, inicio, meio);
            
            Method(Vetor, meio, fim);

            //Chama metodo intercalar
            intercalar(Vetor, inicio, meio, fim);
        }
        
        
        
     return Vetor;   
    }
    
    public static void intercalar(int[] Vetor, int inicio, int meio, int fim){
        int[] vetorLocal = new int[fim - inicio];//Vetor local
        
        int i = inicio;
        
        int m = meio;
        
        int pos = 0;
        
        //Executa enquanto a posiçao do inicio for menor que a posiçao do meio
        while(i < meio && m < fim){
            
            //Valida se a posição inicial do vetor é menor ou igual a posiçao do meio do vetor
            if (Vetor[i] <= Vetor[m]) {
                vetorLocal[pos] = Vetor[i];
                
                pos += 1;
                i += 1;
            } else {
                vetorLocal[pos] = Vetor[m];
                
                pos += 1;
                m += 1;
            }   
        }
        
        //Executa enquanto o inicio for menor que o meio
        while(i < meio){
            vetorLocal[pos] = Vetor[i];
            
            pos += 1;
            i += 1;
        }
        
        //Executa enquanto o meio for menor que o fim
        while(m < fim){
            vetorLocal[pos] = Vetor[m];
            
            pos += 1;
            m += 1;
        }
        
        //atribui os valores do vetor local para o vetor
        for (pos = 0, i = inicio;i < fim; i++, pos++) {
            Vetor[i] = vetorLocal[pos];
        }
    }
}
