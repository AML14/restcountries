package restest_30s;

import org.junit.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.FixMethodOrder;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RestcountriesTest_u8ap0rxnjt4k {


	@BeforeClass
 	public static void setUp() {
		RestAssured.baseURI = "http://localhost:8080/rest";
	}

	@Test
	public void test_t4a06kyq1vsj_v1All() {

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
	public void test_qhvoa4guhbub_v1All() {

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
	public void test_1jygit1dhcq5g_v1All() {

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
	public void test_1h7u7zw3efbdt_v1All() {

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
	public void test_t8f5apzzyoo5_v1All() {

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
	public void test_t49hv0wslkc7_v1All() {

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
	public void test_rhdtti73sqxu_v1All() {

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
	public void test_1iukxm19dkwv9_v1All() {

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
	public void test_skpkdcfaei45_v1All() {

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
	public void test_rhlkvrxnpjcg_v1All() {

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
	public void test_r1iwc0l88b4z_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SI")
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
	public void test_urpnb69235mg_v1Alphacode() {

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
	public void test_1jxzdg98rg7dv_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "ESP")
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
	public void test_tnzijd2628gy_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "GR")
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
	public void test_1jecnso8vpf05_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "AF")
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
	public void test_skmtrg0azlf9_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SPM")
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
	public void test_t4neaqc7qofm_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SV")
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
	public void test_qxffy9aebejo_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SWE")
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
	public void test_urjkq94zhnc4_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "BN")
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
	public void test_qxoc00mj5uer_v1Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "RWA")
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
	public void test_1iukfzurvaxpv_v1Alphacodes() {

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
	public void test_1jy7qsqzama0n_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "GNQ")
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
	public void test_1ies8nt9hxzjk_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "PH;HRV")
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
	public void test_s4mcywevh7w7_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BO;BLZ;LK")
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
	public void test_qhswfpvlw27l_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "BE;TON")
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
	public void test_1iv6kmuvq3x9t_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "KEN")
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
	public void test_us30pmn5chgj_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "JE")
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
	public void test_qxl121eyvar5_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "AX;BRB;BH")
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
	public void test_uve70qsgzx2t_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "IO;YEM")
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
	public void test_qxyvlujusenl_v1Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "SLE")
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
	public void test_t4f2kzevg7cn_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "CHW")
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
	public void test_qxzepgg0atrp_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "DKK")
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
	public void test_vb9kvd43xzz8_v1Currency() {

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
	public void test_1hrjpw51x3ja9_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "TWD")
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
	public void test_1k253871s7rxv_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BND")
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
	public void test_r1fm8kchkpwy_v1Currency() {

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
	public void test_sl3dop2yi7g5_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "SCR")
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
	public void test_s4plwayn1wdt_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "CRC")
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
	public void test_skvls0ciu0qe_v1Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "CAD")
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
	public void test_rl2ulyrn5ph1_v1Currency() {

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
	public void test_tog545lacv1t_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "wJgjBgjvBEuJcTRS")
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
	public void test_1jei9m3qt14c8_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Austria")
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
	public void test_ublx9vbmmwrm_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Liechtenstein")
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
	public void test_1hrj9laxsoyls_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Saint Helena")
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
	public void test_s18vnfzu8zzn_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Czech Republic")
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
	public void test_rl8ddgaemdeq_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Nauru")
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
	public void test_1iv6lvmuvg84y_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Belarus")
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
	public void test_1h822y33wojee_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Martinique")
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
	public void test_r1fmjyrr0bp0_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Bangladesh")
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
	public void test_ursfv8kd6ype_v1Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Mexico")
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
	public void test_1h82k6cg2u435_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "225")
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
	public void test_skjznlfh1ftx_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "221")
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
	public void test_u7u4bg9myxcx_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "389")
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
	public void test_vbk642h1x3jt_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "240")
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
	public void test_trrc75on0p4m_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "886")
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
	public void test_urrx5b8ogxte_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "377")
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
	public void test_1iyc68by6meya_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "674")
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
	public void test_1hrax3m569zqq_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "387")
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
	public void test_1ibe90n7dtwz5_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "51")
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
	public void test_1iuvj3ge89bg0_v1Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "33")
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
	public void test_rh4zshiksehv_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Philipsburg")
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
	public void test_rkxb1wxwngvq_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Juba")
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
	public void test_uvjqyj77hr36_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Stockholm")
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
	public void test_1k1r79bb0tt0z_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Pristina")
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
	public void test_sohcjnp55ohg_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Mariehamn")
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
	public void test_uv5wekftvqk4_v1Capital() {

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
	public void test_qxzdgkv8v0he_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Damascus")
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
	public void test_qhia67capohe_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Bern")
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
	public void test_rhdb6rn6zuci_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Tallinn")
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
	public void test_s10jjm0pu910_v1Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Asmara")
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
	public void test_urxz3dkv0q49_v1Region() {

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
	public void test_tnzk18kg50s0_v1Region() {

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
	public void test_1hrjqoctguwc7_v1Region() {

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
	public void test_t86vzyd17jg2_v1Region() {

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
	public void test_trz5l876a44j_v1Region() {

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
	public void test_1hrdqqwu2n2gp_v1Region() {

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
	public void test_vbhy526cray8_v1Region() {

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
	public void test_qeff6oarksir_v1Region() {

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
	public void test_t84484johsv9_v1Region() {

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
	public void test_s1649wrymuy9_v1Region() {

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
	public void test_t81blbwjf707_v1Subregion() {

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
	public void test_skv3g8db3fqd_v1Subregion() {

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
	public void test_1h7rh2nli0pbn_v1Subregion() {

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
	public void test_s0uj8yh7kspv_v1Subregion() {

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
	public void test_t49jhzy211eq_v1Subregion() {

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
	public void test_uv95ee6a6v5c_v1Subregion() {

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
	public void test_t4tfubrwnbcg_v1Subregion() {

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
	public void test_1jeyvvfwoqu5s_v1Subregion() {

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
	public void test_t86ufoe5wc4l_v1Subregion() {

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
	public void test_trqspkasgenr_v1Subregion() {

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
	public void test_1ibbjl3n4qa8y_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "nr")
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
	public void test_ureko4ts2h4k_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "mh")
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
	public void test_ubjni1mk5lis_v1Lang() {

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
	public void test_1ji4j0lao0svl_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "no")
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
	public void test_1ib0yf59dpl5t_v1Lang() {

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
	public void test_ts2ggsnvplpu_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ti")
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
	public void test_1ji4ga3n8w7qr_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "bn")
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
	public void test_ublvq14ynpyw_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ru")
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
	public void test_skv3u9htwkkw_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "ny")
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
	public void test_1hrpbgokuwlt1_v1Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "to")
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
	public void test_qdytna532gyq_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain;population")
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
	public void test_sl14ji6xqkoj_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "flag;borders;cioc")
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
	public void test_rhb1nvirwkl3_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs")
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
	public void test_sl3gq79dobhx_v2All() {

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
	public void test_1jifkjy6geng5_v2All() {

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
	public void test_qdsre19tc46v_v2All() {

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
	public void test_1ib0dtxc8fo6r_v2All() {

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
	public void test_uvjr9vy9ang2_v2All() {

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
	public void test_rhak43flcy8x_v2All() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
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
	public void test_toamt3yqudet_v2All() {

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
	public void test_1hux4vs9lnioy_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini;area;cioc;borders;numericCode")
				.pathParam("alphacode", "MN")
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
	public void test_qxnrnoco8x83_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion;name")
				.pathParam("alphacode", "NER")
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
	public void test_r1a12dek4yeu_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "SR")
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
	public void test_qec5t1s256cl_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "currencies")
				.pathParam("alphacode", "SRB")
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
	public void test_1iun4ntkiovaa_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital")
				.pathParam("alphacode", "IO")
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
	public void test_1hux8dqf6pgs2_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym")
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
	public void test_socbbbu3ht9d_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym")
				.pathParam("alphacode", "AO")
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
	public void test_vf0xj0e3oz1i_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages")
				.pathParam("alphacode", "BT")
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
	public void test_1iesaaawipwl3_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("alphacode", "OMN")
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
	public void test_1jy5gvrqrtnw3_v2Alphacode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("alphacode", "LV")
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
	public void test_1h7qz2vdcky0h_v2Alphacodes() {

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
	public void test_s4mb0sukc57m_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "GGY;SLE")
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
	public void test_vb6aunwiivdt_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MDV;KR")
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
	public void test_tol8dda6cl6d_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "UA")
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
	public void test_t842zifqrhb9_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "MQ")
				.queryParam("fields", "subregion;currencies;region")
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
	public void test_uveok2djrt5y_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "IN")
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
	public void test_t8f5ouonhkc2_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "SPM;BE")
				.queryParam("fields", "altSpellings")
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
	public void test_u7wvpl6ssd2r_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "CR")
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
	public void test_1h8212ok21kq9_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "SO")
				.queryParam("fields", "subregion")
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
	public void test_skvlud6kojlh_v2Alphacodes() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("codes", "KE;CK;BRA")
				.queryParam("fields", "altSpellings")
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
	public void test_1hux6fn7p2jat_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "BMD")
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
	public void test_qhvmq2e1l0s6_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "EUR")
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
	public void test_t4id4zkbu5b9_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion")
				.pathParam("currency", "JMD")
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
	public void test_u8apev0nixyc_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "AED")
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
	public void test_u87y13w3dg0y_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs")
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
	public void test_s0x9gi0jpfzp_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "demonym")
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
	public void test_qe6kp7zs7pkg_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area;cioc")
				.pathParam("currency", "BND")
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
	public void test_1jetatyo0vsc7_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code;population")
				.pathParam("currency", "MYR")
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
	public void test_1iv12psf6i15w_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "GMD")
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
	public void test_uruq3ebyy62g_v2Currency() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("currency", "MXN")
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
	public void test_1ib5zmzetd3kx_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "4594")
				.pathParam("name", "Argentina")
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
	public void test_uv5uulyvtn50_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.pathParam("name", "Germany")
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
	public void test_rhdtf9lrkkdy_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Virgin Islands (U.S.)")
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
	public void test_s4mbswnbkp4i_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.queryParam("fields", "currencies")
				.pathParam("name", "Iraq")
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
	public void test_1iexsznhcoyet_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("name", "Antarctica")
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
	public void test_1ib6hn8nw1js3_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.queryParam("fields", "region;demonym")
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
	public void test_1k25jzolzojtu_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "cioc;callingCodes;latlng")
				.pathParam("name", "Nauru")
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
	public void test_1iyq0e7kgelpf_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "false")
				.pathParam("name", "Belgium")
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
	public void test_1hr5cbcozaa7q_v2Name() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_s1dyftzkkjll_v2Name() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fullText", "true")
				.queryParam("fields", "area")
				.pathParam("name", "Haiti")
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
	public void test_1jylk16yy3ewm_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion")
				.pathParam("callingcode", "683")
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
	public void test_1iuyrmjjofsqd_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "225")
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
	public void test_1h7o6woyppjz9_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "352")
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
	public void test_rl558je7qgde_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "685")
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
	public void test_1jydantesz810_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders;gini;latlng")
				.pathParam("callingcode", "49")
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
	public void test_qhkl40hrq053_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones")
				.pathParam("callingcode", "385")
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
	public void test_uv95pm9sh54l_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages;timezones")
				.pathParam("callingcode", "243")
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
	public void test_uv6cdnyspq3m_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "name;demonym")
				.pathParam("callingcode", "52")
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
	public void test_urv6gixirt5u_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("callingcode", "685")
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
	public void test_1jyovau6fons2_v2Callingcode() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_1iukflto03voy_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "callingCodes;flag")
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
	public void test_t4q44adcf1b5_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "timezones;name")
				.pathParam("capital", "Vientiane")
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
	public void test_1hv8bhlx75quq_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Vienna")
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
	public void test_rhakyuqyp9b5_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "capital;name;nativeName")
				.pathParam("capital", "Freetown")
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
	public void test_sl3g0ptmcyn7_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Bamako")
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
	public void test_ubom031dv77b_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Port Moresby")
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
	public void test_ure34n10cspy_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region")
				.pathParam("capital", "Apia")
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
	public void test_1iberpyi4axx4_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha2Code;cioc;translations;region")
				.pathParam("capital", "King Edward Point")
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
	public void test_sl3fyh9adqgh_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode;callingCodes")
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
	public void test_r17b8flhxwth_v2Capital() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("capital", "Kingston")
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
	public void test_1jeqi9yax3rqo_v2Region() {

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
	public void test_tol7z5y0on6s_v2Region() {

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
	public void test_1iv4b6sy7oy0h_v2Region() {

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
	public void test_vbem3wvvtnqc_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs")
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
	public void test_s1036n95odpi_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code")
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
	public void test_sof2p2j61hro_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region")
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
	public void test_uvk8tbufzyp1_v2Region() {

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
	public void test_t4f26uqry89y_v2Region() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain")
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
	public void test_t4vows0pmder_v2Region() {

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
	public void test_qdqi01zjntk3_v2Region() {

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
	public void test_1jidb3mdk8xmh_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "region")
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
	public void test_1h7o7owqtfwvk_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng;timezones;altSpellings")
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
	public void test_1ib35zqa4ursl_v2Subregion() {

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
	public void test_s50753juqkon_v2Subregion() {

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
	public void test_1hbfyp0cfm7vq_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_sohvyi2wv67n_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "alpha3Code")
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
	public void test_t4f10yyg7dcx_v2Subregion() {

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
	public void test_t84lops3azxh_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
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
	public void test_ubj3miopdl5w_v2Subregion() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations")
				.pathParam("subregion", "Central Asia")
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
	public void test_1huxoqv1m4vnc_v2Subregion() {

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
	public void test_1iexslrw5glkm_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("lang", "my")
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
	public void test_1h822kfs1ugqh_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "bs")
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
	public void test_1iyq29qe7l06r_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng;region;borders")
				.pathParam("lang", "kk")
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
	public void test_1jicrolqpj90m_v2Lang() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_ts2g5dv0y4iq_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "fo")
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
	public void test_1jyovb0f6gzfl_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "mt")
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
	public void test_1jifjrvy2ufz6_v2Lang() {

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
	public void test_urjlij7jtlbs_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("lang", "am")
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
	public void test_toa5nkxtjfi0_v2Lang() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "regionalBlocs")
				.pathParam("lang", "lu")
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
	public void test_1ji7r5xkeio2t_v2Lang() {

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
	public void test_vf0x2ei2l4xc_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders")
				.pathParam("demonym", "Ecuadorean")
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
	public void test_tocvvk785fsg_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "nativeName")
				.pathParam("demonym", "Senegalese")
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
	public void test_t4swcyajt3y1_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Nicaraguan")
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
	public void test_1if0j72n4musl_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "borders;demonym;alpha3Code;alpha2Code;region")
				.pathParam("demonym", "Saint Helenian")
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
	public void test_1ibjs6laday46_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Dutch")
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
	public void test_1h7o6z7bxsdpd_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "latlng")
				.pathParam("demonym", "Uruguayan")
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
	public void test_u82ev1uzsapf_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "area")
				.pathParam("demonym", "Malian")
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
	public void test_uv9482lnh3dw_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Tuvaluan")
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
	public void test_skq2arfappgy_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.pathParam("demonym", "Papua New Guinean")
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
	public void test_1iey9tlh6jwpt_v2Demonym() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "topLevelDomain")
				.pathParam("demonym", "American")
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
	public void test_sl8x8h39gi0i_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "translations;capital")
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
	public void test_uvhfvea1koqh_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "numericCode;area;nativeName")
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
	public void test_uvbvxjy9zl84_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "gini;demonym")
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
	public void test_s18ei56yprg4_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "population;altSpellings;regionalBlocs;latlng")
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
	public void test_1hbisf9na2lo6_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "languages")
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
	public void test_1hb7o7y8uwrqa_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
				.queryParam("fields", "subregion;nativeName;numericCode")
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
	public void test_u7wvdwx7ybfl_v2Regionalbloc() {

		try {
			Response response = RestAssured
			.given()
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
	public void test_s18dsv7ka59y_v2Regionalbloc() {

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
	public void test_ubj2ru3w0qwn_v2Regionalbloc() {

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

	@Test
	public void test_1h823ev6guyig_v2Regionalbloc() {

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

}
