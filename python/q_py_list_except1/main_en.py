the_list = (1, 2, 3, 4, 5)
sum = 0
error = 0
for i in range(2):
      try:
          sum += the_list[i]
      except:
          error += 1
print(sum)
print(error)