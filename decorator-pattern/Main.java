class Main{
    public static void main(String[] args) {
        MargheritaPizza pizza = new MargheritaPizza();
        ExtraCheesePizza cheesePizza = new ExtraCheesePizza(pizza);
        System.out.println("Total cost: "+cheesePizza.cost());

        FarmHousePizza farmPizza = new FarmHousePizza();
        MushroomPizza mushroomPizza = new MushroomPizza(farmPizza);
        ExtraCheesePizza extraCheesePizza = new ExtraCheesePizza(mushroomPizza);
        System.out.println("Total cost: "+extraCheesePizza.cost());


    }
}