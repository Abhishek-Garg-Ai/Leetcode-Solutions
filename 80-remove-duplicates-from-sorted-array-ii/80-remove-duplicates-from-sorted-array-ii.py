class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curr=0
        nxt=1
        while(nxt<=len(nums)):
            if(nxt<len(nums) and nums[curr]==nums[nxt]):
                nxt+=1
            else:
                extra=nxt-curr-2
                for i in range(extra):
                    nums.pop(curr+2)
                if(extra>0):
                    curr+=1
                curr+=1
                nxt=curr+1
        return len(nums)