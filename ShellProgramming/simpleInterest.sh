echo 'enter p , r , T'
read p
read r
read T
interest=`expr "((($p * $r * $T)/100))" | bc`
echo $interest