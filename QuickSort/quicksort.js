function partition(array , min , max){
  const pivote = array[max] //* Pivote , generalmente sera el ultimo elemento.
  let i = min - 1 //* Indice del pivote array[-1] -> Ultimo elemento

  for(let j = min ; j <= max - 1 ; j++){
    if(array[j] < pivote){ //* Si el elemento actual es mas pequeño que el pivote hacemos un intercambio(swap)
      i++
      [array[i] , array[j]] = [array[j] , array[i]]
    }
  }
  [array[i+1] , array[max]] = [array[max] , array[i+1]] //* Cambiamos el pivote a su posicion correcta
  return i+1 //* Retornamos el indice del pivote(particion)
}

function quickSort(array , min , max){
  if(min < max){
    const indexPivote = partition(array , min , max) //* Obtenemos el indice del pivote
    quickSort(array , min , indexPivote - 1) //* Sub-array cuyos elementos seran menores al pivote
    quickSort(array , indexPivote + 1 , max) //* Sub-array cuyos elementos seran mayores al pivote
  }
}

const array = [79, 61, 48, 27, 21, 56, 74, 9, 63, 31, 73, 96, 44, 3, 20, 41, 46, 50, 60, 65, 88, 16, 75, 58, 68, 35, 55, 98, 94, 78, 23, 85, 77, 87, 30, 43, 34, 83, 38, 25, 18, 26, 37, 64, 6, 13, 67, 76, 81, 93, 32, 72, 22, 17, 99, 90, 66, 11, 39, 2, 15, 91, 42, 8, 12, 24, 4, 53, 36, 54, 19, 10, 29, 95, 5, 45, 69, 28, 33, 70, 7, 51, 62, 97, 71, 40, 92, 57, 14, 86, 49, 84, 80, 100, 1, 89, 52, 59, 82]

quickSort(array , 0 , array.length - 1)
console.log(array)