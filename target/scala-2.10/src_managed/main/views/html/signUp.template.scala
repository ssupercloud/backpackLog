
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
object signUp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Registrant],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(RegistrationForm: Form[Registrant]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.38*/("""

<div class="rfloat" id="registrationForm">
    <h2>Sign Up</h2>
    <p>It's free and always will be!</p>

    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(routes.Application.newRegistrant())/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""

        <p><input class="regFormHome" type="text" name="firstName" placeholder="First Name">
        <input class="regFormHome" type="text" name="lastName" placeholder="Last Name"><p>
        <p><input class="regFormHome regFormHome2" type="email" name="email" placeholder="Your E-mail"><p>
        <p><input class="regFormHome regFormHome2" type="password" name="password" placeholder="Password"></p>
        
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.inputRadioGroup(RegistrationForm("gender"),
            options = Seq("M"->"Male","F"->"Female"),
            '_label -> "Gender",
            '_error -> RegistrationForm("gender").error.map(_.withMessage("select gender"))
        ))),format.raw/*19.10*/("""

        <input class="submitBig" type="submit" value="Sign Up">   
    """)))})),format.raw/*22.6*/("""
</div>"""))}
    }
    
    def render(RegistrationForm:Form[Registrant]): play.api.templates.HtmlFormat.Appendable = apply(RegistrationForm)
    
    def f:((Form[Registrant]) => play.api.templates.HtmlFormat.Appendable) = (RegistrationForm) => apply(RegistrationForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 25 14:11:02 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/signUp.scala.html
                    HASH: b6006be16bea2bb1d028d8adfc1f12f13b506d7f
                    MATRIX: 785->1|915->37|1062->150|1076->156|1125->197|1164->199|1631->630|1646->636|1901->869|2006->943
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|43->15|43->15|47->19|50->22
                    -- GENERATED --
                */
            