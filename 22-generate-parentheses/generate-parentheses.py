class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        results = []

        def dfs(ob_count,cb_count,result,index):
            if(index == 2*n):
                return results.append("".join(result))

            if(ob_count < n):
                result[index] = "("
                dfs(ob_count+1,cb_count,result,index+1)
            
            if(cb_count < ob_count):
                result[index] = ")"
                dfs(ob_count,cb_count+1,result,index+1)
        
        dfs(0,0,["(" for i in range(2*n)],0)
        return results

        