echo "Enter the temperature in Farenheit : "      
read F
C=`expr "((($F - 32) * 5)/ 9)" | bc`
echo The temperature in Celsius is : $C
