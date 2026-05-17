class Solution(object):
    def threeSum(self, nums):
        unique_triplets = set()
        
        nums.sort() 

        n = len(nums)
        for i in range(n):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue

            left = i + 1
            right = n - 1
            while left < right:
                current_sum = nums[i] + nums[left] + nums[right]
                if current_sum == 0:
  
                    triplet = tuple(sorted((nums[i], nums[left], nums[right])))
                    unique_triplets.add(triplet)
                    
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1
                    while left < right and nums[right] == nums[right+1]:
                        right -= 1
                elif current_sum < 0:
                    left += 1
                else:
                    right -= 1
        
        return [list(t) for t in unique_triplets]


obj = Solution()
print(obj.threeSum([-1,0,1,2,-1,-4]))