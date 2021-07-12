package ENCOACADEMY.AccessModifiers.A;

public class BasicClass {
    int a = 10;
    private int b = 20;

    protected int c = 30;
    public int d= 40;
    public void m1()
    {
        System.out.println("Default method of base Class ");
    }
  private void m2()
    {
        System.out.println("Private method of base Class ");
    }
   protected void m3()
    {
        System.out.println("Protected method of base Class ");
    }
   public void m4()
    {
        System.out.println("Public method of base Class ");
    }
}
