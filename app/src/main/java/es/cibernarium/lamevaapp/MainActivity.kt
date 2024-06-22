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
        condicionals()
    }
}

//Aqui expliquem els tipus de dades
private fun condicionals() {
    var edat = 23
    var llistaVip = false
    //OPeradors condicionals
    //> major que
    //< menor que
    //>= major o igual que
    //<= menor o igual que
    //== igual
    //!= diferent
    if (edat >= 18 || llistaVip == true) {
        println("$edat es major de 18") //El dolar ens permet intercalar variables amb string
    } else {
        println("$edat es menor de 18")
    }
}