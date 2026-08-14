class Codex{
	public static void main(String[] args){	
		int num1=5;
		for(int l=1;l<=num1;l++){
			for(int m=1; m<=num1-l; m++){
				System.out.print(" ");
			}
			for(int n=1; n<=l;n++){
				System.out.print(n);
				System.out.print(" ");	
			}
				System.out.println();
		}

		for(int i=1 ;i<=5; i++){
			for(int j=1; j<=5;j++){
				if(i==j || j>i){
					System.out.print(j);
					System.out.print(" ");
				}else{
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}
}