#找陣列中某數有幾個

def count(a,b):
    c = 0;
    for i in range(0,len(b)):
        if b[i] < a :
            c += 1;
    return c;

A=[6,7,7,3,6,7,4];

x = int( input() );

print(count(x,A));
