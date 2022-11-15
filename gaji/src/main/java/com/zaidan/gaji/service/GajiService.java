/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaidan.gaji.service;

import com.zaidan.gaji.VO.Pegawai;
import com.zaidan.gaji.VO.ResponseTemplateVO;
import com.zaidan.gaji.entity.Gaji;
import com.zaidan.gaji.repository.GajiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author HP
 */
@Service
public class GajiService {
    @Autowired
    private GajiRepository gajiRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    private Long gajiId;
    
    public Gaji saveGaji(Gaji gaji) {
        return gajiRepository.save(gaji);
    }
    
    public ResponseTemplateVO getGaji(Long GajiId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Gaji gaji = gajiRepository.findByGajiId(gajiId);
        
        Pegawai pegawai = restTemplate.getForObject("http://localhost:9001/pegawai/"+gaji.getPegawaiId(), Pegawai.class);
        vo.setGaji(gaji);
        vo.setPegawai(pegawai);
        return vo;
    }
}

