class Main {
  public static void main(String[] args) {
    int n = 5;
    for(int i=0;i<=n;i++)
      {
        if(i==0)
          for(int j=1;j<=4;j++)
            System.out.print("n^"+j+" ");
        else 
        for(int j=1;j<=4;j++)
          System.out.print(Math.pow(i, j)+"  ");
        System.out.println("");
      }
  }
}