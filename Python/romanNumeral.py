class Solution(object):
    def romanToInt(self, s):
        roman = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        last = "I"
        num = 0
        #reverse the roman numeral string
        for romanNumeral in s[::-1]:
            if roman[romanNumeral] < roman[last]:
                num -= roman[romanNumeral]
            else:
                num += roman[romanNumeral]
            last = romanNumeral #convert roman numeral to integer
        return num
