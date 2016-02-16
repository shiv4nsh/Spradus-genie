
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

                                            <div class="tp-caption lfb stb stl"
                                            data-x="0"
                                            data-y="120"
                                            data-speed="1500"
                                            data-start="200"
                                            data-easing="easeOutExpo" data-end="6000" data-endspeed="500"><img src=""""),_display_(/*116.118*/routes/*116.124*/.Assets.versioned("theme/media/rev-images/slider1/persp1.png")),format.raw/*116.186*/("""" alt="Image 1"></div>

                                            <div class="tp-caption sfb stb stl"
                                            data-x="0"
                                            data-y="40"
                                            data-speed="1500"
                                            data-start="1800"
                                            data-easing="easeOutExpo" data-end="6200" data-endspeed="500"><img src=""""),_display_(/*123.118*/routes/*123.124*/.Assets.versioned("theme/media/rev-images/slider1/persp2.png")),format.raw/*123.186*/("""" alt="Image 2"></div>

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
                                            data-y="290"
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

                                           """),format.raw/*177.3*/("""
                                            """),format.raw/*178.45*/("""<div class="tp-caption main_color_text sfl str "
                                            data-x="0"
                                            data-y="150"
                                            data-speed="200"
                                            data-start="2000"
                                            data-easing="easeOutCubic" data-end="5600" data-endspeed="500"> for big data analysis</div>


                                            <div class="tp-caption default_text sfl str "
                                            data-x="0"
                                            data-y="200"
                                            data-speed="200"
                                            data-start="2200"
                                            data-easing="" data-end="5400" data-endspeed="500" >
                                                <ul class="icons-list check-2 colored-list ">
                                                    <li><strong>Power Pack</strong> - Power of Spark + Power of Scala. </li>
                                                    <li><strong>LightSpeed</strong> - 100x faster than Hadoop. </li>
                                                    <li><strong>Trenchworkers</strong> - Brought to you by the people who understand Big Data and Functional Programming.</li>
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
                                                <h2 class="h2-section-title left-text">About Us</h2>
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
                                        """),format.raw/*320.48*/("""
                                        """),format.raw/*321.41*/("""<div class="space-sep20"></div>
                                        <a href="#" class="btn btn-primary btn-large">Know more</a>
                                    </div>

                                    <div class="col-md-6 col-sm-6 abt-spradus">
                                        <img src=""""),_display_(/*326.52*/routes/*326.58*/.Assets.versioned("images/about.png")),format.raw/*326.95*/("""" alt="" class="img-responsive"/>
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
                                                            Monitor and Boost Quality of Customer service while it is happening

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
                                                            Ingest, Search, and Analyze All Your Logs in Real-time

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
                                                            Clean-up, Pre-process, and Transform Data in Motion

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

                                                <div class="content-box style5 small  purple animated "
                                                data-animtype="fadeInUp"
                                                data-animrepeat="0"
                                                data-animspeed="1.5s"
                                                data-animdelay="0.2s">
                                                    <h4 class="h4-body-title">
                                                        <i class="icon-file-text"></i>
                                                        <strong>Deep social listening</strong>
                                                    </h4>
                                                    <div class="content-box-text">
                                                        Perform Deep Sentiment and Topic Analysis in Real-time

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
                                                        Predict and Prevent Equipment Failures

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
                                                            <strong>Enterprise Data Bus</strong>
                                                        </h4>
                                                        <div class="content-box-text">
                                                            Create a Modern Responsive Enterprise by keeping all systems in synch all the time

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
                                    <img src=""""),_display_(/*617.48*/routes/*617.54*/.Assets.versioned("images/whySpraduss.png")),format.raw/*617.97*/("""" alt="" class="img-responsive"/>
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
                                    """),format.raw/*634.44*/("""
                                    """),format.raw/*635.37*/("""<div class="space-sep20"></div>
                                    <a href="#" class="btn btn-primary btn-large">Know more</a>
                                </div>
                            </div>
                        </div>
                </div><!--.content-wrapper end -->
                <footer>
                    <div class="footer">

                        """),format.raw/*786.33*/("""
                        """),format.raw/*787.25*/("""<div class="copyright custom-copyright">
                            <div class="container">
                                <div class="row custom-row-top">
                                    <div class="col-md-6 col-sm-6 logo">
                                        <ul>
                                            <li>
                                                <a href="#">
                                                    <img src=""""),_display_(/*794.64*/routes/*794.70*/.Assets.versioned("theme/images/spradus-logo.png")),format.raw/*794.120*/("""" alt="Spradus"/>
                                                </a>
                                            </li>
                                            <li class="footer-color">
                                                <a target="_blank" href="#">Privacy</a><span> |</span>
                                                <a target="_blank" href="#">Terms of Use</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="col-md-6 col-sm-6">

                                        <div class="social-icons right-align">

                                            <ul>
                                                <li>
                                                    <a href="#" title="About US" target="_blank">About us</a><span> |</span>
                                                    <a title="FAQ" target="_blank">FAQ</a><span> |</span>
                                                    <a title="Partners" target="_blank">Partner with us</a>
                                                </li>
                                                </ul>
                                            <ul>
                                                <li>
                                                    <a title="Jobs" target="_blank">Jobs</a><span> |</span>
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
            span.label-nav-sub::before, .navigation > li > a:focus > span.label-nav-sub::before"""),format.raw/*842.96*/("""{"""),format.raw/*842.97*/("""
            """),format.raw/*843.13*/("""color:  """),format.raw/*843.21*/("""{"""),format.raw/*843.22*/("""{"""),format.raw/*843.23*/("""skin_color"""),format.raw/*843.33*/("""}"""),format.raw/*843.34*/("""}"""),format.raw/*843.35*/(""";
            """),format.raw/*844.13*/("""}"""),format.raw/*844.14*/("""
            """),format.raw/*845.13*/(""".mobile-menu-button, .mobile-nav, .slider-fixed-container"""),format.raw/*845.70*/("""{"""),format.raw/*845.71*/("""
            """),format.raw/*846.13*/("""background-color:  """),format.raw/*846.32*/("""{"""),format.raw/*846.33*/("""{"""),format.raw/*846.34*/("""skin_color"""),format.raw/*846.44*/("""}"""),format.raw/*846.45*/("""}"""),format.raw/*846.46*/(""";
            """),format.raw/*847.13*/("""}"""),format.raw/*847.14*/("""

            """),format.raw/*849.13*/(""".navigation > li > a:after, .navigation>li>.activelink:after"""),format.raw/*849.73*/("""{"""),format.raw/*849.74*/("""
            """),format.raw/*850.13*/("""background-color:  """),format.raw/*850.32*/("""{"""),format.raw/*850.33*/("""{"""),format.raw/*850.34*/("""skin_color"""),format.raw/*850.44*/("""}"""),format.raw/*850.45*/("""}"""),format.raw/*850.46*/(""";
            """),format.raw/*851.13*/("""}"""),format.raw/*851.14*/("""
            """),format.raw/*852.13*/(""".navigation>li:hover > a > span.label-nav-sub::before,.navigation>li:hover> a > span.label-nav-sub::before"""),format.raw/*852.119*/("""{"""),format.raw/*852.120*/("""
            """),format.raw/*853.13*/("""color:  """),format.raw/*853.21*/("""{"""),format.raw/*853.22*/("""{"""),format.raw/*853.23*/("""skin_color"""),format.raw/*853.33*/("""}"""),format.raw/*853.34*/("""}"""),format.raw/*853.35*/(""";
            """),format.raw/*854.13*/("""}"""),format.raw/*854.14*/("""


            """),format.raw/*857.13*/("""/* Page Content Colors */
            .body-wrapper a:hover , .tab a:hover, accordion .title:hover, .top-body a:hover, .bottom-body
            a:hover,.content-box.content-style2 h4 i
            ,.accordion .active h4, .accordion .title:hover h4, .side-navigation .menu-item.current-menu-item a,
            .side-navigation .menu-item:hover a:after,
            .side-navigation .menu-item:hover a, a.tool-tip, .team-member .team-member-position, .team-member-progress
            .team-member-position, .item-img-overlay i
            ,ul.icon-content-list-container li.icon-content-single .icon-box i,.item-img-overlay .portfolio-zoom:hover,
            .navigation ul li:hover>a, .blog_post_quote:after,
            .item-img-overlay .portfolio-zoom, body .white-text .feature-details a:hover"""),format.raw/*866.89*/("""{"""),format.raw/*866.90*/("""
            """),format.raw/*867.13*/("""color:  """),format.raw/*867.21*/("""{"""),format.raw/*867.22*/("""{"""),format.raw/*867.23*/("""skin_color"""),format.raw/*867.33*/("""}"""),format.raw/*867.34*/("""}"""),format.raw/*867.35*/(""";
            """),format.raw/*868.13*/("""}"""),format.raw/*868.14*/("""
            """),format.raw/*869.13*/("""::selection
            """),format.raw/*870.13*/("""{"""),format.raw/*870.14*/("""
            """),format.raw/*871.13*/("""background-color: """),format.raw/*871.31*/("""{"""),format.raw/*871.32*/("""{"""),format.raw/*871.33*/("""skin_color"""),format.raw/*871.43*/("""}"""),format.raw/*871.44*/("""}"""),format.raw/*871.45*/(""";
            """),format.raw/*872.13*/("""}"""),format.raw/*872.14*/("""
            """),format.raw/*873.13*/("""::-moz-selection
            """),format.raw/*874.13*/("""{"""),format.raw/*874.14*/("""
            """),format.raw/*875.13*/("""background-color: """),format.raw/*875.31*/("""{"""),format.raw/*875.32*/("""{"""),format.raw/*875.33*/("""skin_color"""),format.raw/*875.43*/("""}"""),format.raw/*875.44*/("""}"""),format.raw/*875.45*/(""";
            """),format.raw/*876.13*/("""}"""),format.raw/*876.14*/("""
            """),format.raw/*877.13*/(""".item-img-overlay .portfolio-zoom:hover, .tab a.active """),format.raw/*877.68*/("""{"""),format.raw/*877.69*/("""
            """),format.raw/*878.13*/("""color:  """),format.raw/*878.21*/("""{"""),format.raw/*878.22*/("""{"""),format.raw/*878.23*/("""skin_color"""),format.raw/*878.33*/("""}"""),format.raw/*878.34*/("""}"""),format.raw/*878.35*/(""" """),format.raw/*878.36*/("""!important;
            """),format.raw/*879.13*/("""}"""),format.raw/*879.14*/("""
            """),format.raw/*880.13*/(""".callout-box"""),format.raw/*880.25*/("""{"""),format.raw/*880.26*/("""
            """),format.raw/*881.13*/("""border-left-color:  """),format.raw/*881.33*/("""{"""),format.raw/*881.34*/("""{"""),format.raw/*881.35*/("""skin_color"""),format.raw/*881.45*/("""}"""),format.raw/*881.46*/("""}"""),format.raw/*881.47*/("""
            """),format.raw/*882.13*/("""}"""),format.raw/*882.14*/("""
            """),format.raw/*883.13*/(""".feature .feature-content,.team-member .team-member-content"""),format.raw/*883.72*/("""{"""),format.raw/*883.73*/("""
            """),format.raw/*884.13*/("""border-top-color:  """),format.raw/*884.32*/("""{"""),format.raw/*884.33*/("""{"""),format.raw/*884.34*/("""skin_color"""),format.raw/*884.44*/("""}"""),format.raw/*884.45*/("""}"""),format.raw/*884.46*/(""";
            """),format.raw/*885.13*/("""}"""),format.raw/*885.14*/("""

            """),format.raw/*887.13*/(""".team-member-progress-bar"""),format.raw/*887.38*/("""{"""),format.raw/*887.39*/("""
            """),format.raw/*888.13*/("""background-color:  """),format.raw/*888.32*/("""{"""),format.raw/*888.33*/("""{"""),format.raw/*888.34*/("""skin_color"""),format.raw/*888.44*/("""}"""),format.raw/*888.45*/("""}"""),format.raw/*888.46*/(""";
            """),format.raw/*889.13*/("""}"""),format.raw/*889.14*/("""
            """),format.raw/*890.13*/(""".blog-masonry .blog_post_quote"""),format.raw/*890.43*/("""{"""),format.raw/*890.44*/("""
            """),format.raw/*891.13*/("""border-top: 2px solid  """),format.raw/*891.36*/("""{"""),format.raw/*891.37*/("""{"""),format.raw/*891.38*/("""skin_color"""),format.raw/*891.48*/("""}"""),format.raw/*891.49*/("""}"""),format.raw/*891.50*/(""";
            """),format.raw/*892.13*/("""}"""),format.raw/*892.14*/("""
            """),format.raw/*893.13*/(""".tab a.active:after """),format.raw/*893.33*/("""{"""),format.raw/*893.34*/("""
            """),format.raw/*894.13*/("""background-color: """),format.raw/*894.31*/("""{"""),format.raw/*894.32*/("""{"""),format.raw/*894.33*/("""skin_color"""),format.raw/*894.43*/("""}"""),format.raw/*894.44*/("""}"""),format.raw/*894.45*/(""";
            border-color:  """),format.raw/*895.28*/("""{"""),format.raw/*895.29*/("""{"""),format.raw/*895.30*/("""skin_color"""),format.raw/*895.40*/("""}"""),format.raw/*895.41*/("""}"""),format.raw/*895.42*/(""";
            """),format.raw/*896.13*/("""}"""),format.raw/*896.14*/("""
            """),format.raw/*897.13*/(""".item-img-overlay"""),format.raw/*897.30*/("""{"""),format.raw/*897.31*/("""
            """),format.raw/*898.13*/("""background-color:  """),format.raw/*898.32*/("""{"""),format.raw/*898.33*/("""{"""),format.raw/*898.34*/("""skin_color_rgba"""),format.raw/*898.49*/("""}"""),format.raw/*898.50*/("""}"""),format.raw/*898.51*/(""";
            """),format.raw/*899.13*/("""}"""),format.raw/*899.14*/("""
            """),format.raw/*900.13*/(""".item-img-overlay i:hover"""),format.raw/*900.38*/("""{"""),format.raw/*900.39*/("""
            """),format.raw/*901.13*/("""background-color:  """),format.raw/*901.32*/("""{"""),format.raw/*901.33*/("""{"""),format.raw/*901.34*/("""skin_color_rgba"""),format.raw/*901.49*/("""}"""),format.raw/*901.50*/("""}"""),format.raw/*901.51*/(""";
            """),format.raw/*902.13*/("""}"""),format.raw/*902.14*/("""
            """),format.raw/*903.13*/("""body .section-content.section-image"""),format.raw/*903.48*/("""{"""),format.raw/*903.49*/("""
            """),format.raw/*904.13*/("""background-color:  """),format.raw/*904.32*/("""{"""),format.raw/*904.33*/("""{"""),format.raw/*904.34*/("""skin_color_rgba"""),format.raw/*904.49*/("""}"""),format.raw/*904.50*/("""}"""),format.raw/*904.51*/(""";
            """),format.raw/*905.13*/("""}"""),format.raw/*905.14*/("""



            """),format.raw/*909.13*/(""".button, .body-wrapper input[type="submit"], .body-wrapper input[type="button"], .section-content.section-color-bg,.content-box.content-style4 h4 i
            ,button.button-main,.body-wrapper .tags a:hover,.callout-box.callout-box2, .blog-search .blog-search-button, .top-title-wrapper, .testimonial-big
            ,.content-style3:hover .content-style3-icon, .content-box.style5 h4 i, table.table thead tr, .price-table .price-label-badge, .price-table .price-table-header, .section-subscribe .subscribe-button.icon-envelope-alt"""),format.raw/*911.227*/("""{"""),format.raw/*911.228*/("""
            """),format.raw/*912.13*/("""background-color: """),format.raw/*912.31*/("""{"""),format.raw/*912.32*/("""{"""),format.raw/*912.33*/("""skin_color"""),format.raw/*912.43*/("""}"""),format.raw/*912.44*/("""}"""),format.raw/*912.45*/(""";
            """),format.raw/*913.13*/("""}"""),format.raw/*913.14*/("""


            """),format.raw/*916.13*/(""".blog-post-icon,.comments-list .children .comment:before,.portfolio-filter li a.portfolio-selected,
            .portfolio-filter li a:hover, .dropcaps.dropcaps-color-style, .carousel-container .carousel-icon:hover"""),format.raw/*917.115*/("""{"""),format.raw/*917.116*/("""
            """),format.raw/*918.13*/("""background-color:  """),format.raw/*918.32*/("""{"""),format.raw/*918.33*/("""{"""),format.raw/*918.34*/("""skin_color"""),format.raw/*918.44*/("""}"""),format.raw/*918.45*/("""}"""),format.raw/*918.46*/(""";
            """),format.raw/*919.13*/("""}"""),format.raw/*919.14*/("""
            """),format.raw/*920.13*/(""".comments-list .children .comment:after"""),format.raw/*920.52*/("""{"""),format.raw/*920.53*/("""
            """),format.raw/*921.13*/("""border-color: transparent transparent transparent  """),format.raw/*921.64*/("""{"""),format.raw/*921.65*/("""{"""),format.raw/*921.66*/("""skin_color"""),format.raw/*921.76*/("""}"""),format.raw/*921.77*/("""}"""),format.raw/*921.78*/(""";;
            """),format.raw/*922.13*/("""}"""),format.raw/*922.14*/("""

            """),format.raw/*924.13*/(""".highlighted-text"""),format.raw/*924.30*/("""{"""),format.raw/*924.31*/("""
            """),format.raw/*925.13*/("""background-color:  """),format.raw/*925.32*/("""{"""),format.raw/*925.33*/("""{"""),format.raw/*925.34*/("""skin_color"""),format.raw/*925.44*/("""}"""),format.raw/*925.45*/("""}"""),format.raw/*925.46*/(""";
            color: #ffffff;
            """),format.raw/*927.13*/("""}"""),format.raw/*927.14*/("""
            """),format.raw/*928.13*/(""".icons-list.colored-list li:before, .blog-post-date .day, .blog-post-date .month, strong.colored, span.colored
            ,.content-style3 .content-style3-icon"""),format.raw/*929.50*/("""{"""),format.raw/*929.51*/("""
            """),format.raw/*930.13*/("""color:  """),format.raw/*930.21*/("""{"""),format.raw/*930.22*/("""{"""),format.raw/*930.23*/("""skin_color"""),format.raw/*930.33*/("""}"""),format.raw/*930.34*/("""}"""),format.raw/*930.35*/(""";
            """),format.raw/*931.13*/("""}"""),format.raw/*931.14*/("""


            """),format.raw/*934.13*/(""".pagination .prev, .pagination .next, .pagination a:hover, .pagination a.current, .price-table .price-label"""),format.raw/*934.120*/("""{"""),format.raw/*934.121*/("""
            """),format.raw/*935.13*/("""color: """),format.raw/*935.20*/("""{"""),format.raw/*935.21*/("""{"""),format.raw/*935.22*/("""skin_color"""),format.raw/*935.32*/("""}"""),format.raw/*935.33*/("""}"""),format.raw/*935.34*/(""";
            """),format.raw/*936.13*/("""}"""),format.raw/*936.14*/("""


            """),format.raw/*939.13*/("""/* Footer Area Colors */

            .footer .copyright"""),format.raw/*941.31*/("""{"""),format.raw/*941.32*/("""
            """),format.raw/*942.13*/("""border-color:  """),format.raw/*942.28*/("""{"""),format.raw/*942.29*/("""{"""),format.raw/*942.30*/("""skin_color"""),format.raw/*942.40*/("""}"""),format.raw/*942.41*/("""}"""),format.raw/*942.42*/(""";
            """),format.raw/*943.13*/("""}"""),format.raw/*943.14*/("""

            """),format.raw/*945.13*/(""".footer .copyright a:hover"""),format.raw/*945.39*/("""{"""),format.raw/*945.40*/("""
            """),format.raw/*946.13*/("""color:  """),format.raw/*946.21*/("""{"""),format.raw/*946.22*/("""{"""),format.raw/*946.23*/("""skin_color"""),format.raw/*946.33*/("""}"""),format.raw/*946.34*/("""}"""),format.raw/*946.35*/(""";
            """),format.raw/*947.13*/("""}"""),format.raw/*947.14*/("""
            """),format.raw/*948.13*/(""".flickr_badge_wrapper .flickr_badge_image img:hover"""),format.raw/*948.64*/("""{"""),format.raw/*948.65*/("""
            """),format.raw/*949.13*/("""border-color:  """),format.raw/*949.28*/("""{"""),format.raw/*949.29*/("""{"""),format.raw/*949.30*/("""skin_color"""),format.raw/*949.40*/("""}"""),format.raw/*949.41*/("""}"""),format.raw/*949.42*/(""";
            """),format.raw/*950.13*/("""}"""),format.raw/*950.14*/("""
            """),format.raw/*951.13*/("""</script>

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
            """),format.raw/*1037.91*/("""

        """),format.raw/*1039.9*/("""</div>

