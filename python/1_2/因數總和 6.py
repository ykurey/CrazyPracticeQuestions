#因數總和

x = int( input() );

count = 0;

for i in range(1,x+1) :
    if x % i == 0 :
        count += i;
print(count);
