package com.kevinfalah.dataKaryawan.DataKaryawan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DataKaryawanRepository extends JpaRepository<DataKaryawan, Long> {
    @Query("SELECT s FROM DataKaryawan s WHERE s.nik = ?1")
    Optional<DataKaryawan> findNik(Integer nik);
}
