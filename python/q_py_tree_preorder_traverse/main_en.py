from binary_tree import BinaryTree
def preorder(tree):
  if tree != None:
    print(tree.get_root_val())
    preorder(tree.get_left())
    preorder(tree.get_right())
tree = BinaryTree(4)
tree.insert_left(2)
tree.insert_right(6)
tree.insert_right(8)
preorder(tree)