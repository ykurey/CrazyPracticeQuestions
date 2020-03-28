#三數排序

x = int( input() );
y = int( input() );
z = int( input() );

if x <= y and y <= z :
    print(x,y,z);
if y <= x and x <= z :
    print(y,x,z);
if z <= x and x <= y :
    print(z,x,y);
if x <= z and z <= y :
    print(x,z,y);
if y <= z and z <= x :
    print(y,z,x);
if z <= y and y <= x :
    print(z,y,x);
