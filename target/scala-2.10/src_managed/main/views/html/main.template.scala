
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Registrant,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, registrant:Registrant)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.55*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Backpacklog</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.59*/routes/*7.65*/.Assets.at("images/favicon.png"))),format.raw/*7.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
    </head>
    	<header>
        <div id="greenBar">
            <div id="header">
                <div id="logo" class="lfoat">
                    <a href=""""),_display_(Seq[Any](/*14.31*/routes/*14.37*/.Application.welcome)),format.raw/*14.57*/(""""><span id="title"><span>Backpack</span>Log</span></a>
                </div>
                """),_display_(Seq[Any](/*16.18*/if(registrant == null)/*16.40*/ {_display_(Seq[Any](format.raw/*16.42*/("""
                """)))}/*17.18*/else/*17.22*/{_display_(Seq[Any](format.raw/*17.23*/("""
				<dl class="rfloat" id="user">
				    <dt><a href=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Application.displayProfile(registrant.email))),format.raw/*19.74*/("""">"""),_display_(Seq[Any](/*19.77*/registrant/*19.87*/.firstName)),format.raw/*19.97*/("""</a> 
				    """),_display_(Seq[Any](/*20.10*/if(registrant.email == "danielalksnis@gmail.com")/*20.59*/ {_display_(Seq[Any](format.raw/*20.61*/(""" """),format.raw/*20.126*/("""
					 <a href=""""),_display_(Seq[Any](/*21.17*/routes/*21.23*/.Application.admin())),format.raw/*21.43*/(""""><span class="smallFont">[Admin Panel] </span></a>
					""")))})),format.raw/*22.7*/(""" 
					</dt>
				    <dd>
				        <a href=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Application.logout())),format.raw/*25.50*/(""""> : Logout</a>
				    </dd>
				</dl>
            	""")))})),format.raw/*28.15*/("""
            </div>
        </div>
    	</header>
    <body>
       <div id="container">
       		"""),_display_(Seq[Any](/*34.11*/views/*34.16*/.html.nav())),format.raw/*34.27*/("""
	    	"""),_display_(Seq[Any](/*35.8*/content)),format.raw/*35.15*/("""
	    </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,registrant:Registrant,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,registrant)(content)
    
    def f:((String,Registrant) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,registrant) => (content) => apply(title,registrant)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 16:11:12 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/main.scala.html
                    HASH: 39d00ccd0ad765233e7237833831a9f8a4721af8
                    MATRIX: 789->1|936->54|1100->183|1114->189|1167->221|1258->277|1272->283|1327->317|1526->480|1541->486|1583->506|1714->601|1745->623|1785->625|1822->643|1835->647|1874->648|1967->705|1982->711|2049->756|2088->759|2107->769|2139->779|2190->794|2248->843|2288->845|2318->910|2371->927|2386->933|2428->953|2517->1011|2601->1059|2616->1065|2659->1086|2745->1140|2880->1239|2894->1244|2927->1255|2970->1263|2999->1270
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|53->25|56->28|62->34|62->34|62->34|63->35|63->35
                    -- GENERATED --
                */
            