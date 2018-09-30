import java.io.*;
import java.util.*;
class Amstrong
    {
        public static void main (String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            for (int i=a;i<=b ;i++ )
                {
                    int num,remainder,result=0;
                    num=i;
                    while (num != 0)
                        {
                            remainder = num%10;
                            result += remainder*remainder*remainder;
                            num /= 10;
                        }

                    if(result == i)
                        {
                            System.out.println(i);
                        }
                        
                }     
        }
    }
