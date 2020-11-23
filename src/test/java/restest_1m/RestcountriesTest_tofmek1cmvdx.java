package restest_1m;

import org.junit.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_tofmek1cmvdx {


	@BeforeClass
 	public static void setUp() {
		RestAssured.baseURI = "http://localhost:8080/rest";
	}

	@Test
	public void test_1ieph9r005zck_v1All() {

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
	public void test_u7wwhlgzc0mt_v1All() {

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
	public void test_1jefesdx1jejl_v1All() {

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
	public void test_sobrqy49fxwi_v1All() {

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
	public void test_qec4mye1uuyf_v1All() {

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
	public void test_1jicu0sf0mixu_v1All() {

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
	public void test_s1jevagiraya_v1All() {

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
	public void test_sksue3mixv78_v1All() {

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
	public void test_vbhw7afsf5gh_v1All() {

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
	public void test_qxw4jlsmdf08_v1All() {

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
	public void test_us07b1aidulw_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "VU")
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
	public void test_1iv4a36fp5id2_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SHN")
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
	public void test_r1g3rykqr6sx_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "ARE")
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
	public void test_s0uijdfbegyr_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "KH")
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
	public void test_sohbosi0wg8j_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SVK")
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
	public void test_rhugxczzgk84_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "CM")
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
	public void test_to53kkh44zty_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "VGB")
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
	public void test_1ievjlm81m8fs_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MKD")
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
	public void test_qxw5ptf4l35e_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "NOR")
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
	public void test_r1l460zurj39_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "IOT")
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
	public void test_1h85cbztyy4it_v1Alphacodes() {

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
	public void test_1h7qz54a695ye_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MLI;CL;CHE")
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
	public void test_rl2b73owf4gz_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "OM")
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
	public void test_ts56ofpk6jp2_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BN")
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
	public void test_uv6cryxvb2uw_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "FK")
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
	public void test_1hv0giys27k8i_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BQ;GRC")
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
	public void test_1k25kg0m10pd2_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "HT")
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
	public void test_1hux6txsvsztw_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BE;PRY")
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
	public void test_qhkk0i9ipauo_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "GEO")
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
	public void test_qhib9tvbc0v8_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MZ")
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
	public void test_1iauxeeje49d0_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "GHS")
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
	public void test_trww54pnv7e9_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "ETB")
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
	public void test_1jidbhnjowx9e_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BZD")
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
	public void test_soq6vwjmlppi_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BIF")
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
	public void test_s1gnk6qf2p0y_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "MZN")
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
	public void test_rhrob06dafdy_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "CLP")
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
	public void test_t81tziog9ooo_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "NPR")
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
	public void test_ubgu5xfd2xyd_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "KGS")
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
	public void test_1iunoj09fpw0z_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "WST")
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
	public void test_1hr8n998j7gx0_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "WST")
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
	public void test_urrvz7vvx8hl_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "2519.4451043917634")
				.pathParam("name", "Cape Verde")
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
	public void test_qdpywg3lxu1u_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Gabon")
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
	public void test_urgta5vekoj9_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Hungary")
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
	public void test_skstm7pm6g4x_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Cura\u00E7ao")
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
	public void test_1iyl1vtzglb20_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Israel")
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
	public void test_u7wvporvhs1l_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Republic of Kosovo")
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
	public void test_1jei9lrxobjom_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Australia")
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
	public void test_1h7ilsqx067nb_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Bolivia")
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
	public void test_ubj4ej9fn67q_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Bolivia")
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
	public void test_u82cx7toxh0l_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Svalbard and Jan Mayen")
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
	public void test_u7zn5uq0lox2_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "256")
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
	public void test_rh7s0zimvtq1_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "350")
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
	public void test_1iyhq5z4itlk1_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "297")
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
	public void test_1hr5vsrsozsj4_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "689")
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
	public void test_qy4yydruciet_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "216")
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
	public void test_1hbfyrp1icjed_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "60")
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
	public void test_s4p18o5x11rt_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "595")
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
	public void test_1h7ts0oyumtsy_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "966")
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
	public void test_uvjrcmlsysf7_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "852")
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
	public void test_ubu5k0kwk2g6_v1Callingcode() {

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
	public void test_1hv2rjp74uqex_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "New Delhi")
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
	public void test_qecnqj2dl54m_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Kabul")
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
	public void test_1h7o5ce9zt4dg_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Sucre")
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
	public void test_tolpim5atirb_v1Capital() {

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
	public void test_trz6rjerbomb_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Mal\u00E9")
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
	public void test_t84lritlqalz_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Minsk")
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
	public void test_to1rzynhureh_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Vienna")
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
	public void test_1jia0zyzk24aa_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Valletta")
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
	public void test_qdw13678c1nm_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Flying Fish Cove")
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
	public void test_1jyg2u259ypf7_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Bandar Seri Begawan")
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
	public void test_skmr1ckaxu7s_v1Region() {

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
	public void test_t84278pw5cmv_v1Region() {

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
	public void test_urmc48548dv7_v1Region() {

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
	public void test_1jenqw5izhd9e_v1Region() {

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
	public void test_qhter2fvwv91_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Oceania")
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
	public void test_1iay6bhlagcit_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Oceania")
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
	public void test_vbszdcga7xv9_v1Region() {

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
	public void test_t4cc1pqhcppw_v1Region() {

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
	public void test_vey44fegg1fb_v1Region() {

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
	public void test_1k1wrz2cqegde_v1Region() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("region", "Oceania")
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
	public void test_1iauuzp5vy8mt_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Melanesia")
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
	public void test_r1cusf4df1wi_v1Subregion() {

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
	public void test_qhvlhhvhn7mp_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Eastern Asia")
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
	public void test_1h7zae9d56l2v_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Eastern Africa")
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
	public void test_1hux8dsersh2c_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Eastern Europe")
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
	public void test_1iuspg98mx92o_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Australia and New Zealand")
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
	public void test_skpicueru14h_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "South-Eastern Asia")
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
	public void test_vb6unnoioleq_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Eastern Europe")
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
	public void test_sok35i5dg303_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Melanesia")
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
	public void test_s4v4a18ozz3a_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Eastern Asia")
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
	public void test_t4l3csk7sg2u_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "is")
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
	public void test_t4q46v38w1fc_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "fi")
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
	public void test_1k1txsb4t9ftw_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ta")
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
	public void test_urrvlb3uvtx1_v1Lang() {

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
	public void test_t81twudb75tk_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "km")
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
	public void test_1iexrt7xvp4xi_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "lb")
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
	public void test_1iavdrhl804l1_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "sr")
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
	public void test_1ji1nq9y5d7j8_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "pl")
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
	public void test_1huzxw6m433uh_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "lo")
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
	public void test_vbszrdl30oki_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "sk")
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
	public void test_1iauwjvichq2c_v2All() {

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
	public void test_qxyx5wnnjlf4_v2All() {

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
	public void test_uv8ludya5d10_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini")
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
	public void test_1hr879twfo5yt_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini;population")
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
	public void test_1ib3qndesqr79_v2All() {

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
	public void test_1ib99t5konins_v2All() {

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
	public void test_urpmiw5xvxwl_v2All() {

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
	public void test_rhaik3c7iesk_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode")
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
	public void test_qhi9pflc9uev_v2All() {

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
	public void test_rkxbgdswiq7s_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
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
	public void test_1ibeskwy1p8pt_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders;area")
				.pathParam("alphacode", "AW")
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
	public void test_1hv2rxcie2w53_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages")
				.pathParam("alphacode", "MHL")
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
	public void test_s1dv08o9xicw_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "WLF")
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
	public void test_r1dd3wv0hxyr_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MAC")
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
	public void test_uv8ne651km78_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "CG")
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
	public void test_qeeyr76jk851_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MS")
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
	public void test_1hr5f40v5h46a_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode;translations;callingCodes")
				.pathParam("alphacode", "NAM")
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
	public void test_1iuvh7v7gz38z_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag;translations;region;callingCodes")
				.pathParam("alphacode", "PYF")
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
	public void test_s101mgwh3sxf_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
				.pathParam("alphacode", "CM")
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
	public void test_1ies9fxgwz49x_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BD")
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
	public void test_uve4om4v59vc_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag;altSpellings;translations;population;topLevelDomain")
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
	public void test_vbbv6nnkme5w_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "UG")
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
	public void test_1ibeakz81woyq_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "DO")
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
	public void test_ubu7tcnbsunl_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "CUW;JPN")
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
	public void test_s1h71s5nt44z_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "GR")
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
	public void test_1iepyt8vi1s2p_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "ALA")
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
	public void test_s4unlfunizw5_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BFA;BWA;KZ")
				.queryParam("fields", "regionalBlocs")
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
	public void test_somycp2gvl11_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "WLF;VUT")
				.queryParam("fields", "callingCodes")
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
	public void test_urgu27ranghe_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "NFK;KNA")
				.queryParam("fields", "timezones;cioc")
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
	public void test_urmedpqr8c34_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "CHE;ST;AZ")
				.queryParam("fields", "translations;alpha2Code;flag")
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
	public void test_rhgkf2u47vxd_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes")
				.pathParam("currency", "AMD")
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
	public void test_to536rl9mczc_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "nativeName")
				.pathParam("currency", "MZN")
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
	public void test_u82xkr0220xc_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "ANG")
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
	public void test_1iv3tn3l2q240_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain")
				.pathParam("currency", "XPF")
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
	public void test_qe75cst7gdv6_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "NGN")
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
	public void test_1jeyw956f64oh_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion;borders")
				.pathParam("currency", "HRK")
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
	public void test_rh7ryidhhwtf_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng;capital;altSpellings;alpha3Code;alpha2Code")
				.pathParam("currency", "SCR")
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
	public void test_1jy2587evlheu_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital;borders")
				.pathParam("currency", "FKP")
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
	public void test_1iyl1tnf1ftye_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("currency", "DOP")
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
	public void test_1ib3p36zu1dnq_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "PGK")
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
	public void test_urp4ld7x2xk6_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "qUFWAYcQqPGqFfh")
				.queryParam("fields", "currencies;alpha3Code")
				.pathParam("name", "R\u00E9union")
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
	public void test_1k1r9irohw8rn_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
				.pathParam("name", "Mongolia")
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
	public void test_sl0lu4jun23p_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Cambodia")
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
	public void test_1if0l5o0lo94h_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "nativeName;timezones")
				.pathParam("name", "Zimbabwe")
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
	public void test_rhg2i5xnb7ll_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Kazakhstan")
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
	public void test_r1g4k2snht84_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Gabon")
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
	public void test_1h7fwfseivrdv_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.queryParam("fields", "latlng;alpha3Code")
				.pathParam("name", "The Bahamas")
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
	public void test_1iv9chdrgrsro_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.queryParam("fields", "nativeName;topLevelDomain;latlng")
				.pathParam("name", "Libya")
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
	public void test_urrvnxf8tesz_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.queryParam("fields", "numericCode;gini")
				.pathParam("name", "Ghana")
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
	public void test_1jecn0o0dbzhi_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.queryParam("fields", "cioc")
				.pathParam("name", "New Caledonia")
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
	public void test_1hv37zgk42ywj_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code")
				.pathParam("callingcode", "688")
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
	public void test_1jyobf5oku0qa_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "599")
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
	public void test_vbheniqh2rea_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
				.pathParam("callingcode", "63")
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
	public void test_s13ck9u6gmsm_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain")
				.pathParam("callingcode", "377")
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
	public void test_urp5dfewxl5u_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "966")
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
	public void test_1hb7ml35dx3y0_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion")
				.pathParam("callingcode", "353")
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
	public void test_u857tggthj6t_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "358")
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
	public void test_t4qnomd0vmg1_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population;latlng")
				.pathParam("callingcode", "380")
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
	public void test_toie6prc3hie_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
				.pathParam("callingcode", "994")
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
	public void test_ubmdbtihevxx_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "92")
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
	public void test_rkwr6s6v0ugj_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Longyearbyen")
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
	public void test_ubgd0si8tm45_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings;subregion")
				.pathParam("capital", "Rome")
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
	public void test_1hrrkx6aw1gkx_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Guatemala City")
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
	public void test_1huzyo2in8j78_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag")
				.pathParam("capital", "Tirana")
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
	public void test_sonf6xntc6yb_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Singapore")
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
	public void test_tnz0m4cei71x_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "London")
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
	public void test_qxwnmqocxx7l_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Colombo")
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
	public void test_1jicucd32vg3d_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Dhaka")
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
	public void test_somux7pc2r74_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes;timezones")
				.pathParam("capital", "Doha")
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
	public void test_1iyq2cd3yvalg_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Buenos Aires")
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
	public void test_1h82ixakdy71t_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym;alpha2Code;topLevelDomain;regionalBlocs;latlng")
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
	public void test_1h7qxl65jaoo1_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
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
	public void test_1h7fvnrrv1n3k_v2Region() {

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
	public void test_skxtobmg3ayc_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones")
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
	public void test_uv6djv9zggtu_v2Region() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_t81djpchvvow_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng;languages;flag")
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
	public void test_s4md1qojthrl_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs;currencies;flag")
				.pathParam("region", "Americas")
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
	public void test_1ibebcnmnwks2_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode")
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
	public void test_tocwyytwbbxu_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital;altSpellings;cioc")
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
	public void test_1jy7os6lrswv6_v2Region() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_1jyd96jjzd3qp_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Southern Asia")
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
	public void test_1ji28rvtjcmzl_v2Subregion() {

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
	public void test_1hb7nd50yda3l_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain;subregion;region;alpha3Code")
				.pathParam("subregion", "Western Europe")
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
	public void test_vb6cchg0w50m_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings;borders;cioc")
				.pathParam("subregion", "Melanesia")
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
	public void test_1h7o85kwz4hup_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Central America")
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
	public void test_vbng7i0jlv09_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "South-Eastern Asia")
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
	public void test_1h7io7rt1hwkz_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital")
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
	public void test_s4rtsm78kdo0_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini;languages;nativeName")
				.pathParam("subregion", "Central America")
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
	public void test_1iyc72x9x61pz_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
				.pathParam("subregion", "South-Eastern Asia")
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
	public void test_qe74yt9cevcg_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages")
				.pathParam("subregion", "Micronesia")
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
	public void test_1hv0g53y88myc_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "id")
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
	public void test_to52enf8hqw5_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name")
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
	public void test_1jyb01nt27zuc_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ln")
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
	public void test_vbcdi24w89cz_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "hr")
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
	public void test_soknc6vehcfl_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ts")
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
	public void test_urmv7uf751dh_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
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
	public void test_1hruc8m6vztwy_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ln")
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
	public void test_1jidbk0br64is_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital")
				.pathParam("lang", "ka")
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
	public void test_t4w80cnn8s3a_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings")
				.pathParam("lang", "ts")
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
	public void test_s1022x5od5k5_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "hu")
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
	public void test_s5054b9qwuw5_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Croatian")
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
	public void test_sl0p0ukuqg55_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Belizean")
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
	public void test_s0xamt7kp1lv_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Egyptian")
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
	public void test_1hbj9mvn3lagn_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes;altSpellings;area")
				.pathParam("demonym", "Maldivan")
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
	public void test_1hrjab6klbktv_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings;translations")
				.pathParam("demonym", "Saudi Arabian")
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
	public void test_rkxb4tgtyywo_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc;alpha3Code")
				.pathParam("demonym", "Emirati")
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
	public void test_t4nf5f9sp0z9_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Latvian")
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
	public void test_qhw5d6d2mh4o_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("demonym", "German")
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
	public void test_1ibjvas6mmusk_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings")
				.pathParam("demonym", "Norfolk Islander")
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
	public void test_1iauwjtj18g8p_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code")
				.pathParam("demonym", "Croatian")
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
	public void test_1h7tq2mzzgppu_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_1if0ithc2mf5h_v2Regionalbloc() {

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
	public void test_s163hkptepf4_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_t4l3qs19c5rl_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "AL")
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
	public void test_rhufouuk6n1s_v2Regionalbloc() {

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
	public void test_t4f10xcomzhz_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "AL")
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
	public void test_s4uln0f5ko4x_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones")
				.pathParam("regionalbloc", "EEU")
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
	public void test_1hrosajxju2wl_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
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
	public void test_t4kk6lk8j0oh_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "CARICOM")
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
	public void test_1hv2r84wq4lyu_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "SAARC")
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
