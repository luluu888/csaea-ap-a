public class Plant {
    private String name;
    private int ageInMonths;
    private double heightInInches;
    private boolean needsDirectSunlight;

    public Plant(String name, int ageInMonths, double heightInInches, boolean needsDirectSunlight) {
        this.name = name;
        this.ageInMonths = ageInMonths;
        this.heightInInches = heightInInches;
        this.needsDirectSunlight = needsDirectSunlight;
    }
    public String toString() {
        return "Plant Name: " + name + ", Age: " + ageInMonths + "mo, Height: " + heightInInches + "in, Direct Sun: " + needsDirectSunlight;
    }

    public boolean evaluateGrowthStatus(double heightThreshold, int ageBonus) {
        double adjustedHeight = heightInInches * 1.05; 
        int totalAge = ageInMonths + ageBonus;
                return needsDirectSunlight && (adjustedHeight >= heightThreshold) && (totalAge > 5);
    }

    public boolean checkNameAndKeyword(String compareName, String searchKeyword) {
        boolean nameMatches = name.equals(compareName);
        
        int index = -1;
        
        if (searchKeyword.length() > 0) {
            String sub = searchKeyword.substring(0, 1);
            index = name.indexOf(sub);
        }

        return nameMatches && (index != -1);
    }
     

   
    public boolean matchesSummaryDescription(String targetSummary) {
        String currentSummary = this.toString(); 
        return currentSummary.equals(targetSummary); 
    }
}







