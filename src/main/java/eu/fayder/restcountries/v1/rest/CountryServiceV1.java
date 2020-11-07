/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package eu.fayder.restcountries.v1.rest;

import eu.fayder.restcountries.rest.CountryServiceBase;
import eu.fayder.restcountries.v1.domain.CountryV1;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CountryServiceV1 extends CountryServiceBase {

    private static final Logger LOG = Logger.getLogger(CountryServiceV1.class);

    private static List<CountryV1> countries;

    private CountryServiceV1() {
        initialize();
    }

    private static class InstanceHolder {
        private static final CountryServiceV1 INSTANCE = new CountryServiceV1();
    }

    public static CountryServiceV1 getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public List<CountryV1> getAll() {
        return countries;
    }

    public CountryV1 getByAlpha(String alpha) {
        return super.getByAlpha(alpha, countries);
    }

    @SuppressWarnings("unchecked")
    public List<CountryV1> getByCodeList(String codeList) {
        return (List<CountryV1>) super.getByCodeList(codeList, countries);
    }

    @SuppressWarnings("unchecked")
    public List<CountryV1> getByName(String name, boolean isFullText) {
        return (List<CountryV1>) super.getByName(name, isFullText, countries);

    }

    @SuppressWarnings("unchecked")
    public List<CountryV1> getByCallingCode(String callingcode) {
        return (List<CountryV1>) super.getByCallingCode(callingcode, countries);
    }

    @SuppressWarnings("unchecked")
    public List<CountryV1> getByCapital(String capital) {
        return (List<CountryV1>) super.getByCapital(capital, countries);
    }

    @SuppressWarnings("unchecked")
    public List<CountryV1> getByRegion(String region) {
        return (List<CountryV1>) super.getByRegion(region, countries);
    }

    @SuppressWarnings("unchecked")
    public List<CountryV1> getBySubregion(String subregion) {
        return (List<CountryV1>) super.getBySubregion(subregion, countries);
    }

    public List<CountryV1> getByCurrency(String currency) {
        List<CountryV1> result = new ArrayList<>();
        for (CountryV1 country : countries) {
            for (String curr : country.getCurrencies()) {
                if (curr.toLowerCase().equals(currency.toLowerCase())) {
                    result.add(country);
                }
            }
        }
        return result;
    }

    public List<CountryV1> getByLanguage(String language) {
        List<CountryV1> result = new ArrayList<CountryV1>();
        for (CountryV1 country : countries) {
            for (String lang : country.getLanguages()) {
                if (lang.toLowerCase().equals(language.toLowerCase())) {
                    result.add(country);
                }
            }
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private void initialize() {
        countries = (List<CountryV1>) super.loadJson("countriesV1.json", CountryV1.class);
    }
}
