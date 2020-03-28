#找因數

x = int( input("輸入數字:") );

for i in range(1,x+1) :
    if x % i == 0 :
        print(i);

print();

j = 1;

while x >= j:
    if x % j == 0:
        print(j);
    j += 1;
