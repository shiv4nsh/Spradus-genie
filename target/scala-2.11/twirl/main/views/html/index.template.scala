
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

            """),format.raw/*5.13*/("""<div id="wrapper"  >

                <div class="top_wrapper">

                    <div id="wrapper"  >

                        <div class="top_wrapper">

                                <!-- Header -->
                            <header id="header">
                                <div class="container">

                                    <div class="row header">

                                            <!-- Logo -->
                                        <div class="col-md-2 col-sm-4 col-xs-4 logo">
                                            <a href="#">
                                                <img src=""""),_display_(/*22.60*/routes/*22.66*/.Assets.versioned("theme/images/spradus-logo.png")),format.raw/*22.116*/("""" alt="Zeina HTML5 Theme"/>
                                            </a>
                                        </div>
                                            <!-- //Logo// -->


                                            <!-- Navigation File -->
                                        <div class="col-md-10">

                                                <!-- Mobile Button Menu -->
                                            <div class="mobile-menu-button">
                                                <i class="icon-reorder"></i>
                                            </div>
                                                <!-- //Mobile Button Menu// -->




                                            <nav>
                                                <ul class="navigation">
                                                    <li>
                                                        <a href="#aboutUs">
                                                            <span class="label-nav">
                                                                Product
                                                            </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#solution">
                                                            <span class="label-nav">
                                                                Solution
                                                            </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#work">
                                                            <span class="label-nav">
                                                                Work
                                                            </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#benefits">
                                                            <span class="label-nav">
                                                                Benefits
                                                            </span>
                                                        </a>
                                                    </li>
                                                    <li>
                                                        <a href="#whySpradus">
                                                            <span class="label-nav">
                                                                Why Spradus?
                                                            </span>
                                                        </a>
                                                    </li>
                                                </ul>

                                            </nav>

                                                <!-- Mobile Nav. Container -->
                                            <ul class="mobile-nav">
                                                <li class="responsive-searchbox">
                                                        <!-- Responsive Nave -->
                                                    <form action="#" method="get">
                                                        <input type="text" class="searchbox-inputtext" id="searchbox-inputtext-mobile" name="s" />
                                                        <button class="icon-search"></button>
                                                    </form>
                                                        <!-- //Responsive Nave// -->
                                                </li>
                                            </ul>
                                                <!-- //Mobile Nav. Container// -->
                                        </div>
                                            <!-- Nav -->

                                    </div>



                                </div>
                            </header>
                                <!-- //Header// -->
                            <div class="rev-slider-full">
                                <div class="rev-slider-banner-full  rev-slider-full">
                                    <ul>


                                        <li data-transition="fade" data-slotamount="7" data-masterspeed="300" >
                                            <img src=""""),_display_(/*109.56*/routes/*109.62*/.Assets.versioned("theme/media/rev-images/slider1/slide1-bg.jpg")),format.raw/*109.127*/(""""  alt="rev-full1" data-fullwidthcentering="on">

                                            """),format.raw/*117.3*/("""
                                            """),format.raw/*118.45*/("""<div class="tp-caption sfb stb stl"
                                            data-x="0"
                                            data-y="40"
                                            data-speed="1500"
                                            data-start="1800"
                                            data-easing="easeOutExpo" data-end="6200" data-endspeed="500"><img src=""""),_display_(/*123.118*/routes/*123.124*/.Assets.versioned("images/sprdus.png")),format.raw/*123.162*/("""" alt="Image 2"></div>

                                            <div class="tp-caption very_large_text2 sft str"
                                            data-x="672"
                                            data-y="100"
                                            data-speed="300"
                                            data-start="1800"
                                            data-easing="easeOutCubic" data-end="5800" data-endspeed="500"> Spradus </div>

                                            <div class="tp-caption main_color_text sfl str "
                                            data-x="672"
                                            data-y="145"
                                            data-speed="200"
                                            data-start="2000"
                                            data-easing="easeOutCubic" data-end="5600" data-endspeed="500"> with a support for Spark</div>

                                            <div class="tp-caption default_text sfl str "
                                            data-x="672"
                                            data-y="200"
                                            data-speed="200"
                                            data-start="2200"
                                            data-easing="" data-end="5400" data-endspeed="500" > The Reactive Big Data Platform </div>

                                            <div class="tp-caption sfl str "
                                            data-x="672"
                                            data-y="220"
                                            data-speed="200"
                                            data-start="2400"
                                            data-easing="" data-end="5000" data-endspeed="500" ><img src=""""),_display_(/*151.108*/routes/*151.114*/.Assets.versioned("images/spark.png")),format.raw/*151.151*/("""" alt="Spark Logo" style="width:300px; height:150px"></div>
                                        </li>

                                        <li data-transition="fade" data-slotamount="7" data-masterspeed="300" >
                                            <img src=""""),_display_(/*155.56*/routes/*155.62*/.Assets.versioned("theme/media/rev-images/slider1/slide2-bg.jpg")),format.raw/*155.127*/(""""  alt="rev-full1" data-fullwidthcentering="on">

                                            <div class="tp-caption lfb stb stl"
                                            data-x="585"
                                            data-y="10"
                                            data-speed="1500"
                                            data-start="200"
                                            data-easing="easeOutExpo" data-end="6000" data-endspeed="500"><img src=""""),_display_(/*162.118*/routes/*162.124*/.Assets.versioned("images/slide2.png")),format.raw/*162.162*/("""" alt="Image 1"></div>

                                            <div class="tp-caption very_large_text2 sft str"
                                            data-x="0"
                                            data-y="100"
                                            data-speed="300"
                                            data-start="1800"
                                            data-easing="easeOutCubic" data-end="5800" data-endspeed="500"> A full stack solution</div>

                                            <div class="tp-caption main_color_text sfl str "
                                            data-x="0"
                                            data-y="150"
                                            data-speed="200"
                                            data-start="2000"
                                            data-easing="easeOutCubic" data-end="5600" data-endspeed="500"> for big data analysis</div>


                                            <div class="tp-caption default_text sfl str "
                                            data-x="0"
                                            data-y="260"
                                            data-speed="200"
                                            data-start="2200"
                                            data-easing="" data-end="5400" data-endspeed="500" >
                                                <ul class="icons-list check-2 colored-list ">
                                                    <li class="custom-font"><strong>Power Pack</strong> - Power of Spark + Power of Scala. </li>
                                                    <li class="custom-font"><strong>LightSpeed</strong> - 100x faster than Hadoop. </li>
                                                    <li class="custom-font"><strong>Trenchworkers</strong> - Brought to you by the people who understand Big Data and Functional Programming.</li>
                                                </ul>
                                            </div>
                                        </li>

                                    </ul>
                                    <div class="tp-bannertimer tp-bottom"></div>
                                </div>
                            </div></div><!--.top wrapper end -->

                        <div class="loading-container">
                            <div class="loading">
                                <i></i><i></i>
                            </div>
                            <div class="loading-fallback">
                                <img src="images/loading.gif" alt="Loading"/>
                            </div>
                            <div class="loading-text">
                                loading..
                            </div>
                        </div>

                <div class="content-wrapper hide-until-loading"><div class="section-content top-body section-services">

                    <div class="container">
                        <div class="row">
                            <div class="col-md-3 col-sm-3">

                                <div class="content-box animated "
                                data-animtype="fadeIn"
                                data-animrepeat="0"
                                data-animspeed="1s"
                                data-animdelay="0.2s"
                                >
                                    <h4 class="h4-body-title">
                                        <i class="icon-cog"></i>
                                        Features
                                    </h4>
                                    <div class="content-box-text">
                                        Spradus is designed to empower enterprises across industry verticals with a wide range of real-time use cases.
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">

                                <div class="content-box animated "
                                data-animtype="fadeIn"
                                data-animrepeat="0"
                                data-animspeed="1s"
                                data-animdelay="0.2s"
                                >
                                    <h4 class="h4-body-title">
                                        <i class="icon-film"></i>
                                        Architecture
                                    </h4>
                                    <div class="content-box-text">
                                        Spradus is designed to continuously ingest massive volumes of data. The engine continuously queries, filters, and analyzes data to discover exceptions, & trends that are presented through live dashboards.
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-3">

                                <div class="content-box animated "
                                data-animtype="fadeIn"
                                data-animrepeat="0"
                                data-animspeed="1s"
                                data-animdelay="0.2s"
                                >
                                    <h4 class="h4-body-title">
                                        <i class="icon-tablet"></i>
                                        Why Spark?
                                    </h4>
                                    <div class="content-box-text">
                                        Spark enables applications in Hadoop clusters to run up to 100x faster in memory, and 10x faster even when running on disk.
                                    </div>

                                </div>

                            </div>
                            <div class="col-md-3 col-sm-3">

                                <div class="content-box animated "
                                data-animtype="fadeIn"
                                data-animrepeat="0"
                                data-animspeed="1s"
                                data-animdelay="0.2s"
                                >
                                    <h4 class="h4-body-title">
                                        <i class="icon-magic"></i>
                                      Spark Ecosystem
                                    </h4>
                                    <div class="content-box-text">
                                        Many data scientists, analysts, and general business intelligence users rely on interactive SQL queries for exploring data.

                                    </div>

                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                        <div class="section-content section-alter" id="aboutUs">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-6 col-sm-6">
                                        <div class="left-title">
                                            <div class="heading-title">
                                                <h2 class="h2-section-title left-text">Spradus</h2>
                                            </div>
                                            <p>
                                                Spradus allows you to live your Big Data Productive dream using a Reactive paradigm. Based on the Reactive Manifesto, Spradus is the high performance engine which powers the next generation products.
                                            </p>
                                            <p>
                                                Architected, developed, and built completely with Spark , Spradus provides an enterprise ready data platform that enables organizations to adopt a Modern Data Architecture.
                                            </p>
                                            <p>
                                                Our software harnesses the processing power of Spark to help you in your business analytics, monitoring and analysis, by helping you mine your data to better understand your target, whether it be for marketing, retail, banking, etc.
                                            </p>
                                        </div>
                                        <div class="space-sep20"></div>
                                        <a href="#" class="btn btn-primary btn-large">Know more</a>
                                    </div>

                                    <div class="col-md-6 col-sm-6 abt-spradus">
                                        <img src=""""),_display_(/*313.52*/routes/*313.58*/.Assets.versioned("images/about.png")),format.raw/*313.95*/("""" alt="" class="img-responsive"/>
                                    </div>

                                </div>
                            </div>
                        </div>

                        <div class="container" id="work">
                            <div class="row">
                                <div class="col-md-12 col-sm-12">
                                    <div class="center-title section-top">
                                        <div class="heading-title">
                                            <h2 class="h2-section-title">How Spradus works?</h2>
                                        </div>
                                        <p>Spradus platform is specifically architected for real-time streaming data applications to provide rapid
                                        application development through a powerful visual developer interface, deliver massive performance and scalability, and simplify deployment.</p>
                                        <div class="space-sep40"></div>
                                    </div>
                                    <div class="process-container">
                                        <div class="single-process ">
                                            <div class="process-step">
                                                1
                                            </div>
                                            <div class="process-details">
                                                <i class="icon-comments-alt"></i>
                                                <div class="process_text">
                                                    <h4>Messages</h4>
                                                    <p>Configure messages and alerts.</p>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="single-process ">
                                            <div class="process-step">
                                                2
                                            </div>
                                            <div class="process-details">
                                                <i class="icon-dropbox"></i>
                                                <div class="process_text">
                                                    <h4>Dropbox</h4>
                                                    <p>Drag and drop operators.</p>
                                                </div>
                                            </div>
                                        </div>


                                        <div class="single-process  ">
                                            <div class="process-step">
                                                3
                                            </div>
                                            <div class="process-details">
                                                <i class="icon-group"></i>
                                                <div class="process_text">
                                                    <h4>Connections</h4>
                                                    <p>Draw Connections.</p>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="single-process  last">
                                            <div class="process-step">
                                                4
                                            </div>
                                            <div class="process-details">
                                                <i class="icon-save"></i>
                                                <div class="process_text">
                                                    <h4>View</h4>
                                                    <p>Save, run and view performance.</p>
                                                </div>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="section-content section-alter" id="solution">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-12 col-sm-12">
                                            <div class="center-title">
                                                <div class="heading-title">
                                                    <h2 class="h2-section-title">Solutions that Deliver Business Value</h2>
                                                </div>
                                            </div>
                                            <div class="row section-top">
                                                <div class="col-md-3 col-sm-3">

                                                    <div class="content-box style5 small  red animated "
                                                    data-animtype="fadeInUp"
                                                    data-animrepeat="0"
                                                    data-animspeed="1.5s"
                                                    data-animdelay="0.2s"
                                                    >
                                                        <h4 class="h4-body-title">
                                                            <i class="icon-tablet"></i>
                                                            <strong>Real Time VOIP and Call center anaytics</strong>
                                                        </h4>
                                                        <div class="content-box-text">
                                                            Monitor and Boost Quality of Customer service while it is happening.

                                                        </div>

                                                    </div>

                                                </div>
                                                <div class="col-md-3 col-sm-3">

                                                    <div class="content-box style5 small  orange animated "
                                                    data-animtype="fadeInUp"
                                                    data-animrepeat="0"
                                                    data-animspeed="1.5s"
                                                    data-animdelay="0.2s"
                                                    >
                                                        <h4 class="h4-body-title">
                                                            <i class="icon-gears"></i>
                                                            <strong>Log Analytics </strong>
                                                        </h4>
                                                        <div class="content-box-text">
                                                            Ingest, Search, and Analyze All Your Logs in Real-time.

                                                        </div>

                                                    </div>

                                                </div>
                                                <div class="col-md-3 col-sm-3">

                                                    <div class="content-box style5 small  green animated "
                                                    data-animtype="fadeInUp"
                                                    data-animrepeat="0"
                                                    data-animspeed="1.5s"
                                                    data-animdelay="0.2s"
                                                    >
                                                        <h4 class="h4-body-title">
                                                            <i class="icon-magic"></i>
                                                            <strong>Streaming ETL </strong>
                                                        </h4>
                                                        <div class="content-box-text">
                                                            Clean-up, Pre-process, and Transform Data in Motion.

                                                        </div>

                                                    </div>

                                                </div>
                                                <div class="col-md-3 col-sm-3">

                                                    <div class="content-box style5 small  purple animated "
                                                    data-animtype="fadeInUp"
                                                    data-animrepeat="0"
                                                    data-animspeed="1.5s"
                                                    data-animdelay="0.2s"
                                                    >
                                                        <h4 class="h4-body-title">
                                                            <i class="icon-file-text"></i>
                                                            <strong>Real Time Marketing </strong>
                                                        </h4>
                                                        <div class="content-box-text">
                                                            Understand and Provide What the Customers Want - NOW!

                                                        </div>

                                                    </div>

                                                </div>
                                                <div class="space-sep40"></div>
                                            </div>
                                            <div class="row section-top">

                                            <div class="col-md-3 col-sm-3">

                                                <div class="content-box style5 small  green animated "
                                                data-animtype="fadeInUp"
                                                data-animrepeat="0"
                                                data-animspeed="1.5s"
                                                data-animdelay="0.2s">
                                                    <h4 class="h4-body-title">
                                                        <i class="icon-magic"></i>
                                                        <strong>Deep social listening</strong>
                                                    </h4>
                                                    <div class="content-box-text">
                                                        Perform Deep Sentiment and Topic Analysis in Real-time.

                                                    </div>

                                                </div>

                                            </div>

                                            <div class="col-md-3 col-sm-3">

                                                <div class="content-box style5 small  purple animated "
                                                data-animtype="fadeInUp"
                                                data-animrepeat="0"
                                                data-animspeed="1.5s"
                                                data-animdelay="0.2s"
                                                >
                                                    <h4 class="h4-body-title">
                                                        <i class="icon-file-text"></i>
                                                        <strong>Predictive Maintenance</strong>
                                                    </h4>
                                                    <div class="content-box-text">
                                                        Predict and Prevent Equipment Failures.

                                                    </div>

                                                </div>

                                            </div>

                                                <div class="col-md-3 col-sm-3">

                                                    <div class="content-box style5 small  red animated "
                                                    data-animtype="fadeInUp"
                                                    data-animrepeat="0"
                                                    data-animspeed="1.5s"
                                                    data-animdelay="0.2s"
                                                    >
                                                        <h4 class="h4-body-title">
                                                            <i class="icon-tablet"></i>
                                                            <strong>Enterprise Data Bus</strong>
                                                        </h4>
                                                        <div class="content-box-text">
                                                            Create a Modern Responsive Enterprise by keeping all systems in synch all the time.

                                                        </div>

                                                    </div>

                                                </div>
                                        <div class="space-sep40"></div>
                                    </div>
                                    </div>
                                </div>
                        </div>
                                </div>
                            </div>

                    <div class="container section-top"id="benefits">
                            <div class="row">
                                <div class="col-md-12 col-sm-12">
                                    <div class="center-title">
                                        <div class="heading-title">
                                            <h2 class="h2-section-title">How Can You Benefit from Spradus?</h2>
                                        </div>
                                    </div>
                                    <div class="tab-container tabs-vertical section-top">
                                        <ul class="etabs ">

                                            <li class="tab">
                                                <a href="#tab1"><i class="icon-leaf"></i>Cut Preventable Losses</a>
                                            </li>


                                            <li class="tab">
                                                <a href="#tab2"><i class="icon-compass"></i>Gain Operational Insights</a>
                                            </li>


                                            <li class="tab">
                                                <a href="#tab3"><i class="icon-html5"></i>Seize New Opportunities</a>
                                            </li>

                                        </ul>

                                        <div class="tabs-content">
                                            <div id="tab1">
                                                <p class="tab-paragraph-text">Spradus is helping to avoid preventable losses through early detection of at-risk situations.</p>
                                            </div>
                                            <div id="tab2">
                                                <p class="tab-paragraph-text">Spradus can provide operational insights to ensure process reliability and improved decision making throughout the enterprise by analyzing operational events in real-time.</p>
                                            </div>
                                            <div id="tab3">
                                                <p class="tab-paragraph-text">By applying real-time analytics on streaming data, you can identify cross-sell and upsell opportunities based on personal profiles and preferences in real-time to speed the buying process and improve the user experience.</p>
                                            </div>
                                        </div>

                                    </div>

                                </div>
                                <div class="space-sep60"></div>
                            </div>
                        </div>

                    <div class="section-content section-alter" id="whySpradus">
                        <div class="container">
                            <div class="row">

                                <div class="col-md-6 col-sm-6">
                                    <img src=""""),_display_(/*604.48*/routes/*604.54*/.Assets.versioned("images/whySpraduss.png")),format.raw/*604.97*/("""" alt="" class="img-responsive"/>
                                </div>
                                <div class="col-md-6 col-sm-6">
                                    <div class="right-title">
                                        <div class="heading-title">
                                            <h2 class="h2-section-title left-text">Why Spradus</h2>
                                        </div>
                                        <p>
                                            Enterprises are moving to add real-time engines or platforms to their Big Data architecture stack.
                                            To do that, they have two sub-optimal options - expensive, proprietary, commercial products or they can "Do-it-yourself" using raw Open Source. Enterprises now have a third more favorable option for real-time streaming data application development - Spradus.
                                        </p>
                                    </div>
                                    <div class="space-sep20"></div>
                                    <a href="#" class="btn btn-primary btn-large">Know more</a>
                                </div>
                            </div>
                        </div>
                </div><!--.content-wrapper end -->
                <footer>
                    <div class="footer">

                        """),format.raw/*767.33*/("""
                        """),format.raw/*768.25*/("""<div class="copyright custom-copyright">
                            <div class="container">
                                <div class="row custom-row-top">
                                    <div class="col-md-6 col-sm-6 logo">
                                        <ul>
                                            <li>
                                                <a href="#">
                                                    <img src=""""),_display_(/*775.64*/routes/*775.70*/.Assets.versioned("theme/images/spradus-logo.png")),format.raw/*775.120*/("""" alt="Spradus"/>
                                                </a>
                                            </li>
                                            <li class="footer-color">
                                                <a href="#">Privacy</a><span> |</span>
                                                <a href="#">Terms of Use</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="col-md-6 col-sm-6">

                                        <div class="social-icons right-align">

                                            <ul>
                                                <li>
                                                    <a href="#aboutUs" title="About US">About us</a><span> |</span>
                                                    <a title="FAQ">FAQ</a><span> |</span>
                                                    <a title="Partners">Partner with us</a>
                                                </li>
                                                </ul>
                                            <ul>
                                                <li>
                                                    <a title="Jobs">Jobs</a><span> |</span>
                                                    <a href="http://blog.knoldus.com/" title="Blog" target="_blank">Blog</a><span> |</span>
                                                    <a href="https://twitter.com/knolspeak" title="Twitter" target="_blank">Twitter</a><span> |</span>
                                                    <a href="http://www.knoldus.com/connect/contactus.knol" title="Contact Us" target="_blank">Contact Us</a>
                                                </li>

                                            </ul>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </footer>

            </div><!-- wrapper end -->


            <!-- remprod -->
            <script type="text/x-handlebars-template" id="css-skin">


            .navigation > li:hover > a,.navigation > li > a:hover,
            .navigation > li > .activelink,.navigation > li:hover > a > i, .navigation > li > a:hover >
            span.label-nav-sub::before, .navigation > li > a:focus > span.label-nav-sub::before"""),format.raw/*823.96*/("""{"""),format.raw/*823.97*/("""
            """),format.raw/*824.13*/("""color:  """),format.raw/*824.21*/("""{"""),format.raw/*824.22*/("""{"""),format.raw/*824.23*/("""skin_color"""),format.raw/*824.33*/("""}"""),format.raw/*824.34*/("""}"""),format.raw/*824.35*/(""";
            """),format.raw/*825.13*/("""}"""),format.raw/*825.14*/("""
            """),format.raw/*826.13*/(""".mobile-menu-button, .mobile-nav, .slider-fixed-container"""),format.raw/*826.70*/("""{"""),format.raw/*826.71*/("""
            """),format.raw/*827.13*/("""background-color:  """),format.raw/*827.32*/("""{"""),format.raw/*827.33*/("""{"""),format.raw/*827.34*/("""skin_color"""),format.raw/*827.44*/("""}"""),format.raw/*827.45*/("""}"""),format.raw/*827.46*/(""";
            """),format.raw/*828.13*/("""}"""),format.raw/*828.14*/("""

            """),format.raw/*830.13*/(""".navigation > li > a:after, .navigation>li>.activelink:after"""),format.raw/*830.73*/("""{"""),format.raw/*830.74*/("""
            """),format.raw/*831.13*/("""background-color:  """),format.raw/*831.32*/("""{"""),format.raw/*831.33*/("""{"""),format.raw/*831.34*/("""skin_color"""),format.raw/*831.44*/("""}"""),format.raw/*831.45*/("""}"""),format.raw/*831.46*/(""";
            """),format.raw/*832.13*/("""}"""),format.raw/*832.14*/("""
            """),format.raw/*833.13*/(""".navigation>li:hover > a > span.label-nav-sub::before,.navigation>li:hover> a > span.label-nav-sub::before"""),format.raw/*833.119*/("""{"""),format.raw/*833.120*/("""
            """),format.raw/*834.13*/("""color:  """),format.raw/*834.21*/("""{"""),format.raw/*834.22*/("""{"""),format.raw/*834.23*/("""skin_color"""),format.raw/*834.33*/("""}"""),format.raw/*834.34*/("""}"""),format.raw/*834.35*/(""";
            """),format.raw/*835.13*/("""}"""),format.raw/*835.14*/("""


            """),format.raw/*838.13*/("""/* Page Content Colors */
            .body-wrapper a:hover , .tab a:hover, accordion .title:hover, .top-body a:hover, .bottom-body
            a:hover,.content-box.content-style2 h4 i
            ,.accordion .active h4, .accordion .title:hover h4, .side-navigation .menu-item.current-menu-item a,
            .side-navigation .menu-item:hover a:after,
            .side-navigation .menu-item:hover a, a.tool-tip, .team-member .team-member-position, .team-member-progress
            .team-member-position, .item-img-overlay i
            ,ul.icon-content-list-container li.icon-content-single .icon-box i,.item-img-overlay .portfolio-zoom:hover,
            .navigation ul li:hover>a, .blog_post_quote:after,
            .item-img-overlay .portfolio-zoom, body .white-text .feature-details a:hover"""),format.raw/*847.89*/("""{"""),format.raw/*847.90*/("""
            """),format.raw/*848.13*/("""color:  """),format.raw/*848.21*/("""{"""),format.raw/*848.22*/("""{"""),format.raw/*848.23*/("""skin_color"""),format.raw/*848.33*/("""}"""),format.raw/*848.34*/("""}"""),format.raw/*848.35*/(""";
            """),format.raw/*849.13*/("""}"""),format.raw/*849.14*/("""
            """),format.raw/*850.13*/("""::selection
            """),format.raw/*851.13*/("""{"""),format.raw/*851.14*/("""
            """),format.raw/*852.13*/("""background-color: """),format.raw/*852.31*/("""{"""),format.raw/*852.32*/("""{"""),format.raw/*852.33*/("""skin_color"""),format.raw/*852.43*/("""}"""),format.raw/*852.44*/("""}"""),format.raw/*852.45*/(""";
            """),format.raw/*853.13*/("""}"""),format.raw/*853.14*/("""
            """),format.raw/*854.13*/("""::-moz-selection
            """),format.raw/*855.13*/("""{"""),format.raw/*855.14*/("""
            """),format.raw/*856.13*/("""background-color: """),format.raw/*856.31*/("""{"""),format.raw/*856.32*/("""{"""),format.raw/*856.33*/("""skin_color"""),format.raw/*856.43*/("""}"""),format.raw/*856.44*/("""}"""),format.raw/*856.45*/(""";
            """),format.raw/*857.13*/("""}"""),format.raw/*857.14*/("""
            """),format.raw/*858.13*/(""".item-img-overlay .portfolio-zoom:hover, .tab a.active """),format.raw/*858.68*/("""{"""),format.raw/*858.69*/("""
            """),format.raw/*859.13*/("""color:  """),format.raw/*859.21*/("""{"""),format.raw/*859.22*/("""{"""),format.raw/*859.23*/("""skin_color"""),format.raw/*859.33*/("""}"""),format.raw/*859.34*/("""}"""),format.raw/*859.35*/(""" """),format.raw/*859.36*/("""!important;
            """),format.raw/*860.13*/("""}"""),format.raw/*860.14*/("""
            """),format.raw/*861.13*/(""".callout-box"""),format.raw/*861.25*/("""{"""),format.raw/*861.26*/("""
            """),format.raw/*862.13*/("""border-left-color:  """),format.raw/*862.33*/("""{"""),format.raw/*862.34*/("""{"""),format.raw/*862.35*/("""skin_color"""),format.raw/*862.45*/("""}"""),format.raw/*862.46*/("""}"""),format.raw/*862.47*/("""
            """),format.raw/*863.13*/("""}"""),format.raw/*863.14*/("""
            """),format.raw/*864.13*/(""".feature .feature-content,.team-member .team-member-content"""),format.raw/*864.72*/("""{"""),format.raw/*864.73*/("""
            """),format.raw/*865.13*/("""border-top-color:  """),format.raw/*865.32*/("""{"""),format.raw/*865.33*/("""{"""),format.raw/*865.34*/("""skin_color"""),format.raw/*865.44*/("""}"""),format.raw/*865.45*/("""}"""),format.raw/*865.46*/(""";
            """),format.raw/*866.13*/("""}"""),format.raw/*866.14*/("""

            """),format.raw/*868.13*/(""".team-member-progress-bar"""),format.raw/*868.38*/("""{"""),format.raw/*868.39*/("""
            """),format.raw/*869.13*/("""background-color:  """),format.raw/*869.32*/("""{"""),format.raw/*869.33*/("""{"""),format.raw/*869.34*/("""skin_color"""),format.raw/*869.44*/("""}"""),format.raw/*869.45*/("""}"""),format.raw/*869.46*/(""";
            """),format.raw/*870.13*/("""}"""),format.raw/*870.14*/("""
            """),format.raw/*871.13*/(""".blog-masonry .blog_post_quote"""),format.raw/*871.43*/("""{"""),format.raw/*871.44*/("""
            """),format.raw/*872.13*/("""border-top: 2px solid  """),format.raw/*872.36*/("""{"""),format.raw/*872.37*/("""{"""),format.raw/*872.38*/("""skin_color"""),format.raw/*872.48*/("""}"""),format.raw/*872.49*/("""}"""),format.raw/*872.50*/(""";
            """),format.raw/*873.13*/("""}"""),format.raw/*873.14*/("""
            """),format.raw/*874.13*/(""".tab a.active:after """),format.raw/*874.33*/("""{"""),format.raw/*874.34*/("""
            """),format.raw/*875.13*/("""background-color: """),format.raw/*875.31*/("""{"""),format.raw/*875.32*/("""{"""),format.raw/*875.33*/("""skin_color"""),format.raw/*875.43*/("""}"""),format.raw/*875.44*/("""}"""),format.raw/*875.45*/(""";
            border-color:  """),format.raw/*876.28*/("""{"""),format.raw/*876.29*/("""{"""),format.raw/*876.30*/("""skin_color"""),format.raw/*876.40*/("""}"""),format.raw/*876.41*/("""}"""),format.raw/*876.42*/(""";
            """),format.raw/*877.13*/("""}"""),format.raw/*877.14*/("""
            """),format.raw/*878.13*/(""".item-img-overlay"""),format.raw/*878.30*/("""{"""),format.raw/*878.31*/("""
            """),format.raw/*879.13*/("""background-color:  """),format.raw/*879.32*/("""{"""),format.raw/*879.33*/("""{"""),format.raw/*879.34*/("""skin_color_rgba"""),format.raw/*879.49*/("""}"""),format.raw/*879.50*/("""}"""),format.raw/*879.51*/(""";
            """),format.raw/*880.13*/("""}"""),format.raw/*880.14*/("""
            """),format.raw/*881.13*/(""".item-img-overlay i:hover"""),format.raw/*881.38*/("""{"""),format.raw/*881.39*/("""
            """),format.raw/*882.13*/("""background-color:  """),format.raw/*882.32*/("""{"""),format.raw/*882.33*/("""{"""),format.raw/*882.34*/("""skin_color_rgba"""),format.raw/*882.49*/("""}"""),format.raw/*882.50*/("""}"""),format.raw/*882.51*/(""";
            """),format.raw/*883.13*/("""}"""),format.raw/*883.14*/("""
            """),format.raw/*884.13*/("""body .section-content.section-image"""),format.raw/*884.48*/("""{"""),format.raw/*884.49*/("""
            """),format.raw/*885.13*/("""background-color:  """),format.raw/*885.32*/("""{"""),format.raw/*885.33*/("""{"""),format.raw/*885.34*/("""skin_color_rgba"""),format.raw/*885.49*/("""}"""),format.raw/*885.50*/("""}"""),format.raw/*885.51*/(""";
            """),format.raw/*886.13*/("""}"""),format.raw/*886.14*/("""



            """),format.raw/*890.13*/(""".button, .body-wrapper input[type="submit"], .body-wrapper input[type="button"], .section-content.section-color-bg,.content-box.content-style4 h4 i
            ,button.button-main,.body-wrapper .tags a:hover,.callout-box.callout-box2, .blog-search .blog-search-button, .top-title-wrapper, .testimonial-big
            ,.content-style3:hover .content-style3-icon, .content-box.style5 h4 i, table.table thead tr, .price-table .price-label-badge, .price-table .price-table-header, .section-subscribe .subscribe-button.icon-envelope-alt"""),format.raw/*892.227*/("""{"""),format.raw/*892.228*/("""
            """),format.raw/*893.13*/("""background-color: """),format.raw/*893.31*/("""{"""),format.raw/*893.32*/("""{"""),format.raw/*893.33*/("""skin_color"""),format.raw/*893.43*/("""}"""),format.raw/*893.44*/("""}"""),format.raw/*893.45*/(""";
            """),format.raw/*894.13*/("""}"""),format.raw/*894.14*/("""


            """),format.raw/*897.13*/(""".blog-post-icon,.comments-list .children .comment:before,.portfolio-filter li a.portfolio-selected,
            .portfolio-filter li a:hover, .dropcaps.dropcaps-color-style, .carousel-container .carousel-icon:hover"""),format.raw/*898.115*/("""{"""),format.raw/*898.116*/("""
            """),format.raw/*899.13*/("""background-color:  """),format.raw/*899.32*/("""{"""),format.raw/*899.33*/("""{"""),format.raw/*899.34*/("""skin_color"""),format.raw/*899.44*/("""}"""),format.raw/*899.45*/("""}"""),format.raw/*899.46*/(""";
            """),format.raw/*900.13*/("""}"""),format.raw/*900.14*/("""
            """),format.raw/*901.13*/(""".comments-list .children .comment:after"""),format.raw/*901.52*/("""{"""),format.raw/*901.53*/("""
            """),format.raw/*902.13*/("""border-color: transparent transparent transparent  """),format.raw/*902.64*/("""{"""),format.raw/*902.65*/("""{"""),format.raw/*902.66*/("""skin_color"""),format.raw/*902.76*/("""}"""),format.raw/*902.77*/("""}"""),format.raw/*902.78*/(""";;
            """),format.raw/*903.13*/("""}"""),format.raw/*903.14*/("""

            """),format.raw/*905.13*/(""".highlighted-text"""),format.raw/*905.30*/("""{"""),format.raw/*905.31*/("""
            """),format.raw/*906.13*/("""background-color:  """),format.raw/*906.32*/("""{"""),format.raw/*906.33*/("""{"""),format.raw/*906.34*/("""skin_color"""),format.raw/*906.44*/("""}"""),format.raw/*906.45*/("""}"""),format.raw/*906.46*/(""";
            color: #ffffff;
            """),format.raw/*908.13*/("""}"""),format.raw/*908.14*/("""
            """),format.raw/*909.13*/(""".icons-list.colored-list li:before, .blog-post-date .day, .blog-post-date .month, strong.colored, span.colored
            ,.content-style3 .content-style3-icon"""),format.raw/*910.50*/("""{"""),format.raw/*910.51*/("""
            """),format.raw/*911.13*/("""color:  """),format.raw/*911.21*/("""{"""),format.raw/*911.22*/("""{"""),format.raw/*911.23*/("""skin_color"""),format.raw/*911.33*/("""}"""),format.raw/*911.34*/("""}"""),format.raw/*911.35*/(""";
            """),format.raw/*912.13*/("""}"""),format.raw/*912.14*/("""


            """),format.raw/*915.13*/(""".pagination .prev, .pagination .next, .pagination a:hover, .pagination a.current, .price-table .price-label"""),format.raw/*915.120*/("""{"""),format.raw/*915.121*/("""
            """),format.raw/*916.13*/("""color: """),format.raw/*916.20*/("""{"""),format.raw/*916.21*/("""{"""),format.raw/*916.22*/("""skin_color"""),format.raw/*916.32*/("""}"""),format.raw/*916.33*/("""}"""),format.raw/*916.34*/(""";
            """),format.raw/*917.13*/("""}"""),format.raw/*917.14*/("""


            """),format.raw/*920.13*/("""/* Footer Area Colors */

            .footer .copyright"""),format.raw/*922.31*/("""{"""),format.raw/*922.32*/("""
            """),format.raw/*923.13*/("""border-color:  """),format.raw/*923.28*/("""{"""),format.raw/*923.29*/("""{"""),format.raw/*923.30*/("""skin_color"""),format.raw/*923.40*/("""}"""),format.raw/*923.41*/("""}"""),format.raw/*923.42*/(""";
            """),format.raw/*924.13*/("""}"""),format.raw/*924.14*/("""

            """),format.raw/*926.13*/(""".footer .copyright a:hover"""),format.raw/*926.39*/("""{"""),format.raw/*926.40*/("""
            """),format.raw/*927.13*/("""color:  """),format.raw/*927.21*/("""{"""),format.raw/*927.22*/("""{"""),format.raw/*927.23*/("""skin_color"""),format.raw/*927.33*/("""}"""),format.raw/*927.34*/("""}"""),format.raw/*927.35*/(""";
            """),format.raw/*928.13*/("""}"""),format.raw/*928.14*/("""
            """),format.raw/*929.13*/(""".flickr_badge_wrapper .flickr_badge_image img:hover"""),format.raw/*929.64*/("""{"""),format.raw/*929.65*/("""
            """),format.raw/*930.13*/("""border-color:  """),format.raw/*930.28*/("""{"""),format.raw/*930.29*/("""{"""),format.raw/*930.30*/("""skin_color"""),format.raw/*930.40*/("""}"""),format.raw/*930.41*/("""}"""),format.raw/*930.42*/(""";
            """),format.raw/*931.13*/("""}"""),format.raw/*931.14*/("""
            """),format.raw/*932.13*/("""</script>

            <script type="text/javascript"> var $default_skin = "light-blue";</script><div id="skin-chooser-container" class="skin-chooser-container hide-skin-chooser">
            <a href="" target="_blank" class="skin-save" id="skin-save"><i class="icon-arrow-down"></i> DOWNLOAD NEW SKIN </a>
            <div class="skin-chooser">

                <div class="skin-chooser-label">
                    Layout mode
                </div>
                <div class="skin-chooser-row skin-chooser-row-open">
                    <select id="layout-mode">
                        <option value="">Wide</option>
                        <option value="boxed">Boxed</option>
                    </select>
                </div>
                <div class="skin-chooser-label">
                    Predefined Skins
                </div>
                <div class="skin-chooser-row skin-chooser-row-open">
                    <div title="light-blue" class="predefined-skins light-blue" data-skinname="light-blue" style="background-color: #279FBB"></div>
                    <div title="green" class="predefined-skins green" data-skinname="green" style="background-color: #26ae91"></div>
                    <div title="red" class="predefined-skins red" data-skinname="red" style="background-color: #d14836"></div>
                    <div title="pink" class="predefined-skins pink" data-skinname="pink" style="background-color: #bb3b6b"></div>
                    <div title="light-purple" class="predefined-skins light-purple" data-skinname="light-purple" style="background-color: #bba6bb"></div>
                    <div title="orange" class="predefined-skins orange" data-skinname="orange" style="background-color: #dd6153"></div>
                    <div title="bright-green" class="predefined-skins bright-green" data-skinname="bright-green" style="background-color: #8cbb75"></div>
                    <div title="dark-blue" class="predefined-skins dark-blue" data-skinname="dark-blue" style="background-color: #2580b1"></div>
                    <div title="oil" class="predefined-skins oil" data-skinname="oil" style="background-color: #9b9e40"></div>
                    <div title="black" class="predefined-skins black" data-skinname="black" style="background-color: #5f5d5c"></div>
                    <div title="light-brown" class="predefined-skins light-brown" data-skinname="light-brown" style="background-color: #d06f71"></div>
                    <div title="coffee" class="predefined-skins coffee" data-skinname="coffee" style="background-color: #9d634c"></div>
                    <div title="flat-blue" class="predefined-skins flat-blue" data-skinname="flat-blue" style="background-color: #3498db"></div>
                </div>

                <div class="skin-chooser-label">
                    Custom Colors
                </div>

                <div class="skin-chooser-row skin-chooser-row-open">
                    <div class="skin-chooser-elements">
                        <div class="color-chooser-group-label">
                            <i class="icon-angle-right"></i> Choose your skin color </div>
                        <div class="color-chooser-input">
                            <input type="text" name="skin_color" id="skin_color" class="input-colorpicker"
                            value="#279FBB"/>
                            <label class="color-preview" for="skin_color"
                            style="background-color: #279FBB"></label>
                        </div>
                    </div>
                </div>
                <div class="skin-chooser-label">
                    Patterns Background
                </div>

                <div class="skin-chooser-row skin-chooser-row-open">
                    <div class="pattern pattern-black-twill" data-body-class="bgpattern-black-twill"></div>
                    <div class="pattern pattern-dark-fish-skin" data-body-class="bgpattern-dark-fish-skin"></div>
                    <div class="pattern pattern-escheresque-ste" data-body-class="bgpattern-escheresque-ste"></div>
                    <div class="pattern pattern-grey" data-body-class="bgpattern-grey"></div>
                    <div class="pattern pattern-knitting250px" data-body-class="bgpattern-knitting250px"></div>
                    <div class="pattern pattern-p4" data-body-class="bgpattern-p4"></div>
                    <div class="pattern pattern-p5" data-body-class="bgpattern-p5"></div>
                    <div class="pattern pattern-p6" data-body-class="bgpattern-p6"></div>
                    <div class="pattern pattern-ps-neutral" data-body-class="bgpattern-ps-neutral"></div>
                    <div class="pattern pattern-pw-maze-white" data-body-class="bgpattern-pw-maze-white"></div>
                    <div class="pattern pattern-pw-pattern" data-body-class="bgpattern-pw-pattern"></div>
                    <div class="pattern pattern-retina-wood" data-body-class="bgpattern-retina-wood"></div>
                    <div class="pattern pattern-shattered" data-body-class="bgpattern-shattered"></div>
                    <div class="pattern pattern-subtle-dots" data-body-class="bgpattern-subtle-dots"></div>
                    <div class="pattern pattern-subtle-surface" data-body-class="bgpattern-subtle-surface"></div>
                    <div class="pattern pattern-whitediamond" data-body-class="bgpattern-whitediamond"></div>
                </div>

                <div class="skin-chooser-label">
                    Images Background
                </div>
                <div class="skin-chooser-row skin-chooser-row-open">
                    <div class="image-chooser tuscany-thumb" data-body-class="bg-tuscany"></div>
                    <div class="image-chooser tracks-thumb" data-body-class="bg-tracks"></div>
                    <div class="image-chooser blurred-lines-thumb" data-body-class="bg-blurred-lines"></div>
                    <div class="image-chooser mountain-thumb" data-body-class="bg-mountain"></div>
                </div>



            </div>
            """),format.raw/*1018.91*/("""

        """),format.raw/*1020.9*/("""</div>

