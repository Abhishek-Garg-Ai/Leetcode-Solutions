class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        index=0
        count=0
        while(index<len(nums)):
            if(count==0):
                el=nums[index]
            elif(nums[index]!=el):
                count-=2
            index+=1
            count+=1
        return el

        