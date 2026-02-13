package Mattiazerbini.U5_W2_D5.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException(UUID message) {
        super(String.valueOf(message));
    }
}
