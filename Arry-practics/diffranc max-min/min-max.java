class Codex{
	public static void main(String args[]){
		int arr []={10,50,40};
		int max=arr[0];
		int min=arr[0];
		int diff=0;
			for(int i=0;i<=arr.length-1;i++){
				if(arr[i]>max){
					max=arr[i];	
				}
				if(arr[i]<min){
					min=arr[i];
				}
			}
			diff=max-min;	

	}
}