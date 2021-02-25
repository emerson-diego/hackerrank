if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    first,second=-999999999999999999999999999999999,-999999999999999999999999999999999
    
    for x in arr:
        if(x > first):
            second,first = first, x
        elif(x < first and x > second):
            second = x
    
    print(second)
