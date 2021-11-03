package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporateClientTest {

    private Client corporateClient;

    @Before
    public void init() {
        corporateClient = new CorporateClient("Stanbic Bank GH","CC1",ServiceLevel.PREMIUM,"Sam");
    }


    @Test
    public void testCorporateKindOfClient() {
        assertTrue(corporateClient instanceof Client);
    }

    @Test
    public void testCorporateGetContactName() {
        assertEquals("Sam",corporateClient.getClientContactName());
    }





}
