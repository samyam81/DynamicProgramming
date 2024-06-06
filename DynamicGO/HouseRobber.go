package main

import "math"

func rob(nums []int) int {
    var Rob int=0
	var noRob int =0
	for i := 0; i < len(nums); i++ {
		newRob:=noRob+nums[i]
		newNoRob:=math.Max(float64(noRob),float64(Rob))		
		Rob=newRob
		noRob=int(newNoRob)	
	}

	return int(math.Max(float64(Rob),float64(noRob)))
}