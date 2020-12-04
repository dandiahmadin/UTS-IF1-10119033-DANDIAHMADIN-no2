/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119033.dandiahmadin.no2;

/**
 *
 * @author Dandi Ahmadin
 */
public class Tabungan {
    private int saldo;
    
    Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
}
