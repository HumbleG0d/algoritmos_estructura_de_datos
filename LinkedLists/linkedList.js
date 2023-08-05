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

a.next = b //*  A -> B
b.next = c //*  A -> B -> C
c.next = d //*  A -> B -> C -> D

//? A -> B -> C -> D -> NULL
const printLinkedList = (head) => {
  let current = head
  while(current !== null){
    console.log(current.value)
    current = current.next
  }
}

//* De manera recursiva

const recursivePrintLinkedList = (head) => {
  if(head === null) return
  console.log(head.value)
  recursivePrintLinkedList(head.next)
}

printLinkedList(a)
recursivePrintLinkedList(a)