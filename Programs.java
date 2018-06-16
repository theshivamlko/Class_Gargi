class Programs{
    public static void main(String[] args) {
        int N=10;

        // 1*2 + 2*2 + ... N*N
        int sum=0;
        for (int i = 1; i <=N; i++) {
            sum=sum+i*i;
        }
        System.out.println(sum);
    
    // 1!/1 + 2!/2 + ... N!/N

        int  sum2=0;
        for (int i = 1; i <=N; i++) {

            if(i%2==0){

            int fact=1;
            for(int j=1;j<=i;j++){
                fact=fact*j;
            }
            sum2= sum2+ fact/i;
        }
                     
        }
        System.out.println(sum2);
    
    
    
    }



}