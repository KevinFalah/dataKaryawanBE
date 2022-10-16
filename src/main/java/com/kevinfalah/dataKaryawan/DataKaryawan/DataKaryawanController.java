package com.kevinfalah.dataKaryawan.DataKaryawan;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DataKaryawanController {
  private DataKaryawanRepository dataKaryawanRepository;

  private DataKaryawanService dataKaryawanService;

    public DataKaryawanController(DataKaryawanRepository dataKaryawanRepository, DataKaryawanService dataKaryawanService) {
        this.dataKaryawanRepository = dataKaryawanRepository;
        this.dataKaryawanService = dataKaryawanService;
    }

    @GetMapping("/data-karyawan")
    @CrossOrigin(origins = "*")
    List<DataKaryawan> all() {
        return dataKaryawanRepository.findAll();
    }

    @PostMapping("/data-karyawan")
    @CrossOrigin(origins = "*")
    DataKaryawan save(@RequestBody DataKaryawan newDataKaryawan) {
        return dataKaryawanService.saveOrFail(newDataKaryawan);
    }

    @GetMapping("/data-karyawan/{id}")
    @CrossOrigin(origins = "*")
    DataKaryawan get(@PathVariable Long id) {
        return dataKaryawanRepository.findById(id).orElseThrow(() -> new DataKaryawanNotFoundException(id));
    }

    @PutMapping("/data-karyawan/{id}")
    @CrossOrigin(origins = "*")
    DataKaryawan update(@PathVariable Long id, @RequestBody DataKaryawan newDataKaryawan) {
        return dataKaryawanRepository.findById(id).map(dataKaryawan -> {
            dataKaryawan.setNik(newDataKaryawan.getNik());
            dataKaryawan.setNamaLengkap(newDataKaryawan.getNamaLengkap());
            dataKaryawan.setAlamat(newDataKaryawan.getAlamat());
            dataKaryawan.setJenisKelamin(newDataKaryawan.getJenisKelamin());
            dataKaryawan.setTanggalLahir(newDataKaryawan.getTanggalLahir());
            dataKaryawan.setNegara(newDataKaryawan.getNegara());
            return dataKaryawanRepository.save(dataKaryawan);
        }).orElseThrow(() -> new DataKaryawanNotFoundException(id));
    }

    @DeleteMapping("/data-karyawan/{id}")
    @CrossOrigin(origins = "*")
    String delete(@PathVariable Long id) {
        dataKaryawanRepository.deleteById(id);
        return "Delete Success";
    }
}
