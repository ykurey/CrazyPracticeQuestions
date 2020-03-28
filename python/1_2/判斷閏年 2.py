#判斷閏年

x = int( input("輸入年分: ") );

if (x % 4 == 0 and x % 100 != 0) or x % 400 == 0 :
    print("YES");
else :
    print("NO")
