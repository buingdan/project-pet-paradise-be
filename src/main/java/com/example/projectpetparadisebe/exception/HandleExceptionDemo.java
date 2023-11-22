package com.example.projectpetparadisebe.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HandleExceptionDemo {
    private int status;
    private String message;
}
