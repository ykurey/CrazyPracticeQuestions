#三角形種類

x = int( input() );
y = int( input() );
z = int( input() );

#不是三角形
if (x+y) <= z or (x+z) <= y or (z+y) <= x :
    print("not a triangle");
#正三角形
elif x == y and y == z and x == z :
    print("regular triangle");
#直角
elif (x*x) + (y*y) == (z*z) or (y*y) + (z*z) == (x*x) or (x*x) + (z*z) == (y*y) :
    print("rectangular triangle");
#等腰三角形
elif x == y or y == z or x == z :
    print("isosceles triangle");
#等腰直角三角形
elif (x == y) or (y == z) or (z == x) and (x*x) + (y*y) == (z*z) or (x*x) + (z*z) == (y*y) or (z*z) + (y*y) == (x*x) :
    print("isosceles righttriangle");
#鈍角
elif (x != y) and (y != z) and (z != x) and (x*x) + (y*y) < (z*z) or (x*x) + (z*z) < (y*y) or (y*y) + (z*z) < (x*x) :
    print("obtuse triangle");
else :
    print("acute triangle");
