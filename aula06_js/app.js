// Em JS não  ha uma estrutura nativa de Pilha
// Utilizamos o ArrayList para realizar LIFO
 
let pratos = ['Azul', 'Laranja', 'Roxo', 'Vermelho']
 
let veiculos = []
veiculos.push({modelo: 'Fiesta', marca: 'Ford', ano:1993,cor:'Vermelho'})
 
//remover elementos na pilha
let removido = pratos.pop()
console.log(removido)
console.log(pratos)
 
//Verificar elemento no topo da pilha
let topo = pratos[pratos.length-1]
console.log(pratos)
 
//Verificar o tamanho da pilh
console.log(pratos.length == 0)
 
//Percorrendo uma pilha
while(!pratos.length == 0){
    console.log(pratos.pop())
}