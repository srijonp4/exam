echo "enter x and y"
read x
read y
echo "x=`expr $x` y=`expr $y`"
z=`expr $x \* $y`
echo "multiplication= `expr $z`"
div=`expr $x/$y`
echo division =`expr $div`
add=`expr $x + $y`
echo "addition = `expr $add`"
sub=`expr $x - $y`
echo "substraction = `expr $sub`"
