package com.github.dmitryalexeevi4;

import org.slf4j.*;
import org.testng.annotations.*;

public class ParameterizedTest {
    private static final Logger LOG = LoggerFactory.getLogger(ParameterizedTest.class);

    @DataProvider(name = "Дата провайдер")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"Дмитрий", 24}
        };
    }

    @Test(dataProvider = "Дата провайдер")
    public void paramTest(String name, int age) {
        String print = String.format("Имя: %s | Возраст: %d", name, age);
        LOG.info(print);
    }
}
