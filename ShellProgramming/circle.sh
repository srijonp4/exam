echo 'enter radius of the circle'
read radius
area=`expr "(3.14 * $radius * $radius)" | bc`
echo "radius is `expr $radius`"
echo "area is `expr $area`"

echo "Enter the radius : "      
read r
area=`expr "(3.14 * $r * $r)" | bc`
circumference=`expr "(3.14 * 2 * $r)" | bc`
echo The area of the circle is : $area
echo "The circumference of the circle is: `expr $circumference`"
