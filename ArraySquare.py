class Solution(object):
    def sortedSquares(self, nums):
        b = []
        for i in nums:
            b.append(i**2)
        b.sort()
        return b
