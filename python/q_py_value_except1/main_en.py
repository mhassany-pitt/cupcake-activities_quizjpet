def str_to_int(var):
    try:       
        print(int(var))
    except ValueError:
        print("Please give a number!")
my_list = ["one", "1", "two", "2", "three", "3"]
str_to_int(my_list[0])