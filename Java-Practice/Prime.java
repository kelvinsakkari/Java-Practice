package SimpleInterest;




public class Prime {

	public static void list(int n){
		int[] al = new int[n+1];
		for(int i=0;i<=n;i++)
			al[i]=1;
		al[0]=0;
		al[1]=0;
		for(int i=2;i<=n;i++){
			if(al[i]==1){
				System.out.println(i);
				for(int j=2;i*j<=n;j++){
					al[i*j]=0;
					}
			}
		}
		
	}
	public static void main(String[] args) {
		Prime.list(7);
	}

}
