class Main {
  public static void main(String[] args) {
    double population = 80000;
    int yearsCount=0;
    while(population < 150000)
      {
        population += population * (0.05);
        yearsCount++;
      }
    System.out.println(yearsCount);
  }
}