class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        candidates.sort()
        self.dfs(candidates,result,0,[],target,0)
        return result
        
    def dfs(self,nums,result,total,arr,target,index):
        if(total > target):
            return
        elif(total == target):
            result.append(list(arr))
        else:
            for i in range(index,len(nums)):
                arr.append(nums[i])
                self.dfs(nums,result,total+nums[i],arr,target,i)
                arr.pop()
            
            
        
        