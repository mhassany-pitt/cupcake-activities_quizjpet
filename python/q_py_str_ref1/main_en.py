def modify(the_string):
    the_string = the_string.replace("6", "0")
    return the_string
def main():
    outer_string = "I have watched 6 movies."
    print(outer_string)
    modify(outer_string)
    print(outer_string)
    outer_string = modify(outer_string)
    print(outer_string)
main()