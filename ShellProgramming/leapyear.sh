#!/bin/bash
echo "Program to check for leap year or not"
read -p "Enter the year: " year
if [ $((year%400)) -eq 0 ]
then
        echo "$year is a leap year"
elif [ $((year%100)) -eq 0 ]
then
        echo "$year is not a leap year"
elif [ $((year%4)) -eq 0 ]
then
        echo "$year is a leap year"
else
        echo "$year is not a leap year"
fi

#!/bin/bash
echo "enter year"
read -p "year " y
if [ $((y%400)) -eq 0 ]
then 
     echo "leap year"
elif [ $((y%100)) -eq 0]
then 
    echo " not leap year"
elif [ $((y%4)) -eq 0 ]
then 
    echo " is leap year"
else
    echo "$y is not leap year"
fi

