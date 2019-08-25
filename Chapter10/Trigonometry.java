public class Trigonometry
{
    public static void main (String [] args)
    {
        double sinx;
        double cosx;
        double sum;

        sinx = Math.sin(0.5236);
        cosx = Math.cos(0.5236);
        sum = (sinx * sinx) + (cosx * cosx);
        System.out.println("Sine: " + sinx + " Cosine: " + cosx + " Sum: " + sum);
    }
}