""")))}),format.raw/*1041.2*/("""
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
                  DATE: Tue Feb 16 13:19:18 IST 2016
                  SOURCE: /home/priyanka/Downloads/Spradus/app/views/index.scala.html
                  HASH: 7cffa01eb145cc9c41a90269a50ae29031e2d966
                  MATRIX: 527->1|639->18|667->21|698->44|737->46|778->60|1439->694|1454->700|1526->750|6461->5657|6477->5663|6565->5728|7076->6210|7093->6216|7178->6278|7663->6734|7680->6740|7765->6802|9626->8634|9643->8640|9703->8677|10005->8951|10021->8957|10109->9022|10621->9505|10638->9511|10699->9549|11259->10473|11333->10518|19435->19022|19505->19063|19840->19370|19856->19376|19915->19413|37296->36766|37312->36772|37377->36815|38434->38238|38500->38275|38904->48539|38958->48564|39435->49013|39451->49019|39524->49069|42199->51715|42229->51716|42271->51729|42308->51737|42338->51738|42368->51739|42407->51749|42437->51750|42467->51751|42510->51765|42540->51766|42582->51779|42668->51836|42698->51837|42740->51850|42788->51869|42818->51870|42848->51871|42887->51881|42917->51882|42947->51883|42990->51897|43020->51898|43063->51912|43152->51972|43182->51973|43224->51986|43272->52005|43302->52006|43332->52007|43371->52017|43401->52018|43431->52019|43474->52033|43504->52034|43546->52047|43682->52153|43713->52154|43755->52167|43792->52175|43822->52176|43852->52177|43891->52187|43921->52188|43951->52189|43994->52203|44024->52204|44068->52219|44895->53017|44925->53018|44967->53031|45004->53039|45034->53040|45064->53041|45103->53051|45133->53052|45163->53053|45206->53067|45236->53068|45278->53081|45331->53105|45361->53106|45403->53119|45450->53137|45480->53138|45510->53139|45549->53149|45579->53150|45609->53151|45652->53165|45682->53166|45724->53179|45782->53208|45812->53209|45854->53222|45901->53240|45931->53241|45961->53242|46000->53252|46030->53253|46060->53254|46103->53268|46133->53269|46175->53282|46259->53337|46289->53338|46331->53351|46368->53359|46398->53360|46428->53361|46467->53371|46497->53372|46527->53373|46557->53374|46610->53398|46640->53399|46682->53412|46723->53424|46753->53425|46795->53438|46844->53458|46874->53459|46904->53460|46943->53470|46973->53471|47003->53472|47045->53485|47075->53486|47117->53499|47205->53558|47235->53559|47277->53572|47325->53591|47355->53592|47385->53593|47424->53603|47454->53604|47484->53605|47527->53619|47557->53620|47600->53634|47654->53659|47684->53660|47726->53673|47774->53692|47804->53693|47834->53694|47873->53704|47903->53705|47933->53706|47976->53720|48006->53721|48048->53734|48107->53764|48137->53765|48179->53778|48231->53801|48261->53802|48291->53803|48330->53813|48360->53814|48390->53815|48433->53829|48463->53830|48505->53843|48554->53863|48584->53864|48626->53877|48673->53895|48703->53896|48733->53897|48772->53907|48802->53908|48832->53909|48890->53938|48920->53939|48950->53940|48989->53950|49019->53951|49049->53952|49092->53966|49122->53967|49164->53980|49210->53997|49240->53998|49282->54011|49330->54030|49360->54031|49390->54032|49434->54047|49464->54048|49494->54049|49537->54063|49567->54064|49609->54077|49663->54102|49693->54103|49735->54116|49783->54135|49813->54136|49843->54137|49887->54152|49917->54153|49947->54154|49990->54168|50020->54169|50062->54182|50126->54217|50156->54218|50198->54231|50246->54250|50276->54251|50306->54252|50350->54267|50380->54268|50410->54269|50453->54283|50483->54284|50528->54300|51090->54832|51121->54833|51163->54846|51210->54864|51240->54865|51270->54866|51309->54876|51339->54877|51369->54878|51412->54892|51442->54893|51486->54908|51730->55122|51761->55123|51803->55136|51851->55155|51881->55156|51911->55157|51950->55167|51980->55168|52010->55169|52053->55183|52083->55184|52125->55197|52193->55236|52223->55237|52265->55250|52345->55301|52375->55302|52405->55303|52444->55313|52474->55314|52504->55315|52548->55330|52578->55331|52621->55345|52667->55362|52697->55363|52739->55376|52787->55395|52817->55396|52847->55397|52886->55407|52916->55408|52946->55409|53017->55451|53047->55452|53089->55465|53278->55625|53308->55626|53350->55639|53387->55647|53417->55648|53447->55649|53486->55659|53516->55660|53546->55661|53589->55675|53619->55676|53663->55691|53800->55798|53831->55799|53873->55812|53909->55819|53939->55820|53969->55821|54008->55831|54038->55832|54068->55833|54111->55847|54141->55848|54185->55863|54270->55919|54300->55920|54342->55933|54386->55948|54416->55949|54446->55950|54485->55960|54515->55961|54545->55962|54588->55976|54618->55977|54661->55991|54716->56017|54746->56018|54788->56031|54825->56039|54855->56040|54885->56041|54924->56051|54954->56052|54984->56053|55027->56067|55057->56068|55099->56081|55179->56132|55209->56133|55251->56146|55295->56161|55325->56162|55355->56163|55394->56173|55424->56174|55454->56175|55497->56189|55527->56190|55569->56203|61703->62385|61742->62395|61783->62404
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|46->22|46->22|46->22|133->109|133->109|133->109|140->116|140->116|140->116|147->123|147->123|147->123|175->151|175->151|175->151|179->155|179->155|179->155|186->162|186->162|186->162|195->177|196->178|333->320|334->321|339->326|339->326|339->326|630->617|630->617|630->617|642->634|643->635|652->786|653->787|660->794|660->794|660->794|708->842|708->842|709->843|709->843|709->843|709->843|709->843|709->843|709->843|710->844|710->844|711->845|711->845|711->845|712->846|712->846|712->846|712->846|712->846|712->846|712->846|713->847|713->847|715->849|715->849|715->849|716->850|716->850|716->850|716->850|716->850|716->850|716->850|717->851|717->851|718->852|718->852|718->852|719->853|719->853|719->853|719->853|719->853|719->853|719->853|720->854|720->854|723->857|732->866|732->866|733->867|733->867|733->867|733->867|733->867|733->867|733->867|734->868|734->868|735->869|736->870|736->870|737->871|737->871|737->871|737->871|737->871|737->871|737->871|738->872|738->872|739->873|740->874|740->874|741->875|741->875|741->875|741->875|741->875|741->875|741->875|742->876|742->876|743->877|743->877|743->877|744->878|744->878|744->878|744->878|744->878|744->878|744->878|744->878|745->879|745->879|746->880|746->880|746->880|747->881|747->881|747->881|747->881|747->881|747->881|747->881|748->882|748->882|749->883|749->883|749->883|750->884|750->884|750->884|750->884|750->884|750->884|750->884|751->885|751->885|753->887|753->887|753->887|754->888|754->888|754->888|754->888|754->888|754->888|754->888|755->889|755->889|756->890|756->890|756->890|757->891|757->891|757->891|757->891|757->891|757->891|757->891|758->892|758->892|759->893|759->893|759->893|760->894|760->894|760->894|760->894|760->894|760->894|760->894|761->895|761->895|761->895|761->895|761->895|761->895|762->896|762->896|763->897|763->897|763->897|764->898|764->898|764->898|764->898|764->898|764->898|764->898|765->899|765->899|766->900|766->900|766->900|767->901|767->901|767->901|767->901|767->901|767->901|767->901|768->902|768->902|769->903|769->903|769->903|770->904|770->904|770->904|770->904|770->904|770->904|770->904|771->905|771->905|775->909|777->911|777->911|778->912|778->912|778->912|778->912|778->912|778->912|778->912|779->913|779->913|782->916|783->917|783->917|784->918|784->918|784->918|784->918|784->918|784->918|784->918|785->919|785->919|786->920|786->920|786->920|787->921|787->921|787->921|787->921|787->921|787->921|787->921|788->922|788->922|790->924|790->924|790->924|791->925|791->925|791->925|791->925|791->925|791->925|791->925|793->927|793->927|794->928|795->929|795->929|796->930|796->930|796->930|796->930|796->930|796->930|796->930|797->931|797->931|800->934|800->934|800->934|801->935|801->935|801->935|801->935|801->935|801->935|801->935|802->936|802->936|805->939|807->941|807->941|808->942|808->942|808->942|808->942|808->942|808->942|808->942|809->943|809->943|811->945|811->945|811->945|812->946|812->946|812->946|812->946|812->946|812->946|812->946|813->947|813->947|814->948|814->948|814->948|815->949|815->949|815->949|815->949|815->949|815->949|815->949|816->950|816->950|817->951|903->1037|905->1039|907->1041
                  -- GENERATED --
              */
          