
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
object terminus extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Registrant],Registrant,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(registrants: List[Registrant], user: Registrant):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Browse Members", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
    <h2>Terminus</h2>
""")))})))}
    }
    
    def render(registrants:List[Registrant],user:Registrant): play.api.templates.HtmlFormat.Appendable = apply(registrants,user)
    
    def f:((List[Registrant],Registrant) => play.api.templates.HtmlFormat.Appendable) = (registrants,user) => apply(registrants,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 25 14:11:02 EDT 2013
                    SOURCE: /Users/danielalksnis/Sites/backpackLog/app/views/terminus.scala.html
                    HASH: 25270bc5a1f140043f8809a05750f2643a5ded3f
                    MATRIX: 798->1|957->50|985->69|1021->71|1057->99|1096->101
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5
                    -- GENERATED --
                */
            