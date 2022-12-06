echo "Enter a number"
read i
rs=`expr $i % 2`
if [ $rs == 0 ]
then
echo "even"
fi
if [ $rs != 0 ]
then
echo "odd"  
fi