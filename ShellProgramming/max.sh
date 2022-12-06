read -p "enter a " a
read -p "enter b " b
read -p "enter c " c
if [ $a -gt $b ] && [ $a -gt $c ]
then
    echo " max = $a "
elif [ $b -gt $a ] && [ $b -gt $c ]
then
    echo " max = $b "
else
    echo " max = $c "
fi


