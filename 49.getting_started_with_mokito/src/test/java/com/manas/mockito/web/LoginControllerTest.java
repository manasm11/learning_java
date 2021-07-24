package com.manas.mockito.web;

import com.manas.mockito.service.AuthenticationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class LoginControllerTest {

    private LoginController controller; // SUT
    private AuthenticationService service; // mock


    @BeforeEach
    public void setUp() {
        this.service = mock(AuthenticationService.class);
        this.controller = new LoginController(this.service);
    }

    @Test
    public void testService_validUsernameAndPassword() {
        // Arrange
        when(service.authenticate(anyString(), anyString())).thenReturn(true);

        // Act
        String path = this.controller.service("something", "somethingelse");

        // Assert
        Assertions.assertEquals("/home", path);
    }
}
