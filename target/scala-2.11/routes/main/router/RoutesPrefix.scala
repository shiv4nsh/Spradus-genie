
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/priyanka/Downloads/Spradus/Spradus-genie/conf/routes
// @DATE:Tue Feb 16 14:02:38 IST 2016


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
