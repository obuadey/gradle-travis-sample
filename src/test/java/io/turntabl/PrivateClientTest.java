package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrivateClientTest {


    private Client privateClient;


    @Before
    public void init() {
        privateClient = new PrivateClient("Kofi Ghana","PC1",ServiceLevel.PLATINUM);
    }

    @Test
    public void testPrivateKindOfClient() {
        assertTrue(privateClient instanceof Client);
    }

    @Test
    public void testPrivateGetContactName() {
        assertEquals("Kofi Ghana",privateClient.getClientContactName());
    }

}
