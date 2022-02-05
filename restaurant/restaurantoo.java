package restaurant;

public class restaurantoo {
  public static void main(String[] args) {
    Food[] menu = new Food[100];
    Food f1 = new Food("Padthai", 70.00, 200, "Noodle");
    menu[0] = f1;
    System.out.println("Lap 1: ID: 64130500220 Pongsapuk Lubkim ");
    System.out.println(menu[0].getName() + " " + menu[0].price);
    f1.addIngredinet("Thin noodle", 200);
    f1.addIngredinet("Shrimp", 100);
    f1.addIngredinet("Beansprout", 50);
    f1.addIngredinet("egg", 1);
    f1.addIngredinet("tofu", 50);
    System.out.println("The Number of ingredients of Padthai is " + menu[0].getAmountOfIngredient());

    menu[1] = new Food("Orange Juice", 30, 100, "Drink");
    menu[1].addIngredinet("Orange", 1);
    menu[1].addIngredinet("salt", 20);
    menu[1].addIngredinet("sugar", 40);

    menu[2] = new Food("Corn soup", 80, 300, "Soup");
    menu[2].addIngredinet("Corn", 200);
    menu[2].addIngredinet("salt", 20);
    menu[2].addIngredinet("Milk", 200);

    for (int i = 0; menu[i] != null; i++) {
      System.out.println(menu[i].getName() + " " + menu[i].getPrice());
      for (int j = 0; j < menu[i].getAmountOfIngredient(); j++) {
        System.out.print(menu[i].ingredient[j] + ";" + menu[i].ingrdientQuantity[j] + ", \n");
      }
      System.out.println();
    }

  }
}
