package checkout;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class productTest {

    @Test
    public void testThat_IHave_AValid_ProductCreated_Successfully() {
        Product product = new Product("Rice", 2, 550.00);
        assertEquals("Rice", product.getName());
        assertEquals(2, product.getQuantity());
        assertEquals(550.00, product.getUnitPrice(), 0.001);
    }

    @Test
    public void testThat_TheTotalOn_TheSame_LineIs_Calculated_Correctly() {
        Product product = new Product("Rice", 2, 550.00);
        assertEquals(1100.00, product.newlineTotal(), 0.001);
    }

}
