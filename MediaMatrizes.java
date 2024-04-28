package Entities;

import java.util.Scanner;

public class Aula20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("São quantos alunos ");
	 int qtdal = in.nextInt();
		
		System.out.println("Quantas notas ");
		int notas = in.nextInt();
		
		
		double [][] notasAlunos = new double [qtdal][notas];

		
		for(int i=0; i<notasAlunos.length;i++) {
			System.out.println("Insira a nota do Aluno " + (i+1) + ":");
			 for(int y=0; y<notasAlunos[i].length;y++) {
				 System.out.println("Notas " + 	(y+1) + ":");
                notasAlunos[i][y]= in.nextDouble();					 
				 
				 
			 }
		}
		double somas[] = new double [notasAlunos.length];
		for (int i=0;i<notasAlunos.length;i++) {
			for(int j =0; j<notasAlunos[i].length;j++) {
				
				somas[i]+= notasAlunos[i][j];
					
				}
				
			}
		
		
		for(int i=0; i<notasAlunos.length;i++) {
			double media = somas[i]/4;
			
			
			System.out.println("Alunos " +(i+1)+ " Media:  " + media);
		}
		
		
		
		in.close();
	}

}
