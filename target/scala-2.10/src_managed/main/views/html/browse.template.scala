
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
object browse extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Registrant],Registrant,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(registrants: List[Registrant], user: Registrant):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Browse Members", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

    <h1>"""),_display_(Seq[Any](/*7.10*/registrants/*7.21*/.size())),format.raw/*7.28*/(""" registrant(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*10.10*/for(registrant <- registrants) yield /*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
            <li>
                <a href=""""),_display_(Seq[Any](/*12.27*/routes/*12.33*/.Application.displayProfile(registrant.email))),format.raw/*12.78*/("""">"""),_display_(Seq[Any](/*12.81*/registrant/*12.91*/.firstName)),format.raw/*12.101*/(""" 
                """),_display_(Seq[Any](/*13.18*/registrant/*13.28*/.lastName)),format.raw/*13.37*/("""</a> <span class="smallFont">"""),_display_(Seq[Any](/*13.67*/registrant/*13.77*/.email)),format.raw/*13.83*/("""</span>
            </li>
        """)))})),format.raw/*15.10*/("""
    </ul>
""")))})))}
    }
    
    def render(registrants:List[Registrant],user:Registrant): play.api.templates.HtmlFormat.Appendable = apply(registrants,user)
    
    def f:((List[Registrant],Registrant) => play.api.templates.HtmlFormat.Appendable) = (registrants,user) => apply(registrants,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 25 14:11:01 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/browse.scala.html
                    HASH: 7f0f193202c4469cf7c3e295b61b6f5fa06800a0
                    MATRIX: 796->1|955->50|983->69|1019->71|1055->99|1094->101|1140->112|1159->123|1187->130|1266->173|1312->203|1352->205|1432->249|1447->255|1514->300|1553->303|1572->313|1605->323|1660->342|1679->352|1710->361|1776->391|1795->401|1823->407|1890->442
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|41->13|41->13|41->13|43->15
                    -- GENERATED --
                */
            