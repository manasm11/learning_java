package com.manas.mockito.service;

import com.manas.mockito.data.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AuthenticationServiceTest {
    private AuthenticationService service;
    private UserRepository repository;

    @BeforeEach
    public void setUp() {
        this.repository = Mockito.mock(UserRepository.class);
        this.service = new AuthenticationService(repository);
    }

    @Test
    public void testAuthenticate() {
        // Arrange
        Mockito.when(repository.findByUsername(Mockito.anyString())).thenThrow(new IllegalArgumentException());

        // Act
        service.authenticate("Any Username", "Any Password");

        // Assert
    }
}
