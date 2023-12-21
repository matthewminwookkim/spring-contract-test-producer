package org.example.producer;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeAll;

public class BaseContractTest {

    @BeforeAll
    static void beforeAll() {
        RestAssuredMockMvc.standaloneSetup(new HelloController());
    }
}
