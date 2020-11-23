package restest_1m;

import org.junit.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_1hrutria7vvw6 {


	@BeforeClass
 	public static void setUp() {
		RestAssured.baseURI = "http://localhost:8080/rest";
	}

	@Test
	public void test_1ji7rjixg4nck_v1All() {

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
	public void test_vevvwk565krl_v1All() {

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
	public void test_1k1rpw85o2915_v1All() {

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
	public void test_1hvbk0ngpnko2_v1All() {

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
	public void test_r1lo15r49kyu_v1All() {

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
	public void test_1ji7qrwv74go4_v1All() {

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
	public void test_qecnqeszi4bn_v1All() {

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
	public void test_t4nwm04sbznb_v1All() {

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
	public void test_1h7wi8ee5ya92_v1All() {

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
	public void test_1h7wjer7grcdh_v1All() {

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
	public void test_1hv8r5740i6gm_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "QA")
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
	public void test_1k1r638bpxz6s_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "GW")
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
	public void test_1k251oatx5y79_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SN")
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
	public void test_1h7wj0qgd08c0_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "GM")
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
	public void test_s15m0tgpevz7_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MN")
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
	public void test_vbszr5myt1dd_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "NGA")
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
	public void test_1ibersp67vfqe_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MAC")
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
	public void test_u7rd0c6hmcds_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "KOR")
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
	public void test_1iyntlcycmasx_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "QAT")
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
	public void test_s0xt0sesjrcl_v1Alphacode() {

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
	public void test_1jetce14b786p_v1Alphacodes() {

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
	public void test_t81cdmdqxtfa_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MD")
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
	public void test_sof3sf7uxlye_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "PHL")
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
	public void test_s1dw434mc46w_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "VU;IQ;BGD")
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
	public void test_s1gq838mqr1i_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "LT")
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
	public void test_vbf4tdq2ikvo_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "CG;KR;ZAF")
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
	public void test_1iuvzjbozpu0m_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "AM;NG")
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
	public void test_1hbja14b5kns4_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "KWT")
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
	public void test_ubrxz5nu3tiq_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "POL")
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
	public void test_1iuvgrnj3dzcp_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "TWN;AO")
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
	public void test_rhjcz6rf3kgz_v1Currency() {

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
	public void test_vevd4s2n9eeo_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "FJD")
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
	public void test_s4xeiavba99e_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BYR")
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
	public void test_1jig39jok3yus_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "ERN")
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
	public void test_skv1w7vs0enr_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BOB")
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
	public void test_rl8fbrrxq9td_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "XOF")
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
	public void test_1jew4k1nuqaep_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "MRO")
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
	public void test_t4f3r924mm2b_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "SHP")
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
	public void test_t4cb9ptmi81l_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "MUR")
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
	public void test_vbbwntx5d5r9_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "CLF")
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
	public void test_1ibh0etezflfd_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "5972.832626407266")
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
	public void test_uruo5ky8w65u_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Guinea")
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
	public void test_uvbw00qnv143_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
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
	public void test_1h82je2ceh086_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Zimbabwe")
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
	public void test_1hb7om39y64ae_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Eritrea")
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
	public void test_t4ico9euytlt_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "French Polynesia")
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
	public void test_qec4bke3r7ed_v1Name() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_1jifj2ggmexpz_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Jersey")
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
	public void test_t4yh0e2bfm92_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Hong Kong")
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
	public void test_s18e3xu16cz5_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "United Kingdom")
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
	public void test_soq7oejqtheu_v1Callingcode() {

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
	public void test_vbbtjmnki6ht_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "44")
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
	public void test_1iuy9du4sjjoh_v1Callingcode() {

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
	public void test_rhithx7sp9b6_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "687")
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
	public void test_t4ncf38f19gx_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "594")
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
	public void test_1iay68uvh2rlh_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "251")
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
	public void test_1iv4bn0yiwtv7_v1Callingcode() {

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
	public void test_tolpiq3da2wo_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "231")
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
	public void test_us2zh0jfhmcm_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "53")
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
	public void test_qhqm9yzurgoi_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "298")
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
	public void test_vf9p55sb1d10_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "St. George's")
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
	public void test_rhufajxrfzg9_v1Capital() {

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
	public void test_1ji77o8lwmxbt_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Vaduz")
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
	public void test_toogwgv5vfqb_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Asunci\u00F3n")
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
	public void test_1huxo1pgnf9ep_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Taipei")
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
	public void test_t4fkwdy53prq_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Asunci\u00F3n")
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
	public void test_qhq3ycymaa7r_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Honiara")
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
	public void test_uv5tcot0ehq1_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Riyadh")
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
	public void test_qdybphbmti5s_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Yerevan")
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
	public void test_somux449eqsz_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Podgorica")
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
	public void test_1jyiry6nwg4du_v1Region() {

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
	public void test_1hrggz0e0yng2_v1Region() {

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
	public void test_r1g4y1j5q0c8_v1Region() {

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
	public void test_1h7z8u0y1mv6t_v1Region() {

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
	public void test_skvn0ks94qid_v1Region() {

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
	public void test_1ib0x8yd6l0s8_v1Region() {

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
	public void test_skk1iuqli7ud_v1Region() {

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
	public void test_qxntlpxo3ak2_v1Region() {

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
	public void test_1h7gdii2qtp45_v1Region() {

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
	public void test_trtnodmzbwwz_v1Region() {

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
	public void test_1iyq29ek0sgv5_v1Subregion() {

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
	public void test_qeexkzjqx8vn_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Polynesia")
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
	public void test_s4scyuujhso5_v1Subregion() {

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
	public void test_1hbiqgmc5thes_v1Subregion() {

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
	public void test_1hrm1ak033upg_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Western Asia")
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
	public void test_qdychjjqbk1j_v1Subregion() {

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
	public void test_vf3myrv13tr7_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "South America")
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
	public void test_ubuptedjum2g_v1Subregion() {

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
	public void test_1ib5yjkf3qj4z_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Central Asia")
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
	public void test_1ies89wfuvuch_v1Subregion() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("subregion", "Central Asia")
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
	public void test_u7rbduwgu7oi_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "nn")
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
	public void test_r1lo3w1mmfqv_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "id")
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
	public void test_1hbg0mwe5q4oh_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "tr")
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
	public void test_urmdzj3mkeat_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "sv")
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
	public void test_1ib6h6cw3n9yw_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ve")
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
	public void test_vb92mlnx2xbo_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "mg")
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
	public void test_1ji4yzurae1k5_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "nd")
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
	public void test_vf1ezm0kajxd_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "be")
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
	public void test_1hruc8ca0mt6a_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ky")
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
	public void test_1jia0ap2xpfzk_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "bs")
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
	public void test_1h7lfwzbnvlgm_v2All() {

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
	public void test_rhdbhyjvejox_v2All() {

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
	public void test_t8fosfdt2dt0_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym;region;currencies")
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
	public void test_t81urixj0c36_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name")
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
	public void test_rhgl7ayrbby0_v2All() {

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
	public void test_urejfcu1cfac_v2All() {

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
	public void test_1ieyalnqy4wv9_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode;callingCodes;cioc")
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
	public void test_vbpp7c769baa_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population;alpha3Code;flag")
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
	public void test_qdviro4c2lid_v2All() {

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
	public void test_toa3msmvr7ec_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym")
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
	public void test_t8cwp54ry3p0_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "PR")
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
	public void test_s1b3k2qyl4rl_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations;latlng;demonym")
				.pathParam("alphacode", "BQ")
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
	public void test_qhq3k9icqcds_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones")
				.pathParam("alphacode", "UG")
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
	public void test_1iuqf4x3oe7g9_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name;regionalBlocs;currencies;borders")
				.pathParam("alphacode", "SLB")
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
	public void test_rhlo2hy5p4qb_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "JPN")
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
	public void test_1jenpndiygqwl_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "MF")
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
	public void test_urrxm0zhrrz5_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name")
				.pathParam("alphacode", "IND")
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
	public void test_tolp27soilv6_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "VU")
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
	public void test_1hrdnmnzc22xy_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BRN")
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
	public void test_rhg42628ux5x_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "GN")
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
	public void test_qxfiqtvm1oiu_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies;translations;nativeName")
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
	public void test_t8fpycecg1tf_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MCO;SS;VN")
				.queryParam("fields", "area;capital")
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
	public void test_ubgazvzpofaa_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "LR")
				.queryParam("fields", "population")
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
	public void test_1h7rhe9vttkdf_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "FJ;GBR")
				.queryParam("fields", "languages")
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
	public void test_1ji9z21cyf3g8_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "AIA;IT")
				.queryParam("fields", "alpha2Code")
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
	public void test_u7xe177ric6w_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "ISR")
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
	public void test_1jyg2ijtw9k50_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "NU;MU;VNM")
				.queryParam("fields", "translations")
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
	public void test_qxfztpw4n9rq_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "CG;PER")
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
	public void test_skxtqudv9u1t_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "HU")
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
	public void test_1jyg0vuaja5ib_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "PY;SEN;KHM")
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
	public void test_1jyaivtnkvdcz_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BBD")
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
	public void test_1iv1jvb3ue0xd_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code;area;numericCode;alpha3Code;timezones")
				.pathParam("currency", "NAD")
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
	public void test_skyd8c6dhppd_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "IQD")
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
	public void test_1if135c9b95yb_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "TND")
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
	public void test_ursdx2ph8llu_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("currency", "ERN")
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
	public void test_u7p17nwteoo2_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code")
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
	public void test_ubp5evu025pe_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "NIO")
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
	public void test_urrxxnc9k661_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "JOD")
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
	public void test_sl6503cwvfqe_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "KES")
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
	public void test_sohcv61mnasl_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
				.pathParam("currency", "AWG")
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
	public void test_1ibc1icpnt0l1_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "3130")
				.queryParam("fields", "region;currencies")
				.pathParam("name", "United States Minor Outlying Islands")
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
	public void test_1iaxnxs7i28o6_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
				.pathParam("name", "Malaysia")
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
	public void test_trqt68gfx206_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Yemen")
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
	public void test_1ibh3zg7x7bza_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
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
	public void test_1h7whj0iz42n9_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Palau")
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
	public void test_qe9c2utknepi_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
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
	public void test_us313jshlycx_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.queryParam("fields", "capital;borders;callingCodes")
				.pathParam("name", "United Arab Emirates")
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
	public void test_1hvb2hf4q37mr_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code;altSpellings")
				.pathParam("name", "Anguilla")
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
	public void test_sohc37dhl3dy_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Liechtenstein")
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
	public void test_qecoz2uaglsx_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name;languages;numericCode;timezones;region")
				.pathParam("name", "Swaziland")
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
	public void test_1hux6ibx1ef5j_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population;demonym;regionalBlocs;timezones;topLevelDomain")
				.pathParam("callingcode", "269")
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
	public void test_1iaxopmk1fnty_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies;name")
				.pathParam("callingcode", "682")
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
	public void test_1iuyajxfp02ls_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
				.pathParam("callingcode", "964")
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
	public void test_1hux59hjlpzcg_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "509")
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
	public void test_1jer22ygoww8k_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies;callingCodes;latlng;numericCode")
				.pathParam("callingcode", "970")
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
	public void test_t81t4rrkcenk_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "36")
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
	public void test_u85716br50kx_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies;translations;languages;capital")
				.pathParam("callingcode", "855")
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
	public void test_qhhrdz4plr38_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "971")
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
	public void test_qe6krki6jj92_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code;translations;latlng;alpha2Code;capital")
				.pathParam("callingcode", "90")
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
	public void test_vbcdf581y8ts_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name;altSpellings")
				.pathParam("callingcode", "960")
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
	public void test_t4swcxx8cm7a_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Santiago")
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
	public void test_1hv392svbabzl_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini;borders")
				.pathParam("capital", "Jerusalem")
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
	public void test_uv6d5w3fvrs4_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini;timezones;area;flag;population")
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
	public void test_qdt8ja3vvhpe_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Porto-Novo")
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
	public void test_s12sm6j8qurb_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Riyadh")
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
	public void test_qe6lh7uzk37a_v2Capital() {

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
	public void test_sknbp2wo4j00_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Honiara")
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
	public void test_rhgkfh0npg11_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "The Valley")
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
	public void test_qxwnmqa7iwc3_v2Capital() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_qeffyqh925o8_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Riga")
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
	public void test_s4pl6rhqhx6e_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion;regionalBlocs;gini")
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
	public void test_1iexqn4ltkd2s_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini")
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
	public void test_rhdccn2hb7fp_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code;alpha2Code;translations;altSpellings")
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
	public void test_r1a0qp3l712p_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
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
	public void test_1jiak640ibp7m_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
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
	public void test_1jeyt7oxexzqp_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies;alpha2Code")
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
	public void test_qe74yjfkr4v8_v2Region() {

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
	public void test_to1spamhkoqh_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc")
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
	public void test_s4xe4pltgrj7_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "nativeName;numericCode")
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
	public void test_1jy88q89nqmur_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc;flag")
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
	public void test_s1boa6o8fm1u_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations;region;altSpellings;area;population")
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
	public void test_1jeyub17qoncj_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode;regionalBlocs;alpha3Code")
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
	public void test_s4xdew8x8g8j_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code;regionalBlocs")
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
	public void test_ts57gw4pb3nb_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc;timezones;translations;flag;languages")
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
	public void test_sl15bpxxb886_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs;alpha3Code")
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
	public void test_rh50n2hbby9e_v2Subregion() {

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
	public void test_1hrgg9glqzbcl_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes")
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
	public void test_rhog8axhxdtk_v2Subregion() {

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
	public void test_rhglzf53ww2s_v2Subregion() {

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
	public void test_1h7wi8hywsfug_v2Subregion() {

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
	public void test_1jew258nflgz7_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages")
				.pathParam("lang", "fj")
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
	public void test_1jeql0cbvqtdd_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ne")
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
	public void test_vbk7oauta055_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
				.pathParam("lang", "ss")
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
	public void test_1hrpaajbh6p81_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ay")
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
	public void test_1jxzf084cvqd5_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region;nativeName")
				.pathParam("lang", "to")
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
	public void test_rhr7jem7sgmr_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag")
				.pathParam("lang", "fj")
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
	public void test_tog5yy1ojgoo_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "sq")
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
	public void test_1ji50k5hehe7p_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
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
	public void test_vb9l98bhc95w_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region;regionalBlocs;capital")
				.pathParam("lang", "tk")
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
	public void test_1jed63wg2mf6r_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "uk")
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
	public void test_t4yfiohcyrsm_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "South Georgia and the South Sandwich Islander")
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
	public void test_1k200u0343gac_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Bangladeshi")
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
	public void test_1jelhtoxomre9_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
				.pathParam("demonym", "Nigerian")
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
	public void test_qy4fuvs18pbp_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
				.pathParam("demonym", "Mozambican")
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
	public void test_rhr7jildxjxt_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
				.pathParam("demonym", "Laotian")
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
	public void test_qe3u35ae1bac_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Haitian")
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
	public void test_1ib0y3bf59v05_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Singaporean")
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
	public void test_1hbfyb7ikjk2p_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym;callingCodes;translations")
				.pathParam("demonym", "Tokelauan")
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
	public void test_1iuy7rb75v31x_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini")
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
	public void test_1hrj8qtuw4z74_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "nativeName;capital;demonym")
				.pathParam("demonym", "Tanzanian")
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
	public void test_rhr6g7w81qar_v2Regionalbloc() {

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
	public void test_qdsqa4ho3gol_v2Regionalbloc() {

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
	public void test_s1b5kp3ywsog_v2Regionalbloc() {

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
	public void test_s4p1mkzm0a49_v2Regionalbloc() {

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
	public void test_1jyiu7l0q46cy_v2Regionalbloc() {

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
	public void test_qhi9s0c2tut4_v2Regionalbloc() {

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
	public void test_ubu6pwdu2hr9_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies;languages")
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
	public void test_1hbahh7het8px_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
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
	public void test_1h7qxws3lmx5t_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population")
				.pathParam("regionalbloc", "AU")
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
	public void test_r1fklz4q2l9x_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("regionalbloc", "AU")
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
