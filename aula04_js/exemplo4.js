//criando um vetor

//vetor vazio
let vetor = []

//vetor com valores
let carros = ['Mobi', 'UP', 'Kwid', 'J1', 'BYD Mini']

console.log(carros)
console.log(vetor)

// push é utilizado para adicionar no final do vetor
vetor.push(1)
vetor.push(2)
vetor.push(3)
vetor.push(4)

console.log(vetor)

//unshift é utilizado para adicionar no inicio do vetor
carros.unshift("Uno")
carros.unshift("Palio")
carros.unshift("HB20")

console.log(carros)
console.log(vetor)

//Acesso direto (ou Rápido)
console.log(carros[3])
carros[3] = "Ford KA"
console.log(carros[3])

//Acesso posicional (é utilizado um laço de repetição)
for(let i; i<carros.length; i++){
    console.log(carros[i])
}