# Take user input
echo "Enter a number"
read n

echo "Even Numbers - "
i=1

# -le means less than or equal to
while [ $i -le $n ]   
do
# arithmetic operations is performed with 'expr'   
rs=`expr $i % 2`

if [ $rs == 0 ]
then
echo "  $i"
  
# end of if loop
fi

# incrementing i by one
((++i))
  
# end of while loop  
done

# Now printing odd numbers
echo "Odd Numbers - "
i=1
  
while [ $i -le $n ]
do
  
rs=`expr $i % 2`

if [ $rs != 0 ]
then

echo "  $i"
  
fi

((++i))
done