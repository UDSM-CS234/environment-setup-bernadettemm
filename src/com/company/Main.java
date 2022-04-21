public class Main {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double x;
        x = (0.5 * (gravity * (fallingTime * fallingTime)) 
        + (initialVelocity * fallingTime) + (initialPosition));
    System.out.println(x + " m. ");
    }
}

