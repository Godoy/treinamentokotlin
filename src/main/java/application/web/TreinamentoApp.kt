package application.web

import application.resources.startJavalin
import application.resources.startProjectKoin

fun main() {
    startProjectKoin()
    startJavalin()
}