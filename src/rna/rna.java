package rna;

import java.util.Random;
/**
 * 
 * @author Matheus Brito
 *
 */
public class rna {
	
	public static void main(String[] args) {
		
		int matrizX[][] = new int [4][4];
		float vetW[] = new float [3];
		float vk;
		float yf;
		float e;
		float n ;
		
		//Taxa de aprendizagem de 0.1
		n=0.1f;
		
		System.out.println("Pesos iniciais:");
		//Preenchendo meu Vetor de Pesos vetW
		for(int i=0; i<3; i++) {
			vetW[i]=RandomFloat();
			System.out.println("Peso w"+i+" = "+vetW[i]+"\n");
		}
		System.out.println("---------------------------------------");
		System.out.println("Início das rotinas\n");
		for(int linha=0; linha<4; linha++) {
			for(int coluna=0; coluna<4; coluna++) {
				
				if(coluna==0) {
					matrizX[linha][coluna] =-1; 
				}else if(coluna==3) {
					if(matrizX[linha][1] == matrizX[linha][2] && matrizX[linha][1]!=0)
						matrizX[linha][coluna]=1;
				}else {
					if(linha==0) {
						matrizX[linha][1]=0;
						matrizX[linha][2]=0;
					}else if(linha==1) {
						matrizX[linha][1]=0;
						matrizX[linha][2]=1;
					}else if(linha==2) {
						matrizX[linha][1]=1;
						matrizX[linha][2]=0;
					}else{
						matrizX[linha][1]=1;
						matrizX[linha][2]=1;
					}
				}

			}
		}
		/**
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("Matriz["+linha+"]["+coluna+"]="+matrizX[linha][coluna]);
			}
		}
		*/
		for(int i=0; i<100; i++) {		
				
			//Começo da rotina 0.0
			
			vk= matrizX[0][0] * vetW[0] + matrizX[0][1] * vetW[1] + matrizX[0][2] * vetW[2];
			
			if(vk>=0) {
				yf=1;
			}else {
				yf=0;
			}
			if(matrizX[0][3]!=yf) {
				e = matrizX[0][3] - yf;
				vetW[0] = (n*e*matrizX[0][0])+vetW[0];
				vetW[1] = (n*e*matrizX[0][1])+vetW[1];
				vetW[2] = vetW[2]+(n*e*matrizX[0][2]);
				
			}
			//Fim da primeira rotina 0/0
			//começo rotina 0/1
			//0.0

				
				//w1=w2=w0=FuncaoLimiar();
				
				vk= matrizX[0][0] * vetW[0] + matrizX[0][1] * vetW[1] + matrizX[0][2] * vetW[2];
				
				if(vk>=0) {
					yf=1;
				}else {
					yf=0;
				}
				if(matrizX[1][3]!=yf) {
					e = matrizX[1][3] - yf;
					vetW[0] = (n*e*matrizX[1][0])+vetW[0];
					vetW[1] = (n*e*matrizX[1][1])+vetW[1];
					vetW[2] = vetW[2]+(n*e*matrizX[1][2]);
				}
			//fim da rotina 0/1
			//Começo rotina 1/1
				//0.0
				
				//w1=w2=w0=FuncaoLimiar();
				
				vk= matrizX[0][0] * vetW[0] + matrizX[0][1] * vetW[1] + matrizX[0][2] * vetW[2];
				
				if(vk>=0) {
					yf=1;
				}else {
					yf=0;
				}
				if(matrizX[2][3]!=yf) {
					e = matrizX[2][3] - yf;
					vetW[0] = (n*e*matrizX[2][0])+vetW[0];
					vetW[1] = (n*e*matrizX[2][1])+vetW[1];
					vetW[2] = vetW[2]+(n*e*matrizX[2][2]);			
				}
			//fim da rotina 1/0
			//começo da rotina 1/1
				//0.0
				
				//w1=w2=w0=FuncaoLimiar();
				
				vk= matrizX[0][0] * vetW[0] + matrizX[0][1] * vetW[1] + matrizX[0][2] * vetW[2];
				
				if(vk>=0) {
					yf=1;
				}else {
					yf=0;
				}
				if(matrizX[3][3]!=yf) {
					e = matrizX[3][3] - yf;
					vetW[0] = (n*e*matrizX[3][0])+vetW[0];
					vetW[1] = (n*e*matrizX[3][1])+vetW[1];
					vetW[2] = vetW[2]+(n*e*matrizX[3][2]);
				
				}				
			//fim da rotina 1/1
				System.out.println("Rotina "+(i+1)+" Peso w0: "+vetW[0]+"---- Peso w1: "+vetW[1]+" Peso w2 "+vetW[2]+"\n");
			}//Fim do for
	
	}
	
	public static float RandomFloat() {
		Random r =new Random();
		return r.nextFloat();
	}
	

}
