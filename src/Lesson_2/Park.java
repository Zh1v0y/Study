package Lesson_2;

public class Park {
    private String name;
    private String location;

    private Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    private class Attraction {
        private String attractionName;
        private String workingHours;
        private double cost;

        private Attraction(String attractionName, String workingHours, double cost) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        private void printInfo() {
            System.out.println("Attraction Name: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Cost: " + cost + " Руб.");
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Disneyland", "France");
        Attraction rollerCoaster = park.new Attraction("Roller Coaster", "10:00 AM - 8:00 PM", 5.0);
        Attraction ferrisWheel = park.new Attraction("Ferris Wheel", "9:00 AM - 10:00 PM", 3.0);
        Attraction freeFallRide = park.new Attraction("Free Fall Ride", "12:00 PM - 12:00 AM", 4.0);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        freeFallRide.printInfo();
    }
}
