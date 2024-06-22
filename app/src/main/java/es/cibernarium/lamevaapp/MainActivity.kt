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
    var nota = 6

    when(nota){
        0, 1, 2,3, 4 -> {
            println("Suspes")
        } in 5..7 -> { //Definim un rang entre 5 i 7
            println("Aprobat")
        } in 8..10 -> {
            println("Notable")
        } else -> {
            println("No reconeixem la nota")
        }
    }
}