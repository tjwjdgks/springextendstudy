package com.seo.springextend.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ChickenController.class)
class ChickenControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void chicken() throws Exception {
        mockMvc.perform(get("/chicken"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}