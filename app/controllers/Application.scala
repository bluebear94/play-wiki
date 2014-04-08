package controllers

import play.api.mvc._

object Application extends Controller {
  def index = Action { implicit req =>
    Ok("Welcome to play-wiki")
  }
}