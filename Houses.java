class Houses{
    public static void main(String[] args){

        Sample obj1 = new Sample();
        obj1.Buy("house1");
        obj1.Buy("house1","house2");
        obj1.Buy("house1","house2","house3");
        
    }

}
class Buy{

    String a, b,c;
 
    void Buy(String x){
        a=x;
        int cost=15000;
        System.out.print("For renting single house"+a+":");
        System.out.println(cost);
        System.out.print("For buying single house"+a+":");
        System.out.println(cost);

    }

    void Buy(String x, String y)
    {
        a=x;
        b=y;
        int cost1=15000;
        int cost2=20000;
        int cost=cost1+cost2;
        System.out.print("For renting two houses "+a+" "+b+":");
        System.out.println(cost*1.10);
        System.out.print("For buying two houses "+a+" "+b+":");
        System.out.println(cost*0.9);
        
    }

    void Buy(String x, String y,String z){
        a=x;
        b=y;
        c=z;
        int cost1=15000;
        int cost2=20000;
        int cost3=25000;
        int cost=cost1+cost2+cost3;
        System.out.print("For renting three houses "+a+" "+b+" "+c+":");
        System.out.println(cost*1.15);
        System.out.print("For buying three houses "+a+" "+b+" "+c+":");
        System.out.println(cost*.85);

    }
}
