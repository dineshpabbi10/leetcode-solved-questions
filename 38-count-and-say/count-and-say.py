class Solution:
    def countAndSay(self, n: int) -> str:
        s = "1"
        for i in range(2,n+1):
            s = self.getString(s)
            
        return s
        
        
    def getString(self,s):
        count = 0
        result = ""
        for i in range(len(s)):
            if(i > 0 and s[i] != s[i-1]):
                result = result + str(count)+s[i-1]
                count = 1
            else:
                count += 1
                
            if(i == len(s)-1):
                result = result + str(count)+s[i]
                
        return result