class Palindrome {
    public static boolean isPalindrome(int x) {;
        int temp=x;
        int rev=0;
        while(x>0)
        {
            int dig=x%10;
            rev=rev*10+dig;
            x/=10;
        }
        if(temp==rev)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x=sc.nextInt();
            isPalindrome(x);
        }
    }
}
