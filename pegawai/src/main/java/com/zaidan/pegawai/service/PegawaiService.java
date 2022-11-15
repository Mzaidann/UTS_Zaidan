/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaidan.pegawai.service;

import com.zaidan.pegawai.entity.Pegawai;
import com.zaidan.pegawai.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class PegawaiService {
    @Autowired
    private PegawaiRepository pegawaiRepository;
    
    public Pegawai savePegawai(Pegawai pegawai){
        return pegawaiRepository.save(pegawai);
    }
    
    public Pegawai findPegawaiById(Long pegawaiId){
        return (Pegawai) pegawaiRepository.findByPegawaiId(pegawaiId);
    }

   
}