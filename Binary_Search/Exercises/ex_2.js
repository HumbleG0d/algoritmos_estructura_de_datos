const mySqrt = function(x) {
  if(x >= 0){
      if(x < 2){
          return x 
      }

      let min = 1
      let max = x / 2

      let result = 0

      while(min <= max){
          const midle = Math.floor((min + max)/2)
          let sqrt = midle*midle

          if(sqrt < x){
              min = midle + 1
              result = midle
          }
          else if(sqrt > x){
              max = midle - 1
          }
          else{
              return midle
          }
      }
      return result
  }
};

console.log(mySqrt(4))
console.log(mySqrt(8))