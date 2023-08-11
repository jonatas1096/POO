package com.example.poo

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.poo.customclass.Pessoa
import com.example.poo.customclass.Trabalhador
import com.example.poo.ui.theme.POOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POOTheme {
                Main() //Chamando a função principal pra renderizar no android em si (essa parte aqui é basicamente o emulador).
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Main() {
    Scaffold( //pode ignorar se quiser esta parte, é só pra enfeitar
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text(text = "Orientação a objetos", fontSize = 26.sp)},
                backgroundColor = Color(243, 119, 10, 255),
                contentColor = Color.White
            )
        }
    ) {
        Column() {



            // 1- O primeiro passo ta na classe "Pessoa", eu separei ela em uma pasta com chamada customclass

            //
            // 2 - Agora que a classe Pessoa existe, vem o conceito de "instanciar ela". E isso se faz por meio de objetos:
            val pessoa = Pessoa("Havik Malik Salamaleico Bil", 327)
            // os objetos nada mais são que variaveis. E quando tu fala que esse objeto pertence a uma classe, basta abrir () que ele ja vai pedir os parâmetros.
            //Novamente, os parâmetros//atributos são OBRIGATÓRIOS. Então, no seu código não existe uma pessoa sem idade, por exemplo.

            // 3 - Agora que a pessoa existe, a gente pode mandar ela executar algo:
            pessoa.saudacoes(pessoa = pessoa)
            // nao se preocupa em entender essa linha acima, entendendo a lógica ta suave.
            // a gente só chamou uma função que a classe da pessoa executa.


            // ================ //
            //4 - Herança:
            // agora nao vamos criar uma pessoa diretamente, mas um trabalhador, que em tese é uma pessoa:
            val trabalhador = Trabalhador("Hillary Clinton", 75, "Advogada e política americana", 2.00)
            //abra os () que o próprio jetpack vai mostrar o que tu precisa preencher.
            //Trabalhador herdou o nome e idade de pessoa!
            // E novamente, um trabalhador aparece como trabalhador (val trabalhador = Trabalhador) mas, ainda assim recebe algumas coisas de Pessoa.

            //Objeto criado, agora vamos mandar ele fazer algo:
            trabalhador.exibirtrabalhador(trabalhador = trabalhador)

            //novamente nao se preocupe com a sintaxe.
            //É importante entender uma fita em especifico aqui, se tu for na classe Trabalhador e olhar a primeira linha da função,
            //vai reparar que o trabalhador executa uma ação da classe Pessoa (trabalhador.saudacoes)
            //Saudações pertence apenas às pessoas, eu nao criei em trabalhador! Então, um trabalhador herdou
            //uma ação básica de uma pessoa.
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Main() //chamando também a função pra usar na preview. Aqui só serve pra olhar como o projeto ta ficando sem emular de fato
}