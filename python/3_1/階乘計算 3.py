#階乘計算


def recursive(n):
    if n == 0:
        return 1;
    else :
        return n*recursive(n-1);


x = int( input() );

print("%d!=%d" %(x,recursive(x) ) );
