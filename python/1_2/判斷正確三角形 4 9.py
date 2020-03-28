#判斷正確三角形

x = float( input() );
y = float( input() );
z = float( input() );

if x > 0 and y > 0 and z > 0 and (x*x) + (y*y) >= (z*z) :
    print("YES");
else :
    print("NO");
