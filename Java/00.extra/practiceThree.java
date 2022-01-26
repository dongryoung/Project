package sss;

import java.util.Scanner;

public class practiceThree {
		public static void main(String[] args) {
			Scanner sc ;
			int N,i,j,k;

			System.out.println("구구단 몇단까지 할건가요?");
			sc=new Scanner(System.in);
			N=sc.nextInt();
			
			
			if((N>0)&&(N<99)) {
			
				for(i=1; i<=N; i++) {
					if(i<=N-2) {
						for(j=1; j<=9; j++) {
							 
							for(k=1; k<=3; k++) {
								System.out.print(i+"X"+j+"="+i*j+"\t");
								i++;
							}
							i=i-3;
							System.out.println("");
						}
						i=i+2;	
					}
					else if(i<=N-1){
						for(j=1; j<=9; j++) {
							for(k=1; k<=2; k++) {
								System.out.print(i+"X"+j+"="+i*j+"\t");
								i++;
							}
							i=i-2;
							System.out.println("");
						}
						i=i+1;
					}
					else {
						for(j=1; j<=9; j++) {
							for(k=1; k<=1; k++) {
								System.out.print(i+"X"+j+"="+i*j+"\t");
							}
							System.out.println("");
						}
					}

				}
				return;
			}
		}
}
							