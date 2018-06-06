package com.example.gustavo.anime_final

class producto{

    var img: Int? = null
    var precio: Float? = null
    var cant: Int? = null
    var nombre: String? = null

    constructor(Img: Int,Precio: Float, Cant:Int, Nombre:String){
        this.cant = Cant
        this.img = Img
        this.precio = Precio
        this.nombre =  Nombre

    }
}