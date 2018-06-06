package com.example.gustavo.anime_final

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_catalogo.*
import kotlinx.android.synthetic.main.moldecatalogo.view.*

class Catalogo(var adaptador: productosadaptador?=null) : AppCompatActivity() {

    var listaproducto = ArrayList<producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        listaproducto.add(producto(1,12.2F,5,"Hunter x Hunter"))
        listaproducto.add(producto(1,15.2F,3,"Naruto"))


        adaptador =productosadaptador(this,this.listaproducto)

        listacatalogo.adapter=adaptador


    }

    class productosadaptador(Contexto:Context,var listaelementos: ArrayList<producto>):BaseAdapter(){
        var contexto1:Context?=Contexto

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val producto1 = listaelementos[position]
            val inflador = contexto1!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val mivista = inflador.inflate(R.layout.moldecatalogo,null)
            mivista.nombre.text = producto1.nombre
            mivista.precio.text =producto1.precio.toString()
            mivista.cantidad.text =producto1.cant.toString()
            return mivista
        }

        override fun getItem(position: Int): Any {
        return listaelementos[position]
        }

        override fun getItemId(position: Int): Long {
        return position.toLong()
        }

        override fun getCount(): Int {

        return listaelementos.size
        }

    }
}
