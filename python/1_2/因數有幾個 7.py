#因數有幾個

x =  int( input() );

count = 0;

for i in range(1,x+1) : #range(索引值[預設0], < x )
    if x % i == 0:
        count += 1;
print(count);
