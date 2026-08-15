import math

class Solution:
    def quadraticRoots(self, a, b, c):
        d = b * b - 4 * a * c

        if d < 0:
            return [-1]

        r1 = (-b + math.sqrt(d)) / (2 * a)
        r2 = (-b - math.sqrt(d)) / (2 * a)

        r1 = math.floor(r1)
        r2 = math.floor(r2)

        if r1 >= r2:
            return [r1, r2]
        else:
            return [r2, r1]