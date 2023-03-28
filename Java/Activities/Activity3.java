package activities;

public class Activity3 {

    public static void main(String[] args){
        double seconds = 1000000000;

        double mercurySeconds = 0.2408467;
        double venusSeconds = 0.61519726;
        double earthSeconds = 31557600;
        double marsSeconds = 1.8808158;
        double jupiterSeconds = 11.862615;
        double saturnSeconds = 29.447498;
        double uranusSeconds = 84.016846;
        double neptuneSeconds = 164.79132;

        System.out.println("Age on Mercury Planet: " + seconds / earthSeconds / earthSeconds);
        System.out.println("Age on Mercury Planet: " + seconds / earthSeconds / earthSeconds);
        System.out.println("Age on Venus Planet: " + seconds / earthSeconds / venusSeconds);
        System.out.println("Age on Earth Planet: " + seconds / earthSeconds);
        System.out.println("Age on Mars Planet: " + seconds / earthSeconds / marsSeconds);
        System.out.println("Age on Jupiter Planet: " + seconds / earthSeconds / jupiterSeconds);
        System.out.println("Age on Saturn Planet: " + seconds / earthSeconds / saturnSeconds);
        System.out.println("Age on Uranus Planet: " + seconds / earthSeconds / uranusSeconds);
        System.out.println("Age on Neptune Planet: " + seconds / earthSeconds / neptuneSeconds);

    }
}
