public class PlantTester {
    public static void main(String[] args) {
  
        Plant plant1 = new Plant("Monstera", 12, 18.5, true);
        Plant plant2 = new Plant("SnakePlant", 6, 12.0, false);
        Plant plant3 = new Plant("FiddleLeaf", 24, 36.0, true);

        System.out.println("Plant1 evaluation result (should be true): " + plant1.evaluateGrowthStatus(18.0, 10));
        System.out.println("Plant2 evaluation result (should be false): " + plant2.evaluateGrowthStatus(10.0, 2));
        System.out.println("Plant3 evaluation result (should be true): " + plant3.evaluateGrowthStatus(35.0, 5));


   
        System.out.println("Plant1 check (matching name & keyword) (should be true): " + plant1.checkNameAndKeyword("Monstera", "Mon"));
        System.out.println("Plant1 check (wrong name) (should be false): " + plant1.checkNameAndKeyword("Fern", "Mon"));
        System.out.println("Plant3 check (matching name & keyword) (should be true): " + plant3.checkNameAndKeyword("FiddleLeaf", "Fid"));


        String summary2 = "Plant Name: SnakePlant, Age: 6mo, Height: 12.0in, Direct Sun: false";
        String summary3 = "Plant Name: FiddleLeaf, Age: 24mo, Height: 36.0in, Direct Sun: true";
        
        System.out.println("Plant2 check (matching summary) (should be true): " + plant2.matchesSummaryDescription(summary2));
        System.out.println("Plant3 check (matching summary) (should be true): " + plant3.matchesSummaryDescription(summary3));
        System.out.println("Plant3 check (wrong summary) (should be false): " + plant3.matchesSummaryDescription("Insert bad summary description"));
        
    }
}