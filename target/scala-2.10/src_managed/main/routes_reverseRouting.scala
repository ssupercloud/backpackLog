// @SOURCE:/Users/danielalksnis/Sites/backpackLog/conf/routes
// @HASH:3e623145411c0ae0070d03204db4f75af7f2ab7a
// @DATE:Fri Oct 25 14:11:00 EDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:25
def terminus(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "terminus")
}
                                                

// @LINE:28
def displayProfile(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                

// @LINE:22
def admin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                

// @LINE:29
def editRegistrant(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/edit")
}
                                                

// @LINE:18
def browse(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "browse")
}
                                                

// @LINE:15
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:6
def welcome(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:23
// @LINE:19
def deleteRegistrant(id:String): Call = {
   (id: @unchecked) match {
// @LINE:19
case (id) if true => Call("POST", _prefix + { _defaultPrefix } + "browse/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/delete")
                                                        
// @LINE:23
case (id) if true => Call("POST", _prefix + { _defaultPrefix } + "admin/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)) + "/delete")
                                                        
   }
}
                                                

// @LINE:12
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:7
def newRegistrant(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:11
// @LINE:8
def login(): Call = {
   () match {
// @LINE:8
case () if true => Call("GET", _prefix)
                                                        
// @LINE:11
case () if true => Call("GET", _prefix + { _defaultPrefix } + "login")
                                                        
   }
}
                                                
    
}
                          
}
                  


// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:25
def terminus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.terminus",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminus"})
      }
   """
)
                        

// @LINE:28
def displayProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.displayProfile",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        

// @LINE:22
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:29
def editRegistrant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editRegistrant",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/edit"})
      }
   """
)
                        

// @LINE:18
def browse : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.browse",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "browse"})
      }
   """
)
                        

// @LINE:15
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:6
def welcome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.welcome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:23
// @LINE:19
def deleteRegistrant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteRegistrant",
   """
      function(id) {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "browse/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/delete"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id)) + "/delete"})
      }
      }
   """
)
                        

// @LINE:12
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:7
def newRegistrant : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newRegistrant",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:11
// @LINE:8
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
      }
   """
)
                        
    
}
              
}
        


// @LINE:32
// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:32
class ReverseAssets {
    

// @LINE:32
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:25
def terminus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.terminus(), HandlerDef(this, "controllers.Application", "terminus", Seq(), "GET", """""", _prefix + """terminus""")
)
                      

// @LINE:28
def displayProfile(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.displayProfile(username), HandlerDef(this, "controllers.Application", "displayProfile", Seq(classOf[String]), "GET", """Profile""", _prefix + """$username<[^/]+>""")
)
                      

// @LINE:22
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.admin(), HandlerDef(this, "controllers.Application", "admin", Seq(), "GET", """Browse Members""", _prefix + """admin""")
)
                      

// @LINE:29
def editRegistrant(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editRegistrant(username), HandlerDef(this, "controllers.Application", "editRegistrant", Seq(classOf[String]), "GET", """""", _prefix + """$username<[^/]+>/edit""")
)
                      

// @LINE:18
def browse(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.browse(), HandlerDef(this, "controllers.Application", "browse", Seq(), "GET", """Browse Members""", _prefix + """browse""")
)
                      

// @LINE:15
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """Logout""", _prefix + """logout""")
)
                      

// @LINE:6
def welcome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.welcome(), HandlerDef(this, "controllers.Application", "welcome", Seq(), "GET", """Index""", _prefix + """""")
)
                      

// @LINE:19
def deleteRegistrant(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteRegistrant(id), HandlerDef(this, "controllers.Application", "deleteRegistrant", Seq(classOf[String]), "POST", """""", _prefix + """browse/$id<[^/]+>/delete""")
)
                      

// @LINE:12
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:7
def newRegistrant(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newRegistrant(), HandlerDef(this, "controllers.Application", "newRegistrant", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:8
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          
}
        
    