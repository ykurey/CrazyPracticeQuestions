#1+2+...+n

x = int( input() );

count = 0;
i = 0;
b = 0;

while i < x :
    b = b+1;
    count += b;
    i+=1;
print(count);
