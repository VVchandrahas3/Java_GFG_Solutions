// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int dup=n;
         int s=0;
        while(dup>0)
        {
            int last=dup%10;
            if(last>0)
            {
                int store=1;
                for(int i=0;i<3;i++)
                {
                    store*=last;
                }
                s+=store;
            }
            
            dup=dup/10;
        }
        if(s==n)
        {
            return true;
        }
        else{
            return false;
        }
    }
}