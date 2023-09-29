import java.util.Random;

class AirQualityData {
    private double airQualityIndex;

    public AirQualityData() {
        // Simulate collecting air quality data (e.g., between 0 and 100)
        Random rand = new Random();
        airQualityIndex = rand.nextDouble() * 100;
    }

    public double getAirQualityIndex() {
        return airQualityIndex;
    }
}

class Main {
    public static void main(String[] args) {
        // Simulate continuous data monitoring
        while (true) {
            AirQualityData airQualityData = new AirQualityData();

            // Analyze the data
            double airQualityIndex = airQualityData.getAirQualityIndex();
            System.out.println("Current Air Quality Index: " + airQualityIndex);

            // Perform actions based on analysis (e.g., send alerts, take corrective measures)
            if (airQualityIndex > 70) {
                System.out.println("Alert: Poor air quality detected. Take necessary actions.");
            }

            // Sleep for a period (simulating real-time data monitoring)
            try {
                Thread.sleep(10000); // Sleep for 10 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

