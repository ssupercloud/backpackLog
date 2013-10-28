
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Application.Login],Registrant,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login], user: Registrant):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

"""),_display_(Seq[Any](/*3.2*/main("Browse Members", user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
    <div id="login">
        """),_display_(Seq[Any](/*5.10*/helper/*5.16*/.form(routes.Application.authenticate)/*5.54*/ {_display_(Seq[Any](format.raw/*5.56*/("""
        Sign in
        """),_display_(Seq[Any](/*7.10*/if(form.hasGlobalErrors)/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
            <p class="error">
            """),_display_(Seq[Any](/*9.14*/form/*9.18*/.globalError.message)),format.raw/*9.38*/("""
            </p>
        """)))})),format.raw/*11.10*/("""
        """),_display_(Seq[Any](/*12.10*/if(flash.contains("success"))/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/("""
            <p class="success">
                """),_display_(Seq[Any](/*14.18*/flash/*14.23*/.get("success"))),format.raw/*14.38*/("""
            </p>
        """)))})),format.raw/*16.10*/("""

            <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*18.74*/form("email")/*18.87*/.value)),format.raw/*18.93*/("""">

            <input type="password" name="password" placeholder="Password">

            <button type="submit">Login</button>                    """)))})),format.raw/*22.70*/("""
    </div>
""")))})))}
    }
    
    def render(form:Form[Application.Login],user:Registrant): play.api.templates.HtmlFormat.Appendable = apply(form,user)
    
    def f:((Form[Application.Login],Registrant) => play.api.templates.HtmlFormat.Appendable) = (form,user) => apply(form,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Oct 28 16:11:12 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/login.scala.html
                    HASH: b529927473eada43ede0083da27f114a433fe763
                    MATRIX: 802->1|945->50|982->53|1018->81|1057->83|1123->114|1137->120|1183->158|1222->160|1283->186|1315->210|1354->212|1433->256|1445->260|1486->280|1545->307|1591->317|1629->346|1669->348|1755->398|1769->403|1806->418|1865->445|1976->520|1998->533|2026->539|2207->688
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|37->9|39->11|40->12|40->12|40->12|42->14|42->14|42->14|44->16|46->18|46->18|46->18|50->22
                    -- GENERATED --
                */
            