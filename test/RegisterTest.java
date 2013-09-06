import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RegisterTest {
    @Test
    public void shouldVerifyProcessMethodPrintsAPurchase() throws Exception {
        MockPrinter printer = new MockPrinter();
        Register register = new Register(printer);
        Purchase purchase = new StubPurchase(new Item[]{});
        register.process(purchase);
        assertThat(printer.printGotCalled, is(true));
    }




}

