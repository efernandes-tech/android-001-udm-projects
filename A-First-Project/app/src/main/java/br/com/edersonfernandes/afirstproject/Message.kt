package br.com.edersonfernandes.afirstproject

class Message {
    fun send() {
        val user = User()
        user.login()
        // or
        User().login()
    }
}