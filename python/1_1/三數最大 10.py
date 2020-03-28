#找三數中最大

x = int (input() );
y = int (input() );
z = int (input() );

if x >= y and x >= z :
    print(x);
if y >= x and y >= z :
    print(y);
if z >= x and z >= y :
    print(z);

if x >= y and x >= z :
    g = x;
if y >= x and y >= z :
    g = y;
if z >= x and z >= y :
    g = z;
print(g);
print(type(g))
