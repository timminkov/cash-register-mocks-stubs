class MockPrinter implements Printer{
    public boolean printGotCalled = false;

    @Override
    public void print(String printThis) {
        this.printGotCalled = true;
    }
}