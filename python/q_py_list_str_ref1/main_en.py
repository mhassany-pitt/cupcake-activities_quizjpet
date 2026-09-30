def modify(the_list):
    the_list[0] = the_list[0].replace("9", "0")
    return the_list
def main():
    outer_list = ["I have watched 9 movies."]
    print(outer_list[0])
    modify(outer_list)
    print(outer_list[0])
    outer_list = modify(outer_list)
    print(outer_list[0])
main()