public class Demo {
    public static void main(String[] args) {

        MealBilder mealBuider = new MealBilder();

        Meal vegMeal = mealBuider.prepareVegMeal();
        System.out.println(" Meal");
        vegMeal.showItems();
        System.out.println("Total Cost : " + vegMeal.getCost());

    }
}
