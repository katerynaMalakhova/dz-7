
public enum SolarSystem {

    MERCURY(1, 20, 2.44, null),
    VENUS(2, 50, 6.05, MERCURY),
    EARTH(3, 40, 6.37, VENUS),
    MARS(4, 70, 3.39, EARTH),
    JUPITER(5, 500, 71.49, MARS),
    SATURN(6, 700, 60.26, JUPITER),
    URANUS(7, 1400, 25.55, SATURN),
    NEPTUNE(8, 1700, 24.76, URANUS),
    PLUTO(9, 1400, 1.15, NEPTUNE);

    private final int ordinalNumberFromTheSun;
    private final int distanceFromThePreviousPlanet; //in million km
    private final double radius;
    private final double distanceFromTheSun;
    private final SolarSystem previousPlanet;


    SolarSystem(int ordinalNumberFromTheSun, int distanceFromThePreviousPlanet, double radius, SolarSystem previousPlanet) {
        this.ordinalNumberFromTheSun = ordinalNumberFromTheSun;
        this.distanceFromThePreviousPlanet = distanceFromThePreviousPlanet;
        this.distanceFromTheSun = previousPlanet != null ? previousPlanet.distanceFromTheSun + distanceFromThePreviousPlanet : distanceFromThePreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
    }


    public int getOrdinalNumberFromTheSun(){
        return ordinalNumberFromTheSun;
    }
    public int getDistanceFromThePreviousPlanet(){
        return distanceFromThePreviousPlanet;
    }
    public double getRadius(){
        return radius;
    }
    public double getDistanceFromSun(){
        return distanceFromTheSun;
    }
    public SolarSystem getPreviousPlanet(){
        return previousPlanet;
    }
    public double getDistanceFromTheSun (){
        return distanceFromTheSun;
    }

}

