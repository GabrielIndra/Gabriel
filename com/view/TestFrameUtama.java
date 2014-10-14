/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestFrameUtama {
    public static void main(String[] args) {
        FrameUtama fu= new FrameUtama();
        DialogPekerja dp= new DialogPekerja(fu, true);
        fu.add(dp);
    }
}
