public class inheritance {
    public static void main(String[] args) {
        multiply mp =new multiply();
        mp.calc(20, 30, 40);
        mp.calc(1, 2, 3, 4, 5);
    }
}
class sum
{
    static void calc(int n1,int n2,int n3,int n4,int n5)
    {
        System.out.println(n1+n2+n3+n4+n5);
    }
}
class multiply extends sum
{
    static void calc(int n1,int n2,int n3)
    {
        System.out.println(n1*n2*n3);
    }
}