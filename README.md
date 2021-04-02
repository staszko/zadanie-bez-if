No-IF-statement exercise
===============

Mathematical formula `2 * (17 + 6 / (5 - 2))` may be expressed as binary tree with nodes being:
* value (*leaf node*)
* mathematical operation (*inner node*)

![Binary tree of wspression: 2 * (17 + 6 / (5 - 2))](https://g.gravizo.com/svg?digraph%20G%20%7B%0A%20%20%20%20%20%20%20%20size%3D%224%2C4%22%3B%0A%20%20%20%20%20%20%20%20op_0%20%5Blabel%3D%22%2A%22%5D%3B%0A%20%20%20%20%20%20%20%20value_2%20%5Blabel%3D%222%22%5D%3B%0A%20%20%20%20%20%20%20%20op_1%20%5Blabel%3D%22%2B%22%5D%3B%0A%20%20%20%20%20%20%20%20op_0%20-%3E%20%7Bvalue_2%2C%20op_1%7D%3B%0A%20%20%20%20%20%20%20%20value_17%20%5Blabel%3D%2217%22%5D%3B%0A%20%20%20%20%20%20%20%20op_2%20%5Blabel%3D%22%2F%22%5D%3B%0A%20%20%20%20%20%20%20%20op_1%20-%3E%20%7Bvalue_17%2C%20op_2%7D%3B%0A%20%20%20%20%20%20%20%20value_6%20%5Blabel%3D%226%22%5D%3B%0A%20%20%20%20%20%20%20%20op_3%20%5Blabel%3D%22-%22%5D%3B%0A%20%20%20%20%20%20%20%20op_2%20-%3E%20%7Bvalue_6%2C%20op_3%7D%3B%0A%20%20%20%20%20%20%20%20value_5%20%5Blabel%3D%225%22%5D%3B%0A%20%20%20%20%20%20%20%20value_2_%20%5Blabel%3D%222%22%5D%3B%0A%20%20%20%20%20%20%20%20op_3%20-%3E%20%7Bvalue_5%2C%20value_2_%7D%3B%0A%20%20%20%20%7D)
