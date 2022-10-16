package com.kevinfalah.dataKaryawan.DataKaryawan;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DataKaryawanNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(DataKaryawanNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String dataKaryawanNotFoundHandler(DataKaryawanNotFoundException e) {
        return e.getMessage();
    }
}
