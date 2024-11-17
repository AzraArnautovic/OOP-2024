package examprep.restaurantManagement;

public class Dish extends MenuItem{
    CuisineType cuisineType;
    String mainIngredient;

    public Dish(String code, String name, double price, CuisineType cuisineType, String mainIngredient) {
        super(code, name, price);
        this.cuisineType = cuisineType;
        this.mainIngredient = mainIngredient;
    }
    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType=cuisineType;
    }
    public CuisineType getCuisineType(){
        return cuisineType;
    }
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }
    public String getMainIngredient(){
        return mainIngredient;
    }

    @Override
    public String getDescription() {
        return  super.getDescription() +  ", Cuisine: " + cuisineType + ", Main Ingredient: " + mainIngredient;
    }
}
