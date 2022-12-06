read -p "enter operator 1=add,2=sub,3=div,4=mult" operator
read -p "enter A" a
read -p "enter B" b
if [ $operator == 1 ]
then
    echo "add `expr $a + $b `"
elif [ $operator == 2 ]   
then 
    echo "sub `expr $a - $b `"
elif [ $operator == 3 ]   
then 
    echo "mult `expr $a \* $b `"
elif [ $operator == 4 ]   
then 
        if [ $b -eq 0 ]
        then
            echo "cannot divide by zero"
        elif [ $b != 0 ]
        then
        R=`expr "( $a / $b)" | bc`
        echo "answer is = $R"
        fi
fi