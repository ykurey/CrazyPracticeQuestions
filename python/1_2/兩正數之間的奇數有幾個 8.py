#兩正數之間的奇數有幾個

#輸入兩個值
x = int( input() );
y = int( input() );

#大小交換
if x > y :
    z = x;
    x = y;
    y = z;

#給第二支程式跑的
a = x;
b = y;

#設定初始值
count = 0;
count1 = 0;

#演算一
for x in range(x,y+1) : #range(x, < y )
    if x % 2 != 0 :
        count1 += x;
print(count1);

#演算二
while True :
    if a % 2 != 0 :
        count += a;
    if a == b :
        break;
    a+=1;
print(count);
