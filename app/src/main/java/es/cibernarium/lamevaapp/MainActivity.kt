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
        println(saludar("Ordinador",230,21))
        println(saludar("Tablet",106,21))
        println(saludar("Smartphone",983,21))
    }
}

//Aqui expliquem com definir una funció
private fun saludar(nom:String,pvp:Int,iva:Int) : String {
    val total = (((pvp * iva) / 100) + pvp)
    return "Article $nom amb el preu $total"
}