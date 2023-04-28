import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SolarSystem planet = SolarSystem.MERCURY;
        System.out.printf("Number from the sum %d \n", planet.getOrdinalNumberFromTheSun());
        System.out.printf("Distance from previous planet %d mln km \n", planet.getDistanceFromThePreviousPlanet());
        System.out.printf("Previous planet: %s \n", planet.getPreviousPlanet());
        System.out.printf("Radius %.2f mln km \n", planet.getRadius());
        System.out.printf("Distance from the sun %.2f mln km \n", planet.getDistanceFromTheSun());
    }
}