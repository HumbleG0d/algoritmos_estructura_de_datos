function binarySearch(array , n){ //! El array tiene que estar ordenado
  let min = 0
  let max = array.length - 1
  while(min <= max){
    let average = Math.floor((min + max)/2) //*Nos vasamos en la posicion promedio.
    if(array[average] < n){
      min = average + 1
    }
    else if(array[average] > n){
      max = average - 1
    }
    else{
      return average
    }
  }
  return -1 //* Si el elemento no es encuentra retornamos -1
}

const array = [1,2,3,4,5,6,7,8,9,10]


console.log(binarySearch(array , 6))