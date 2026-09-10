class ExtraCheesePizza extends BasePizza {

    private final BasePizza pizza;

    ExtraCheesePizza(BasePizza pizza) {
        this.pizza = pizza; 
    }

    @Override
    public int cost() {
        int cost = pizza.cost();
        System.out.println("ExtraCheese costs 10 rupees");
        return  cost+ 10;
    }
}
