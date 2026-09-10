class MushroomPizza extends BasePizza {

    private final BasePizza pizza;

    MushroomPizza(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        int cost = pizza.cost() ;
        System.out.println("Mushroom costs 50 rupees");
        return cost + 50;
    }
}
