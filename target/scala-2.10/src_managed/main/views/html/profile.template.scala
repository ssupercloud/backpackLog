
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Registrant,Registrant,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(profile: Registrant, user: Registrant):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.41*/("""

"""),_display_(Seq[Any](/*3.2*/main("Profile", user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
	<div id="timelinePhoto">
		<div class="bottom"><span>"""),_display_(Seq[Any](/*5.30*/profile/*5.37*/.firstName)),format.raw/*5.47*/(""" """),_display_(Seq[Any](/*5.49*/profile/*5.56*/.lastName)),format.raw/*5.65*/("""</span>
			"""),_display_(Seq[Any](/*6.5*/if(profile.email == user.email)/*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""
			 <a href=""""),_display_(Seq[Any](/*7.15*/routes/*7.21*/.Application.editRegistrant(user.email))),format.raw/*7.60*/("""">Edit Profile</a>
			""")))})),format.raw/*8.5*/("""
		</div>
	</div>
	""")))})))}
    }
    
    def render(profile:Registrant,user:Registrant): play.api.templates.HtmlFormat.Appendable = apply(profile,user)
    
    def f:((Registrant,Registrant) => play.api.templates.HtmlFormat.Appendable) = (profile,user) => apply(profile,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 25 14:11:02 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/profile.scala.html
                    HASH: 15d4b6c7dfc788a2424252691dbbac687f32f5b8
                    MATRIX: 791->1|924->40|961->43|990->64|1029->66|1120->122|1135->129|1166->139|1203->141|1218->148|1248->157|1294->169|1333->200|1372->202|1422->217|1436->223|1496->262|1549->285
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8
                    -- GENERATED --
                */
            