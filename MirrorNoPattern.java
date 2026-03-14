public class MirrorNoPattern {
  public static void main(String[] args) {
    int n =5;
    for(int i = 1; i <= n; i++) {
      //print space
      for(int k = 1; k <= n-i; k++) {
        System.out.print("  ");
      }
      for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      for(int j = i-1; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
