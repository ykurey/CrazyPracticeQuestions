#找出最大、最小及平均值

x = int( input() );

arr = [];
sum_=0;

for i in range (0,x) :
    y = int( input() );
    sum_+=y;
    arr.append(y);
    
arr.sort();
print("Maximum=%d" %arr[x-1] );
print("Minimum=%d" %arr[0] );
print("Mean=%.3f" %(sum_/x) );
