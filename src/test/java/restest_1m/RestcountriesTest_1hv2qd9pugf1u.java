package restest_1m;

import org.junit.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1hv2qd9pugf1u {


	@BeforeClass
 	public static void setUp() {
		RestAssured.baseURI = "http://localhost:8080/rest";
	}

	@Test
	public void test_somvpducalv5_v1All() {

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
	public void test_qxtvh38sqr76_v1All() {

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
	public void test_rhodfa7k5jjn_v1All() {

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
	public void test_vbt18z9j8u9c_v1All() {

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
	public void test_1iyc6aosshs8g_v1All() {

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
	public void test_s0ugicxfsm79_v1All() {

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
	public void test_rhoe7o90bhie_v1All() {

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
	public void test_u82wh41ob6g1_v1All() {

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
	public void test_s0xbelwrurzp_v1All() {

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
	public void test_1iukg0airz8f9_v1All() {

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
	public void test_1h7zr8boaw31f_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "GF")
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
	public void test_1h7tq2pcvv41e_v1Alphacode() {

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
	public void test_urk45c44wqpj_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "NL")
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
	public void test_1iut7dgdks679_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BB")
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
	public void test_1k1uho204j2uq_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BRB")
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
	public void test_qxia286caz3p_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "TUR")
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
	public void test_rh7r6alvwi7r_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BVT")
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
	public void test_tolqm2febgbp_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "PRY")
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
	public void test_vb3jsfswvghi_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "RUS")
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
	public void test_rh5ivo0otbg1_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "NI")
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
	public void test_1hb86uwban0hj_v1Alphacodes() {

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
	public void test_rhg2hpswzlme_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "JM;MYT;GMB")
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
	public void test_rhow7pxw53dx_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "AL")
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
	public void test_trz442d55bg8_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "COL")
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
	public void test_vb3kn0fe8h0w_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "UA;TCD;CHN")
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
	public void test_qxw5pnil9s2q_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "CG;MK")
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
	public void test_rh7r8p1df6n9_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "NIU")
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
	public void test_t4c9muq5fqlh_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "UZ;REU;KEN")
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
	public void test_1k22slqby75me_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BHR")
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
	public void test_soemneagwg8j_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "FSM")
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
	public void test_1iv0ziv7sqh4k_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "XPF")
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
	public void test_ure3gd9wouhv_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "NIO")
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
	public void test_vbhf4erxftx5_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "RSD")
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
	public void test_1jig23g0c5r95_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "UGX")
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
	public void test_1jyg06ctfqmuu_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "MAD")
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
	public void test_rhb2ffleftk3_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "MMK")
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
	public void test_t4w7864zu4bl_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "XAF")
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
	public void test_trqunpt8iofl_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "CUC")
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
	public void test_s15k0dfg10z9_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "AWG")
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
	public void test_1h7imkz1x2alt_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "SYP")
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
	public void test_1jeyvv9z3an36_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "3686.6109465078525")
				.pathParam("name", "Pakistan")
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
	public void test_vbk7adbn98bl_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Burkina Faso")
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
	public void test_1jyodrq3a2a0h_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Republic of Ireland")
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
	public void test_1hbd9n8dxqhiu_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Grenada")
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
	public void test_1iey9faiy76ev_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Dominica")
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
	public void test_qxi8ynl7aoh1_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Ghana")
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
	public void test_qxlil3sr88km_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Turkey")
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
	public void test_u7ru5qyzt4di_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
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
	public void test_qhntni6vz4fm_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "French Guiana")
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
	public void test_ubrds17s7d4o_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "United Arab Emirates")
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
	public void test_1jyaz9hok6xx0_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "973")
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
	public void test_vf0v433vao9y_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "855")
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
	public void test_skmtdn4i6s6x_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "55")
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
	public void test_1hv2q237j4cvq_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "977")
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
	public void test_1iuspuactljz7_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "850")
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
	public void test_sl0ngs4sioh0_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "41")
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
	public void test_uvbfk52mvyw5_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "32")
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
	public void test_1hbafx8zmscom_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "357")
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
	public void test_rkzkiogvsrj8_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "506")
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
	public void test_rhiu9rj87d4h_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "692")
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
	public void test_1jylmrn0lnn1d_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Nuuk")
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
	public void test_qxkzvy2y9e0p_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Mexico City")
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
	public void test_1iyeys233r1o5_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Ankara")
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
	public void test_1jewm0mvxbsyp_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Niamey")
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
	public void test_vbelsg5by2wi_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Lisbon")
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
	public void test_t8cy6mjm1v7d_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Muscat")
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
	public void test_1iusprtltgsip_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Khartoum")
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
	public void test_ts2ezevs5s8j_v1Capital() {

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
	public void test_u7ulxksy4qqs_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Bishkek")
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
	public void test_r1l6kmgghkdi_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Luanda")
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
	public void test_qe6kdncxtun8_v1Region() {

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
	public void test_to7u6ew8h92t_v1Region() {

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
	public void test_1ib8qpr5xy62h_v1Region() {

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
	public void test_1ieyawsmpgd44_v1Region() {

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
	public void test_1k1u04jt9drg5_v1Region() {

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
	public void test_1iyhq8hikqr08_v1Region() {

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
	public void test_t89ndp4lq6p0_v1Region() {

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
	public void test_rkxc84kf6uyd_v1Region() {

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
	public void test_qe3v951fop5t_v1Region() {

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
	public void test_1ib0e7suxt46c_v1Region() {

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
	public void test_qy4f2x75z4mo_v1Subregion() {

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
	public void test_1ibbhph75hhko_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Southern Africa")
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
	public void test_1h7fw1lcz1lbo_v1Subregion() {

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
	public void test_1jifm48vokq49_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Western Africa")
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
	public void test_1k1tykrku8g9t_v1Subregion() {

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
	public void test_1k1wrwjivfgol_v1Subregion() {

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
	public void test_1h84tk1hll3z8_v1Subregion() {

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
	public void test_vbsi532yjsc5_v1Subregion() {

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
	public void test_sl0o8tyqpwm9_v1Subregion() {

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
	public void test_1iusq8bfmicf6_v1Subregion() {

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
	public void test_ubu8o3j40qb9_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "dz")
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
	public void test_1jy4xupsrsnkz_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "es")
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
	public void test_t4q5oesfxnxf_v1Lang() {

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
	public void test_qy1mx83o0vu9_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "uz")
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
	public void test_s0uiurfvdxkh_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "vi")
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
	public void test_qy4edjld1m46_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "es")
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
	public void test_trznzj9z3ign_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ne")
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
	public void test_r1lof6h5o6r7_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "af")
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
	public void test_vbnfqy2ztwdv_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "az")
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
	public void test_ts4ofoblf1gw_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ne")
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
	public void test_1jidap9srzsjd_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations;numericCode;regionalBlocs;name;flag")
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
	public void test_urejtntdqcfa_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
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
	public void test_vevwal9x41te_v2All() {

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
	public void test_1jyiv28024ear_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs;timezones")
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
	public void test_sl68hx6ls57l_v2All() {

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
	public void test_rl2ulsvnqji0_v2All() {

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
	public void test_r17auk2r1ohi_v2All() {

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
	public void test_urmedlrkt642_v2All() {

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
	public void test_sl9hfdnqyrfq_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital;nativeName;name;alpha3Code")
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
	public void test_urpmiy4ysym0_v2All() {

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
	public void test_urgshvrqd6ci_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name;currencies")
				.pathParam("alphacode", "MZ")
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
	public void test_1ji4zggxv6fy1_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "YT")
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
	public void test_tocwnodv06k9_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs")
				.pathParam("alphacode", "MKD")
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
	public void test_t4ct78r32r8i_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital")
				.pathParam("alphacode", "VC")
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
	public void test_t8a4ucqx6d0m_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_vbk5c85mxhyu_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
				.pathParam("alphacode", "RW")
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
	public void test_qxkzvm7dyana_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BIH")
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
	public void test_sok5hoto84me_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "IM")
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
	public void test_vf3p8he8ifza_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "ERI")
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
	public void test_t4fkwnsqpysh_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "PY")
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
	public void test_vb94w3mvn2w1_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain;altSpellings")
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
	public void test_1iv9cep1udsgz_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "SWZ;MU;RW")
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
	public void test_1iykh896xedrl_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "RW")
				.queryParam("fields", "timezones;altSpellings")
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
	public void test_sl6504ywcqib_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "NCL")
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
	public void test_1jew3e0m8ubfm_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "JM;TO;TKM")
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
	public void test_1jifkk622tvzl_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "FRA;ES")
				.queryParam("fields", "numericCode")
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
	public void test_vbele764nqr7_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "GT")
				.queryParam("fields", "topLevelDomain;numericCode")
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
	public void test_sohe1cx1u33s_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "PH")
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
	public void test_1iv12n42ldwdy_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "GEO")
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
	public void test_1jeytivga4s3b_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BZ")
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
	public void test_vbcdtk58aqna_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "HNL")
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
	public void test_skxtqsqhq4iq_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones")
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
	public void test_rhr5lddh62b8_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
				.pathParam("currency", "ZAR")
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
	public void test_1ies9fnk37gpy_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes")
				.pathParam("currency", "NPR")
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
	public void test_1jy4wzyx9hm5e_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "TMT")
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
	public void test_urseatwaieec_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population;borders")
				.pathParam("currency", "TOP")
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
	public void test_1hbd99f4j6cth_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
				.pathParam("currency", "SVC")
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
	public void test_toiy4lict9gw_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages;borders")
				.pathParam("currency", "GEL")
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
	public void test_1k1zi71yyput2_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "DJF")
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
	public void test_1hux4vavp4kkx_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings")
				.pathParam("currency", "PEN")
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
	public void test_s10jy4w4sqb9_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "hKtBNNnnJdDU")
				.queryParam("fields", "languages")
				.pathParam("name", "Federated States of Micronesia")
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
	public void test_s1jhzx3ncwmo_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
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
	public void test_qe4dkyysmb7d_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Fiji")
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
	public void test_1k1rp4005czzs_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Namibia")
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
	public void test_1jy5g3d9u09bo_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym;numericCode;area;region")
				.pathParam("name", "Macau")
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
	public void test_r1cuebpq9bhi_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Sweden")
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
	public void test_t89lr3z06t6g_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
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
	public void test_1iext27utaz4x_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Mayotte")
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
	public void test_sohus8tsyezo_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region;gini;timezones;altSpellings;cioc")
				.pathParam("name", "Palestine")
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
	public void test_s0ujbbaxrj94_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings;subregion")
				.pathParam("name", "Sudan")
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
	public void test_1hr5x1fvxyjht_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "350")
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
	public void test_t8f5dk8c5wtg_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "973")
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
	public void test_u7xcguiy3n03_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "nativeName;timezones;topLevelDomain")
				.pathParam("callingcode", "356")
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
	public void test_t89oy1glsmk0_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "224")
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
	public void test_ts56rcngw679_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode")
				.pathParam("callingcode", "359")
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
	public void test_rkzjc9b8j22d_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "389")
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
	public void test_1jylmg8lwjtpz_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "94")
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
	public void test_rl02ika28dvd_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "48")
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
	public void test_1h7ldz1a2ryp1_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages;borders")
				.pathParam("callingcode", "502")
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
	public void test_1h7za03xumr8j_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_s1gnkcagxy60_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
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
	public void test_uv6bzmwvo8xd_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
				.pathParam("capital", "Saipan")
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
	public void test_u7wt1u838i1u_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
				.pathParam("capital", "New Delhi")
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
	public void test_vbcdw4v2xhrm_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Dushanbe")
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
	public void test_vf9pxm63w4f5_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "nativeName")
				.pathParam("capital", "Juba")
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
	public void test_1hr5cru9ofbqr_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
				.pathParam("capital", "Warsaw")
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
	public void test_u8ditjjvh9o4_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Cockburn Town")
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
	public void test_ubj2rw2owfg8_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code;languages")
				.pathParam("capital", "Panama City")
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
	public void test_1jict6bphr5fa_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag")
				.pathParam("capital", "Taipei")
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
	public void test_u7zmrz5lmjc1_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Helsinki")
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
	public void test_t49k9sarw1tf_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
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
	public void test_s4xwtxaxdnqe_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc")
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
	public void test_t87crag8qbfl_v2Region() {

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
	public void test_u87wgxtci9gk_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain")
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
	public void test_vf9qbhcvo6zl_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym")
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
	public void test_1jyda9y6xd8bq_v2Region() {

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
	public void test_tocxr9admx5t_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations;currencies;area")
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
	public void test_tnzk0x3wmlpi_v2Region() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_vb6a0astyat1_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region;latlng")
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
	public void test_qe11m1ugj19u_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
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
	public void test_1jeyvhegadduq_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Western Africa")
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
	public void test_urund2msv336_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_uvbx3gyrkmk0_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area;alpha2Code")
				.pathParam("subregion", "Western Africa")
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
	public void test_s12ukidptjkx_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc")
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
	public void test_1hr5dvf5x6e03_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Polynesia")
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
	public void test_1jidaphouq6ux_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Eastern Africa")
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
	public void test_1ib60vsz2e3qd_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes;population")
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
	public void test_r1fls0gbld9h_v2Subregion() {

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
	public void test_1hv5ijggs5anl_v2Subregion() {

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
	public void test_1ibkcty6jo6zo_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
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
	public void test_uv8mmfrodg12_v2Lang() {

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
	public void test_1ji27ai29hq9l_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes;regionalBlocs;nativeName")
				.pathParam("lang", "ps")
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
	public void test_qy4gmzmqa6uv_v2Lang() {

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
	public void test_1jed644p6skkx_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area;flag;regionalBlocs;subregion")
				.pathParam("lang", "da")
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
	public void test_1jia12rmqrhv5_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "tg")
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
	public void test_tony4aljmzow_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region;topLevelDomain")
				.pathParam("lang", "sn")
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
	public void test_t49klaaqcaxt_v2Lang() {

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
	public void test_1ibjvr84gbpdf_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym")
				.pathParam("lang", "ku")
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
	public void test_1iv4a09teefdv_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "hy")
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
	public void test_1iauulqd7nayd_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "nb")
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
	public void test_vf6xfym809is_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Kenyan")
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
	public void test_r1albt5o8xus_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Macedonian")
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
	public void test_t845br2h85rr_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "altSpellings")
				.pathParam("demonym", "Guatemalan")
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
	public void test_s1jhlm4wrynl_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain")
				.pathParam("demonym", "Malaysian")
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
	public void test_t4km77typlyb_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
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
	public void test_skq2ouih06cy_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Grenadian")
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
	public void test_1k25l5ke35ohi_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region")
				.pathParam("demonym", "Swedish")
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
	public void test_urp4zcamwz08_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code")
				.pathParam("demonym", "French")
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
	public void test_1ib6gsm1hvvc2_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Chinese")
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
	public void test_s4xd130kxyk7_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Congolese")
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
	public void test_vf99k3df5zky_v2Regionalbloc() {

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
	public void test_rhtwzbouztx3_v2Regionalbloc() {

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
	public void test_vbmxvvzl5qgi_v2Regionalbloc() {

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
	public void test_r1fl2qvmmzxf_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code")
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
	public void test_soq63wa00bp5_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
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
	public void test_t8f4zfkqu0jd_v2Regionalbloc() {

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

	@Test
	public void test_r1cv8wmj1vlk_v2Regionalbloc() {

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
	public void test_sof2mm4nd1yp_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng;demonym;translations")
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
	public void test_1jed6w6xk75tj_v2Regionalbloc() {

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
	public void test_1hrotjdw00g1h_v2Regionalbloc() {

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

}
