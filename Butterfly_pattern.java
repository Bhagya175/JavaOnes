public class Butterfly_pattern {
    public static void main(String[] args) {

        int n=5;

        //upper half

        for (int i=1;i<=n;i++)
        {
            //right one
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for (int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //left one
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

        //lowwer half
        for (int i=n;i>=1;i--)
        {
            //right one
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            int spaces=2*(n-i);
            for (int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }

            //left one
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
