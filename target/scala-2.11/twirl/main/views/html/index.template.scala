
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
                                            data-easing="" data-end="5000" data-endspeed="500" ><img src=""""),_display_(/*151.108*/routes/*151.114*/.Assets.versioned("images/spark-streaming.png")),format.raw/*151.161*/("""" alt="Spark Logo" style="width:200px; height:100px"></div>

                                            """),format.raw/*166.3*/("""

                                        """),format.raw/*168.41*/("""</li>

                                        <li data-transition="fade" data-slotamount="7" data-masterspeed="300" >
                                            <img src=""""),_display_(/*171.56*/routes/*171.62*/.Assets.versioned("media/rev-images/slider1/slide2-bg.jpg")),format.raw/*171.121*/(""""  alt="rev-full1" data-fullwidthcentering="on">

                                            <div class="tp-caption lfb stb stl"
                                            data-x="585"
                                            data-y="10"
                                            data-speed="1500"
                                            data-start="200"
                                            data-easing="easeOutExpo" data-end="6000" data-endspeed="500"><img src=""""),_display_(/*178.118*/routes/*178.124*/.Assets.versioned("theme/media/rev-images/slider1/iphone.png")),format.raw/*178.186*/("""" alt="Image 1"></div>

                                            <div class="tp-caption very_large_text2 sft str"
                                            data-x="0"
                                            data-y="100"
                                            data-speed="300"
                                            data-start="1800"
                                            data-easing="easeOutCubic" data-end="5800" data-endspeed="500"> Responsive Design</div>

                                            <div class="tp-caption main_color_text sfl str "
                                            data-x="0"
                                            data-y="145"
                                            data-speed="200"
                                            data-start="2000"
                                            data-easing="easeOutCubic" data-end="5600" data-endspeed="500"> Perfect on Mobile</div>

                                            <div class="tp-caption default_text sfl str "
                                            data-x="0"
                                            data-y="200"
                                            data-speed="200"
                                            data-start="2200"
                                            data-easing="" data-end="5400" data-endspeed="500" > Proin gravida nibh vel velit auctor aliquet. Aenean solli- <br />citudin, lorem quis bibendum auctor, nisi elit consequat <br />ipsum, nec sagittis sem nibh id elit. Duis sed odio sit </div>

                                            <div class="tp-caption sfl str "
                                            data-x="0"
                                            data-y="289"
                                            data-speed="200"
                                            data-start="2400"
                                            data-easing="" data-end="5000" data-endspeed="500" ><a href="#"><img src=""""),_display_(/*206.120*/routes/*206.126*/.Assets.versioned("theme/media/rev-images/slider1/apple-button.png")),format.raw/*206.194*/("""" alt="Apple Button"></a></div>

                                            <div class="tp-caption sfl str "
                                            data-x="223"
                                            data-y="289"
                                            data-speed="200"
                                            data-start="2600"
                                            data-easing="" data-end="5200" data-endspeed="500" ><a href="#"><img src=""""),_display_(/*213.120*/routes/*213.126*/.Assets.versioned("theme/media/rev-images/slider1/android-button.png")),format.raw/*213.196*/("""" alt="Android Button"></a></div>

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

                    """),format.raw/*420.33*/("""

                        """),format.raw/*422.25*/("""<div class="section-content section-alter" id="aboutUs">
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
                                        """),format.raw/*445.48*/("""
                                        """),format.raw/*446.41*/("""<div class="space-sep20"></div>
                                        <a href="#" class="btn btn-primary btn-large">Know more</a>
                                    </div>

                                    <div class="col-md-6 col-sm-6">
                                        <img src=""""),_display_(/*451.52*/routes/*451.58*/.Assets.versioned("theme/media/macbookpro.png")),format.raw/*451.105*/("""" alt="" class="img-responsive"/>
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
                                        """),format.raw/*690.48*/("""
                                    """),format.raw/*691.37*/("""</div>
                                </div>
                        </div>

                        """),format.raw/*706.33*/("""

                       """),format.raw/*708.60*/("""
                                """),format.raw/*709.33*/("""</div>
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

                               <!--  <div class="col-md-4 col-sm-5">
                                    <h3 class="h3-body-title">What Clients Say About Us</h3>
                                    <div class="testimonial-vertical">

                                        <div class="testimonial-vertical-pics">
                                            <ul>
                                                <li>
                                                    <a href="#accord-1">
                                                        <img src=""""),_display_(/*764.68*/routes/*764.74*/.Assets.versioned("theme/media/testimonial-placeholder.jpg")),format.raw/*764.134*/("""" alt="Jane Doe"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#accord-3">
                                                        <img src=""""),_display_(/*769.68*/routes/*769.74*/.Assets.versioned("theme/media/testimonial-placeholder.jpg")),format.raw/*769.134*/("""" alt="John Doe"/>
                                                    </a>
                                                </li>
                                                <li>
                                                    <a href="#accord-3">
                                                        <img src=""""),_display_(/*774.68*/routes/*774.74*/.Assets.versioned("theme/media/testimonial-placeholder.jpg")),format.raw/*774.134*/("""" alt="Moe Peter"/>
                                                    </a>
                                                </li>
                                            </ul>
                                        </div>

                                            Arrow
                                        <div class="testimonial-vertical-arrow"></div>
                                            Arrow

                                        <div class="testimonial-vertical-content">
                                            <div class="testimonial-vertical-text" id="accord-1">
                                                <div>
                                                    Cras sem erat, aliquet in egestas cursus sem erat, ullamcorper vitae ligula. Nunc commodo lacinia eros ac condimentum Nunc commodo lacinia eros ac condimentu
                                                </div>
                                                <div class="testimonial-vertical-author">
                                                    Jane Doe
                                                </div>
                                                <div class="testimonial-vertical-author-position">
                                                    CEO
                                                </div>
                                            </div>
                                            <div class="testimonial-vertical-text" id="accord-3">
                                                <div>
                                                    Cras sem erat, aliquet in egestas cursus sem erat, ullamcorper vitae ligula. Nunc commodo lacinia eros ac condimentum Nunc commodo lacinia eros ac condimentu
                                                </div>
                                                <div class="testimonial-vertical-author">
                                                    John Doe
                                                </div>
                                                <div class="testimonial-vertical-author-position">
                                                    Project Manager
                                                </div>
                                            </div>
                                            <div class="testimonial-vertical-text" id="accord-3">
                                                <div>
                                                    Cras sem erat, aliquet in sem erat egestas cursus, ullamcorper vitae ligula. Nunc commodo lacinia eros ac condimentum Nunc commodo lacinia eros ac condimentu
                                                </div>
                                                <div class="testimonial-vertical-author">
                                                    Moe Peter
                                                </div>
                                                <div class="testimonial-vertical-author-position">
                                                    Web Developer
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div> -->
                            </div>
                        </div>

                    <div class="section-content section-alter" id="whySpradus">
                        <div class="container">
                            <div class="row">

                                <div class="col-md-6 col-sm-6">
                                    <img src=""""),_display_(/*829.48*/routes/*829.54*/.Assets.versioned("theme/media/macbookpro.png")),format.raw/*829.101*/("""" alt="" class="img-responsive"/>
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
                                    """),format.raw/*846.44*/("""
                                    """),format.raw/*847.37*/("""<div class="space-sep20"></div>
                                    <a href="#" class="btn btn-primary btn-large">Know more</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!--.content-wrapper end -->
                <footer>
                    <div class="footer">

                        """),format.raw/*999.33*/("""
                        """),format.raw/*1000.25*/("""<div class="copyright custom-copyright">
                            <div class="container">
                                <div class="row custom-row-top">
                                    <div class="col-md-6 col-sm-6 logo">
                                        <ul>
                                            <li>
                                                <a href="#">
                                                    <img src=""""),_display_(/*1007.64*/routes/*1007.70*/.Assets.versioned("theme/images/spradus-logo.png")),format.raw/*1007.120*/("""" alt="Spradus"/>
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
            span.label-nav-sub::before, .navigation > li > a:focus > span.label-nav-sub::before"""),format.raw/*1055.96*/("""{"""),format.raw/*1055.97*/("""
            """),format.raw/*1056.13*/("""color:  """),format.raw/*1056.21*/("""{"""),format.raw/*1056.22*/("""{"""),format.raw/*1056.23*/("""skin_color"""),format.raw/*1056.33*/("""}"""),format.raw/*1056.34*/("""}"""),format.raw/*1056.35*/(""";
            """),format.raw/*1057.13*/("""}"""),format.raw/*1057.14*/("""
            """),format.raw/*1058.13*/(""".mobile-menu-button, .mobile-nav, .slider-fixed-container"""),format.raw/*1058.70*/("""{"""),format.raw/*1058.71*/("""
            """),format.raw/*1059.13*/("""background-color:  """),format.raw/*1059.32*/("""{"""),format.raw/*1059.33*/("""{"""),format.raw/*1059.34*/("""skin_color"""),format.raw/*1059.44*/("""}"""),format.raw/*1059.45*/("""}"""),format.raw/*1059.46*/(""";
            """),format.raw/*1060.13*/("""}"""),format.raw/*1060.14*/("""

            """),format.raw/*1062.13*/(""".navigation > li > a:after, .navigation>li>.activelink:after"""),format.raw/*1062.73*/("""{"""),format.raw/*1062.74*/("""
            """),format.raw/*1063.13*/("""background-color:  """),format.raw/*1063.32*/("""{"""),format.raw/*1063.33*/("""{"""),format.raw/*1063.34*/("""skin_color"""),format.raw/*1063.44*/("""}"""),format.raw/*1063.45*/("""}"""),format.raw/*1063.46*/(""";
            """),format.raw/*1064.13*/("""}"""),format.raw/*1064.14*/("""
            """),format.raw/*1065.13*/(""".navigation>li:hover > a > span.label-nav-sub::before,.navigation>li:hover> a > span.label-nav-sub::before"""),format.raw/*1065.119*/("""{"""),format.raw/*1065.120*/("""
            """),format.raw/*1066.13*/("""color:  """),format.raw/*1066.21*/("""{"""),format.raw/*1066.22*/("""{"""),format.raw/*1066.23*/("""skin_color"""),format.raw/*1066.33*/("""}"""),format.raw/*1066.34*/("""}"""),format.raw/*1066.35*/(""";
            """),format.raw/*1067.13*/("""}"""),format.raw/*1067.14*/("""


            """),format.raw/*1070.13*/("""/* Page Content Colors */
            .body-wrapper a:hover , .tab a:hover, accordion .title:hover, .top-body a:hover, .bottom-body
            a:hover,.content-box.content-style2 h4 i
            ,.accordion .active h4, .accordion .title:hover h4, .side-navigation .menu-item.current-menu-item a,
            .side-navigation .menu-item:hover a:after,
            .side-navigation .menu-item:hover a, a.tool-tip, .team-member .team-member-position, .team-member-progress
            .team-member-position, .item-img-overlay i
            ,ul.icon-content-list-container li.icon-content-single .icon-box i,.item-img-overlay .portfolio-zoom:hover,
            .navigation ul li:hover>a, .blog_post_quote:after,
            .item-img-overlay .portfolio-zoom, body .white-text .feature-details a:hover"""),format.raw/*1079.89*/("""{"""),format.raw/*1079.90*/("""
            """),format.raw/*1080.13*/("""color:  """),format.raw/*1080.21*/("""{"""),format.raw/*1080.22*/("""{"""),format.raw/*1080.23*/("""skin_color"""),format.raw/*1080.33*/("""}"""),format.raw/*1080.34*/("""}"""),format.raw/*1080.35*/(""";
            """),format.raw/*1081.13*/("""}"""),format.raw/*1081.14*/("""
            """),format.raw/*1082.13*/("""::selection
            """),format.raw/*1083.13*/("""{"""),format.raw/*1083.14*/("""
            """),format.raw/*1084.13*/("""background-color: """),format.raw/*1084.31*/("""{"""),format.raw/*1084.32*/("""{"""),format.raw/*1084.33*/("""skin_color"""),format.raw/*1084.43*/("""}"""),format.raw/*1084.44*/("""}"""),format.raw/*1084.45*/(""";
            """),format.raw/*1085.13*/("""}"""),format.raw/*1085.14*/("""
            """),format.raw/*1086.13*/("""::-moz-selection
            """),format.raw/*1087.13*/("""{"""),format.raw/*1087.14*/("""
            """),format.raw/*1088.13*/("""background-color: """),format.raw/*1088.31*/("""{"""),format.raw/*1088.32*/("""{"""),format.raw/*1088.33*/("""skin_color"""),format.raw/*1088.43*/("""}"""),format.raw/*1088.44*/("""}"""),format.raw/*1088.45*/(""";
            """),format.raw/*1089.13*/("""}"""),format.raw/*1089.14*/("""
            """),format.raw/*1090.13*/(""".item-img-overlay .portfolio-zoom:hover, .tab a.active """),format.raw/*1090.68*/("""{"""),format.raw/*1090.69*/("""
            """),format.raw/*1091.13*/("""color:  """),format.raw/*1091.21*/("""{"""),format.raw/*1091.22*/("""{"""),format.raw/*1091.23*/("""skin_color"""),format.raw/*1091.33*/("""}"""),format.raw/*1091.34*/("""}"""),format.raw/*1091.35*/(""" """),format.raw/*1091.36*/("""!important;
            """),format.raw/*1092.13*/("""}"""),format.raw/*1092.14*/("""
            """),format.raw/*1093.13*/(""".callout-box"""),format.raw/*1093.25*/("""{"""),format.raw/*1093.26*/("""
            """),format.raw/*1094.13*/("""border-left-color:  """),format.raw/*1094.33*/("""{"""),format.raw/*1094.34*/("""{"""),format.raw/*1094.35*/("""skin_color"""),format.raw/*1094.45*/("""}"""),format.raw/*1094.46*/("""}"""),format.raw/*1094.47*/("""
            """),format.raw/*1095.13*/("""}"""),format.raw/*1095.14*/("""
            """),format.raw/*1096.13*/(""".feature .feature-content,.team-member .team-member-content"""),format.raw/*1096.72*/("""{"""),format.raw/*1096.73*/("""
            """),format.raw/*1097.13*/("""border-top-color:  """),format.raw/*1097.32*/("""{"""),format.raw/*1097.33*/("""{"""),format.raw/*1097.34*/("""skin_color"""),format.raw/*1097.44*/("""}"""),format.raw/*1097.45*/("""}"""),format.raw/*1097.46*/(""";
            """),format.raw/*1098.13*/("""}"""),format.raw/*1098.14*/("""

            """),format.raw/*1100.13*/(""".team-member-progress-bar"""),format.raw/*1100.38*/("""{"""),format.raw/*1100.39*/("""
            """),format.raw/*1101.13*/("""background-color:  """),format.raw/*1101.32*/("""{"""),format.raw/*1101.33*/("""{"""),format.raw/*1101.34*/("""skin_color"""),format.raw/*1101.44*/("""}"""),format.raw/*1101.45*/("""}"""),format.raw/*1101.46*/(""";
            """),format.raw/*1102.13*/("""}"""),format.raw/*1102.14*/("""
            """),format.raw/*1103.13*/(""".blog-masonry .blog_post_quote"""),format.raw/*1103.43*/("""{"""),format.raw/*1103.44*/("""
            """),format.raw/*1104.13*/("""border-top: 2px solid  """),format.raw/*1104.36*/("""{"""),format.raw/*1104.37*/("""{"""),format.raw/*1104.38*/("""skin_color"""),format.raw/*1104.48*/("""}"""),format.raw/*1104.49*/("""}"""),format.raw/*1104.50*/(""";
            """),format.raw/*1105.13*/("""}"""),format.raw/*1105.14*/("""
            """),format.raw/*1106.13*/(""".tab a.active:after """),format.raw/*1106.33*/("""{"""),format.raw/*1106.34*/("""
            """),format.raw/*1107.13*/("""background-color: """),format.raw/*1107.31*/("""{"""),format.raw/*1107.32*/("""{"""),format.raw/*1107.33*/("""skin_color"""),format.raw/*1107.43*/("""}"""),format.raw/*1107.44*/("""}"""),format.raw/*1107.45*/(""";
            border-color:  """),format.raw/*1108.28*/("""{"""),format.raw/*1108.29*/("""{"""),format.raw/*1108.30*/("""skin_color"""),format.raw/*1108.40*/("""}"""),format.raw/*1108.41*/("""}"""),format.raw/*1108.42*/(""";
            """),format.raw/*1109.13*/("""}"""),format.raw/*1109.14*/("""
            """),format.raw/*1110.13*/(""".item-img-overlay"""),format.raw/*1110.30*/("""{"""),format.raw/*1110.31*/("""
            """),format.raw/*1111.13*/("""background-color:  """),format.raw/*1111.32*/("""{"""),format.raw/*1111.33*/("""{"""),format.raw/*1111.34*/("""skin_color_rgba"""),format.raw/*1111.49*/("""}"""),format.raw/*1111.50*/("""}"""),format.raw/*1111.51*/(""";
            """),format.raw/*1112.13*/("""}"""),format.raw/*1112.14*/("""
            """),format.raw/*1113.13*/(""".item-img-overlay i:hover"""),format.raw/*1113.38*/("""{"""),format.raw/*1113.39*/("""
            """),format.raw/*1114.13*/("""background-color:  """),format.raw/*1114.32*/("""{"""),format.raw/*1114.33*/("""{"""),format.raw/*1114.34*/("""skin_color_rgba"""),format.raw/*1114.49*/("""}"""),format.raw/*1114.50*/("""}"""),format.raw/*1114.51*/(""";
            """),format.raw/*1115.13*/("""}"""),format.raw/*1115.14*/("""
            """),format.raw/*1116.13*/("""body .section-content.section-image"""),format.raw/*1116.48*/("""{"""),format.raw/*1116.49*/("""
            """),format.raw/*1117.13*/("""background-color:  """),format.raw/*1117.32*/("""{"""),format.raw/*1117.33*/("""{"""),format.raw/*1117.34*/("""skin_color_rgba"""),format.raw/*1117.49*/("""}"""),format.raw/*1117.50*/("""}"""),format.raw/*1117.51*/(""";
            """),format.raw/*1118.13*/("""}"""),format.raw/*1118.14*/("""



            """),format.raw/*1122.13*/(""".button, .body-wrapper input[type="submit"], .body-wrapper input[type="button"], .section-content.section-color-bg,.content-box.content-style4 h4 i
            ,button.button-main,.body-wrapper .tags a:hover,.callout-box.callout-box2, .blog-search .blog-search-button, .top-title-wrapper, .testimonial-big
            ,.content-style3:hover .content-style3-icon, .content-box.style5 h4 i, table.table thead tr, .price-table .price-label-badge, .price-table .price-table-header, .section-subscribe .subscribe-button.icon-envelope-alt"""),format.raw/*1124.227*/("""{"""),format.raw/*1124.228*/("""
            """),format.raw/*1125.13*/("""background-color: """),format.raw/*1125.31*/("""{"""),format.raw/*1125.32*/("""{"""),format.raw/*1125.33*/("""skin_color"""),format.raw/*1125.43*/("""}"""),format.raw/*1125.44*/("""}"""),format.raw/*1125.45*/(""";
            """),format.raw/*1126.13*/("""}"""),format.raw/*1126.14*/("""


            """),format.raw/*1129.13*/(""".blog-post-icon,.comments-list .children .comment:before,.portfolio-filter li a.portfolio-selected,
            .portfolio-filter li a:hover, .dropcaps.dropcaps-color-style, .carousel-container .carousel-icon:hover"""),format.raw/*1130.115*/("""{"""),format.raw/*1130.116*/("""
            """),format.raw/*1131.13*/("""background-color:  """),format.raw/*1131.32*/("""{"""),format.raw/*1131.33*/("""{"""),format.raw/*1131.34*/("""skin_color"""),format.raw/*1131.44*/("""}"""),format.raw/*1131.45*/("""}"""),format.raw/*1131.46*/(""";
            """),format.raw/*1132.13*/("""}"""),format.raw/*1132.14*/("""
            """),format.raw/*1133.13*/(""".comments-list .children .comment:after"""),format.raw/*1133.52*/("""{"""),format.raw/*1133.53*/("""
            """),format.raw/*1134.13*/("""border-color: transparent transparent transparent  """),format.raw/*1134.64*/("""{"""),format.raw/*1134.65*/("""{"""),format.raw/*1134.66*/("""skin_color"""),format.raw/*1134.76*/("""}"""),format.raw/*1134.77*/("""}"""),format.raw/*1134.78*/(""";;
            """),format.raw/*1135.13*/("""}"""),format.raw/*1135.14*/("""

            """),format.raw/*1137.13*/(""".highlighted-text"""),format.raw/*1137.30*/("""{"""),format.raw/*1137.31*/("""
            """),format.raw/*1138.13*/("""background-color:  """),format.raw/*1138.32*/("""{"""),format.raw/*1138.33*/("""{"""),format.raw/*1138.34*/("""skin_color"""),format.raw/*1138.44*/("""}"""),format.raw/*1138.45*/("""}"""),format.raw/*1138.46*/(""";
            color: #ffffff;
            """),format.raw/*1140.13*/("""}"""),format.raw/*1140.14*/("""
            """),format.raw/*1141.13*/(""".icons-list.colored-list li:before, .blog-post-date .day, .blog-post-date .month, strong.colored, span.colored
            ,.content-style3 .content-style3-icon"""),format.raw/*1142.50*/("""{"""),format.raw/*1142.51*/("""
            """),format.raw/*1143.13*/("""color:  """),format.raw/*1143.21*/("""{"""),format.raw/*1143.22*/("""{"""),format.raw/*1143.23*/("""skin_color"""),format.raw/*1143.33*/("""}"""),format.raw/*1143.34*/("""}"""),format.raw/*1143.35*/(""";
            """),format.raw/*1144.13*/("""}"""),format.raw/*1144.14*/("""


            """),format.raw/*1147.13*/(""".pagination .prev, .pagination .next, .pagination a:hover, .pagination a.current, .price-table .price-label"""),format.raw/*1147.120*/("""{"""),format.raw/*1147.121*/("""
            """),format.raw/*1148.13*/("""color: """),format.raw/*1148.20*/("""{"""),format.raw/*1148.21*/("""{"""),format.raw/*1148.22*/("""skin_color"""),format.raw/*1148.32*/("""}"""),format.raw/*1148.33*/("""}"""),format.raw/*1148.34*/(""";
            """),format.raw/*1149.13*/("""}"""),format.raw/*1149.14*/("""


            """),format.raw/*1152.13*/("""/* Footer Area Colors */

            .footer .copyright"""),format.raw/*1154.31*/("""{"""),format.raw/*1154.32*/("""
            """),format.raw/*1155.13*/("""border-color:  """),format.raw/*1155.28*/("""{"""),format.raw/*1155.29*/("""{"""),format.raw/*1155.30*/("""skin_color"""),format.raw/*1155.40*/("""}"""),format.raw/*1155.41*/("""}"""),format.raw/*1155.42*/(""";
            """),format.raw/*1156.13*/("""}"""),format.raw/*1156.14*/("""

            """),format.raw/*1158.13*/(""".footer .copyright a:hover"""),format.raw/*1158.39*/("""{"""),format.raw/*1158.40*/("""
            """),format.raw/*1159.13*/("""color:  """),format.raw/*1159.21*/("""{"""),format.raw/*1159.22*/("""{"""),format.raw/*1159.23*/("""skin_color"""),format.raw/*1159.33*/("""}"""),format.raw/*1159.34*/("""}"""),format.raw/*1159.35*/(""";
            """),format.raw/*1160.13*/("""}"""),format.raw/*1160.14*/("""
            """),format.raw/*1161.13*/(""".flickr_badge_wrapper .flickr_badge_image img:hover"""),format.raw/*1161.64*/("""{"""),format.raw/*1161.65*/("""
            """),format.raw/*1162.13*/("""border-color:  """),format.raw/*1162.28*/("""{"""),format.raw/*1162.29*/("""{"""),format.raw/*1162.30*/("""skin_color"""),format.raw/*1162.40*/("""}"""),format.raw/*1162.41*/("""}"""),format.raw/*1162.42*/(""";
            """),format.raw/*1163.13*/("""}"""),format.raw/*1163.14*/("""
            """),format.raw/*1164.13*/("""</script>

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
            """),format.raw/*1250.91*/("""

        """),format.raw/*1252.9*/("""</div>