""")))}),format.raw/*1022.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Feb 16 16:38:13 IST 2016
                  SOURCE: /home/priyanka/Downloads/Spradus/Spradus-genie/app/views/index.scala.html
                  HASH: 46691fd392b41227711675d54b99753fe2af4ef7
                  MATRIX: 527->1|639->18|667->21|698->44|737->46|778->60|1439->694|1454->700|1526->750|6461->5657|6477->5663|6565->5728|6687->6305|6761->6350|7178->6738|7195->6744|7256->6782|9117->8614|9134->8620|9194->8657|9496->8931|9512->8937|9600->9002|10112->9485|10129->9491|10190->9529|19190->18501|19206->18507|19265->18544|36641->35892|36657->35898|36722->35941|38154->47233|38208->47258|38685->47707|38701->47713|38774->47763|41360->50320|41390->50321|41432->50334|41469->50342|41499->50343|41529->50344|41568->50354|41598->50355|41628->50356|41671->50370|41701->50371|41743->50384|41829->50441|41859->50442|41901->50455|41949->50474|41979->50475|42009->50476|42048->50486|42078->50487|42108->50488|42151->50502|42181->50503|42224->50517|42313->50577|42343->50578|42385->50591|42433->50610|42463->50611|42493->50612|42532->50622|42562->50623|42592->50624|42635->50638|42665->50639|42707->50652|42843->50758|42874->50759|42916->50772|42953->50780|42983->50781|43013->50782|43052->50792|43082->50793|43112->50794|43155->50808|43185->50809|43229->50824|44056->51622|44086->51623|44128->51636|44165->51644|44195->51645|44225->51646|44264->51656|44294->51657|44324->51658|44367->51672|44397->51673|44439->51686|44492->51710|44522->51711|44564->51724|44611->51742|44641->51743|44671->51744|44710->51754|44740->51755|44770->51756|44813->51770|44843->51771|44885->51784|44943->51813|44973->51814|45015->51827|45062->51845|45092->51846|45122->51847|45161->51857|45191->51858|45221->51859|45264->51873|45294->51874|45336->51887|45420->51942|45450->51943|45492->51956|45529->51964|45559->51965|45589->51966|45628->51976|45658->51977|45688->51978|45718->51979|45771->52003|45801->52004|45843->52017|45884->52029|45914->52030|45956->52043|46005->52063|46035->52064|46065->52065|46104->52075|46134->52076|46164->52077|46206->52090|46236->52091|46278->52104|46366->52163|46396->52164|46438->52177|46486->52196|46516->52197|46546->52198|46585->52208|46615->52209|46645->52210|46688->52224|46718->52225|46761->52239|46815->52264|46845->52265|46887->52278|46935->52297|46965->52298|46995->52299|47034->52309|47064->52310|47094->52311|47137->52325|47167->52326|47209->52339|47268->52369|47298->52370|47340->52383|47392->52406|47422->52407|47452->52408|47491->52418|47521->52419|47551->52420|47594->52434|47624->52435|47666->52448|47715->52468|47745->52469|47787->52482|47834->52500|47864->52501|47894->52502|47933->52512|47963->52513|47993->52514|48051->52543|48081->52544|48111->52545|48150->52555|48180->52556|48210->52557|48253->52571|48283->52572|48325->52585|48371->52602|48401->52603|48443->52616|48491->52635|48521->52636|48551->52637|48595->52652|48625->52653|48655->52654|48698->52668|48728->52669|48770->52682|48824->52707|48854->52708|48896->52721|48944->52740|48974->52741|49004->52742|49048->52757|49078->52758|49108->52759|49151->52773|49181->52774|49223->52787|49287->52822|49317->52823|49359->52836|49407->52855|49437->52856|49467->52857|49511->52872|49541->52873|49571->52874|49614->52888|49644->52889|49689->52905|50251->53437|50282->53438|50324->53451|50371->53469|50401->53470|50431->53471|50470->53481|50500->53482|50530->53483|50573->53497|50603->53498|50647->53513|50891->53727|50922->53728|50964->53741|51012->53760|51042->53761|51072->53762|51111->53772|51141->53773|51171->53774|51214->53788|51244->53789|51286->53802|51354->53841|51384->53842|51426->53855|51506->53906|51536->53907|51566->53908|51605->53918|51635->53919|51665->53920|51709->53935|51739->53936|51782->53950|51828->53967|51858->53968|51900->53981|51948->54000|51978->54001|52008->54002|52047->54012|52077->54013|52107->54014|52178->54056|52208->54057|52250->54070|52439->54230|52469->54231|52511->54244|52548->54252|52578->54253|52608->54254|52647->54264|52677->54265|52707->54266|52750->54280|52780->54281|52824->54296|52961->54403|52992->54404|53034->54417|53070->54424|53100->54425|53130->54426|53169->54436|53199->54437|53229->54438|53272->54452|53302->54453|53346->54468|53431->54524|53461->54525|53503->54538|53547->54553|53577->54554|53607->54555|53646->54565|53676->54566|53706->54567|53749->54581|53779->54582|53822->54596|53877->54622|53907->54623|53949->54636|53986->54644|54016->54645|54046->54646|54085->54656|54115->54657|54145->54658|54188->54672|54218->54673|54260->54686|54340->54737|54370->54738|54412->54751|54456->54766|54486->54767|54516->54768|54555->54778|54585->54779|54615->54780|54658->54794|54688->54795|54730->54808|60864->60990|60903->61000|60944->61009
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|46->22|46->22|46->22|133->109|133->109|133->109|135->117|136->118|141->123|141->123|141->123|169->151|169->151|169->151|173->155|173->155|173->155|180->162|180->162|180->162|331->313|331->313|331->313|622->604|622->604|622->604|643->767|644->768|651->775|651->775|651->775|699->823|699->823|700->824|700->824|700->824|700->824|700->824|700->824|700->824|701->825|701->825|702->826|702->826|702->826|703->827|703->827|703->827|703->827|703->827|703->827|703->827|704->828|704->828|706->830|706->830|706->830|707->831|707->831|707->831|707->831|707->831|707->831|707->831|708->832|708->832|709->833|709->833|709->833|710->834|710->834|710->834|710->834|710->834|710->834|710->834|711->835|711->835|714->838|723->847|723->847|724->848|724->848|724->848|724->848|724->848|724->848|724->848|725->849|725->849|726->850|727->851|727->851|728->852|728->852|728->852|728->852|728->852|728->852|728->852|729->853|729->853|730->854|731->855|731->855|732->856|732->856|732->856|732->856|732->856|732->856|732->856|733->857|733->857|734->858|734->858|734->858|735->859|735->859|735->859|735->859|735->859|735->859|735->859|735->859|736->860|736->860|737->861|737->861|737->861|738->862|738->862|738->862|738->862|738->862|738->862|738->862|739->863|739->863|740->864|740->864|740->864|741->865|741->865|741->865|741->865|741->865|741->865|741->865|742->866|742->866|744->868|744->868|744->868|745->869|745->869|745->869|745->869|745->869|745->869|745->869|746->870|746->870|747->871|747->871|747->871|748->872|748->872|748->872|748->872|748->872|748->872|748->872|749->873|749->873|750->874|750->874|750->874|751->875|751->875|751->875|751->875|751->875|751->875|751->875|752->876|752->876|752->876|752->876|752->876|752->876|753->877|753->877|754->878|754->878|754->878|755->879|755->879|755->879|755->879|755->879|755->879|755->879|756->880|756->880|757->881|757->881|757->881|758->882|758->882|758->882|758->882|758->882|758->882|758->882|759->883|759->883|760->884|760->884|760->884|761->885|761->885|761->885|761->885|761->885|761->885|761->885|762->886|762->886|766->890|768->892|768->892|769->893|769->893|769->893|769->893|769->893|769->893|769->893|770->894|770->894|773->897|774->898|774->898|775->899|775->899|775->899|775->899|775->899|775->899|775->899|776->900|776->900|777->901|777->901|777->901|778->902|778->902|778->902|778->902|778->902|778->902|778->902|779->903|779->903|781->905|781->905|781->905|782->906|782->906|782->906|782->906|782->906|782->906|782->906|784->908|784->908|785->909|786->910|786->910|787->911|787->911|787->911|787->911|787->911|787->911|787->911|788->912|788->912|791->915|791->915|791->915|792->916|792->916|792->916|792->916|792->916|792->916|792->916|793->917|793->917|796->920|798->922|798->922|799->923|799->923|799->923|799->923|799->923|799->923|799->923|800->924|800->924|802->926|802->926|802->926|803->927|803->927|803->927|803->927|803->927|803->927|803->927|804->928|804->928|805->929|805->929|805->929|806->930|806->930|806->930|806->930|806->930|806->930|806->930|807->931|807->931|808->932|894->1018|896->1020|898->1022
                  -- GENERATED --
              */
          