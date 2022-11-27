interface a{
    public void try();
}
class b implements a{
    public void try(int x){
        System.out.print("Area of circle is:"+x*x);
    }
}
class intertry{
    public static void main(String[] args){
        b obj=new b();
            obj.try(10);
    }
}