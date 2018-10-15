package test

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.scenario.Simulation

class Test extends Simulation {
    val baseurl = "https://localhost:44398/api/values"
    val httpConf = http.baseURL(baseurl)

    val scn = scenario("TESTE").exec(http("REQUEST").get("/"))

    setUp(scn.inject(atOnceUsers(5))).protocols(httpConf)
}