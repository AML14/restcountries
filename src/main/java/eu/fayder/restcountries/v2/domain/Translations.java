package eu.fayder.restcountries.v2.domain;

import eu.fayder.restcountries.v1.domain.CountryTranslationsV1;

/**
 * Created by fayder on 05/03/2017.
 */
public class Translations extends CountryTranslationsV1 {

    private String br;
    private String pt;
    private String nl;
    private String hr;
    private String fa;

    public String getBr() {
        return br;
    }

    public String getPt() {
        return pt;
    }

    public String getNl() {
        return nl;
    }

    public String getHr() {
        return hr;
    }

    public String getFa() {
        return fa;
    }
}
