package projectOne;

    class FibonacciExample1{
        public static void main(String args[])
        {
            int num1=1;
            int num2=1;
            int num3;
            int i;
            int count=20;
            System.out.print(num1+" "+num2);//printing 0 and 1

            for(i=1;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
            {
                num3=num1+num2;
                System.out.print(" "+num3);
                num1=num2;
                num2=num3;
            }

        }




}