""")))}),format.raw/*1254.2*/("""
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
                  DATE: Mon Feb 15 22:52:48 IST 2016
                  SOURCE: /home/priyanka/Downloads/Spradus/app/views/index.scala.html
                  HASH: 7c2f29a53da3ddc5101f3d78978a03c69194f127
                  MATRIX: 527->1|639->18|667->21|698->44|737->46|778->60|1439->694|1454->700|1526->750|6461->5657|6477->5663|6565->5728|7076->6210|7093->6216|7178->6278|7663->6734|7680->6740|7765->6802|9626->8634|9643->8640|9713->8687|9846->9789|9917->9831|10119->10005|10135->10011|10217->10070|10729->10553|10746->10559|10831->10621|12851->12612|12868->12618|12959->12686|13454->13152|13471->13158|13564->13228|18594->24864|18649->24890|20322->26965|20392->27006|20715->27301|20731->27307|20801->27354|34948->41887|35014->41924|35145->42765|35199->42826|35261->42859|38623->46193|38639->46199|38722->46259|39073->46582|39089->46588|39172->46648|39523->46971|39539->46977|39622->47037|43311->50698|43327->50704|43397->50751|44454->52174|44520->52211|44951->62502|45006->62527|45484->62976|45501->62982|45575->63032|48251->65678|48282->65679|48325->65692|48363->65700|48394->65701|48425->65702|48465->65712|48496->65713|48527->65714|48571->65728|48602->65729|48645->65742|48732->65799|48763->65800|48806->65813|48855->65832|48886->65833|48917->65834|48957->65844|48988->65845|49019->65846|49063->65860|49094->65861|49138->65875|49228->65935|49259->65936|49302->65949|49351->65968|49382->65969|49413->65970|49453->65980|49484->65981|49515->65982|49559->65996|49590->65997|49633->66010|49770->66116|49802->66117|49845->66130|49883->66138|49914->66139|49945->66140|49985->66150|50016->66151|50047->66152|50091->66166|50122->66167|50167->66182|50995->66980|51026->66981|51069->66994|51107->67002|51138->67003|51169->67004|51209->67014|51240->67015|51271->67016|51315->67030|51346->67031|51389->67044|51443->67068|51474->67069|51517->67082|51565->67100|51596->67101|51627->67102|51667->67112|51698->67113|51729->67114|51773->67128|51804->67129|51847->67142|51906->67171|51937->67172|51980->67185|52028->67203|52059->67204|52090->67205|52130->67215|52161->67216|52192->67217|52236->67231|52267->67232|52310->67245|52395->67300|52426->67301|52469->67314|52507->67322|52538->67323|52569->67324|52609->67334|52640->67335|52671->67336|52702->67337|52756->67361|52787->67362|52830->67375|52872->67387|52903->67388|52946->67401|52996->67421|53027->67422|53058->67423|53098->67433|53129->67434|53160->67435|53203->67448|53234->67449|53277->67462|53366->67521|53397->67522|53440->67535|53489->67554|53520->67555|53551->67556|53591->67566|53622->67567|53653->67568|53697->67582|53728->67583|53772->67597|53827->67622|53858->67623|53901->67636|53950->67655|53981->67656|54012->67657|54052->67667|54083->67668|54114->67669|54158->67683|54189->67684|54232->67697|54292->67727|54323->67728|54366->67741|54419->67764|54450->67765|54481->67766|54521->67776|54552->67777|54583->67778|54627->67792|54658->67793|54701->67806|54751->67826|54782->67827|54825->67840|54873->67858|54904->67859|54935->67860|54975->67870|55006->67871|55037->67872|55096->67901|55127->67902|55158->67903|55198->67913|55229->67914|55260->67915|55304->67929|55335->67930|55378->67943|55425->67960|55456->67961|55499->67974|55548->67993|55579->67994|55610->67995|55655->68010|55686->68011|55717->68012|55761->68026|55792->68027|55835->68040|55890->68065|55921->68066|55964->68079|56013->68098|56044->68099|56075->68100|56120->68115|56151->68116|56182->68117|56226->68131|56257->68132|56300->68145|56365->68180|56396->68181|56439->68194|56488->68213|56519->68214|56550->68215|56595->68230|56626->68231|56657->68232|56701->68246|56732->68247|56778->68263|57341->68795|57373->68796|57416->68809|57464->68827|57495->68828|57526->68829|57566->68839|57597->68840|57628->68841|57672->68855|57703->68856|57748->68871|57993->69085|58025->69086|58068->69099|58117->69118|58148->69119|58179->69120|58219->69130|58250->69131|58281->69132|58325->69146|58356->69147|58399->69160|58468->69199|58499->69200|58542->69213|58623->69264|58654->69265|58685->69266|58725->69276|58756->69277|58787->69278|58832->69293|58863->69294|58907->69308|58954->69325|58985->69326|59028->69339|59077->69358|59108->69359|59139->69360|59179->69370|59210->69371|59241->69372|59313->69414|59344->69415|59387->69428|59577->69588|59608->69589|59651->69602|59689->69610|59720->69611|59751->69612|59791->69622|59822->69623|59853->69624|59897->69638|59928->69639|59973->69654|60111->69761|60143->69762|60186->69775|60223->69782|60254->69783|60285->69784|60325->69794|60356->69795|60387->69796|60431->69810|60462->69811|60507->69826|60593->69882|60624->69883|60667->69896|60712->69911|60743->69912|60774->69913|60814->69923|60845->69924|60876->69925|60920->69939|60951->69940|60995->69954|61051->69980|61082->69981|61125->69994|61163->70002|61194->70003|61225->70004|61265->70014|61296->70015|61327->70016|61371->70030|61402->70031|61445->70044|61526->70095|61557->70096|61600->70109|61645->70124|61676->70125|61707->70126|61747->70136|61778->70137|61809->70138|61853->70152|61884->70153|61927->70166|68061->76348|68100->76358|68141->76367
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|46->22|46->22|46->22|133->109|133->109|133->109|140->116|140->116|140->116|147->123|147->123|147->123|175->151|175->151|175->151|177->166|179->168|182->171|182->171|182->171|189->178|189->178|189->178|217->206|217->206|217->206|224->213|224->213|224->213|326->420|328->422|346->445|347->446|352->451|352->451|352->451|586->690|587->691|591->706|593->708|594->709|649->764|649->764|649->764|654->769|654->769|654->769|659->774|659->774|659->774|714->829|714->829|714->829|726->846|727->847|737->999|738->1000|745->1007|745->1007|745->1007|793->1055|793->1055|794->1056|794->1056|794->1056|794->1056|794->1056|794->1056|794->1056|795->1057|795->1057|796->1058|796->1058|796->1058|797->1059|797->1059|797->1059|797->1059|797->1059|797->1059|797->1059|798->1060|798->1060|800->1062|800->1062|800->1062|801->1063|801->1063|801->1063|801->1063|801->1063|801->1063|801->1063|802->1064|802->1064|803->1065|803->1065|803->1065|804->1066|804->1066|804->1066|804->1066|804->1066|804->1066|804->1066|805->1067|805->1067|808->1070|817->1079|817->1079|818->1080|818->1080|818->1080|818->1080|818->1080|818->1080|818->1080|819->1081|819->1081|820->1082|821->1083|821->1083|822->1084|822->1084|822->1084|822->1084|822->1084|822->1084|822->1084|823->1085|823->1085|824->1086|825->1087|825->1087|826->1088|826->1088|826->1088|826->1088|826->1088|826->1088|826->1088|827->1089|827->1089|828->1090|828->1090|828->1090|829->1091|829->1091|829->1091|829->1091|829->1091|829->1091|829->1091|829->1091|830->1092|830->1092|831->1093|831->1093|831->1093|832->1094|832->1094|832->1094|832->1094|832->1094|832->1094|832->1094|833->1095|833->1095|834->1096|834->1096|834->1096|835->1097|835->1097|835->1097|835->1097|835->1097|835->1097|835->1097|836->1098|836->1098|838->1100|838->1100|838->1100|839->1101|839->1101|839->1101|839->1101|839->1101|839->1101|839->1101|840->1102|840->1102|841->1103|841->1103|841->1103|842->1104|842->1104|842->1104|842->1104|842->1104|842->1104|842->1104|843->1105|843->1105|844->1106|844->1106|844->1106|845->1107|845->1107|845->1107|845->1107|845->1107|845->1107|845->1107|846->1108|846->1108|846->1108|846->1108|846->1108|846->1108|847->1109|847->1109|848->1110|848->1110|848->1110|849->1111|849->1111|849->1111|849->1111|849->1111|849->1111|849->1111|850->1112|850->1112|851->1113|851->1113|851->1113|852->1114|852->1114|852->1114|852->1114|852->1114|852->1114|852->1114|853->1115|853->1115|854->1116|854->1116|854->1116|855->1117|855->1117|855->1117|855->1117|855->1117|855->1117|855->1117|856->1118|856->1118|860->1122|862->1124|862->1124|863->1125|863->1125|863->1125|863->1125|863->1125|863->1125|863->1125|864->1126|864->1126|867->1129|868->1130|868->1130|869->1131|869->1131|869->1131|869->1131|869->1131|869->1131|869->1131|870->1132|870->1132|871->1133|871->1133|871->1133|872->1134|872->1134|872->1134|872->1134|872->1134|872->1134|872->1134|873->1135|873->1135|875->1137|875->1137|875->1137|876->1138|876->1138|876->1138|876->1138|876->1138|876->1138|876->1138|878->1140|878->1140|879->1141|880->1142|880->1142|881->1143|881->1143|881->1143|881->1143|881->1143|881->1143|881->1143|882->1144|882->1144|885->1147|885->1147|885->1147|886->1148|886->1148|886->1148|886->1148|886->1148|886->1148|886->1148|887->1149|887->1149|890->1152|892->1154|892->1154|893->1155|893->1155|893->1155|893->1155|893->1155|893->1155|893->1155|894->1156|894->1156|896->1158|896->1158|896->1158|897->1159|897->1159|897->1159|897->1159|897->1159|897->1159|897->1159|898->1160|898->1160|899->1161|899->1161|899->1161|900->1162|900->1162|900->1162|900->1162|900->1162|900->1162|900->1162|901->1163|901->1163|902->1164|988->1250|990->1252|992->1254
                  -- GENERATED --
              */
          