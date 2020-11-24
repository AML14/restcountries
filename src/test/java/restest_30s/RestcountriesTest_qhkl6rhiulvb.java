package restest_30s;

import eu.fayder.restcountries.EMDriver;
import org.evomaster.client.java.controller.SutHandler;
import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_qhkl6rhiulvb {


	private static final SutHandler controller = new EMDriver();
	private static String baseUrlOfSut;


	@BeforeClass
	public static void initClass() {
		controller.setupForGeneratedTest();
		baseUrlOfSut = controller.startSut();
		assertNotNull(baseUrlOfSut);
		RestAssured.baseURI = "http://localhost:8080/rest";
	}


	@AfterClass
	public static void tearDown() {
		controller.stopSut();
	}

	@Test
	public void test_qe9efdawfmeu_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbli8q21rm90_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl65rvbzkbxg_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t8f8f2g37b5f_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyagjujqpdur_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skq1inmbk0o4_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jer1rk29h839_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubrxnndka06b_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sohwcj7fe6uo_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyc8mzqtaoo3_v1All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrbff859371d_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MMR")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4f2yunol3jr_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "ALA")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s1b3y29dymw6_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "HT")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iupwtiyc94c3_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "TD")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jefy7ku76ezm_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BL")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4nd71h2k0o6_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MLT")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8dgv84a8lko_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SDN")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4nccgixtn3q_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "JOR")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7tqup8n58vm_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MNP")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urmdlnif97hy_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "EC")
			.when()
				.get("/v1/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h820zxhsxtgi_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jewkutekakad_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "YT")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv72yp50xvzt_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "KE")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhdaps04b2nt_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MQ;AL")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib3pvh3ifx2p_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "LBY")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7wzub1cqp80_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "LB")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhowzolktmxy_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BH;NRU;DM")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rlb604nvrprr_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "KGZ;GAB;HN")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us0pmrmme6w5_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "TUR;LAO")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rlapmqh81nap_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "FM")
			.when()
				.get("/v1/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hux7zlq0vub6_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "SOS")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s507x9oecx84_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BSD")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skycrm0elgdv_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BRL")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to2amt82j8f6_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "USS")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s12tslpq106s_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "CHF")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jicqwdkoojzm_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "VUV")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl8zhqro440x_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "UYI")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sok3gsad5fsg_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BRL")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhllnicgdqau_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "ZAR")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbmx41nlznea_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "PHP")
			.when()
				.get("/v1/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhugxjao7ntw_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "EUvfsOWQxbrczpaR")
				.pathParam("name", "Armenia")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib0wusws2kvq_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Bhutan")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf6fwmr3ot41_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Canada")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urguwgw0xkkm_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Kazakhstan")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qeevp8t7u62h_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "United States")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrj8cus8fyht_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Holy See")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuvgtwesu9td_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Guinea-Bissau")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rh5i3tntlzjk_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Anguilla")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jygkd48apyr8_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Barbados")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib5xrkhyw6si_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Oman")
			.when()
				.get("/v1/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy5g3hlzte1y_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "242")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4idj0af525y_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "228")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1if114nxs2u76_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "218")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jygj70hut3jo_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "57")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubj2dwk61wdx_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "375")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib0gy091y546_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "238")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4p4cr4ehbhh_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "373")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhlogf406moz_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "248")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv3rp5xl7far_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "992")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us085m8f1ox1_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "354")
			.when()
				.get("/v1/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv95pka5fxwj_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "West Island")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv9c11qvhwm9_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "South Tarawa")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jei7o2jeifdu_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Longyearbyen")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib3q6v6vzqk2_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Baku")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urv78zd9qq1y_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Roseau")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhibqfcx6cm9_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Singapore")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrgfek5axxlt_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Hamilton")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy7r3xgro486_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Freetown")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrdo0re99x7l_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Belmopan")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7r9fjgf292b_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Porto-Novo")
			.when()
				.get("/v1/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tofnywqdtaw1_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Asia")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvbws4xso6yd_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Polar")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbafzq4u90l1_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Asia")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv0zx852fp7m_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Europe")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jett5ce3ygrl_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Europe")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdsqaef3hc1h_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Polar")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jifkmfbdt3qx_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Asia")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t86wbaspprok_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Africa")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7lwqrr47b6q_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Europe")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji4imik7kg8l_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Americas")
			.when()
				.get("/v1/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1u0zaoflcmp_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Western Europe")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibh37c2654c5_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Caribbean")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8571c9qgzmp_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Central America")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy1o5s7iww2p_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Northern Europe")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv6e0bjgtx6c_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Northern Europe")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhsvqgc0l46a_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Northern America")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe9dn4sdshmb_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Northern Africa")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iukeu1n9ilph_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Southern Asia")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy1mxa4552rc_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Micronesia")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv2pnu5buezn_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Middle Africa")
			.when()
				.get("/v1/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbt0gt3nl35g_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ms")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jyazc0exhsmp_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ts")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ji4hiu2cbhgz_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "fj")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8anxcwkbejm_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "fa")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7fwqykmo19d_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "kl")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rkwurj9w3m0g_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "th")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iuyavhps6oo2_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "et")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s18bdvzghlbm_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ln")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy26evvhqywh_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "he")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_urhblbserf4x_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ff")
			.when()
				.get("/v1/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1a1wyq0nbdt_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones;name;translations")
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhncyizwh65e_v2All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t87e8s5aclyo_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode;nativeName;flag")
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sohdn1zxh4xi_v2All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trrbf3ghfxpf_v2All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1ugw1ekhp2q_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tog6o623c678_v2All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rh50khqj9feh_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion")
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r1lnncijsdv6_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies;region")
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iepz79kh8zzl_v2All() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v2/all");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k22acujjllx1_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "PW")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7wuzzs7h084_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones")
				.pathParam("alphacode", "IMN")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7wvs3z295br_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BA")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u82g1arw8k12_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "YEM")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeadvir245lu_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "LVA")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhnt9ip6se9f_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "UM")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdt8x4yrv2uo_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code")
				.pathParam("alphacode", "LTU")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1k1r8cu9cfgoh_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "UGA")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iay70x44o8c7_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MU")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibhko760jk8j_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
				.pathParam("alphacode", "EE")
			.when()
				.get("/v2/alpha/{alphacode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4cscprzajw8_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t84m2z602czb_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "TH;TZ")
				.queryParam("fields", "capital")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jenraakychtk_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "GW;NLD")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_r17tmg27tsv8_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "KI;GW")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyc5u6wtevs1_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "ET;BV")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvhg9jpmb49v_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "CI;NA;KOR")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxyx3nsjqwc7_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "KAZ;LSO")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts2ez8kj5vli_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MOZ")
				.queryParam("fields", "cioc")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sohe1bbkglyv_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "ATF;WS")
				.queryParam("fields", "currencies")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdq18qoba8v5_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MMR;MYT;VGB")
			.when()
				.get("/v2/alpha");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib0g5w3965h3_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag")
				.pathParam("currency", "ZMW")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_us08xuqbvuwl_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population;area;alpha3Code")
				.pathParam("currency", "SSP")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7p0tsp5nyup_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
				.pathParam("currency", "TWD")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hr5dxxl2xyzm_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "ILS")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u7zkravs8ylw_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name;alpha3Code")
				.pathParam("currency", "RSD")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1if0k1zhogk82_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini;name")
				.pathParam("currency", "MKD")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeyv3dcnoto2_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "INR")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sl67qcrg7v3p_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code")
				.pathParam("currency", "GYD")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4nedd2h08df_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "TZS")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy2p6coak3le_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs")
				.pathParam("currency", "CHW")
			.when()
				.get("/v2/currency/{currency}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jicsgpx2ee01_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "8327")
				.queryParam("fields", "gini")
				.pathParam("name", "Hungary")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s15k05kpde7s_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "China")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv6jh5p53i9h_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Georgia")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qeewf05h3uwm_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
				.pathParam("name", "Turks and Caicos Islands")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4se4qmyoajo_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.queryParam("fields", "translations;flag;alpha3Code;population;subregion")
				.pathParam("name", "Armenia")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skk1x9c4oeap_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.queryParam("fields", "subregion;translations")
				.pathParam("name", "United States")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jezcmhcptuev_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.queryParam("fields", "area")
				.pathParam("name", "Myanmar")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4nvwinov8l4_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.queryParam("fields", "altSpellings")
				.pathParam("name", "Svalbard and Jan Mayen")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdyc6aqgwu3n_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code;alpha3Code")
				.pathParam("name", "French Southern and Antarctic Lands")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trtm1wdu59id_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Nigeria")
			.when()
				.get("/v2/name/{name}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jy87vqx1wn6u_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "34")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdsqzrxaod2s_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "670")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ts2g3300d1ki_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion;latlng;callingCodes")
				.pathParam("callingcode", "27")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_tofn6uiaebef_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "222")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u8dzkv7rhz6q_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "383")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv5u2699pe90_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
				.pathParam("callingcode", "967")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7z9ovfmt8ae_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code;region;borders;latlng;cioc")
				.pathParam("callingcode", "505")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sksa4ibt704h_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "258")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyhrc8eow2lu_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code;demonym;nativeName;timezones;altSpellings")
				.pathParam("callingcode", "886")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeipno2q0pit_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "594")
			.when()
				.get("/v2/callingcode/{callingcode}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4vog47n7a78_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc;population;translations;altSpellings;nativeName")
				.pathParam("capital", "South Tarawa")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_to1t37e8gw8p_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Fort-de-France")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv9uq6t3bak1_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area;numericCode;population")
				.pathParam("capital", "Luxembourg")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrrkgcjckoxj_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Road Town")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ibbzy4byb9rq_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("capital", "Mal\u00E9")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qe6krscd2ud1_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Conakry")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rhiv4kfp3oz6_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Oslo")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf3q30cqc302_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Wellington")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvjo8bdvtbn6_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Papeet\u0113")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iyi8h70u6j4x_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc;population")
				.pathParam("capital", "Amsterdam")
			.when()
				.get("/v2/capital/{capital}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iey9cluhb71e_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
				.pathParam("region", "Africa")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s102eozyd7w5_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code")
				.pathParam("region", "Oceania")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7oq2zkzynu8_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings")
				.pathParam("region", "Europe")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4v5wuc978s7_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Asia")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv5toaq6ws37_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Europe")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jifk5z0in4fq_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages;population;capital;regionalBlocs")
				.pathParam("region", "Asia")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vf96tpnbxc8n_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Asia")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iauw87az7hvb_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones;languages")
				.pathParam("region", "Africa")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_trqse5vkqmhv_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
				.pathParam("region", "Polar")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hbaf7nk7704l_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Polar")
			.when()
				.get("/v2/region/{region}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4w80g8fqgqd_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Middle Africa")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1jeiqtxc5qr02_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Southern Europe")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ib6hn4nlycl4_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Northern Europe")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdqgrdxmvucj_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Eastern Europe")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iaxnzz6gj144_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("subregion", "Northern America")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv9e1jtfoxf6_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population;gini;name;region")
				.pathParam("subregion", "Northern Europe")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrs1zyoi3yhu_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Western Asia")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hux6fexqtlix_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Caribbean")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7zb6jh1jxo2_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Australia and New Zealand")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qeevpcr216pj_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Western Asia")
			.when()
				.get("/v2/subregion/{subregion}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iupww3an0h84_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings;gini")
				.pathParam("lang", "ht")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhsuvpf4kqxw_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area;cioc")
				.pathParam("lang", "sl")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t81avyds50kx_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs;alpha3Code;capital")
				.pathParam("lang", "de")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_ubu8zptdxw11_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code;numericCode")
				.pathParam("lang", "bi")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skydxxmez4o3_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ms")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_s4pmajjp2aue_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "bg")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rlanaprca9td_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "sv")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iv0z55jxdoab_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code;currencies")
				.pathParam("lang", "so")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_skms7dib1xyo_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "pa")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hrdq1t4awysy_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "fi")
			.when()
				.get("/v2/lang/{lang}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv2qg69ddws8_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital;alpha3Code;area")
				.pathParam("demonym", "Falkland Islander")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1ies94difivs4_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Motswana")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4a091cyuo9v_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Guadeloupian")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_vbemyjfohzdw_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain")
				.pathParam("demonym", "Barbadian")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t4a06uf67whf_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Sao Tomean")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qhvlvb3u1mxw_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "New Caledonian")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7lf4n7uogtu_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Burmese")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_sok510myg57q_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Afghan")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_toa3n4gii0j8_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "French Polynesian")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qxwnbfu64z00_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "New Zealander")
			.when()
				.get("/v2/demonym/{demonym}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1h7wib2qswdwm_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "CAIS")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qdqibgeh9jcl_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "USAN")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_rl544wwh9vef_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings")
				.pathParam("regionalbloc", "CAIS")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_u87y11vmmqeu_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag")
				.pathParam("regionalbloc", "ASEAN")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uvgxjwlauixw_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "NAFTA")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_qy1ov3u2hysl_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "EFTA")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_t84m2owxcjzt_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "CEFTA")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_uv95pu6p7rjp_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode")
				.pathParam("regionalbloc", "PA")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1hv005kn8ql44_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital")
				.pathParam("regionalbloc", "EU")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

	@Test
	public void test_1iukvlj8stt86_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain;altSpellings;languages")
				.pathParam("regionalbloc", "EFTA")
			.when()
				.get("/v2/regionalbloc/{regionalbloc}");

			response.then();

			assertTrue(response.statusCode() < 500);
			System.out.println("Test passed.");
		} catch (RuntimeException ex) {
			System.err.println(ex.getMessage());
			fail(ex.getMessage());
		}
	}

}
