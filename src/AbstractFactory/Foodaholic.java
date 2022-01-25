package AbstractFactory;

/**
 * The abstract factory pattern is particularly suitable for a product structure in which the products are divided into
 * several families, and in each family the layout of the products is similar, and a product in one position in one
 * family must have a counterpart in another family. Such a product structure exists where products in the same position
 * in these families may be mutually exclusive, and they are solutions for different customers, each of whom chooses
 * only one of them.
 *
 */
public class Foodaholic {
    public static void main(String[] args) {
        Foodaholic factoryA = new Foodaholic();
        KitchenFactory kitchenA = new Kitchen();
        factoryA.eat(kitchenA);
    }

    //A foodaholic start to eat!
    public void eat(KitchenFactory k) {
        System.out.println(
                k.getFood().getFoodName() + " " + k.getTableWare().getToolName()
        );
    }
}

//abstract food
interface Food {
    public String getFoodName();
}

//abstract tableware
interface TableWare{
    public String getToolName();
}

//abstract factory
interface KitchenFactory{
    public Food getFood();
    public TableWare getTableWare();
}

//concrete food Apple define
class Apple implements Food {
    @Override
    public String getFoodName() {
        return "apple";
    }
}

//concrete tool Knife define
class Knife implements TableWare {
    @Override
    public String getToolName() {
        return "knife";
    }
}
//concrete factory
class Kitchen implements KitchenFactory {

    @Override
    public Food getFood() {
        return new Apple() {
        };
    }

    @Override
    public TableWare getTableWare() {
        return new Knife();
    }
}