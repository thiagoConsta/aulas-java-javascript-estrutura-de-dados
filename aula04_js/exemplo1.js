function exemploVar(){
    var x = 5
    if (true){
        var x = 10 //re-declaração
        console.log(x)
    }
    console.log(x) //sobreposição de valores
}

function exemploLet(){
    let x = 5
    if (true){
        let x = 10
        console.log(x)
    }
    console.log(x)
}
// chamando a função para executar
// exemploVar()
exemploLet()

// Constante é uma variavel de valor fixo no ato da criação
// Não permite re-atribuição de valores
// Boa prática! Escrever em Caixa Alta



const NOME="Francisco Douglas"

console.log(NOME)
// NOME="DANIEL" - Não é permitida
