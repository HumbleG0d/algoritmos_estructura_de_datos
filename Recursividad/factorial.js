function factorial(n){
  if(n > 0 ){
    return n*factorial(n-1)
  }
  else{
    return 1
  }
}

console.log(factorial(6))