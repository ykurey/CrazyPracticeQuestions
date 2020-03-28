#輸入10個數，找重複的數字，分別輸出

def findDup(A) :
    i = 0;
    while i < len(A) :
        c = 0;
        for j in range(i,len(A)) :
            if A[i] == A[j] :
                c += 1;
        if c > 1 :
            print(A[i]);
            i += c;
        else :
            i += 1;

A=[];

for i in range(1,11):
    x = int( input() );
    A.append(x);

A.sort();
findDup(A);
