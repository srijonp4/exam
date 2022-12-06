#!/bin/bash
read -p "enter a " a
read -p "enter b " b
echo "before swaping a = $a , b = $b"
k=`expr $a \* 1`
a=$b
b=$k
echo "after swapping a = $a and b = $b" 