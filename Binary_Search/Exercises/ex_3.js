const missingNumber = function(nums) {
  nums = nums.sort(function (a, b) {
      return a - b
  })
  
  for(let i = 0 ; i <= nums.length ; i++){
      if(binarySearch(nums , i) === -1){
          return i
      }
  }
};

function binarySearch (nums , target){
  let min = 0 
  let max = nums.length - 1

  while(min <= max){
      const midle = Math.floor((min + max)/2)
      if(nums[midle] < target){
          min = midle + 1
      }
      else if(nums[midle] > target){
          max = midle - 1
      }
      else{
          return midle
      }
  }
  return -1
}

console.log(missingNumber([3,0,1]))
console.log(missingNumber([0,1]))
console.log(missingNumber([9,6,4,2,3,5,7,0,1]))