class Solution:
    def reverseWords(self, s):
        words = []

        for word in s.split('.'):
            if word:
                words.append(word)

        words.reverse()
        return ".".join(words)