class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        n=2**len(nums)
        result=[]
        for i in range(n):
            lt=[]
            k=i
            for j in range(len(nums)):
                if(k%2==1):
                    lt.append(nums[j])
                k//=2
            result.append(lt)
        return result
                    