from binary_tree import BinaryTree
def inorder(tree):
  if tree != None:
    inorder(tree.get_left())
    print(tree.get_root_val())
    inorder(tree.get_right())
tree = BinaryTree(4)
tree.insert_left(2)
tree.insert_right(6)
tree.insert_right(8)
inorder(tree)