class bubble{
    public static void main(String arg[]){
        int i,j,tmp,n=10;
        int X[]={256,128,64,32,16,8,4,2,1,0};
            for(i=0;i<n;i++)
                System.out.println(X[i]);
            System.out.println();
            for(i=0;i<n-1;i++){
                for(j=0;j<n-1;j++){
                    if(X[j]>X[j+1]){
                        tmp=X[j];
                        X[j]=X[j+1];
                        X[j+1]=tmp;
                    }
                }   
            }
                for(i=0;i<n;i++)
                    System.out.println(X[i]+" ");
                System.out.println();
    }
}