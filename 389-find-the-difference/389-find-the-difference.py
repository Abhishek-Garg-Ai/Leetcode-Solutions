class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        ans=0;
        for i in s:
            ans=ans^ord(i)
        for i in t:
            ans=ans^ord(i)
        # print(ans)
        return chr(ans)