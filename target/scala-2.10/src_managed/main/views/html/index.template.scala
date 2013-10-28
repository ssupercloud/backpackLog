
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Application.Login],Form[Registrant],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login], RegistrationForm: Form[Registrant]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.69*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Backpacklog</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*7.59*/routes/*7.65*/.Assets.at("images/favicon.png"))),format.raw/*7.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
    </head>
    <body>

	<header>
        <div id="greenBar">
            <div id="header">
                <div id="logo" class="lfoat">
                    <a href=""""),_display_(Seq[Any](/*16.31*/routes/*16.37*/.Application.welcome)),format.raw/*16.57*/(""""><span id="title"><span>Backpack</span>Log</span></a>
                </div>

                
                <div id="login" class="rfloat">
                    <div class="lfloat">
                        """),_display_(Seq[Any](/*22.26*/if(form.hasGlobalErrors)/*22.50*/ {_display_(Seq[Any](format.raw/*22.52*/("""
	                        <p class="error">
	                        """),_display_(Seq[Any](/*24.27*/form/*24.31*/.globalError.message)),format.raw/*24.51*/("""
	                        </p>
                    	""")))})),format.raw/*26.23*/("""
                    	"""),_display_(Seq[Any](/*27.23*/if(flash.contains("success"))/*27.52*/ {_display_(Seq[Any](format.raw/*27.54*/("""
	                        <p class="success">
	                            """),_display_(Seq[Any](/*29.31*/flash/*29.36*/.get("success"))),format.raw/*29.51*/("""
	                        </p>
                    		""")))})),format.raw/*31.24*/("""
                	</div>
                	<div class="rfloat">
                    """),_display_(Seq[Any](/*34.22*/helper/*34.28*/.form(routes.Application.authenticate)/*34.66*/ {_display_(Seq[Any](format.raw/*34.68*/("""

                        <input class="homeLogin" type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*36.104*/form("email")/*36.117*/.value)),format.raw/*36.123*/("""">

                        <input class="homeLogin" type="password" name="password" placeholder="Password">

                        <button type="submit">Sign In</button>     
                    	""")))})),format.raw/*41.23*/("""
                    <div>
                </div>
            </div>
        </div>
    </header>


    <div id="container">
    	<div id="home">
    	<p>Connect with travelers and the world around you on BackpackLog.<p>
    	<ul>
    	<li><span>Discover the latest calls for adventures</span> at the the Terminus</li>
    	<li><span>Exhibit your adventures and discoveries</span> in your Cabinet of Trophees</li>
    	<li><span>Share your expertise</span> on your Wall of Certificates</li>
    	</div>
    	"""),_display_(Seq[Any](/*57.7*/views/*57.12*/.html.signUp(RegistrationForm))),format.raw/*57.42*/("""
    </div>
</body>
</html>

"""))}
    }
    
    def render(form:Form[Application.Login],RegistrationForm:Form[Registrant]): play.api.templates.HtmlFormat.Appendable = apply(form,RegistrationForm)
    
    def f:((Form[Application.Login],Form[Registrant]) => play.api.templates.HtmlFormat.Appendable) = (form,RegistrationForm) => apply(form,RegistrationForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 16:11:12 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/index.scala.html
                    HASH: 6e46b0dfe6f3a19094b47d4f160748a37ef502f2
                    MATRIX: 808->1|969->68|1133->197|1147->203|1200->235|1291->291|1305->297|1360->331|1567->502|1582->508|1624->528|1870->738|1903->762|1943->764|2049->834|2062->838|2104->858|2189->911|2248->934|2286->963|2326->965|2438->1041|2452->1046|2489->1061|2575->1115|2695->1199|2710->1205|2757->1243|2797->1245|2939->1350|2962->1363|2991->1369|3223->1569|3767->2078|3781->2083|3833->2113
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|44->16|44->16|44->16|50->22|50->22|50->22|52->24|52->24|52->24|54->26|55->27|55->27|55->27|57->29|57->29|57->29|59->31|62->34|62->34|62->34|62->34|64->36|64->36|64->36|69->41|85->57|85->57|85->57
                    -- GENERATED --
                */
            