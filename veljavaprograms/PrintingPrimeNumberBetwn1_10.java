package veljavaprograms;

public class PrintingPrimeNumberBetwn1_10
{
    public static void main(String[] args)
    {
        int flag = 0;

        for(int i=2; i<=10; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }

            if(flag == 0)
            {
                System.out.println(i+" is a prime number");
            }
            else
            {
                flag=0;
            }


        }



    }
}
