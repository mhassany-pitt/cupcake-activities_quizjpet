file = open("file2.txt", "r")
lines = 0
words = 0
for line in file:
   lines += 1
   words += len(line.split())
print("file has", lines, "lines")
print("file has", words, "words")