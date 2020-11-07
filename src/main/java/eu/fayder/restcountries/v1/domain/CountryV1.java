/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package eu.fayder.restcountries.v1.domain;

import java.util.List;

import eu.fayder.restcountries.domain.BaseCountry;

public class CountryV1 extends BaseCountry {

    private List<String> currencies;
    private List<String> languages;
    private CountryTranslationsV1 translations;
    private String relevance;

    public List<String> getCurrencies() {
        return currencies;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public CountryTranslationsV1 getTranslations() {
        return translations;
    }

    public String getRelevance() {
        return relevance;
    }
}
