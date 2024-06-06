package main


func deleteAndEarn(nums []int) int {
	freq := make(map[int]int)
	for _, num := range nums {
		freq[num]++
	}

	prev := 0
	curr := 0

	for num := range freq {
		points := num * freq[num]
		if _, exists := freq[num-1]; exists {
			points += prev
		}
		if _, exists := freq[num+1]; exists {
			points = max(points, curr)
		}
		prev, curr = curr, points
	}

	return curr
}


func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

