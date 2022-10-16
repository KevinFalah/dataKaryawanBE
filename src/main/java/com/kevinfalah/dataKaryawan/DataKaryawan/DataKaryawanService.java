package com.kevinfalah.dataKaryawan.DataKaryawan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DataKaryawanService {

    private final DataKaryawanRepository dataKaryawanRepository;
    @Autowired
    public DataKaryawanService(DataKaryawanRepository dataKaryawanRepository) {
        this.dataKaryawanRepository = dataKaryawanRepository;
    }

    public DataKaryawan saveOrFail(DataKaryawan dataKaryawan) {
        Optional<DataKaryawan> findNik = dataKaryawanRepository.findNik(dataKaryawan.getNik());

        // if registration number already exist? throw an exception
        if (findNik.isPresent()) {
            throw new IllegalStateException("NIK is already exist");
        }

        // if not, save into database
        return dataKaryawanRepository.save(dataKaryawan);
    }
}
