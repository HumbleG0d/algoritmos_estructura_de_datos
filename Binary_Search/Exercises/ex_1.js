const searchInsert = function(nums, target) {
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
    
    for(let i = 0 ; i < nums.length ; i++){
        if(target < nums[i]){
            return i
        }
    }

    return nums.length 
}

const nums = [1,3,5,6]
console.log(searchInsert(nums , 5))
console.log(searchInsert(nums , 2))
console.log(searchInsert(nums , 7))