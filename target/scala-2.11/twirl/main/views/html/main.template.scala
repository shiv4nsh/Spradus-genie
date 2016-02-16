
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en" class="no-js">
    <head>
        <meta charset="utf-8">
            <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">

        <script type="text/javascript" src=""""),_display_(/*14.46*/routes/*14.52*/.Assets.versioned("theme/js/ie-fixes.js")),format.raw/*14.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*15.46*/routes/*15.52*/.Assets.versioned("theme/js/_excanvas.compiled.js")),format.raw/*15.103*/(""""></script>
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.versioned("theme/css/ie-fixes.css")),format.raw/*16.88*/("""">

        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*18.70*/("""" type="text/javascript"></script>

        <meta name="description" content="Zeina HTML5 Theme">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href=""""),_display_(/*23.39*/routes/*23.45*/.Assets.versioned("theme/css/font-awesome-ie7.css")),format.raw/*23.96*/("""">
        <link rel="stylesheet" href=""""),_display_(/*24.39*/routes/*24.45*/.Assets.versioned("theme/css/font-awesome-ie7.min.css")),format.raw/*24.100*/("""">
        <link rel="stylesheet" href=""""),_display_(/*25.39*/routes/*25.45*/.Assets.versioned("theme/css/font-awesome.css")),format.raw/*25.92*/("""">
        <link rel="stylesheet" href=""""),_display_(/*26.39*/routes/*26.45*/.Assets.versioned("theme/css/font-awesome.min.css")),format.raw/*26.96*/("""">
        <link rel="stylesheet" href=""""),_display_(/*27.39*/routes/*27.45*/.Assets.versioned("theme/css/revolution_settings.css")),format.raw/*27.99*/("""">
        <link rel="stylesheet" href=""""),_display_(/*28.39*/routes/*28.45*/.Assets.versioned("theme/css/bootstrap.min.css")),format.raw/*28.93*/("""">
        <link rel="stylesheet" href=""""),_display_(/*29.39*/routes/*29.45*/.Assets.versioned("theme/css/eislider.css")),format.raw/*29.88*/("""">
        <link rel="stylesheet" href=""""),_display_(/*30.39*/routes/*30.45*/.Assets.versioned("theme/css/tipsy.css")),format.raw/*30.85*/("""">
        <link rel="stylesheet" href=""""),_display_(/*31.39*/routes/*31.45*/.Assets.versioned("theme/css/prettyPhoto.css")),format.raw/*31.91*/("""">
        <link rel="stylesheet" href=""""),_display_(/*32.39*/routes/*32.45*/.Assets.versioned("theme/css/isotop_animation.css")),format.raw/*32.96*/("""">
        <link rel="stylesheet" href=""""),_display_(/*33.39*/routes/*33.45*/.Assets.versioned("theme/css/animate.css")),format.raw/*33.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*34.39*/routes/*34.45*/.Assets.versioned("theme/css/flexslider.css")),format.raw/*34.90*/("""">

            <!-- remprod -->
        <link rel="stylesheet" href=""""),_display_(/*37.39*/routes/*37.45*/.Assets.versioned("theme/css/_colorpicker.css")),format.raw/*37.92*/("""">
            <!-- end remprod -->

        <link href=""""),_display_(/*40.22*/routes/*40.28*/.Assets.versioned("theme/css/style.css")),format.raw/*40.68*/("""" rel="stylesheet" type="text/css">
        <link href=""""),_display_(/*41.22*/routes/*41.28*/.Assets.versioned("theme/css/responsive.css")),format.raw/*41.73*/("""" rel="stylesheet" type="text/css">
        <link href=""""),_display_(/*42.22*/routes/*42.28*/.Assets.versioned("theme/css/skins/flat-blue.css")),format.raw/*42.78*/("""" rel="stylesheet" type="text/css" id="skin-file">
		<link href=""""),_display_(/*43.16*/routes/*43.22*/.Assets.versioned("theme/css/custom.css")),format.raw/*43.63*/("""" rel="stylesheet" type="text/css" id="skin-file">
            <!-- remprod -->
        <style type="text/css" id="skin-chooser-css"></style>
            <!-- end remprod -->

        <script src="https://maps.googleapis.com/maps/api/js?v=3.exp&amp;sensor=false"></script>

            <!-- Fonts -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400,600" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">

        <script src=""""),_display_(/*54.23*/routes/*54.29*/.Assets.versioned("theme/js/respond.js")),format.raw/*54.69*/("""" type="text/javascript"></script>

        <link rel="stylesheet" href=""""),_display_(/*56.39*/routes/*56.45*/.Assets.versioned("theme/css/color-chooser.css")),format.raw/*56.93*/("""">

    </head>
    <body>
        """),_display_(/*60.10*/content),format.raw/*60.17*/("""

            """),format.raw/*62.13*/("""<!-- end remprod -->
        <script type="text/javascript" src=""""),_display_(/*63.46*/routes/*63.52*/.Assets.versioned("theme/js/_jq.js")),format.raw/*63.88*/(""""></script>

        <script type="text/javascript" src=""""),_display_(/*65.46*/routes/*65.52*/.Assets.versioned("theme/js/_jquery.placeholder.js")),format.raw/*65.104*/(""""></script>

            <!-- remprod -->
        <script type="text/javascript" src=""""),_display_(/*68.46*/routes/*68.52*/.Assets.versioned("theme/js/_colorpicker.js")),format.raw/*68.97*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*69.46*/routes/*69.52*/.Assets.versioned("theme/js/_handlebars.js")),format.raw/*69.96*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*70.46*/routes/*70.52*/.Assets.versioned("theme/js/_skins.js")),format.raw/*70.91*/(""""></script>
        <script type="text/javascript" src=""""),_display_(/*71.46*/routes/*71.52*/.Assets.versioned("theme/js/_skinchooser.js")),format.raw/*71.97*/(""""></script>
            <!-- end remprod -->
        <script src=""""),_display_(/*73.23*/routes/*73.29*/.Assets.versioned("theme/js/activeaxon_menu.js")),format.raw/*73.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*74.23*/routes/*74.29*/.Assets.versioned("theme/js/animationEnigne.js")),format.raw/*74.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.versioned("theme/js/bootstrap.js")),format.raw/*75.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*76.23*/routes/*76.29*/.Assets.versioned("theme/js/bootstrap.min.js")),format.raw/*76.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*77.23*/routes/*77.29*/.Assets.versioned("theme/js/easypiecharts.js")),format.raw/*77.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*78.23*/routes/*78.29*/.Assets.versioned("theme/js/ie-fixes.js")),format.raw/*78.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*79.23*/routes/*79.29*/.Assets.versioned("theme/js/jquery.base64.js")),format.raw/*79.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*80.23*/routes/*80.29*/.Assets.versioned("theme/js/jquery.carouFredSel-6.2.1-packed.js")),format.raw/*80.94*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*81.23*/routes/*81.29*/.Assets.versioned("theme/js/jquery.cycle.js")),format.raw/*81.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*82.23*/routes/*82.29*/.Assets.versioned("theme/js/jquery.cycle2.carousel.js")),format.raw/*82.84*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*83.23*/routes/*83.29*/.Assets.versioned("theme/js/jquery.easing.1.3.js")),format.raw/*83.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*84.23*/routes/*84.29*/.Assets.versioned("theme/js/jquery.easytabs.js")),format.raw/*84.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*85.23*/routes/*85.29*/.Assets.versioned("theme/js/jquery.eislideshow.js")),format.raw/*85.80*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*86.23*/routes/*86.29*/.Assets.versioned("theme/js/jquery.flexslider.js")),format.raw/*86.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*87.23*/routes/*87.29*/.Assets.versioned("theme/js/jquery.infinitescroll.js")),format.raw/*87.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*88.23*/routes/*88.29*/.Assets.versioned("theme/js/jquery.isotope.js")),format.raw/*88.76*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*89.23*/routes/*89.29*/.Assets.versioned("theme/js/jquery.parallax-1.1.3.js")),format.raw/*89.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*90.23*/routes/*90.29*/.Assets.versioned("theme/js/jquery.prettyPhoto.js")),format.raw/*90.80*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*91.23*/routes/*91.29*/.Assets.versioned("theme/js/jQuery.scrollPoint.js")),format.raw/*91.80*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*92.23*/routes/*92.29*/.Assets.versioned("theme/js/jquery.themepunch.plugins.min.js")),format.raw/*92.91*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*93.23*/routes/*93.29*/.Assets.versioned("theme/js/jquery.themepunch.revolution.js")),format.raw/*93.90*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*94.23*/routes/*94.29*/.Assets.versioned("theme/js/jquery.tipsy.js")),format.raw/*94.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*95.23*/routes/*95.29*/.Assets.versioned("theme/js/jquery.validate.js")),format.raw/*95.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*96.23*/routes/*96.29*/.Assets.versioned("theme/js/jQuery.XDomainRequest.js")),format.raw/*96.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*97.23*/routes/*97.29*/.Assets.versioned("theme/js/retina.js")),format.raw/*97.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*98.23*/routes/*98.29*/.Assets.versioned("theme/js/timeago.js")),format.raw/*98.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*99.23*/routes/*99.29*/.Assets.versioned("theme/js/tweetable.jquery.js")),format.raw/*99.78*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*100.23*/routes/*100.29*/.Assets.versioned("theme/js/zeina.js")),format.raw/*100.67*/("""" type="text/javascript"></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Feb 16 14:02:38 IST 2016
                  SOURCE: /home/priyanka/Downloads/Spradus/Spradus-genie/app/views/main.scala.html
                  HASH: 01f5d8a6df8e732a8bab45aaeb2dc587449e3679
                  MATRIX: 530->1|655->31|683->33|914->238|939->243|1029->306|1044->312|1107->353|1195->414|1210->420|1271->459|1347->508|1362->514|1424->555|1508->612|1523->618|1596->669|1673->719|1688->725|1752->768|1805->794|1820->800|1882->841|2125->1057|2140->1063|2212->1114|2280->1155|2295->1161|2372->1216|2440->1257|2455->1263|2523->1310|2591->1351|2606->1357|2678->1408|2746->1449|2761->1455|2836->1509|2904->1550|2919->1556|2988->1604|3056->1645|3071->1651|3135->1694|3203->1735|3218->1741|3279->1781|3347->1822|3362->1828|3429->1874|3497->1915|3512->1921|3584->1972|3652->2013|3667->2019|3730->2061|3798->2102|3813->2108|3879->2153|3977->2224|3992->2230|4060->2277|4145->2335|4160->2341|4221->2381|4305->2438|4320->2444|4386->2489|4470->2546|4485->2552|4556->2602|4649->2668|4664->2674|4726->2715|5302->3264|5317->3270|5378->3310|5479->3384|5494->3390|5563->3438|5626->3474|5654->3481|5696->3495|5789->3561|5804->3567|5861->3603|5946->3661|5961->3667|6035->3719|6149->3806|6164->3812|6230->3857|6314->3914|6329->3920|6394->3964|6478->4021|6493->4027|6553->4066|6637->4123|6652->4129|6718->4174|6812->4241|6827->4247|6896->4295|6980->4352|6995->4358|7064->4406|7148->4463|7163->4469|7226->4511|7310->4568|7325->4574|7392->4620|7476->4677|7491->4683|7558->4729|7642->4786|7657->4792|7719->4833|7803->4890|7818->4896|7885->4942|7969->4999|7984->5005|8070->5070|8154->5127|8169->5133|8235->5178|8319->5235|8334->5241|8410->5296|8494->5353|8509->5359|8580->5409|8664->5466|8679->5472|8748->5520|8832->5577|8847->5583|8919->5634|9003->5691|9018->5697|9089->5747|9173->5804|9188->5810|9263->5864|9347->5921|9362->5927|9430->5974|9514->6031|9529->6037|9604->6091|9688->6148|9703->6154|9775->6205|9859->6262|9874->6268|9946->6319|10030->6376|10045->6382|10128->6444|10212->6501|10227->6507|10309->6568|10393->6625|10408->6631|10474->6676|10558->6733|10573->6739|10642->6787|10726->6844|10741->6850|10816->6904|10900->6961|10915->6967|10975->7006|11059->7063|11074->7069|11135->7109|11219->7166|11234->7172|11304->7221|11389->7278|11405->7284|11465->7322
                  LINES: 20->1|25->1|27->3|33->9|33->9|35->11|35->11|35->11|36->12|36->12|36->12|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|42->18|42->18|42->18|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|58->34|58->34|58->34|61->37|61->37|61->37|64->40|64->40|64->40|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|78->54|78->54|78->54|80->56|80->56|80->56|84->60|84->60|86->62|87->63|87->63|87->63|89->65|89->65|89->65|92->68|92->68|92->68|93->69|93->69|93->69|94->70|94->70|94->70|95->71|95->71|95->71|97->73|97->73|97->73|98->74|98->74|98->74|99->75|99->75|99->75|100->76|100->76|100->76|101->77|101->77|101->77|102->78|102->78|102->78|103->79|103->79|103->79|104->80|104->80|104->80|105->81|105->81|105->81|106->82|106->82|106->82|107->83|107->83|107->83|108->84|108->84|108->84|109->85|109->85|109->85|110->86|110->86|110->86|111->87|111->87|111->87|112->88|112->88|112->88|113->89|113->89|113->89|114->90|114->90|114->90|115->91|115->91|115->91|116->92|116->92|116->92|117->93|117->93|117->93|118->94|118->94|118->94|119->95|119->95|119->95|120->96|120->96|120->96|121->97|121->97|121->97|122->98|122->98|122->98|123->99|123->99|123->99|124->100|124->100|124->100
                  -- GENERATED --
              */
          