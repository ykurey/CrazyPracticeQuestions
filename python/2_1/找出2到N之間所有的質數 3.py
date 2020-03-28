#找出2到N之間所有質數

x = int( input() );

c = 0;

for i in range(2,x+1) :
    
    count = 0;

    for j in range(2,i+1) :
        
        if i % j == 0 :
            count+=1;
            
    if count == 1 :

        print("%03d\t" %i,end="");
        c += 1;
        
        if c % 5 ==0 :
            print();

if c % 5 != 0 :
    print();
print("小於%d的質數共有%d個" %(x,c) );
            
