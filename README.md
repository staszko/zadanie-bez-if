No-IF-statement exercise
===============

Mathematical formula `2 * (17 + 6 / (5 - 2))` may be expressed as binary tree with nodes being:
* value (*leaf node*)
* mathematical operation (*inner node*)

![Binary tree of wspression: 2 * (17 + 6 / (5 - 2))](https://g.gravizo.com/svg?{size="4,4";op_0[label="*"];value_2[label="2"];op_1[label="+"];op_0->{value_2,op_1};value_17 [label="17"];op_2 [label="/"];op_1 -> {value_17, op_2};value_6 [label="6"];op_3 [label="-"];op_2 -> {value_6, op_3};value_5 [label="5"];value_2_ [label="2"];op_3 -> {value_5, value_2_};})
