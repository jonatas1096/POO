package com.example.poo.customclass

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Trabalhador(nome:String, idade:Int, val profissao:String, val salario:Double) : Pessoa(nome, idade) { //Essa linha simplesmente significa "Trabalhador herda de Pessoa."

   /*Novamente mexemos com os parâmetros, aqui passamos todos os atributos de um trabalhador.
    //repare que os dois primeiros nao são variaveis, é meio que uma referência, nome e idade já existem, que no caso pertence a pessoa
    //pra tentar resumir, a gente criou dois atributos novos que um trabalhador tem, e uma pessoa nao necessariamente ja nasce tendo, faz sentido?
    //Então, um trabalhador herda os atributos e as ações de uma pessoa, porém, o contrário não ocorre.
    */

    @Composable // <- Existe texto, entao existe composição gráfica.
    fun exibirtrabalhador(trabalhador: Trabalhador){
        Text(text = "Meu nome é $nome, tenho $idade anos e minha profissão é $profissao. Eu ganho miseros R$$salario reais.",
        fontSize = 20.sp,
            modifier = Modifier.padding(10.dp))
    }
}