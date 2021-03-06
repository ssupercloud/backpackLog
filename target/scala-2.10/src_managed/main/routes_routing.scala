// @SOURCE:/Users/danielalksnis/Sites/backpackLog/conf/routes
// @HASH:eb08e75776ab5a3d2949b9174a5a6fb9778708e8
// @DATE:Mon Oct 28 16:11:10 EDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_welcome0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_newRegistrant1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:12
private[this] lazy val controllers_Application_authenticate3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:15
private[this] lazy val controllers_Application_logout4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:18
private[this] lazy val controllers_Application_browse5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("browse"))))
        

// @LINE:19
private[this] lazy val controllers_Application_deleteRegistrant6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("browse/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:22
private[this] lazy val controllers_Application_admin7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:25
private[this] lazy val controllers_Application_terminus8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminus"))))
        

// @LINE:28
private[this] lazy val controllers_Application_displayProfile9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Application_editRegistrant10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("username", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:32
private[this] lazy val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.welcome()"""),("""POST""", prefix,"""controllers.Application.newRegistrant()"""),("""GET""", prefix,"""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """browse""","""controllers.Application.browse()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """browse/$id<[^/]+>/delete""","""controllers.Application.deleteRegistrant(id:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Application.admin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminus""","""controllers.Application.terminus()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$username<[^/]+>""","""controllers.Application.displayProfile(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$username<[^/]+>/edit""","""controllers.Application.editRegistrant(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_welcome0(params) => {
   call { 
        invokeHandler(controllers.Application.welcome(), HandlerDef(this, "controllers.Application", "welcome", Nil,"GET", """Index""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_newRegistrant1(params) => {
   call { 
        invokeHandler(controllers.Application.newRegistrant(), HandlerDef(this, "controllers.Application", "newRegistrant", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:12
case controllers_Application_authenticate3(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """Login
GET     /login                  	controllers.Application.login()""", Routes.prefix + """login"""))
   }
}
        

// @LINE:15
case controllers_Application_logout4(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """Logout""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:18
case controllers_Application_browse5(params) => {
   call { 
        invokeHandler(controllers.Application.browse(), HandlerDef(this, "controllers.Application", "browse", Nil,"GET", """Browse Members""", Routes.prefix + """browse"""))
   }
}
        

// @LINE:19
case controllers_Application_deleteRegistrant6(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteRegistrant(id), HandlerDef(this, "controllers.Application", "deleteRegistrant", Seq(classOf[String]),"POST", """""", Routes.prefix + """browse/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:22
case controllers_Application_admin7(params) => {
   call { 
        invokeHandler(controllers.Application.admin(), HandlerDef(this, "controllers.Application", "admin", Nil,"GET", """Browse Members""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:25
case controllers_Application_terminus8(params) => {
   call { 
        invokeHandler(controllers.Application.terminus(), HandlerDef(this, "controllers.Application", "terminus", Nil,"GET", """""", Routes.prefix + """terminus"""))
   }
}
        

// @LINE:28
case controllers_Application_displayProfile9(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Application.displayProfile(username), HandlerDef(this, "controllers.Application", "displayProfile", Seq(classOf[String]),"GET", """Profile""", Routes.prefix + """$username<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Application_editRegistrant10(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Application.editRegistrant(username), HandlerDef(this, "controllers.Application", "editRegistrant", Seq(classOf[String]),"GET", """""", Routes.prefix + """$username<[^/]+>/edit"""))
   }
}
        

// @LINE:32
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     