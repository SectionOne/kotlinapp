package es.cibernarium.lamevaapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import es.cibernarium.lamevaapp.ui.theme.LaMevaAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Invocarem una funció personalitzada
        bucles()
    }
}

//Aqui expliquem els mapes o diccionaris
private fun bucles() {
    //Bucles
    val alumnes : List<String> = listOf("Josep","Maria","Jan","Anna")
    val evaluacions : MutableMap<String,Int> = mutableMapOf("Josep" to 8, "Maria" to 4, "Jan" to 6, "Anna" to 9)

    //For
    for (alumne:String in alumnes){
        println(alumne)
    }

    for(evaluacio:MutableMap.MutableEntry<String,Int> in evaluacions){
        println("L'alumne ${evaluacio.key} ha obtingut un ${evaluacio.value}")
    }

    //Exemple de rang amb la taula del 7
    for (taula:Int in 0..10){
        println("7 x " + taula + " = " + (taula * 7))
    }

    //Exemple de rang amb la taula del 3 sense tenir en compte l'últim valor
    for (taula:Int in 0 until 10){
        println("7 x " + taula + " = " + (taula * 7))
    }

    //Exemple de rang amb salts de 2 per mostrar els valors parells
    for (nombre:Int in 0..10 step 2){
        println(nombre)
    }

    //Exemple de rang amb ordre invers
    for (nombre:Int in 10 downTo 0 step 4){
        println(nombre)
    }

}