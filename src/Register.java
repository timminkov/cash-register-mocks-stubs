class Register implements CashRegister {

    private Printer printer;

    public Register(Printer printer){

        this.printer = printer;
    }
    public void process(Purchase purchase) {
        printer.print(purchase.asString());
    }

}
