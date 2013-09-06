class StubPurchase extends Purchase{

    public StubPurchase(Item[] items) {
        super(items);
    }

    public String asString(){
        return "";
    }
}