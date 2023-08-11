package com.example.poo.customclass

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

open class Pessoa(val nome:String, val idade:Int) { // <- Primeiro, passamos os atributos que toda "pessoa" tem

    //isso acima é chamado de parâmetros. Quando voce "criar" uma nova "pessoa", vai ser obrigatório que contenha esses parâmetros.
    //o termo técnico é "construtores", é tipo uma regra para toda classe. Se colocou, tem que usar.


    //Agora vem os métodos:

    @Composable //Composable é obrigatório pra usar algumas funções gráficas. Em resumo é isso.
    fun saudacoes(pessoa: Pessoa){
        Text(text = "O meu nome é $nome e eu tenho $idade anos!",
        fontSize = 20.sp,
        modifier = Modifier.padding(10.dp))
    }

    //Os métodos nada mais são que ações. Os cara são chato e fica inventando nome novo.
    //Além disso, métodos nada mais são que funções. Então, quando tu chamar esse método/função, ele vai obrigatóriamente executar todo o conteúdo dentro dele.//
    //Em suma, um método de uma classe executa uma ação que você determinar, que nesse caso é a saudação de uma pessoa, beleza?

}