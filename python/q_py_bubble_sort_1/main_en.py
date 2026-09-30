def bubble_sort(lst):
  for i in range(len(lst) - 1, 0 , -1):
    for current in range(0, i):
      if (lst[current+1] < lst[current]):
        temp = lst[current]
        lst[current] = lst[current+1]
        lst[current+1] = temp
  return lst
data = [5, 5, -11, 6, 2, -12]
print(bubble_sort(data))