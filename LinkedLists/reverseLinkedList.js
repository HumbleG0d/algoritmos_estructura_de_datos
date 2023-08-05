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

//* NULL A -> B -> C -> D -> NULL
//? NULL <- A <- B <- C <- D
const reverseList = (head) => {
  let current = head
  let prev = null
  while(current !== null){
    const next = current.next 
    current.next = prev 
    prev = current 
    current = next 
  }
  return prev
}

const printLinkedList = (head) => {
  let current = head
  while(current !== null){
    console.log(current.value)
    current = current.next
  }
}

printLinkedList(reverseList(a))