class Node{
  constructor(value){
    this.value = value
    this.next = null
  }
}

const a = new Node('A')
const b = new Node('B')
const c = new Node('C')
const d = new Node('D')

a.next = b
b.next = c
c.next = d

//*['A', 'B', 'C', 'D']
//? A -> B -> C -> D
const linkedListValues = (head) => {
  const values = []
  let current = head

  while(current !== null){
    values.push(current.value)
    current = current.next
  }
  return values
}

//* De forma recursiva

const recursiveLinkedListValues = (head) => {
  const values = []
  fillValues(head , values)
  return values
}

const fillValues = (head , values) => {
  if(head === null) return
  values.push(head.value)
  fillValues(head.next , values)
}

console.log(linkedListValues(a))
console.log(recursiveLinkedListValues(a))