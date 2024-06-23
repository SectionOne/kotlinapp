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
        emprantNulls()
    }
}

//Aqui expliquem els mapes o diccionaris
@Suppress("UNREACHABLE_CODE")
private fun emprantNulls() {
    //Si a una variable preexistent desitgem assignarli un null ens donarà un error de compilació
    var ciutat = "Barcelona"
    //ciutat = null Aixó originarà un error
    println(ciutat)

    var assignatura:String? = "Introducció a Kotlin"
    assignatura = null
    println(assignatura)

    //Fem servir el ? per evitar que s'executi el length si es null
    println(assignatura?.length)
}