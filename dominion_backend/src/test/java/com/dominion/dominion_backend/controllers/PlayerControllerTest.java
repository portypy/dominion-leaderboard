package com.dominion.dominion_backend.controllers;

import com.dominion.dominion_backend.models.Player;
import com.dominion.dominion_backend.repositories.PlayerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class PlayerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    PlayerRepository playerRepository;

    @Test
    public void shouldReturnPlayer() throws Exception {
        Player player = new Player("Prince");
        playerRepository.save(player);
        this.mockMvc.perform(get("/players")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Prince")));
    }
}
