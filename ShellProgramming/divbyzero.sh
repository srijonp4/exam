read -p "enter a " a
read -p "enter b " b
if [ $b -eq 0 ]
then
    echo "cannot divide by zero"
elif [ $b != 0 ]
then
    R=`expr "( $a / $b)" | bc`
    echo "answer is = $R"
fi