class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        counter = dict()
        for i in candidates:
            counter[i] = counter.get(i,0) + 1
        print(counter)
        
        candidates = list(set(candidates))
        candidates.sort()
        output = []

        def dfs(index,candidates,running_sum,elements):
            
            if(running_sum == target):
                output.append(list(elements))
                return
            if(running_sum > target or index >= len(candidates)):
                return
            
            for i in range(counter[candidates[index]]+1):
                for j in range(i):
                    elements.append(candidates[index])
                dfs(index + 1, candidates,running_sum + i* candidates[index],elements)
                for j in range(i):
                    elements.pop()
                
        dfs(0,candidates,0,[])
        
        return output
            
        