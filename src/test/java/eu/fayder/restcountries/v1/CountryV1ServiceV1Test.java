/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package eu.fayder.restcountries.v1;

import java.util.List;

import eu.fayder.restcountries.v1.domain.CountryV1;
import org.junit.Assert;
import org.junit.Test;

import eu.fayder.restcountries.v1.rest.CountryServiceV1;

public class CountryV1ServiceV1Test {
	
	@Test
	public void singletonTest() throws Exception {
		for(int i = 0; i < 100; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					CountryServiceV1.getInstance();
				}
			}).run();
		}
	}
	
	@Test
	public void getAll() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getAll();
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		System.out.println("TOTAL Countries " + countries.size());
	}
	
	@Test
	public void getByAlpha2() throws Exception {
		CountryV1 country = CountryServiceV1.getInstance().getByAlpha("CO");
		Assert.assertNotNull(country);
		Assert.assertEquals("CO", country.getAlpha2Code());
	}
	
	@Test
	public void getByAlpha3() throws Exception {
		CountryV1 country = CountryServiceV1.getInstance().getByAlpha("COL");
		Assert.assertNotNull(country);
		Assert.assertEquals("COL", country.getAlpha3Code());
	}
	
	@Test
	public void getByCodeList() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByCodeList("CO;NOR;EE");
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals(3, countries.size());
		
		for(CountryV1 country : countries) {
			Assert.assertTrue(country.getAlpha2Code().equals("CO") || country.getAlpha2Code().equals("NO") || country.getAlpha2Code().equals("EE"));
		}
	}
	
	@Test
	public void getByCurrency() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByCurrency("EUR");
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		for(CountryV1 country : countries) {
			Assert.assertTrue(country.getCurrencies().contains("EUR"));
		}
	}
	
	@Test
	public void getByName() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByName("Norway", false);
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals("Norway", countries.get(0).getName());
	}
	
	@Test
	public void getByNamePriority() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByName("Iran", false);
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals("Iran", countries.get(0).getName());
		
		countries = CountryServiceV1.getInstance().getByName("United", false);
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals("United States Minor Outlying Islands", countries.get(0).getName());
	}
	
	@Test
	public void getByNameAlt() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByName("Norge", false);
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals("Norway", countries.get(0).getName());
	}
	
	@Test
	public void getByNameFullText() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByName("Russian Federation", true);
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals("Russia", countries.get(0).getName());
	}
	
	@Test
	public void getByNameFullTextNotFound() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByName("Russian Fed", true);
		Assert.assertNotNull(countries);
		Assert.assertTrue(countries.isEmpty());
	}
	
	@Test
	public void getByCallingCode() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByCallingCode("57");
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals(1, countries.size());
		Assert.assertEquals("CO", countries.get(0).getAlpha2Code());
	}
	
	@Test
	public void getByCapital() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByCapital("Tallinn");
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		Assert.assertEquals(1, countries.size());
		Assert.assertEquals("EE", countries.get(0).getAlpha2Code());
		Assert.assertEquals("Eesti", countries.get(0).getNativeName());
	}
	
	@Test
	public void getByRegion() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByRegion("Europe");
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		for(CountryV1 country : countries) {
			Assert.assertEquals("Europe", country.getRegion());
		}
	}
	
	@Test
	public void getBySubregion() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getBySubregion("Northern Europe");
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		for(CountryV1 country : countries) {
			Assert.assertEquals("Northern Europe", country.getSubregion());
		}
	}
	
	@Test
	public void getByLanguageCode() throws Exception {
		List<CountryV1> countries = CountryServiceV1.getInstance().getByLanguage("en");
		Assert.assertNotNull(countries);
		Assert.assertFalse(countries.isEmpty());
		for(CountryV1 country : countries) {
			Assert.assertTrue(country.getLanguages().contains("en"));
		}
	}

}
