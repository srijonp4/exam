echo "hello world"
a=1000
b=200
c=`expr "( $a * $b )" | bc`
echo "$c"
