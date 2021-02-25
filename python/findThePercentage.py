if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    
    
    length = len(student_marks[query_name])
    sum = 0
    
    for x in student_marks[query_name]:
        sum = sum + x
    
    print("{0:.2f}".format(sum/length))