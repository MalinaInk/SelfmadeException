package org.malinaink.exception;

import java.io.IOException;

public class FailIsDirectoryException extends IOException {
    public FailIsDirectoryException() {
    }

    public FailIsDirectoryException(String message) {
        super(message);
    }

    public FailIsDirectoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public FailIsDirectoryException(Throwable cause) {
        super(cause);
    }
}
