const memo = {}
function factorial(n){
  if(n === 0){
    return 1
  }
  else if(memo.hasOwnProperty(n)){ //* Verifica si n esta en el objeto , si esta lo retorna
    return memo[n]
  }
  else{
    const result = n*factorial(n-1)
    memo[n] = result //* Memoriza
    return result
  }
}

console.log(factorial(5))
console.log(memo)