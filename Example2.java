public class Example2{
    public static void main(String[] args) {
        sample1 a1=new sample1(30);
        sample1 a2=new sample1(40);
        sample1 a3=new sample1(50);
        sample2 obj1 =new sample2();
        obj1.sum(a1,a2,a3);
    }
}
class sample1
{
    int n;
    sample1(int n)
    {
        this.n=n;
    }
}
class sample2
{
    static void sum(sample1 a1,sample1 a2, sample1 a3)
    {
        System.out.println("sum = "+(a1.n+a2.n+a3.n));
    }
}
