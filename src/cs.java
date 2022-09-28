import java.util.Scanner;

public class cs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            int cs,j,k,n;
            n = scan.nextInt();
            for (cs=1;cs<n+1;cs++){
                for(j=1;j<=n-cs;j++)
                    System.out.print(" ");
                for(k=1;k<2*cs;k++)
                    System.out.print("*");
                System.out.print("\n");

            }
        }


    }
}