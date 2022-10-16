package com.kevinfalah.dataKaryawan.DataKaryawan;

public class DataKaryawanNotFoundException extends RuntimeException{
    DataKaryawanNotFoundException(Long id) {
        super(String.format("Data with id = %s is not found", id));
    }
}
