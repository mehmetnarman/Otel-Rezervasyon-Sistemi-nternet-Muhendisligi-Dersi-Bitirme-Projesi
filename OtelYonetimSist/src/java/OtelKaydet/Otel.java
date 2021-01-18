/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OtelKaydet;

/**
 *
 * @author Mehmet NARMAN
 */
public class Otel {
    public int id;
    public String oteladi;
    public String sehir;

    public Otel() {
    }

    public Otel(int id, String oteladi, String sehir) {
        this.id = id;
        this.oteladi = oteladi;
        this.sehir = sehir;
    }

    public Otel(String oteladi, String sehir) {
        this.oteladi = oteladi;
        this.sehir = sehir;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOteladi() {
        return oteladi;
    }

    public void setOteladi(String oteladi) {
        this.oteladi = oteladi;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    @Override
    public String toString() {
        return "Otel{" + "id=" + id + ", oteladi=" + oteladi + ", sehir=" + sehir + '}';
    }
    
}    