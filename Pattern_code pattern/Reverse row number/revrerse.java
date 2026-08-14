class Codex{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=4; j++){	
			 if(i==1&&(j==1||j==4)||
			    i==2&&(j==1||j==3)||
			    i==3&&(j==1||j==2)||
			    i==4&&(j==1||j==3)||
			    i==5&&(j==1||j==4))	{
			}else{
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}