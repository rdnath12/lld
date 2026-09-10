class FarmHousePizza extends BasePizza {

    @Override
    public int cost() {
        System.out.println("FarmHouse Pizza costs 100 rupees");
        return 100;
    }
}
