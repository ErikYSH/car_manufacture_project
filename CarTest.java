public class CarTest 
{
    public static void main (String[] args)
    {
        // CAR 1
        Car audi = new Car(50, "AudiR8");
        audi.setPassengers(2);
        int passengerInCar = audi.getPassengers();
        double gasPumped = audi.addGas(30);
        int drove = 500;
        audi.drive(drove);
        double gasLevel = audi.getGassLevel();
        
        System.out.println("Project 1: Car - Shih-Hung Yang ");
        System.out.printf("Your %s %n" , audi.carName);
        System.out.printf("Your car holds %d passenger(s) %n" , passengerInCar);
        System.out.printf("You have successfully pumped %.2f Gallon %n", gasPumped);
        System.out.printf("Drove %d miles and you have %.2f Gallon left %n", drove, gasLevel);
        System.out.println("---------------------");

        // CAR 2 
        Car lexus = new Car(42, "Lexus ls400");
        lexus.setPassengers(4);
        int passengerInCar2 = lexus.getPassengers();
        double gasPumped2 = lexus.addGas(14);
        int drove2 = 200;
        lexus.drive(drove2);
        double gasLevel2 = lexus.getGassLevel();

        System.out.printf("Your %s %n" , lexus.carName);
        System.out.printf("Your car holds %d passenger(s) %n" , passengerInCar2);
        System.out.printf("You have successfully pumped %.2f Gallon %n", gasPumped2);
        System.out.printf("Drove %d miles and you have %.2f Gallon left %n", drove2, gasLevel2);
    }
}