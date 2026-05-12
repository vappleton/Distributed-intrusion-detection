package com.vappleto.ids;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClientMainTest {

    @Test
    public void testInternalIpGeneration() {
        String ip = ClientMain.generateInternalIp();

        assertTrue(ip.startsWith("192.168."));

    }

    @Test
    public void testExternalIpGeneration() {

        String ip = ClientMain.generateExternalIp();

        assertNotNull(ip);
        assertTrue(ip.contains("."));
    }

    @Test
    public void testAttackTypeGeneration() {
        String attack = ClientMain.randomAttackType();

        assertNotNull(attack);
        assertFalse(attack.isEmpty());

    }

    @Test
    public void testSeverityGeneration() {
        String severity = ClientMain.randomSeverityLevel();

        assertTrue(severity.equals("LOW")
        || severity.equals("MEDIUM")
        || severity.equals("HIGH")
        || severity.equals("CRITICAL"));

    }
    @Test
    public void testDescriptionGeneration() {

        String description =
                ClientMain.generateDescription("Port Scan");

        assertEquals(
                "Multiple ports probed rapidly",
                description
        );
    }
}
