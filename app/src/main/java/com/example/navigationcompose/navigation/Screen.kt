package com.example.navigationcompose.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"
const val AUTHENTICATION_ROUTE = "auth"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

sealed class Screen(val route : String){
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}"){
//        fun passId(id:Int): String{
//            return this.route.replace(
//                oldValue = "{$DETAIL_ARGUMENT_KEY}",
//                newValue = id.toString())
//        }
        fun passNameId(id: Int, name:String) : String{
            return "detail_screen/$id/$name"

        }
    }
    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "sign_up_screen")

}
