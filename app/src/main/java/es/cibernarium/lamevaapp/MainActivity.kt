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
        sentenciaWhen()
    }
}

//Aqui expliquem el when
private fun sentenciaWhen() {
    var pais = "España"

    when(pais){
        "Italia" -> {
            println("El idioma és Italia")
        } "España","Mexico","Honduras" -> {
            println("El idioma és Espanyol")
        } "Vietnam" -> {
            println("El idioma és Vietnamita")
        } else -> {
            println("No reconeixem el pais")
        }
    }
}