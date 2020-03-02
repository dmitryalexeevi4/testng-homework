package com.github.dmitryalexeevi4;

import org.slf4j.*;
import org.testng.annotations.*;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @Test
    public void simpleTest() {
        LOG.info("Simple test complete!");
    }
}
