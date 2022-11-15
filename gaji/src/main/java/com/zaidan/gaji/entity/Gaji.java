/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zaidan.gaji.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author HP
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gaji {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gajiId;
    private Long pegawaiId;
    private Long getgapok;
    private Long getgajibersih;
    private String tanggal;
    private String gapok;
    private String golongan;
    private String tunj_anak;
    private String tunj_istri;

    public String getPegawaiId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}