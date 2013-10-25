
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
object adminPanel extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Registrant],Registrant,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(registrants: List[Registrant], user: Registrant):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Admin Panel", user)/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""

    <h1>"""),_display_(Seq[Any](/*7.10*/registrants/*7.21*/.size())),format.raw/*7.28*/(""" registrant(s)</h1>
    
    <table>
        """),_display_(Seq[Any](/*10.10*/for(registrant <- registrants) yield /*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/("""
            <tr>
                <td><a href=""""),_display_(Seq[Any](/*12.31*/routes/*12.37*/.Application.displayProfile(registrant.email))),format.raw/*12.82*/("""">"""),_display_(Seq[Any](/*12.85*/registrant/*12.95*/.firstName)),format.raw/*12.105*/(""" 
                """),_display_(Seq[Any](/*13.18*/registrant/*13.28*/.lastName)),format.raw/*13.37*/("""</a></td>
                <td>"""),_display_(Seq[Any](/*14.22*/registrant/*14.32*/.email)),format.raw/*14.38*/("""</td>
                <td>"""),_display_(Seq[Any](/*15.22*/registrant/*15.32*/.password)),format.raw/*15.41*/("""</td>

                <td>"""),_display_(Seq[Any](/*17.22*/form(routes.Application.deleteRegistrant(registrant.email))/*17.81*/ {_display_(Seq[Any](format.raw/*17.83*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*19.18*/("""</td>
                <td>"""),_display_(Seq[Any](/*20.22*/form(routes.Application.editRegistrant(registrant.email))/*20.79*/ {_display_(Seq[Any](format.raw/*20.81*/("""
                    <input type="submit" value="Modify">
                """)))})),format.raw/*22.18*/("""</td>
            </tr>
        """)))})),format.raw/*24.10*/("""
    </table>
""")))})))}
    }
    
    def render(registrants:List[Registrant],user:Registrant): play.api.templates.HtmlFormat.Appendable = apply(registrants,user)
    
    def f:((List[Registrant],Registrant) => play.api.templates.HtmlFormat.Appendable) = (registrants,user) => apply(registrants,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 25 14:11:01 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/adminPanel.scala.html
                    HASH: 6af1a3865aaebf1d3030b5bcd29253b917e0a203
                    MATRIX: 800->1|959->50|987->69|1023->71|1056->96|1095->98|1141->109|1160->120|1188->127|1270->173|1316->203|1356->205|1440->253|1455->259|1522->304|1561->307|1580->317|1613->327|1668->346|1687->356|1718->365|1785->396|1804->406|1832->412|1895->439|1914->449|1945->458|2009->486|2077->545|2117->547|2224->622|2287->649|2353->706|2393->708|2500->783|2565->816
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|38->10|38->10|38->10|40->12|40->12|40->12|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|45->17|45->17|45->17|47->19|48->20|48->20|48->20|50->22|52->24
                    -- GENERATED --
                */
            