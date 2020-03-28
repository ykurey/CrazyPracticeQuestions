#數字排序後的乘積

arr = [];

for i in range(1,9) :
    x = int( input() );
    arr.append(x);#將X放入arr的最後面
    
arr.sort();
print(arr[1]*arr[6]);
