function merge(array , min , max , midle){
  const SIZE1 = midle - min + 1 //* Tamaño de nuestro primer array
  const SIZE2 = max - midle //* Tamaño de nuestro segundo array

  const lowHalf = new Array(SIZE1)
  const highHalf = new Array(SIZE2)

  //* Copiamos los sub-arrayas en un solo 
  for(let i = 0 ; i < SIZE1 ; i++){
    lowHalf[i] = array[min + i]
  }
  for(let i = 0 ; i < SIZE2 ; i++){
    highHalf[i] = array[midle + 1 + i]
  }
  
  //* Mezclamos(merge) los 2 sub-arrays en un solo array
  let i = 0 , j = 0 , k = min

  //* Copiamos los menores elementos de los 2 sub-arrays
  while( i < SIZE1 && j < SIZE2 ){
    if(lowHalf[i] <= highHalf[j]){
      array[k] = lowHalf[i]
      i++
    }
    else{
      array[k] = highHalf[j]
      j++
    }
    k++
  }

  //* Copiamos los elementos restantes
  while( i < SIZE1){
    array[k] = lowHalf[i]
    i++
    k++
  }
  while( j < SIZE2){
    array[k] = highHalf[j]
    j++
    k++
  }
}


//? [1, 2, 3, 4, 5, 6]
function mergeSort(array , min , max){
  const midle = Math.floor((min + max)/2)

  if(max <= min) return //* Si los sub-arrays son de longitud 1 , retornamos ya que no hay nada q hacer
  mergeSort(array , min , midle) //* Primer divide y venceras recursivo -> [1, 2, 3] -> [1, 2] ; [3]
  mergeSort(array , midle + 1 , max) //* Segundo divide y venceras recursivo -> [4, 5, 6] -> [4, 5] ; [6] 
  merge(array , min , max , midle)
}

const array = [79, 61, 48, 27, 21, 56, 74, 9, 63, 31, 73, 96, 44, 3, 20, 41, 46, 50, 60, 65, 88, 16, 75, 58, 68, 35, 55, 98, 94, 78, 23, 85, 77, 87, 30, 43, 34, 83, 38, 25, 18, 26, 37, 64, 6, 13, 67, 76, 81, 93, 32, 72, 22, 17, 99, 90, 66, 11, 39, 2, 15, 91, 42, 8, 12, 24, 4, 53, 36, 54, 19, 10, 29, 95, 5, 45, 69, 28, 33, 70, 7, 51, 62, 97, 71, 40, 92, 57, 14, 86, 49, 84, 80, 100, 1, 89, 52, 59, 82]

mergeSort(array , 0 , array.length - 1)
console.log(array)
