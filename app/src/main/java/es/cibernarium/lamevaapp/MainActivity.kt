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
        tipusDeDades()
    }
}

//Aqui expliquem els tipus de dades
private fun tipusDeDades(){
    //Strings
    val ciutat = "Vilanova i la Geltru"
    val provincia: String = "barcelona"
    val direccio = ciutat + provincia
    println(direccio)
    //Integers (Byte,Short,Int,Long)
    val num1: Int = 2
    val num2 = 3
    val num3 = num1 + num2
    println(num3)
    //Decimals (Float 32bits i Double 64 bits)
    val temperatura: Float = 23.5f
    val numDoble: Double = 2.9
    val num4 = 2 //Es Int pero el ser Double el resultat, num4 s'adaptarà el tipus a Double
    val resultat: Double = temperatura + numDoble + num4
    println(resultat)
    //Boolean
}