//Condicional Simples (if)
let idade = 18
if (idade>=18){
    console.log("Maior de idade")
}

// Condicional Composta (if-else)

if (idade>=18){
    console.log("Maior de idade")
}else{
    console.log("Menor de idade")
}

// Multipla Condição (else if)
let nota = 7
if (nota>=6){
    console.log("Aprovado")
}else if (nota>=4){
    console.log("Exame")
}else{
    console.log("Reprovado")
}

// Operadores: >, <, >=, <=, ==, ===, !==, !=
// Lógicos: || (Lógica OR), && (Lógica AND)

let cnh = "1"
if (idade>= 18 && cnh === 1){
    console.log("Pode dirigir")
}else{
    console.log("Não pode dirigir")
}

let dia = "sábado"
if (dia == "sábado" || dia == "domingo"){
    console.log("Final de semana")
}else{
    console.log("Dia útil")
}

// entendo a diferença de ==  para ===
// == é verificado apenas o conteúdo
// === é verificado o conteúdo E a tipagem

//Ternário: Precisa de uma variavel para guardar o resultado da comparação lógica
// é utilizado para subtituir a condicional composta (If-else)
let resultado =  dia == "sábado" || dia == "domingo" ?  "Final de semana" : "Dia útil"
console.log(resultado)

//switch case (multiplas opções)

dia = 3
switch(dia){
    case 1:
        console.log("Domingo")
        break
    case 2:
        console.log("Segunda")
        break
    case 3: 
        console.log("Terça")
        break
    default:
        console.log("Dia invalido")
}



