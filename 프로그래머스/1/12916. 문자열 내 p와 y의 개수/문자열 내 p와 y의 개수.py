def solution(s):
    answer = True
    p = 0
    j = 0
    for i in s:
        if i == "p" or i == "P":
            p = p+1
        elif i == "y" or i=="Y":
            j = j+1
    if p!=j:
        answer = False

    return answer