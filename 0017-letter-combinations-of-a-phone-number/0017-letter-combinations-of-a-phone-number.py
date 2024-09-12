class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        
        if not digits:
            return []
        DigitsMap = {
            '2':"abc",
            '3':"def",
            '4':"ghi",
            '5':"jkl",
            '6':"mno",
            '7':"pqrs",
            '8':"tuv",
            '9':"wxyz"
        }

        s = ""
        for digit in digits:
            s += DigitsMap[digit]
        
        res = []
        n = len(digits)
        def allCombinations( ind , remString):
            if len(remString) == n:
                res.append(remString)
                return
            
            if len(remString)>n or ind>n:
                return ;
            
            for chars in DigitsMap[digits[ind]]:
                allCombinations(ind+1,remString + chars)

            
        allCombinations(0,"")
        return res;

