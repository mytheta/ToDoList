package controllers

import javax.inject.Inject

import play.api.data.Forms._
import play.api.data._
import play.api.i18n.{I18nSupport, MessagesApi}
import play.api.mvc._
import views._

class TodoController @Inject() (val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def helloworld() = Action { implicit request =>
    Ok("Hello World")
  }

}
