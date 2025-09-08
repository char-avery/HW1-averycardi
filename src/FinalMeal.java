package hw1DanielK;
public final class FinalMeal extends MenuItem implements Prepare {
private final String ingredients;
public FinalMeal(String name, double price, String ingredients) {
	super(name, price);
	this.ingredients = ingredients;
}
public String getingredients; {
	// Line 2 is allowing this file to extend into the other file and use stuff from the prepare file too
}




@Override //This tells Java that you're overriding a method from an interface
public void Prepare() {
	System.out.println("Preparing Dish: " + getname() + " " + getprice() + "$" + " with ingredients: " + ingredients);


}
public String getDescription() {
    return getname() + " is a delicious dish priced at $" + getprice();
}

	
	


}