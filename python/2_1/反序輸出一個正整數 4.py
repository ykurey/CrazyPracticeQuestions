#反序輸出一個正整數

x = input();

for i in range(len(x)-1,-1,-1) : #if x=5 的話 4~0
    if i != 0 :
        print(x[i],"",end="");
    else :
        print(x[i]);
