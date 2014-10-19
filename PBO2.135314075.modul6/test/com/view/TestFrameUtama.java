package com.view;

/**
 *
 * @author 8.1 Enterprise
 */
public class TestFrameUtama {
    public static void main(String[] args) {
        FrameUtama test= new FrameUtama();
        DialogPekerja dp = new DialogPekerja(test, true);
        test.add(dp);
    }
}
