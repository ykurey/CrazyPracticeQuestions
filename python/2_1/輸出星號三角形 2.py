#輸出*三角形

x = int( input() );

for i in range(1,x+1) :
    for j in range(1,i+1) :
        print("*",end=""); #(x,end="")不換行
    print();
