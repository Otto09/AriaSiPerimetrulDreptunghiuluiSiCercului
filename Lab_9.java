
public class Lab_9
{
    // instance variables - replace the example below with your own
    private Dreptunghi dr;
    private Cerc cr;

    /**
     * Constructor for objects of class Lab_9
     */
    public Lab_9()
    {
        // initialise instance variables
        dr = new Dreptunghi(30, 25, 10, 7);
        cr = new Cerc(65, 30 ,20);
        System.out.println("Aria dreptunghiului: " + dr.arie() + 
            ", aria cercului este: " + cr.arie() );
    }

    public static void main(String arg[])
    {
        Lab_9 l = new Lab_9();
    }
}
