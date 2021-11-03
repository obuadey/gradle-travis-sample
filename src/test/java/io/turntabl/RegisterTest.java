package io.turntabl;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class RegisterTest {

    private Register register;

    @Before
    public void init() {
        register = new Register(Arrays.asList(
                new CorporateClient("Stanbic Bank GH","CC1",ServiceLevel.GOLD,"Sam"),
                new PrivateClient("Kofi Accra","PC1",ServiceLevel.GOLD),
                new CorporateClient("Access Bank GH","CC2",ServiceLevel.PREMIUM,"Chima"),
                new PrivateClient("Kofi Kumasi","PC2",ServiceLevel.PLATINUM)));
    }

    @Test
    public void testContactNamesForGoldClients(){
        assertEquals(Arrays.asList("Sam", "Kofi Accra"),register.contactNamesForGoldClients());
    }

    @Test
    public void testGetClientNameById(){
        assertEquals(Optional.of("Stanbic Bank GH"),register.getClientNameById("CC1"));
    }

    @Test
    public void testCountOfAllClientsAtEveryLevel(){
        Map<ServiceLevel, Long> testCount = new HashMap<>();
        testCount.put(ServiceLevel.PLATINUM, 1L);
        testCount.put(ServiceLevel.GOLD, 2L);
        testCount.put(ServiceLevel.PREMIUM, 1L);

        assertEquals(testCount,register.countOfAllClientsAtEveryLevel());
    }


}
