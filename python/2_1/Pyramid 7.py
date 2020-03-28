#星號金字塔

x = int( input() );

for i in range(1,x+1):
    for j in range(1,x+1-i):
        print(" ",end="");
    for k in range(1,2*i):
        print("*",end="");
    print();
