
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/priyanka/Downloads/Spradus/conf/routes
// @DATE:Mon Feb 15 11:16:47 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
